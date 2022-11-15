package com.siva.springboot.tour_project.Converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.siva.springboot.tour_project.Model.Region;

@Converter(autoApply = true)
public class RegionConverter implements AttributeConverter<Region, String> {

    @Override
    public String convertToDatabaseColumn(Region region) {
        return region.getLabel();
    }

    @Override
    public Region convertToEntityAttribute(String string) {
        return Region.findByLabel(string);
    }

}
