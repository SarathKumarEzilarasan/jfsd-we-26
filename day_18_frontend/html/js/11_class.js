// let john = {
//   firstName: "John",
//   lastName: "Doe",
//   age: 20,
//   mobiles: [199999999, 20000000],
//   address: {
//     street: "Street 1",
//     locality: "Anna Nagar",
//     city: "Chennai",
//     state: "TamilNadu",
//   },
//   fullName: function () {
//     return this.firstName + this.lastName;
//   },
// };

// function john(name, age, mobiles) {
//   this.name = name;
//   function getName() {
//     return this.name;
//   }
// }

class Car {
  #price = 0;
  constructor(name, year) {
    this.name = name;
    this.year = year;
    this.#price = 200000;
  }

  model() {
    return "sedan";
  }

  get _name() {
    return this.name;
  }

  set _year(year) {
    this.year = year;
  }
}

const myCar = new Car("TATA", 2026);
console.log(myCar.price);

// console.log(myCar.name);
// console.log(myCar.model());
// console.log(myCar._name);

// myCar._year = 2028;
// console.log(myCar.year);

// inheritance

class Model extends Car {
  constructor(name, year, model) {
    super(name, year);
    this.model = model;
  }

  display() {
    return this.name + " " + this.model + " " + this.year;
  }

  static _display() {
    return "this is a display method";
  }
}

// let myModel = new Model("BMW", 2026, "Sedan");
// console.log(myModel.display());
// console.log(Model._display());

function add(a) {
  return a;
}

function add(a, b) {
  return a + b;
}

// console.log(add(1));
// overriding ????
