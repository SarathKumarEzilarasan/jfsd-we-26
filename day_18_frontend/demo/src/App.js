import logo from "./logo.svg";
import "./App.css";
import Header from "./Header";
import Content from "./Content";
import Footer from "./Footer";
import React, { useEffect, useState } from "react";
import AddItem from "./AddItem";
import SearchItem from "./SearchItem";

function App() {
  // JSX

  const name = "demo";
  // const [items, setItems] = useState([
  // { id: 1, checked: true, description: "Practice Java" },
  // { id: 2, checked: false, description: "Practice JavaScript" },
  // { id: 3, checked: false, description: "Practice Python" },
  // ]);

  // const [items, setItems] = useState(
  //   JSON.parse(localStorage.getItem("todo_list")) || []
  // );

  const API_URL = "http://localhost:3500/db";

  const [items, setItems] = useState([]);
  const [isError, setIsError] = useState(null);
  const [isLoading, setIsLoading] = useState(true);

  console.log("before");
  // api
  // useEffect(() => console.log("loading"), []);
  // useEffect(() => setItems(JSON.parse(localStorage.getItem("todo_list"))), []);
  useEffect(() => {
    const fetchItems = async () => {
      try {
        const response = await fetch(API_URL);
        if (!response.ok) throw new Error("Data not found");
        const listItems = await response.json();
        setItems(listItems);
      } catch (error) {
        console.log(error);
        setIsError(error.message);
      } finally {
        setIsLoading(false);
      }
    };

    setTimeout(() => {
      fetchItems();
    }, 2000);
  }, []);
  console.log("after");

  const handleCheck = (id) => {
    const listItems = items.map((item) =>
      item.id === id ? { ...item, checked: !item.checked } : item,
    );
    setItems(listItems);
    // localStorage.setItem("todo_list", JSON.stringify(listItems));
    const putOptions = {
      method: "PATCH",
      headers: {
        "Content-Type": "application/json",
      },
    };
  };

  const deleteTask = (id) => {
    const listItems = items.filter((item) => item.id !== id);
    setItems(listItems);
    localStorage.setItem("todo_list", JSON.stringify(listItems));
  };

  const [newItem, setNewItem] = useState("");
  const [searchItem, setSearchItem] = useState("");

  const addItem = (itemDescription) => {
    const id = items.length ? items[items.length - 1].id + 1 : 1;
    const addNewItem = { id: id, checked: false, description: itemDescription };
    const listItems = [...items, addNewItem];
    setItems(listItems);
    localStorage.setItem("todo_list", JSON.stringify(listItems));
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    addItem(newItem);
    setNewItem("");
  };

  return (
    <div className="App">
      <Header title="Demo App" />
      <AddItem
        newItem={newItem}
        setNewItem={setNewItem}
        handleSubmit={handleSubmit}
      />
      <SearchItem searchItem={searchItem} setSearchItem={setSearchItem} />
      <main>
        {isError && <p>{isError}</p>}
        {isLoading && <p>Loading</p>}
        {!isError && !isLoading && items.length && (
          <Content
            items={items.filter((item) =>
              item.description.toLowerCase().includes(searchItem.toLowerCase()),
            )}
            handleCheck={handleCheck}
            deleteTask={deleteTask}
          />
        )}
      </main>
      <Footer
        length={
          items.length &&
          items.filter((item) =>
            item.description.toLowerCase().includes(searchItem.toLowerCase()),
          ).length
        }
      />
    </div>
  );
}

export default App;
