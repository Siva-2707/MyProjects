function search() {
  const searchStr = document.querySelector("#search-item").value.toUpperCase();
  const storeItems = document.querySelectorAll(".product");

  storeItems.forEach((product) => {
    const productName = product.getElementsByTagName("h2")[0].textContent.toUpperCase();
    product.style.display = productName.includes(searchStr) ? "" : "none";
  });
}
