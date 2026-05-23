function add(a, b) {
  console.log(a + b);
  return a + b;
}

// add();

// let sum = add(100, 200);
// console.log(sum);

// let person = {
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

// console.log(person.fullName());

let result = add;

result(100, 200);
