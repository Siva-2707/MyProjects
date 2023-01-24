(() => {
  var screen = document.querySelector(".screen");
  let buttons = document.querySelectorAll(".buttons");
  let result = 0;

  buttons.forEach((button) => {
    button.addEventListener("click", (e) => {
      let value = e.target.dataset.num;
      if (value) screen.value += value;
    });
  });

  document.querySelector(".button-equal").addEventListener("click", () => (screen.value = screen.value == "" ? "" : eval(screen.value)));
  document.querySelector(".button-clear").addEventListener("click", () => (screen.value = ""));
})();
