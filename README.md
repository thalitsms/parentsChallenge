# SpringBoot WebMVC Parent-Child Challenge

## Overview

This project revolves around a system with two core tables: `PARENT` and `CHILD`. They have the following data:

### PARENT:

| Id | Name |
|---|------|
| 1 | John |
| 2 | Paul |
| 3 | Mary |
| 4 | Lucy |
| 5 | Mark |

### CHILD:

| Id | Name   | FATHER_ID | MOTHER_ID |
|----|-------|-----------|-----------|
| 1  | John  | 1         | 3         |
| 2  | Paul  | 1         | 3         |
| 3  | Lucy  | 2         | 4         |
| 4  | Claire| 1         | 4         |
| 5  | Simon | NULL      | 4         |

## Requirements

Develop a SpringBoot WebMVC REST Service with the following endpoints:

1. **GET `/fathers`**: Returns a list of all FATHER names.
2. **GET `/fathers/multiple-children`**: Returns the names of all FATHERS that have more than one child.
3. **GET `/children/parents`**: For each CHILD, this should return the name of his/her father and mother (if defined).
4. **GET `/john/children-count`**: Returns the count of how many children John has.
5. **GET `/mary/children-count`**: Returns the count of how many children Mary has.

**Note**: Use only SQL-92 compliant statements for database operations.

## Setting Up

```bash
# Clone the repo
git clone https://github.com/thalitsms/parentsChallenge.git
# Navigate to the project directory
cd parentsChallenge
# Install dependencies
mvn install
# Run the application
mvn spring-boot:run
