# Module 03 - Smart Home Device System

## Overview
This project demonstrates fundamental Object-Oriented Programming (OOP) concepts in Java through a simple Smart Home Device system.

The project includes:
* Encapsulation through private fields
* Inheritance using the `extends` keyword
* Interfaces using the `implements` keyword
* Polymorphism through interface implementation
* JavaDoc documentation

A `SmartLight` inherits common functionality from `SmartDevice` and implements the `Connectable` interface to simulate connecting to a WiFi network.

## Classes
### Connectable
An interface that defines the behavior required for a device to connect to a WiFi network.

### SmartDevice
A superclass representing a generic smart home device.

Features:
* Device brand
* Power status
* Power toggle functionality

### SmartLight
A subclass of `SmartDevice`.

Additional features:
* Brightness level
* WiFi connectivity

### SmartHomeDeviceManager
Contains the `main()` method and demonstrates the Smart Home Device system.

## Requirements
* Java JDK 21 or later
* Command Line Interface (CLI)

## Project Structure
```text
week3_SmartHomeDevice/
├── src/
├── doc/
├── godoaMod3A_UMLDesign.pdf
├── README.md
└── requirements.txt
```

## Compilation
Compile all source files:
```bash
javac -d bin src/*.java
```

## Execution
Run the program:
```bash
java -cp bin SmartHomeDeviceManager
```

## Generate JavaDocs
Generate documentation:
```bash
javadoc -d doc src/*.java
```

Open:
```text
doc/index.html
```
to view the generated JavaDocs.

## Example Output
```text
Philips is now ON
Brightness Level: 50
Philips is now connected to WiFi
```

## UML Diagram
The UML diagram used during the design phase is included in the UML folder.

## Author
Amane Godo

## Generative AI Usage
Generative AI was used to:

* Review UML design concepts
* Discuss inheritance and interface relationships
* Generate and refine documentations
* Verify adherence to object-oriented programming principles

All generated content was reviewed, modified, tested, and validated before submission.
