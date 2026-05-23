const fruits = ["apple", "banana", "orange"];

// for (let i = 0; i < fruits.length; i++) {
//   console.log(fruits[i]);
// }

// fruits[5] = "pineapple";

// console.log(fruits);

// console.log(fruits.pop());
// console.log(fruits);

// console.log(fruits.push("pineapple"));
// console.log(fruits);

// console.log(fruits.shift());
// console.log(fruits);

// console.log(fruits.unshift("pineapple"));
// console.log(fruits);

// const fruits1 = ["pineapple", "tomato"];

// console.log(fruits.concat(fruits1, fruits1));

// fruits.splice(2, 0, "tomato", "pineapple");
// console.log(fruits);

// console.log(fruits.slice(0, 2));
// console.log(fruits);

// console.log(fruits.sort());
// console.log(fruits.reverse());

const numbers = [45, 4, 9, 16, 25];

// function compare(a, b) {
//   return a - b;
// }

// console.log(numbers.sort(compare));
// console.log(
//   numbers.sort(function compare(a, b) {
//     return a - b;
//   }),
// );
// console.log(numbers.sort((a, b) => a - b));

// let result = numbers.filter((a) => a % 2 != 0);
// console.log(result);

// console.log(numbers.map((a) => a * a));

// numbers.forEach((a) => console.log(a));

// console.log(numbers.reduce((total, value) => total + value));

// for (num in numbers) {
//   console.log(num);
// }

// for (num of numbers) {
//   console.log(num);
// }

// const result = [...fruits, ...numbers]; // spread operator
// console.log(result);

// let keys = numbers.keys();

// for (key of keys) {
//   console.log(key);
// }

// let values = numbers.values();

// for (value of values) {
//   console.log(value);
// }

let entries = numbers.entries();

for (entry of entries) {
  console.log(entry);
}
