# 🚀 JaruratCare Chatbot API

A simple **WhatsApp chatbot backend simulation** built using **Java and Spring Boot**, designed for **Jarurat NGO** to automate basic user interactions.

---

## 📌 Overview

This project simulates a chatbot system where user messages are received via a REST API and responded to with predefined replies. It demonstrates core backend concepts such as:

* REST API development
* JSON request handling
* Layered architecture (Controller → Service)
* Logging using SLF4J
* Basic frontend-backend integration

---

## 🛠️ Tech Stack

* **Java**
* **Spring Boot**
* **Lombok**
* **SLF4J (Logging)**
* **HTML, CSS, JavaScript (Frontend)**

---

## ⚙️ Features

* ✅ REST API endpoint (`/api/webhook`) to receive messages
* ✅ Accepts JSON input simulating WhatsApp messages
* ✅ Returns predefined responses:

  * `Hi` → `Hello`
  * `Bye` → `Goodbye`
  * Default → fallback message
* ✅ Logs all incoming and outgoing messages
* ✅ Simple frontend UI to interact with chatbot
* ✅ Clean layered architecture (Controller + Service)

---

## 📂 Project Structure

```
src/main/java/com/ngo/jaruratCare/
│
├── controller/
│     └── WebhookController.java
│
├── service/
│     └── ChatService.java
│
├── dto/
│     └── MessageRequest.java
│
└── JaruratCareApplication.java


src/main/resources/
│
├── static/
│     ├── index.html
│     ├── style.css
│     └── script.js
```

---

## 🔌 API Endpoint

### POST `/api/webhook`

#### Request:

```json
{
  "message": "Hi"
}
```

#### Response:

```
Hello
```

---

## 🧪 How to Run

1. Clone the repository
2. Open in IntelliJ / Eclipse
3. Run the Spring Boot application

👉 Backend runs at:

```
http://localhost:8080
```

👉 Open frontend:

```
http://localhost:8080
```

---

## 📸 How It Works

1. User enters a message in the UI
2. Frontend sends POST request to `/api/webhook`
3. Backend processes message via service layer
4. Response is sent back and displayed

---

## 🧠 Key Learnings

* Understanding of REST APIs in Spring Boot
* JSON to Java object mapping using `@RequestBody`
* Clean code practices using service layer
* Logging using industry-standard tools
* Basic frontend-backend integration

---

## 🚀 Future Improvements

* 🔹 Add database to store chat history
* 🔹 Integrate real WhatsApp API (Meta)
* 🔹 Add AI-based responses (ChatGPT/Gemini)
* 🔹 Enhance UI (chat bubbles, history, styling)

---

## 👨‍💻 Author

**Prakhar Chaudhary**

* 📧 [prakharchaudhary0302@gmail.com](mailto:prakharchaudhary0302@gmail.com)
* 🔗 [LinkedIn](https://www.linkedin.com/in/prakhar-chaudhary-94a84a2b7/)
* 💻 [GitHub](https://github.com/Prakhar3518)

---

## ⭐ Contribution

This project was developed as a learning and demonstration project for backend fundamentals and chatbot simulation.

---

> Built with ❤️ for Jarurat NGO
