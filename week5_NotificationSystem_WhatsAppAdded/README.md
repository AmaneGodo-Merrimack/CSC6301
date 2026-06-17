# Module 05 - Notification System Maintenance Enhancement
## Overview
This project extends the Flexible Notification System developed in Module 04 by adding support for WhatsApp notifications.

The primary goal of this assignment was to demonstrate software maintenance practices by introducing new functionality without modifying the existing system architecture. The project follows the Open-Closed Principle by extending the system through a new implementation of the NotificationMedium interface.

## Concepts Demonstrated
* Software Maintenance
* Open-Closed Principle
* Interfaces
* Composition
* Runtime behavior switching
* ArrayList collections
* Extensible system design
* JavaDocs
* Command Line Interface (CLI) execution

## Classes
### NotificationMedium
An interface that defines the behavior required for all notification services.
```java
void send(String message);
```

### EmailService
Implements NotificationMedium and delivers notifications through email.

### SMSService
Implements NotificationMedium and delivers notifications through SMS.

### WhatsAppService
Implements NotificationMedium and delivers notifications through WhatsApp.

This class was added as part of the maintenance enhancement without modifying the existing notification architecture.

### AlertSystem
Acts as the composition container.

Responsibilities:
* Stores the active notification medium
* Delegates message delivery
* Maintains a notification log
* Supports runtime switching between services

### Demo
Contains the main method and demonstrates notification delivery through Email, SMS, and WhatsApp services.

## Requirements
* Java JDK 21 or later
* Command Line Interface (CLI)

## Project Structure
```text
week5_WhatsAppMaintenanceEnhancement/
├── src/
├── doc/
├── godoaMod5A_UMLDesign.pdf
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
to view the generated JavaDocs.

## Example Output
```text
[Email] Sending message: The first alert to the user
[SMS] Sending message: The second alert to the user
[WhatsApp] Sending message: The Third alert to the user
[The first alert to the user, The second alert to the user, The Third alert to the user]
```

## Maintenance Enhancement
The original architecture was preserved during development.

Rather than modifying AlertSystem to directly support WhatsApp, a new WhatsAppService class was created that implements the existing NotificationMedium interface.

This approach allows additional services to be added in the future without changing the AlertSystem implementation.

## UML Diagram
The UML diagram used during the design phase.

## Author
Amane Godo

## Generative AI Usage
Generative AI was used to:
* Review software maintenance concepts
* Discuss the Open-Closed Principle
* Generate and refine documentations
* Verify that WhatsApp functionality was added without modifying the existing architecture

All generated content was reviewed, tested, and modified before submission.
