# Module 02 - Area Calculator

## Overview
This project is an interactive command-line Java application that calculates the area of either a rectangle or a triangle based on user input.

The program demonstrates:

* User input handling with `Scanner`
* Input validation using loops
* Static methods
* Basic object-oriented programming concepts
* JavaDoc documentation

## Features
* Prompts the user for their name
* Allows the user to choose between rectangle and triangle calculations
* Validates menu selections
* Validates numeric inputs
* Calculates and displays the area

## Requirements
* Java JDK 21 or later
* Command Line Interface (CLI)

## Project Structure
```text
week2_AreaCalculator/
├── src/
├── bin/
├── doc/
├── README.md
└── requirements.txt
```

## Compilation
From the project directory:
```bash
javac -d bin src/*.java
```

## Execution
Run the application:

```bash
java -cp bin AreaCalculator
```

## Generate JavaDocs
Generate documentation into the doc directory:

```bash
javadoc -d doc src/*.java
```

Open:
```text
doc/index.html
```

to view the generated documentation.

## Example Usage
```text
Enter your name:
Amane

Calculate area: Press 1 for Rectangle, 2 for Triangle - 1

Enter the length:
10

Enter the width:
5

Hello Amane, the calculated area is: 50.0
```
## Author
Amane Godo

## Generative AI Usage
Generative AI was used to:

* Generate and refine documentations
* Review input validation logic
* Debug Scanner input handling

All generated content was reviewed, tested, and modified before submission.
