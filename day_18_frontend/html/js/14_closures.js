// global , local
// local -> private for a function
// global -> public -> private

// function func() {
//   let a = 4;
//   return a;
// }

// let a = 4;
// function func1() {
//   return a;
// }

// let counter = 0;
// function add() {
//   let counter = 0;
//   counter++;
// }

// function sub() {
//   counter--;
// }

// add();
// add();
// add();
// // sub();
// console.log(counter);

// function add() {
//   let counter = 0;
//   function plus() {
//     counter++;
//   }

//   plus(); ////////////
//   return counter;
// }

// function func1() {
//   console.log(100);
// }

// let x = function () {
//   console.log(100);
// };

// x();

// const add = (function () {
//   let counter = 0;
//   return counter;
// })();

// console.log(add);

const add = (function () {
  let counter = 0;
  return function () {
    counter++;
    return counter;
  };
})();

console.log(add());
console.log(add());
console.log(add());
