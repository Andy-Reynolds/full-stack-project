import { useEffect, useState } from "react";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import "./App.scss";
import AddJump from "./pages/AddJump/AddJump";
import Home from "./pages/Home/Home";
import "./styles/main.scss";

function App() {
  const [jumpData, setJumpData] = useState([]);

  const url = "https://logbook-project-347913.nw.r.appspot.com/jumps";

  const getJumps = async () => {
    const response = await fetch(url);
    const data = await response.json();

    setJumpData(data);
  };

  useEffect(() => {
    getJumps();
  }, []);

  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Home jumpData={jumpData} />} />
        <Route path="/add-jump" element={<AddJump />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
