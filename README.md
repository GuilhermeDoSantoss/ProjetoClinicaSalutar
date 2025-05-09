## 📁 Physiotherapy Clinic Record System

This is a complete software solution developed from scratch for a physiotherapist who needed a system to manage patient records digitally. The professional had been relying on paper-based records and had no secure or organized method of storing medical media such as exam results or reports. This project was created specifically to solve this problem.

## 🏥 Problem Statement

A client approached us with a challenge: he owns a physiotherapy clinic (but the software was developed solely for his personal use) and still handles patient records on paper. Furthermore, he receives various medical documents (e.g., exams, reports) from patients but cannot retain physical copies.

Using our technical knowledge, we created a complete software system to digitize this process and centralize all his patient data and medical media.

**✅ Requirements Covered**

The project was built using the following technologies and skills:

**📌 Backend**

Java (Spring Boot for RESTful API development)

Algorithms and Programming Logic

Version Control with Git

PostgreSQL database

Docker (for creating containers and images)

**🎨 Frontend**

Angular

HTML & CSS

## 🧪 Available Services

Service	Description	Input	Expected Output

**createRecord**
Creates a new patient record	record: Record	Success → Created Record with ID
Failure → null

**findRecordByName**
Searches records by patient name	keyword: String	Success → List of Records
Failure → null

**updateRecord**
Updates an existing patient record	record: Record	Success → Updated Record
Failure → null


**getRecordById**
Opens a record by its ID	id: int	Success → Record
Failure → null

**addMediaToRecord**
Attaches media to a patient record	record: Record, media: Media	Success → Updated Record
Failure → null

**upload**
Uploads a media file (photo, video, or document)	file: MediaFile	Success → Server file path
Failure → null

## ⚠️ Upload Constraints
The upload service includes validation and restrictions to ensure quality and security:

Accepted formats: JPG, PNG, MP4, PDF, DOC

File size limit

Resolution constraints

## 🔄 Roadmap
v1.0: Basic upload service

v2.0: Integrate FFmpeg to optimize video resolution and reduce file size automatically.

## 🧰 How to Run (Dockerized)
To run the full stack using Docker:

**Backend**

docker build -t clinic-api ./backend

docker run -d -p 8080:8080 clinic-api

**Frontend**

docker build -t clinic-frontend ./frontend

docker run -d -p 4200:80 clinic-frontend

PostgreSQL and other services should be configured via docker-compose.yml if needed.

## 📌 Version

1.0.0 – Initial full version with CRUD, upload, and basic validations.

## 👤 Author
**Guilherme – Software Engineer | Java Developer**
