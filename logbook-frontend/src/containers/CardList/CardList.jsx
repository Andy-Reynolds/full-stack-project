import React from "react";
import JumpCard from "../../components/JumpCard/JumpCard";
import "./CardList.scss";

const CardList = ({ logbookEntries }) => {
  const cardListJSX = logbookEntries.map((jump) => {
    return (
      <JumpCard
        key={jump.jumpNumber}
        jumpNumber={jump.jumpNumber}
        date={jump.date}
        dropZone={jump.dropZone}
        typeOfJump={jump.typeOfJump}
        altitude={jump.altitude}
        freefallTime={jump.freefallTime}
      />
    );
  });

  return <div className="card-list">{cardListJSX}</div>;
};

export default CardList;
