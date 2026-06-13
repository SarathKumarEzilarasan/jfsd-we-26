import ItemList from "./ItemList";

const Content = ({ items, handleCheck, deleteTask }) => {
  // const [count, setCount] = useState(99);

  // function incrementFunc() {
  //   // setCount(count + 1);
  //   // setCount(count + 1);
  //   // setCount(count + 1);

  //   setCount((count) => ++count);
  //   setCount((count) => ++count);
  //   setCount((count) => ++count);
  // }

  // function decrementFunc() {
  //   setCount(count - 1);
  // }

  // //   const [name, setName] = useState(randomName());
  // const [name, setName] = useState(() => randomName());

  // const [age, setAge] = useState({ age: 20 });

  // function randomName() {
  //   const names = ["john", "peter"];
  //   const i = Math.floor(Math.random() * 2);
  //   console.log(names[i]);

  //   return names[i];
  // }

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

  return (
    <>
      {items.length ? (
        <ItemList
          items={items}
          handleCheck={handleCheck}
          deleteTask={deleteTask}
        />
      ) : (
        <p style={{ marginTop: "25px" }}>List is Empty</p>
      )}
    </>
  );
};

export default Content;
