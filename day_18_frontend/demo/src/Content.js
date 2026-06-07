import React, { useState } from "react";
import { FaTrash } from "react-icons/fa";

const Content = () => {
  const [count, setCount] = useState(99);

  function incrementFunc() {
    // setCount(count + 1);
    // setCount(count + 1);
    // setCount(count + 1);

    setCount((count) => ++count);
    setCount((count) => ++count);
    setCount((count) => ++count);
  }

  function decrementFunc() {
    setCount(count - 1);
  }

  //   const [name, setName] = useState(randomName());
  const [name, setName] = useState(() => randomName());

  const [age, setAge] = useState({ age: 20 });

  function randomName() {
    const names = ["john", "peter"];
    const i = Math.floor(Math.random() * 2);
    console.log(names[i]);

    return names[i];
  }

  //   const addItem = () => {
  //     console.log("item added");
  //   };

  //   const addItem = (name) => {
  //     console.log(name + " added");
  //   };

  //   const addItem = (e) => {
  //     console.log(e);
  //     console.log(e.target);
  //     console.log(e.target.innerText);
  //   };

  //   return (
  //     <main>
  //       {/* <p>Logged in by {randomName()}</p> */}
  //       {/* <button onClick={addItem}>Add</button> */}
  //       {/* <button onClick={addItem("john")}>Add</button> */}
  //       {/* <button onClick={() => addItem("john")}>Add</button> */}
  //       {/* <button onClick={(e) => addItem(e)}>Add</button> */}
  //       <button onClick={decrementFunc}>-</button>
  //       <span>{count}</span>
  //       {/* <span>{age}</span> */}
  //       <button onClick={incrementFunc}>+</button>
  //     </main>
  //   );

  const [items, setItems] = useState([
    { id: 1, checked: true, description: "Practice Java" },
    { id: 2, checked: false, description: "Practice JavaScript" },
    { id: 3, checked: false, description: "Practice Python" },
  ]);

  const handleCheck = (id) => {
    const listItems = items.map((item) =>
      item.id === id ? { ...item, checked: !item.checked } : item,
    );
    setItems(listItems);
  };

  const deleteTask = (id) => {
    const listItems = items.filter((item) => item.id !== id);
    setItems(listItems);
  };

  return (
    <main>
      {items.length ? (
        <ul>
          {items.map((item) => (
            <li className="item" key={item.id}>
              <input
                type="checkbox"
                checked={item.checked}
                onChange={() => handleCheck(item.id)}
              ></input>
              <label
                onDoubleClick={() => handleCheck(item.id)}
                style={item.checked ? { textDecoration: "line-through" } : null}
              >
                {item.description}
              </label>
              <FaTrash role="button" onClick={() => deleteTask(item.id)} />
            </li>
          ))}
        </ul>
      ) : (
        <p style={{ marginTop: "25px" }}>List is Empty</p>
      )}
    </main>
  );
};

export default Content;
