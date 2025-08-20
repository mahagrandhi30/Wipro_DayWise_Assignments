import React from "react";
import "./NurseryApp.css";

function NurseryApp() {
  return (
    <div className="nursery-container">
      <h2>Welcome to the Nursery App</h2>
      <p>This is a React-based landing page for our nursery.</p>

      <label>Select Location: </label>
      <select>
        <option>Chennai</option>
        <option>Bangalore</option>
        <option>Mumbai</option>
        <option>Delhi</option>
      </select>

      <h3>Available Flowers</h3>
      <ul>
        <li>Rose</li>
        <li>Lily</li>
        <li>Tulip</li>
        <li>Sunflower</li>
        <li>Jasmine</li>
      </ul>
    </div>
  );
}

export default NurseryApp;
