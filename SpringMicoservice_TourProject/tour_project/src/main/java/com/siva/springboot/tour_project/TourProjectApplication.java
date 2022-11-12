package com.siva.springboot.tour_project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.siva.springboot.tour_project.Model.Difficulty;
import com.siva.springboot.tour_project.Model.Region;
import com.siva.springboot.tour_project.Service.TourPackageService;
import com.siva.springboot.tour_project.Service.TourService;

@SpringBootApplication
public class TourProjectApplication implements CommandLineRunner{

	private Logger LOG = LoggerFactory.getLogger(TourProjectApplication.class);

	@Value("${importfile}")
	private String importFile;

	@Autowired
	private TourPackageService tourPackageService;

	@Autowired
	private TourService tourService;
	public static void main(String[] args) {
		SpringApplication.run(TourProjectApplication.class, args);
	}

	

	

	@Override
	public void run(String... args) throws Exception {
		createTourPackages();
		long totalPackages = tourPackageService.total();
		LOG.info("Total packages: "+totalPackages);
		createTours(importFile);
		long totalTours = tourService.total();
		LOG.info("Total tours: "+totalTours);
	
	}



	/**
     * Initialize all the known tour packages
     */
	private void createTourPackages(){
        tourPackageService.createTourPackage("BC", "Backpack Cal");
        tourPackageService.createTourPackage("CC", "California Calm");
        tourPackageService.createTourPackage("CH", "California Hot springs");
        tourPackageService.createTourPackage("CY", "Cycle California");
        tourPackageService.createTourPackage("DS", "From Desert to Sea");
        tourPackageService.createTourPackage("KC", "Kids California");
        tourPackageService.createTourPackage("NW", "Nature Watch");
        tourPackageService.createTourPackage("SC", "Snowboard Cali");
        tourPackageService.createTourPackage("TC", "Taste of California");
    }

	private void createTours(String fileToBeImported) throws IOException {
		ToursFromFile.read(fileToBeImported).forEach(obj -> tourService.createTour(obj.getTitle(), obj.getDescription(), obj.getBlurb(), obj.getPrice(), obj.getLength(), obj.getBullets(), obj.getKeywords(), obj.getPackageType(), obj.getDifficulty(), obj.getRegion()));
		
	}

	private static class ToursFromFile{

		private String packageType, title, description, blurb, price, length,
                bullets, keywords, difficulty, region;

		static List<ToursFromFile> read(String importedFile) throws IOException{
			return new ObjectMapper().setVisibility(PropertyAccessor.FIELD, Visibility.ANY).readValue(new FileInputStream(importedFile), new TypeReference<List<ToursFromFile>>() {});
		}

		public String getPackageType() {
			return packageType;
		}

		public String getTitle() {
			return title;
		}

		public String getDescription() {
			return description;
		}

		public String getBlurb() {
			return blurb;
		}

		public Integer getPrice() {
			return Integer.parseInt(price);
		}

		public String getLength() {
			return length;
		}

		public String getBullets() {
			return bullets;
		}

		public String getKeywords() {
			return keywords;
		}

		public Difficulty getDifficulty() {
			return Difficulty.valueOf(difficulty.toUpperCase());
		}

		public Region getRegion() {
			return Region.findByLabel(region);
		}

				

	} 


}
