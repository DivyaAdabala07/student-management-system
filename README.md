# 🎓 Student Management System

A Spring Boot-based RESTful application to manage student records efficiently. This system allows adding, updating, retrieving, and deleting student information, backed by PostgreSQL.

---

## 🛠️ Features

- Add new student records
- Update existing student data
- Delete student by ID
- Retrieve all students
- Retrieve a single student by ID
- RESTful API integration
- PostgreSQL database support

---

## 🚀 Technologies Used

- Java 17
- Spring Boot 3
- Spring Web
- Spring Data JPA
- PostgreSQL
- Lombok
- Maven

---

## 🗂️ Project Structure

```
student-management/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/student/
│   │   │       ├── controller/
│   │   │       ├── entity/
│   │   │       ├── repository/
│   │   │       ├── service/
│   │   │       └── StudentManagementApplication.java
│   │   └── resources/
│   │       └── application.properties
├── pom.xml
└── README.md
```

---

## ⚙️ Setup Instructions

### ✅ Prerequisites
- Java 17+
- Maven
- PostgreSQL
- IDE (IntelliJ / Eclipse)
- Git

### 🔧 Configuration

1. Create a PostgreSQL database (e.g., `student_db`)
2. Update `application.properties` with your DB credentials:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/student_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### ▶️ Run the Project

```bash
# Compile and run
mvn spring-boot:run
```

API will be available at: `http://localhost:8080/students`

---

## 📫 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| `POST` | `/students` | Add a new student |
| `GET` | `/students` | Get all students |
| `GET` | `/students/{id}` | Get student by ID |
| `PUT` | `/students/{id}` | Update student by ID |
| `DELETE` | `/students/{id}` | Delete student by ID |

---

## 🙌 Contributors

- 👩‍💻 Divya Adabala

---

## 📜 License

This project is licensed under the MIT License - feel free to use, modify, and distribute.

---
