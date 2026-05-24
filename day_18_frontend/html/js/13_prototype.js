function Person(name, age) {
  this.name = name;
  this.age = age;
}

Person.prototype.nationality = "Indian";
const john = new Person("john", 20);

// console.log(john.nationality);

function sum(...args) {
  // rest operator

  let sum = 0;
  for (let arg of args) {
    sum += arg;
  }

  return sum;
}

console.log(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
