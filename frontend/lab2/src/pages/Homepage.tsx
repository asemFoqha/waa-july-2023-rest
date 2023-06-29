import { FC } from "react";
import { Link, Route, Routes } from "react-router-dom";

interface Props {}

const Homepage: FC<Props> = () => {
  return (
    <>
      <div>hello</div>
      <nav>
        <Link to={"home"}>Home</Link>
        <Link to={"student"}>--stu</Link>
      </nav>

      <Routes>
        <Route path="" element={<div>hello link 1</div>} />
        <Route path="student" element={<div>hello link 2</div>} />
      </Routes>
    </>
  );
};
export default Homepage;
