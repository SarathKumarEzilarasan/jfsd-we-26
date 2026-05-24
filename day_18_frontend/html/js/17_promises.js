// let myPromise = new Promise((res, rej) => {
//   let x = 0;
//   setTimeout(() => {
//     res("ok");
//   }, 5000);
//   //   if (x == 0) {
//   //     res("ok");
//   //   } else {
//   //     rej("error");
//   //   }
// });

// console.log(myPromise);

// myPromise
//   .then((val) => console.log(val + " from then block"))
//   .catch((err) => console.error(err));

const fs = require("fs").promises;

fs.readFile("js/file1.txt", "utf-8")
  .then((data) => {
    console.log(data);
    return fs.readFile("js/file2.txt", "utf-8");
  })
  .then((data) => {
    console.log(data);
    return fs.readFile("js/file3.txt", "utf-8");
  })
  .then((data) => console.log(data))
  .catch((err) => console.error("error"));
