# Hotel Management System

A full-stack hotel management application built using **Spring Boot** for the backend and **React** for the frontend. This project allows hotel staff to manage room bookings, customers, and hotel services efficiently.
<img width="947" alt="hotel" src="https://github.com/user-attachments/assets/249b35b7-59ff-4d46-bdcd-a415bf805b34">


## Project Structure

hotel-management-system/ ├── hotel-management-server/ # Backend (Spring Boot) ├── hotel-management-client/ # Frontend (React) └── README.md # Project documentation


## Features

- **Room Management**: Add, update, and delete room information, including room types, availability, and pricing.
- **Customer Management**: Manage customer check-ins and check-outs, customer profiles, and booking history.
- **Booking Management**: Book rooms for customers, update bookings, and cancel reservations.
- **Service Management**: Manage hotel services like room service, housekeeping, and other amenities.
- **Authentication**: Secure login and role-based access control for admins and hotel staff.
- **Responsive UI**: Frontend built using React with a responsive design for mobile and desktop.

## Technology Stack

### Backend (hotel-management-server)

- **Java 11+**
- **Spring Boot 3**
  - Spring MVC (REST APIs)
  - Spring Data JPA (Database interactions)
  - Spring Security (Authentication & Authorization)
- **MySQL** (or PostgreSQL) - For storing data
- **JPA/Hibernate** - ORM for database management
- **Maven** - Dependency management and build tool

### Frontend (hotel-management-client)

- **React 18** with modern hooks
- **React Router** - For routing
- **Axios** - For making HTTP requests to the backend
- **Material-UI** - For a clean and responsive UI
- **Vite** (or Create React App) - For React project setup

## Getting Started

### Prerequisites

- **Java 11+** installed
- **Node.js 16+** installed
- **MySQL** or **PostgreSQL** installed
- **Maven** and **npm** installed

### Clone the repository

```bash
git clone https://github.com/yourusername/hotel-management-system.git
cd hotel-management-system
```

### Backend setup


cd hotel-management-server
mvn clean install
mvn spring-boot:run

### front setup

cd ../hotel-management-client
npm install

