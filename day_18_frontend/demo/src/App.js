import logo from "./logo.svg";
import "./App.css";
import Header from "./Header";
import Content from "./Content";
import Footer from "./Footer";

function App() {
  // JSX

  const name = "demo";

  return (
    <div className="App">
      <Header />
      <Content />
      <Footer />
    </div>
  );
}

export default App;
