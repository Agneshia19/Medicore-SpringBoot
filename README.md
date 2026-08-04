🏥 MediCore – Hospital Management System

## 📖 Overview

MediCore is a backend Hospital Management System developed using Java Spring Boot. It provides REST APIs to manage patients, doctors, and appointments while following a clean layered architecture.

This project was built to practice real-world backend development concepts such as REST APIs, database integration, validation, exception handling, entity relationships, and API documentation.

---

## ✨ Features

- Patient Management (Create, Read, Update, Delete)
- Doctor Management (Create, Read, Update, Delete)
- Appointment Management (Create, Read, Update, Delete)
- Patient–Doctor relationship using JPA
- DTO implementation for clean API responses
- Global Exception Handling
- Input Validation
- Swagger API Documentation
- MySQL Database Integration

---

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Swagger (OpenAPI)
- Postman
- Git & GitHub

---

## 📂 Project Structure

src
 ├── controller
 ├── service
 ├── repository
 ├── entity
 ├── dto
 ├── exception
 └── resources

---

## 📌 API Modules

### Patient API

- Create Patient
- Get All Patients
- Update Patient
- Delete Patient

### Doctor API

- Create Doctor
- Get All Doctors
- Update Doctor
- Delete Doctor

### Appointment API

- Create Appointment
- Get All Appointments
- Update Appointment
- Delete Appointment

---

## 🗄️ Database

Database: MySQL

The project uses Spring Data JPA with Hibernate to communicate with the database.

---

## 🗂️ ER Diagram

The following diagram represents the database structure and relationships between patients, doctors, and appointments.

![MediCore ER Diagram](Medicode-ER-diagram.png)

---

## 📚 API Documentation

Swagger UI is available after running the project.

---

## 🚀 Future Improvements

- Spring Security Authentication
- JWT Authorization
- Role-Based Access Control
- File Upload Support
- Email Notifications
- Docker Deployment

---

## 👨‍💻 Author

Developed by Agneshia Khalid

This project was created as part of my backend development learning journey using Java Spring Boot
