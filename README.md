# ☕ Java Low-Level Design (LLD) Practice

A curated, production-grade repository of classic **Low-Level Design (LLD) and Object-Oriented Design (OOD)** interview problems implemented in **Java 21** using clean architecture and design patterns.

Built as a **Maven Multi-Module Monorepo**, every problem is an independent, fully-runnable module with its own models, services, simulation runners (`Main.java`), and automated test suites.

---

## 📚 Problems Catalog & Roadmap

| # | Problem | Key Design Patterns | Status | Module Link |
|:---:|:---|:---|:---:|:---:|
| 1 | **Smart Parking Lot System** | Strategy, Facade, Factory | ✅ Completed | [smart-parking-lot](./smart-parking-lot) |
| 2 | **Elevator System** | State, Strategy, Observer | 📝 Planned | Upcoming |
| 3 | **Snake and Ladder** | Strategy, Game Loop, State | 📝 Planned | Upcoming |
| 4 | **Tic Tac Toe** | Strategy, Minimax / Rules Engine | 📝 Planned | Upcoming |
| 5 | **Rate Limiter (Token Bucket / Leaky Bucket)** | Strategy, Token Bucket, Sliding Window | 📝 Planned | Upcoming |
| 6 | **In-Memory Cache (LRU / LFU)** | Doubly Linked List + HashMap, Eviction Strategy | 📝 Planned | Upcoming |
| 7 | **Splitwise (Expense Sharing System)** | Strategy, Composite, Observer | 📝 Planned | Upcoming |
| 8 | **BookMyShow (Movie Booking System)** | Concurrency Locks, Observer, State | 📝 Planned | Upcoming |
| 9 | **Vending Machine** | State Pattern, Chain of Responsibility | 📝 Planned | Upcoming |
| 10 | **ATM System** | State Pattern, Chain of Responsibility | 📝 Planned | Upcoming |

---

## 🏗️ Repository Architecture

This project is structured as a Maven multi-module monorepo:

```text
java-lld-practice/
├── pom.xml                                   # Root Parent POM (Java 21, dependency management)
├── README.md                                 # Master documentation and problem catalog
├── .gitignore
│
├── smart-parking-lot/                        # Module 1
│   ├── pom.xml
│   ├── README.md
│   ├── docs/
│   │   └── parking-lot-uml.png
│   └── src/
│       ├── main/java/
│       │   ├── enums/
│       │   ├── model/
│       │   ├── service/
│       │   ├── utils/
│       │   └── Main.java                     # Runnable console app
│       └── test/java/
│           └── ParkingLotTest.java           # Unit tests
│
├── <next-problem>/                           # Module 2, 3, ...
│   ├── pom.xml
│   └── src/
```

### Why Multi-Module?
- **Single Workspace**: Open the entire repository in IntelliJ IDEA once and practice all problems without switching project windows.
- **Complete Isolation**: Each module is self-contained with its own classpath and runners. Code in one problem never pollutes another.
- **Centralized Dependencies**: Common testing libraries (JUnit 5, Mockito) and utilities (Lombok) are managed from the root `pom.xml`.

---

## 🚀 Getting Started

### Prerequisites
- **Java**: OpenJDK 21 or later (`java -version`)
- **Maven**: Apache Maven 3.9+ (`mvn -version`)
- **IDE**: IntelliJ IDEA (recommended) or VS Code

### Building the Entire Project
To build all modules and run all test suites across the repository:
```bash
mvn clean test
```

### Running a Specific Problem

#### Via Terminal:
Run the console application for any module directly using `mvn exec:java`:
```bash
# Run Smart Parking Lot
mvn exec:java -pl smart-parking-lot
```

#### Via IntelliJ IDEA:
1. Open the project root folder in IntelliJ IDEA (**File -> Open** -> select `java-lld-practice`).
2. IntelliJ will automatically detect the root `pom.xml` and import all sub-modules.
3. Navigate to any module's `src/main/java/Main.java`.
4. Click the green **▶ Run** icon next to `public static void main`.

---

## ➕ Adding a New LLD Problem

Adding a new design problem takes under 30 seconds:

1. **Create the module folder structure**:
   ```bash
   mkdir -p elevator-system/src/main/java
   mkdir -p elevator-system/src/test/java
   ```

2. **Add a child `pom.xml`** inside `elevator-system/`:
   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <project xmlns="http://maven.apache.org/POM/4.0.0"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
       <modelVersion>4.0.0</modelVersion>
       <parent>
           <groupId>com.rohit.lld</groupId>
           <artifactId>java-lld-practice</artifactId>
           <version>1.0.0-SNAPSHOT</version>
       </parent>
       <artifactId>elevator-system</artifactId>
       <name>Elevator System</name>
   </project>
   ```

3. **Register the module** in the root `pom.xml`:
   ```xml
   <modules>
       <module>smart-parking-lot</module>
       <module>elevator-system</module>
   </modules>
   ```

4. Create your `Main.java` and start designing!

---

## 📜 License

This project is licensed under the MIT License - feel free to use it for learning, interview prep, and reference!
