import { FC, Fragment, useEffect, useState } from "react";
import ICourse from "../types/ICourse";
import axios from "axios";

const Courses: FC = () => {
  const [courses, setCourses] = useState<ICourse[]>([]);
  const [loading, setLoading] = useState(false);

  useEffect(() => {
    const fetchCourses = async () => {
      try {
        const response = await axios.get<ICourse[]>(
          "http://localhost:8080/courses"
        );

        setCourses(response.data);
      } catch (error) {
        console.error("Error fetching courses:", error);
      }
    };

    fetchCourses();
  }, []);
  return (
    <Fragment>
      {courses.map((course) => (
        <div key={course.id}>{course.name}</div>
      ))}
    </Fragment>
  );
};
export default Courses;
