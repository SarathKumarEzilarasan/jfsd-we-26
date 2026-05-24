function func(arg) {
  console.log();
  console.log();
  console.log();
  console.log();
  console.log();
  console.log();
  arg();
  arg();
  arg();
  arg();
  arg();
}

function display() {
  console.log("hello world");
}

func(display);
func(() => console.log("hello from arrow"));
