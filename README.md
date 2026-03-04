 **Student Management System**

A console-based Student Management System developed using Core Java, JDBC, and MySQL, implementing the DAO (Data Access Object) and DTO (Data Transfer Object) design patterns.

This project demonstrates structured application development, database integration, and clean architecture principles.

 **Overview**

The Student Management System enables efficient management of student records through a menu-driven interface. It performs database operations such as adding and retrieving student details while maintaining separation of concerns using layered architecture.

This project is designed to strengthen understanding of:

JDBC connectivity

MySQL database integration

DAO & DTO design patterns

Modular project structuring

Exception handling in Java

** Features**

Add new student records

View all students

Persistent data storage using MySQL

Structured package-based architecture

Reusable and maintainable code design

🛠 Technology Stack

Programming Language: Java

Database: MySQL

Connectivity: JDBC (MySQL Connector/J)

IDE/Editor: VS Code / IntelliJ IDEA

🏗 Project Architecture

The project follows a layered architecture to ensure clean separation between data representation, business logic, and database access.

StudentManagementSystem/
│
├── dto/        → Data Transfer Objects
├── dao/        → Data Access Interfaces & Implementations
├── util/       → Database Utility Classes
└── main/       → Application Entry Point
🔹 DTO Layer

Contains the Student class used to transfer data between layers.

🔹 DAO Layer

Defines database operations and their implementation.

🔹 Utility Layer

Manages database connection handling.

🔹 Main Layer

Handles user interaction and application flow.

🗄 Database Configuration
Create Database
CREATE DATABASE studentdb;
USE studentdb;
Create Table
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    marks DOUBLE
);
🔌 Database Connection Setup

Update credentials in DBConnection.java:

String url = "jdbc:mysql://localhost:3306/studentdb";
String username = "root";
String password = "your_password";

Ensure:

MySQL Server is running

MySQL Connector JAR is added to the lib folder

JAR file is included in the classpath during compilation
