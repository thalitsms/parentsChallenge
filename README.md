# 🚀 SpringBoot WebMVC Parent-Child Challenge

## 📖 Overview

In this challenge, you'll embark on a journey through the familial relationships between parents and their children, represented by two main tables: `PARENT` and `CHILD`.

### 🧑‍🦱 PARENT Table:

| Id | Name |
|---|------|
| 1 | John |
| 2 | Paul |
| 3 | Mary |
| 4 | Lucy |
| 5 | Mark |

### 👶 CHILD Table:

| Id | Name   | FATHER_ID | MOTHER_ID |
|----|-------|-----------|-----------|
| 1  | John  | 1         | 3         |
| 2  | Paul  | 1         | 3         |
| 3  | Lucy  | 2         | 4         |
| 4  | Claire| 1         | 4         |
| 5  | Simon | NULL      | 4         |

## 🎯 Challenge Requirements

Dive deep and create a SpringBoot WebMVC REST service that offers the following:

1. 📜 An endpoint to list all FATHER names.
2. 🕵️‍♂️ An endpoint to fetch names of FATHERS boasting more than one child.
3. 🌳 An endpoint that, for each sprout (CHILD), delivers the name of the protective tree branches, their father, and mother (when they're present).
4. 🧮 An endpoint to count and tell the world how many little ones John is responsible for.
5. 📌 An endpoint that reveals the number of Mary's offspring.

⚠️ **Note**: Stick strictly to SQL-92 compliant statements when dancing with the database.

## ⚙️ Getting Started

To rise to this challenge:

```bash
# 📥 Clone the project repository:
git clone https://github.com/thalitsms/parentsChallenge.git

# 📁 Dive into the project directory:
cd parentsChallenge

# 🌱 Plant the seeds and let them grow (install dependencies):
mvn install

# 🚴‍♂️ Set forth and start the SpringBoot application:
mvn spring-boot:run

