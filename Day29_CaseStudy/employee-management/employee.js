import mysql from 'mysql2/promise';

// 1. Connect to MySQL
const connection = await mysql.createConnection({
  host: 'localhost',
  user: 'root',       // change if your MySQL username is different
  password: 'P@ssword123',        // add your MySQL password if you set one
  database: 'employeeDB'
});

console.log("Connected to MySQL!");

// 2. Add new employee
async function addEmployee(name, email, department) {
  const [result] = await connection.execute(
    'INSERT INTO employees (name, email, department) VALUES (?, ?, ?)',
    [name, email, department]
  );
  console.log("Employee Added:", result.insertId);
}

// 3. List all employees
async function listEmployees() {
  const [rows] = await connection.execute('SELECT * FROM employees');
  console.log("All Employees:", rows);
}

// 4. Update employee info
async function updateEmployee(id, newDepartment) {
  await connection.execute(
    'UPDATE employees SET department = ? WHERE id = ?',
    [newDepartment, id]
  );
  console.log(`Employee ${id} updated!`);
}

// 5. Delete employee
async function deleteEmployee(id) {
  await connection.execute('DELETE FROM employees WHERE id = ?', [id]);
  console.log(`Employee ${id} deleted!`);
}

// Demo Workflow
await addEmployee("Alice", "alice@example.com", "HR");
await addEmployee("Bob", "bob@example.com", "IT");

await listEmployees();

await updateEmployee(2, "Finance");

await listEmployees();

await deleteEmployee(1);

await listEmployees();

await connection.end();
