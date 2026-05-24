try {
  add();
} catch (error) {
  if (error instanceof TypeError) {
    console.log("Typeerror occuried");
  } else {
    console.log("from catch block");
  }
} finally {
  console.log("from finally block");
}
