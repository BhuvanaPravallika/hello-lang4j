# 🚀 HelloLang4j - GenAI Chat Agent

![Java](https://img.shields.io/badge/Java-17+-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![LangChain4j](https://img.shields.io/badge/LangChain4j-GenAI-orange)
![Maven](https://img.shields.io/badge/Maven-Build-red)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

A console-based Generative AI chatbot built using **Spring Boot** and **LangChain4j**.

---

## 📌 Overview

HelloLang4j is a simple AI-powered chat application that runs in the console.  
It demonstrates how to integrate **LangChain4j** with a **Spring Boot** project to interact with an OpenAI-compatible chat model.

The application:

- Starts a Spring Boot application
- Connects to an OpenAI-compatible AI model
- Accepts user input from the console
- Sends prompts to the AI model
- Displays AI-generated responses
- Continues until the user types `exit`

---

## 🏗️ Tech Stack

- ☕ Java 17+
- 🌱 Spring Boot
- 🤖 LangChain4j
- 📦 Maven
- 🔗 OpenAI-Compatible API

---

## 📂 Project Structure

```
hello-lang4j/
│
├── pom.xml
├── mvnw
├── mvnw.cmd
├── .mvn/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/ai/HelloLang4j/
│       │       └── HelloLang4jApplication.java
│       └── resources/
│           └── application.properties
```

---

## 🧠 How It Works

1. The application initializes `OpenAiChatModel`
2. A console loop reads user input
3. Input is converted to `UserMessage`
4. The AI model generates a response
5. Response is printed to the console

---

## 🔧 Core Implementation

```java
OpenAiChatModel model = OpenAiChatModel.builder()
        .apiKey("demo")
        .baseUrl("http://langchain4j.dev/demo/openai/v1")
        .modelName("gpt-4o-mini")
        .build();

String answer = model.generate(
        UserMessage.from(input)
).content().text();
```

---

## ▶️ How to Run

### 1️⃣ Clone Repository

```
git clone https://github.com/YOUR_USERNAME/hello-lang4j.git
cd hello-lang4j
```

### 2️⃣ Build Project

```
mvn clean install
```

### 3️⃣ Run Application

```
mvn spring-boot:run
```

OR

```
java -jar target/hello-lang4j-0.0.1-SNAPSHOT.jar
```

---

## 💬 Sample Output

```
AI Chat started. Type 'exit' to quit.
prompt> Explain AI in simple terms
AI> Artificial Intelligence is technology that allows machines to think and learn like humans...
```

---

## 🔐 Security Best Practice

⚠️ Do NOT hardcode API keys in production.

Instead use environment variables:

```java
.apiKey(System.getenv("OPENAI_API_KEY"))
```

---

## 🚀 Future Enhancements

- ✅ Add conversation memory
- ✅ Convert to REST API
- ✅ Add RAG (Retrieval-Augmented Generation)
- ✅ Integrate vector database
- ✅ Connect React frontend
- ✅ Dockerize application
- ✅ Deploy to cloud

---

## 🎯 Learning Goals

This project demonstrates:

- Integrating GenAI into Java applications
- Using LangChain4j chat models
- Building console-based AI agents
- Applying clean Spring Boot structure

---

## 👩‍💻 Author

**Bhuvana**

Aspiring Generative AI Engineer  
Spring Boot | LangChain4j | Java

---

⭐ If you found this project useful, consider giving it a star!
