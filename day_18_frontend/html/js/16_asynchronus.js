// setTimeout(() => console.log("from settimeout"), 2000);
// console.log("hello world");

const fs = require("fs");

// callback hell
fs.readFile("js/file1.txt", "utf-8", (err, data1) => {
  if (err) {
    console.error(err);
  } else {
    fs.readFile("js/file2.txt", "utf-8", (err, data2) => {
      if (err) {
        console.error(err);
      } else {
        fs.readFile("js/file3.txt", "utf-8", (err, data3) => {
          if (err) {
            console.error(err);
          } else {
            console.log(data1);
            console.log(data2);
            console.log(data3);
          }
        });
      }
    });
  }
});
