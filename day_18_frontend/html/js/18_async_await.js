const fs = require("fs").promises;

async function display() {
  try {
    let data = await fs.readFile("js/file1.txt", "utf-8");
    console.log(data);
    data = await fs.readFile("js/file2.txt", "utf-8");
    console.log(data);
    data = await fs.readFile("js/file3.txt", "utf-8");
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// display();

class ClassWithPrivateField {
  #privateField;

  constructor() {
    this.#privateField = 42;
  }
}

let myClass = new ClassWithPrivateField();
console.log(myClass.privateField);
