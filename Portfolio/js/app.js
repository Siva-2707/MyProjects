const sections = document.querySelectorAll(".section");
const controlsTab = document.querySelectorAll(".controls");
const controls = document.querySelectorAll(".control");
const allContent = document.querySelectorAll(".main-content");

const pageTransition = function () {
  for (let control of controls) {
    control.addEventListener("click", function () {
      // For button
      document.querySelector(".active-btn").classList.remove("active-btn");
      this.classList.add("active-btn");

      // For content
      document.querySelector(".active").classList.remove("active");
      let section = this.dataset.id;
      document.querySelector(`.${section}`).classList.add("active");
      console.log(section);
    });
  }
  for (let content of allContent) {
  }
};

pageTransition();
