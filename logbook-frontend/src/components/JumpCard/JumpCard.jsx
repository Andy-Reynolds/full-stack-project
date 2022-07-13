import React from "react";
import "./JumpCard.scss";

const JumpCard = ({
  jumpNumber,
  date,
  dropzone,
  typeOfJump,
  altitude,
  freefallTime,
}) => {
  return (
    <div className="jump-card">
      <div className="jump-card__entry">
        <h3 className="jump-card__label">Jump Number:</h3>
        <p className="jump-card__input">{jumpNumber}</p>
      </div>
      <div className="jump-card__entry">
        <h3 className="jump-card__label">Date:</h3>
        <p className="jump-card__input">{date}</p>
      </div>
      <div className="jump-card__entry">
        <h3 className="jump-card__label">Dropzone:</h3>
        <p className="jump-card__input">{dropzone}</p>
      </div>
      <div className="jump-card__entry">
        <h3 className="jump-card__label">Type of Jump:</h3>
        <p className="jump-card__input">{typeOfJump}</p>
      </div>
      <div className="jump-card__entry">
        <h3 className="jump-card__label">Altitude:</h3>
        <p className="jump-card__input">{altitude}</p>
      </div>
      <div className="jump-card__entry">
        <h3 className="jump-card__label">Freefall Time:</h3>
        <p className="jump-card__input">{freefallTime} seconds</p>
      </div>
    </div>
  );
};

export default JumpCard;
