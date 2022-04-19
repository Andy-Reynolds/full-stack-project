import { BrowserRouter, Routes, Route } from "react-router-dom";
import "./App.scss";
import AddJump from "./pages/AddJump/AddJump";
import Home from "./pages/Home/Home";
import "./styles/main.scss";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/add-jump" element={<AddJump />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
