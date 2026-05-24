let myMap = new Map();

myMap.set(1, "john");
myMap.set(1, "john");
myMap.set(2, "peter");
myMap.set(3, "zack");

console.log(myMap);
console.log(myMap.size);
myMap.delete(1);
myMap.has(1);

let arr = Array.from(myMap.keys());

console.log(arr);

// wwwaacddda
