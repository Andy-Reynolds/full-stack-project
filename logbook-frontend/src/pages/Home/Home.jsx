import React from "react";
import Navbar from "../../components/Navbar/Navbar";
import CardList from "../../containers/CardList/CardList";
import logbookEntries from "../../assets/mockData/logbookEntries";

const Home = ({ jumpData }) => {
  return (
    <>
      <Navbar />
      <CardList logbookEntries={logbookEntries} jumpData={jumpData} />
    </>
  );
};

export default Home;
