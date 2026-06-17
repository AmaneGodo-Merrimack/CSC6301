# Module 04 - Flexible Notification System
## Overview
This project demonstrates the use of composition in Java by creating a flexible notification system that can send messages through different communication services.

Rather than hard-coding notification behavior, the system delegates message delivery to a selected notification medium at runtime. This design allows new notification services to be added without modifying the core AlertSystem class.

## Concepts Demonstrated
* Interfaces
* Composition
* Runtime behavior switching
* ArrayList collections
* Encapsulation
* JavaDocs
* Command Line Interface (CLI) execution

## Classes
### NotificationMedium
An interface that defines the behavior required for a notification service.
```java
void send(String message);
```

### EmailService
Implements NotificationMedium and delivers messages through email.

### SMSService
Implements NotificationMedium and delivers messages through SMS.

### AlertSystem
Acts as the container class.

Responsibilities:
* Stores the active notification medium
* Delegates message delivery
* Maintains a log of all notifications sent
* Allows notification services to be changed at runtime

### Demo
Contains the main method and demonstrates the notification system.

## Requirements
* Java JDK 21 or later
* Command Line Interface (CLI)

## Project Structure
```text
week4_NotificationSystem/
├── src/
├── doc/
├── godoaMod4A_UMLDesign.pdf
├── README.md
└── requirements.txt
```

## Compilation
Compile all source files:
```bash
javac -d bin src/*.java
```

## Execution
Run the demonstration program:
```bash
java -cp bin Demo
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
to view the generated documentation.

## Example Output
```text
The first alert to the user sent via Email.
The second alert to the user sent via SMS.
[The first alert to the user, The second alert to the user]
```

## Design Approach
This project follows the composition principle.

The AlertSystem does not directly implement email or SMS functionality. Instead, it contains a NotificationMedium object and delegates message delivery to whichever service is currently active.

This allows new notification services to be added without modifying the AlertSystem class.

## UML Diagram
The UML diagram used during the design phase.

## Author
Amane Godo

## Generative AI Usage
Generative AI was used to:
* Review composition versus inheritance concepts
* Discuss UML design relationships
* Generate and refine documentations
* Verify compliance with assignment requirements

All generated content was reviewed, tested, and modified before submission.
