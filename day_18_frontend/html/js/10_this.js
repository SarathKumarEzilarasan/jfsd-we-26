let person = {
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
  fullName: function () {
    return this.firstName + this.lastName;
  },
};
