# 💼 Job Searching System

> A console-based Java application for browsing job listings and registering applicants — built with OOP principles, inheritance, and polymorphism.

---

## 📌 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Project Structure](#project-structure)
- [Class Hierarchy](#class-hierarchy)
- [Getting Started](#getting-started)
- [Usage Walkthrough](#usage-walkthrough)
- [Available Job Positions](#available-job-positions)
- [Validation Rules](#validation-rules)
- [Technologies Used](#technologies-used)
- [Future Improvements](#future-improvements)
- [Contact](#contact)

---

## 📖 Overview

**Job Searching System** is a Java console application that simulates a simple job portal. Users can browse available job positions, view detailed job requirements, and register as applicants. The system validates applicant eligibility based on age requirements before confirming registration.

The project demonstrates core **Object-Oriented Programming** concepts:
- **Abstraction** — via the `Job` abstract class
- **Inheritance** — `SalesManager` and `VideoEditor` extend `Job`
- **Polymorphism** — `showDetails()` is overridden in each subclass
- **Encapsulation** — `User` fields are private with getters/setters

---

## ✨ Features

- 📋 Browse multiple job listings from a menu
- 🔍 View detailed job information (location, salary, hours, requirements)
- ✅ Eligibility check before registration
- 📝 Applicant registration with name, phone, and age
- 🗂️ In-memory storage of registered users using `ArrayList`
- ⚠️ Age-based validation with informative error messages
- 📧 Post-registration instructions for submitting a CV

---

## 📁 Project Structure

```
job-searching-system/
│
├── Job.java          # Abstract base class for all job types
├── Salse.java        # Contains SalesManager, VideoEditor, and User classes
└── Main.java         # Entry point — handles menu, signup flow, and registration
```

---

## 🧬 Class Hierarchy

```
Job  (abstract)
├── SalesManager       — adds: experienceYears (int)
└── VideoEditor        — adds: software (String)

User                   — standalone model for registered applicants
Main                   — controller with static methods for flow management
```

### Class Responsibilities

| Class | File | Responsibility |
|---|---|---|
| `Job` | `Job.java` | Abstract base with shared job fields and `showDetails()` |
| `SalesManager` | `Salse.java` | Extends `Job`; adds experience years requirement |
| `VideoEditor` | `Salse.java` | Extends `Job`; adds required software skill |
| `User` | `Salse.java` | Stores applicant info; getters, setters, `displayInfo()` |
| `Main` | `Main.java` | Menu loop, signup handling, age validation, registration |

---

## 🚀 Getting Started

### Prerequisites

- Java JDK 8 or higher
- A terminal / command prompt
- (Optional) An IDE like IntelliJ IDEA, Eclipse, or VS Code with Java extension

### Compilation

```bash
# Navigate to the project directory
cd job-searching-system

# Compile all files
javac Job.java Salse.java Main.java
```

### Run

```bash
java Main
```

---

## 🖥️ Usage Walkthrough

```
---= Welcome to Job Searching System =---

== Job Positions ==
1. Sales Manager
2. Video Editor
3. Exit
Please enter your choice: 1

== Your choice is Sales Manager ==

=== Job Details ===
Title: Sales Manager
Location: Bole
Age Range: 25-43
Working Time: 8 hours/day
Salary: 25000.0 ETB
Experience Required: 3 years

DO YOU FULFILL THE REQUIREMENT?
1. Yes
2. No
Choice: 1

--- Sign Up ---
Enter Full Name: Abebe Kebede
Enter Phone Number: 0911121314
Enter Your Age: 30

--- Saved User Details ---
Name: Abebe Kebede
Age: 30
Phone: 911121314

Registered successfully !!!
Attach your CV or portfolio on Gmail.
Gmail Account: jobsearching1@gmail.com
If you pass, we will call you very soon.
For more information: +251911121314
```

---

## 📋 Available Job Positions

### 1. 🧑‍💼 Sales Manager
| Field | Details |
|---|---|
| Location | Bole |
| Age Range | 25 – 43 years |
| Working Hours | 8 hours/day |
| Salary | 25,000 ETB/month |
| Experience | 3 years required |

### 2. 🎬 Video Editor
| Field | Details |
|---|---|
| Location | Remote |
| Age Range | 22 – 40 years |
| Working Hours | 4 hours/day |
| Salary | 18,000 ETB/month |
| Required Software | Adobe Premiere |

---

## 🛡️ Validation Rules

Age eligibility is enforced during registration:

| Job | Minimum Age | Maximum Age | Rejection Message |
|---|---|---|---|
| Sales Manager | 25 | 43 | `"You must be between 25 and 43 years old to apply for Sales Manager."` |
| Video Editor | 22 | 40 | `"You must be between 22 and 40 years old to apply for Video Editor."` |

If validation fails, registration is rejected with:
```
!!! REGISTRATION FAILED !!!
```

---

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java (JDK 8+) | Core programming language |
| `java.util.ArrayList` | In-memory user storage |
| `java.util.Scanner` | Console input handling |
| OOP (Abstraction, Inheritance, Polymorphism, Encapsulation) | System design |

---

## 🔮 Future Improvements

- [ ] **Persistent storage** — Save registered users to a `.txt` or `.csv` file
- [ ] **Dynamic job loading** — Load job listings from a JSON or database source
- [ ] **More job types** — Add `GraphicDesigner`, `SoftwareEngineer`, etc.
- [ ] **Login system** — Allow returning users to check application status
- [ ] **Input validation** — Handle non-numeric and empty input gracefully
- [ ] **GUI version** — Migrate to JavaFX or Swing for a desktop interface
- [ ] **Email integration** — Automate CV submission confirmation via JavaMail API
- [ ] **Unit tests** — Add JUnit tests for validation logic and user registration

---

## 📬 Contact

For questions or to apply for a listed position:

- 📧 **Email:** jobsearching1@gmail.com
- 📞 **Phone:** +251 911 121 314

---

> *Built with ❤️ using Java — demonstrating clean OOP design for real-world use cases.*
