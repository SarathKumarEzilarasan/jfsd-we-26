// Document Object Model -> DOM
// console.log(document);
// console.log(document.domain);
// console.log(document.URL);
// console.log(document.title);

// document.title = "hello world";

// console.log(document.head);
// console.log(document.body);

// let headerTitle = document.getElementById("header-title");
// let header = document.getElementById("main-header");
// // console.log(header);
// headerTitle.textContent = "hello";
// headerTitle.innerText = "hello";
// headerTitle.innerHTML = "<h3> world </h3>";
// header.style.border = "solid 3px black";

// let items = document.getElementsByClassName("list-group-item");

// // items.style.border = "solid 3px black";
// items[0].style.border = "solid 3px black";

// for (let index = 0; index < items.length; index++) {
//   items[index].style.border = "solid 3px black";
// }

// let liList = document.getElementsByTagName("li");
// console.log(liList);

// let header = document.querySelector("#main-header");
// console.log(header);

// document.querySelector(".list-group-item:nth-type(2)");

let itemList = document.querySelector("#items");

// console.log(itemList.parentNode);
// itemList.parentNode.parentNode.style.backgroundColor = "yellow";

// itemList.children[0].style.backgroundColor = "green";
// itemList.firstElementChild.style.backgroundColor = "green";

// console.log(itemList.nextElementSibling);
// console.log(itemList.previousElementSibling);

// <li class="list-group-item">Item 5</li>

// let textNode = document.createTextNode("Item 5");
// let newItem = document.createElement("li");
// newItem.setAttribute("class", "list-group-item");
// newItem.appendChild(textNode);

// itemList.appendChild(newItem);

function buttonClick(e) {
  //   console.log("button clicked");
  //   console.log(e.target);
  //   e.target.style.backgroundColor = "orange";

  let textNode = document.createTextNode("Item 5");
  let newItem = document.createElement("li");
  newItem.setAttribute("class", "list-group-item");
  newItem.appendChild(textNode);
  itemList.appendChild(newItem);
}

let btn = document.querySelector("#button");

btn.addEventListener("click", (e) => {
  //   console.log("button clicked");
  //   console.log(e.target);
  //   e.target.style.backgroundColor = "orange";

  let textNode = document.createTextNode("Item 5");
  let newItem = document.createElement("li");
  newItem.setAttribute("class", "list-group-item");
  newItem.appendChild(textNode);
  itemList.appendChild(newItem);
});
