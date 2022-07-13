import React from "react";
import JumpCard from "../../components/JumpCard/JumpCard";
import "./CardList.scss";

const CardList = ({ logbookEntries, jumpData }) => {
  const cardListJSX = logbookEntries.map((jump) => {
    return (
      <JumpCard
        key={jump.jumpNumber}
        jumpNumber={jump.jumpNumber}
        date={jump.date}
        dropzone={jump.dropzone}
        typeOfJump={jump.typeOfJump}
        altitude={jump.altitude}
        freefallTime={jump.freefallTime}
      />
    );
  });

  return <div className="card-list">{cardListJSX}</div>;
};

export default CardList;
