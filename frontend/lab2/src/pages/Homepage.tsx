import { FC } from "react";
import { Link, Route, Routes } from "react-router-dom";

import Courses from "../components/Courses";

interface Props {}

const Homepage: FC<Props> = () => {
  return (
    <>
      <div>hello</div>
      <nav>
        <Link to={""}>Home</Link>
        <Link to={"student"}>--stu</Link>
      </nav>

      <Routes>
        <Route path="" element={<div>Welcome to home page</div>} />
        <Route path="student" element={<Courses />} />
      </Routes>
    </>
  );
};
export default Homepage;
