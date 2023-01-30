function search() {
  const searchBox = document.querySelector("#search-item").value.toUpperCase;
  const storeItems = document.querySelectorAll(".product");
  storeItems.forEach((product) => {
    const val = product.getElementsByTagName("h2")[0].textContent;
    console.log(val);
  });
}
