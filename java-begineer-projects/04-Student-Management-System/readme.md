# Student Management System

A simple **console-based Student Management System built in Java**.

This project was created to practice and strengthen my understanding of **Java fundamentals, Object-Oriented Programming (OOP), arrays of objects, methods, constructors, loops, conditional statements, and user input**.

## 🚀 Features

The system provides the following operations:

1. **Add Student**

   * Add a new student with:

     * Student ID
     * Name
     * Age
     * Marks

2. **View All Students**

   * Display the details of all students currently stored in the system.

3. **Search Student**

   * Search for a student using their Student ID.

4. **Update Student**

   * Update the student's:

     * Name
     * Age
     * Marks

5. **Delete Student**

   * Delete a student using their Student ID.
   * Includes a confirmation before deletion.

6. **Exit**

   * Exit the application.

## 🛠️ Concepts Used

This project helped me practice:

* Java Classes and Objects
* Constructors
* Instance Variables
* Methods
* Object Arrays
* `Scanner` for user input
* `if-else` statements
* `while` loops
* `for` loops
* `break`
* Boolean flags
* `null` references
* Searching through arrays
* Updating objects
* Deleting object references
* Menu-driven programming
* Basic Object-Oriented Programming

## 📂 Project Structure

```text
Student Management System
│
└── Projects.java
    ├── Student
    │   ├── id
    │   ├── name
    │   ├── age
    │   ├── marks
    │   └── display()
    │
    ├── StudentManagementSystem
    │   ├── add()
    │   ├── display()
    │   ├── search()
    │   ├── update()
    │   └── delete()
    │
    └── main()
```

## 💻 How It Works

The program stores students inside an array of `Student` objects:

```java
Student students[] = new Student[100];
```

Each position in the array can contain a `Student` object.

When a student is added, a new object is created using the constructor:

```java
Student st = new Student(id, name, age, marks);
```

The object is then stored in the first available position in the array.

For searching, updating, and deleting, the program loops through the array and compares the entered ID with the student's ID.

## ▶️ Example Menu

```text
===== STUDENT MANAGEMENT SYSTEM =====
1. Add Student
2. View All Students
3. Search Student
4. Update Student
5. Delete Student
6. Exit

Enter your choice:
```

## 📌 Example

Adding a student:

```text
Enter Id: 101
Enter Name: Rahul
Enter Age: 20
Enter Marks: 87.5
```

Viewing the student:

```text
==== Students Details ====
Id: 101
Name: Rahul
Age: 20
Marks: 87.5
---------------------------
```

## 🎯 Purpose of the Project

The main purpose of this project was to move beyond individual Java practice programs and build a **complete working application** using the concepts I have learned so far.

It also helped me improve my problem-solving skills by implementing operations such as:

* Finding an empty position in an object array
* Searching for a particular student
* Updating an existing object
* Removing an object from an array
* Handling cases where a student does not exist

## 🔮 Future Improvements

Possible improvements for future versions:

* Prevent duplicate Student IDs
* Handle the case when all 100 student slots are full
* Allow names containing spaces
* Add grade calculation
* Sort students by marks
* Find the student with the highest marks
* Add more student information
* Use `ArrayList` instead of a fixed-size array
* Improve input validation
* Add a graphical user interface

## 📚 Learning

This project is part of my **Java learning journey** and is helping me build a stronger foundation before moving toward more advanced Java concepts and DSA.

---

**Language:** Java
**Type:** Console Application
**Level:** Beginner
**Focus:** Java Fundamentals + OOP
