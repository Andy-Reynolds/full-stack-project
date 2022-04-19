import React from "react";
import { Link } from "react-router-dom";
import "./Navbar.scss";

const Navbar = () => {
  return (
    <div className="navbar">
      <Link className="navbar__item navbar__item--logo" to="/">
        <h1>Skydiving Logbook</h1>
      </Link>
      <Link className="navbar__item navbar__item--add-jump" to="/add-jump">
        Add Jump
      </Link>
    </div>
  );
};

export default Navbar;
