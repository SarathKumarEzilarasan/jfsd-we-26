async function get() {
  const response = await fetch("http://localhost:3500/db");
  const items = await response.json();
  console.log(items);
}

get();
