let form = document.querySelector("#addForm");
let itemList = document.querySelector("#items");
let filter = document.querySelector("#filter");

form.addEventListener("submit", (e) => {
  e.preventDefault();

  //   <li class="list-group-item">
  //        Item 1
  //        <button class="btn btn-danger btn-sm float-right delete">
  //            X
  //        </button>
  //   </li>

  let btn = document.createElement("button");
  btn.setAttribute("class", "btn btn-danger btn-sm float-right delete");
  let xSymbol = document.createTextNode("X");
  btn.appendChild(xSymbol);
  let inputText = document.querySelector("#item").value;
  let textNode = document.createTextNode(inputText);
  let newItem = document.createElement("li");
  newItem.setAttribute("class", "list-group-item");
  newItem.appendChild(textNode);
  newItem.appendChild(btn);
  itemList.appendChild(newItem);
});

itemList.addEventListener("click", (e) => {
  //   console.log(e.target);
  if (e.target.classList.contains("delete")) {
    if (confirm("Are you sure????")) {
      let li = e.target.parentElement;
      itemList.removeChild(li);
    }
  }
});

filter.addEventListener("keyup", (e) => {
  //   console.log("typed");
  let text = e.target.value.toLowerCase();
  //   console.log(text);
  let items = itemList.querySelectorAll("li");

  for (let index = 0; index < items.length; index++) {
    let item = items[index];
    let itemVal = item.firstChild.textContent.toLowerCase();
    // z - Item 1
    if (!itemVal.startsWith(text)) {
      item.style.display = "none";
    } else {
      item.style.display = "block";
    }
  }
});
