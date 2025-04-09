CREATE DATABASE ProjectDEPI;
USE ProjectDEPI;
CREATE TABLE Student_Details (
    StudentID INT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    DateOfBirth DATE NOT NULL,
    Email VARCHAR(100) UNIQUE NOT NULL,
    New_member ENUM('Yes', 'No')
);
CREATE TABLE Courses (
    CourseID INT PRIMARY KEY,
    Title VARCHAR(100) NOT NULL,
    Description TEXT,
    Credits INT CHECK (Credits >= 0)
);
CREATE TABLE Enrollments (
    EnrollmentID INT PRIMARY KEY,
    StudentID INT,
    CourseID INT,
    Grade CHAR(1),
    FOREIGN KEY (StudentID) REFERENCES Student_Details(StudentID)
        ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (CourseID) REFERENCES Courses(CourseID)
        ON DELETE CASCADE ON UPDATE CASCADE
);
INSERT INTO Student_Details (StudentID, Name, DateOfBirth, Email)
VALUES 
(1, 'Ibrahim', '1997-02-23', 'ibrahim.mohamed@gmail.com'),
(2, 'Aly', '1997-02-23', 'Aly.farag@gmail.com'),
(3, 'Alaa', '1998-02-23', 'Alaa2626@gmail.com'),
(4, 'Amany', '1998-02-23', 'Amany2676@gmail.com'),
(5, 'Sarah', '1998-02-23', 'sarah10@gmail.com'),
(6, 'Ahmed', '1998-02-23', 'Ahmed.hassan11@gmail.com');

INSERT INTO Courses (CourseID, Title, Description, Credits)
VALUES 
(101, 'Introduction to Programming', 'Learn the basics of programming using Java.', 3),
(102, 'Database Systems', 'Understand relational databases and SQL.', 4),
(103, 'Web Development', 'Create websites using HTML, CSS, and JavaScript.', 3),
(104, 'Software Testing', 'Principles and tools for manual and automated testing.', 2);
INSERT INTO Enrollments (EnrollmentID, StudentID, CourseID, Grade)
VALUES 
(1, 1, 101, 'A'),
(2, 1, 102, 'B'),
(3, 2, 101, 'C'),
(4, 3, 104, 'B');

UPDATE Student_Details
Set DateOfBirth = '1994-02-23'
WHERE StudentID = 4;
UPDATE Student_Details
Set DateOfBirth = '1994-02-22'
WHERE StudentID = 1;
UPDATE Student_Details
Set DateOfBirth = '1994-10-1'
WHERE StudentID = 6;
UPDATE Student_Details
Set DateOfBirth = '1994-02-23'
WHERE StudentID = 5;
DELETE FROM Student_Details
WHERE StudentID = 6;
INSERT INTO Student_Details (StudentID, Name, DateOfBirth, Email)
VALUES (6, 'Ahmed', '1994-02-23', 'ahmed.adel@example.com');

DELETE FROM users WHERE email = 'alaa@gmail.com';

DESCRIBE student_details;

ALTER TABLE student_details
MODIFY COLUMN StudentID INT;
SELECT 
    sd.Name AS StudentName, 
    sd.Email AS StudentEmail, 
    c.Title AS CourseTitle
FROM 
    student_details sd
LEFT JOIN 
    enrollments e ON sd.StudentID = e.StudentID
LEFT JOIN 
    courses c ON e.CourseID = c.CourseID;
    
    SELECT 
    sd.Name AS StudentName, 
    sd.Email AS StudentEmail, 
    c.Title AS CourseTitle
FROM 
    student_details sd
JOIN 
    enrollments e ON sd.StudentID = e.StudentID
JOIN 
    courses c ON e.CourseID = c.CourseID;
    
    SELECT 
    sd.Name AS StudentName, 
    sd.Email AS StudentEmail, 
    c.Title AS CourseTitle
FROM 
    student_details sd
RIGHT JOIN 
    enrollments e ON sd.StudentID = e.StudentID
RIGHT JOIN 
    courses c ON e.CourseID = c.CourseID;






