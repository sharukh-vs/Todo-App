# 📝 Todo App

A simple Spring Boot-based Todo application.

## 🚀 Features
- Add tasks
- View task list
- Toggle task completion status
- Delete tasks

## 🛠️ Tech Stack
- **Backend:** Spring Boot, Spring MVC, Hibernate
- **Frontend:** Thymeleaf, Bootstrap
- **Database:** H2 Database / MySQL
- **Build Tool:** Maven

## 🔧 Setup & Installation

### Prerequisites
Ensure you have the following installed:
- Java 17+
- Maven
- Git

### Steps
1. Clone this repository:
   ```sh
   git clone https://github.com/sharukh-vs/Todo-App.git
   ```
2. Navigate to the project folder:
   ```sh
   cd Todo-App
   ```
3. Build the project:
   ```sh
   mvn clean install
   ```
4. Run the application:
   ```sh
   mvn spring-boot:run
   ```
5. Open in browser:  
   ```
   http://localhost:8080/task
   ```

## 📂 Project Structure
```
Todo-App/
│-- src/
│   ├── main/
│   │   ├── java/com/app/todoapp/
│   │   │   ├── controller/
│   │   │   ├── models/
│   │   │   ├── repository/
│   │   │   ├── service/
│   │   ├── resources/
│   │   │   ├── templates/
│   │   │   ├── application.properties
│-- pom.xml
│-- README.md
```

## 🎯 API Endpoints
| HTTP Method | Endpoint         | Description |
|------------|-----------------|-------------|
| GET        | `/task`          | View all tasks |
| POST       | `/task`          | Add a new task |
| GET        | `/task/{id}/toggle` | Toggle task status |
| DELETE     | `/task/{id}`     | Delete a task |

## 📷 Screenshots
![image](https://github.com/user-attachments/assets/378e9178-3bc0-47e0-9a15-aca02b3ec8cc)


## 🤝 Contributing
Contributions are welcome! Follow these steps:
1. Fork the repository
2. Create a new branch (`feature-branch`)
3. Commit your changes
4. Push and create a PR

## 📜 License
This project is open-source and available under the [MIT License](LICENSE).

---


