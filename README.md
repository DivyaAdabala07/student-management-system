# 🎓 Student Management System

A Spring Boot application to manage student records for an educational institute. This project provides a simple web interface to perform CRUD operations, search, and view student data efficiently.

---

## 🚀 Features

- Add, update, delete, and view student records
- Search students by name or class
- Validation for email and age
- Pagination for student list
- Thymeleaf-based UI
- In-memory H2 database
- Error handling and user-friendly messages

---

## 🛠 Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Spring MVC (Web)
- Thymeleaf
- H2 Database
- Maven

---

## 🗂 Project Structure

src/
└── main/
    ├── java/
    │   └── com/example/studentmanagement/
    │       ├── controller/
    │       ├── service/
    │       ├── repository/
    │       └── entity/
    └── resources/
        ├── templates/students/
        │   ├── list.html
        │   ├── add.html
        │   └── edit.html
        ├── application.properties
