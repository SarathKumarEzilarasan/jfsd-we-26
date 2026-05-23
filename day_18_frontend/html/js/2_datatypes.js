let x;

// console.log(x);

x = ["john", "peter", 100];

// console.log(x);

x = {
  firstName: "John",
  lastName: "Doe",
  age: 20,
  mobiles: [199999999, 20000000],
  address: {
    street: "Street 1",
    locality: "Anna Nagar",
    city: "Chennai",
    state: "TamilNadu",
  },
};

console.log(x.firstName);
console.log(x["lastName"]);
console.log(x.mobiles[1]);
console.log(x.address.street);
