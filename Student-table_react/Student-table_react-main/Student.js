import React from "react";


function Student() {
  
  const students = [
    { id: 1, name: "Alice", mark1: 85, mark2: 90 },
    { id: 2, name: "Bob", mark1: 70, mark2: 65 },
    { id: 3, name: "Charlie", mark1: 50, mark2: 55 },
    { id: 4, name: "David", mark1: 95, mark2: 92 }
  ];

  
  const calculateGrade = (total) => {
    if (total >= 180) return "A+";
    else if (total >= 150) return "A";
    else if (total >= 120) return "B";
    else if (total >= 100) return "C";
    else return "Fail";
  };

  return (
    <div className="student-container">
      <h2>Student Report</h2>
      <table className="student-table">
        <thead>
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Mark 1</th>
            <th>Mark 2</th>
            <th>Total</th>
            <th>Grade</th>
          </tr>
        </thead>
        <tbody>
          {students.map((stu) => {
            const total = stu.mark1 + stu.mark2;
            const grade = calculateGrade(total);
            return (
              <tr key={stu.id}>
                <td>{stu.id}</td>
                <td>{stu.name}</td>
                <td>{stu.mark1}</td>
                <td>{stu.mark2}</td>
                <td>{total}</td>
                <td>{grade}</td>
              </tr>
            );
          })}
        </tbody>
      </table>
    </div>
  );
}

export default Student;
