# SmartBank Credit Simulation Project

## Project Overview
SmartBank Credit Simulation is a Java EE web application that allows clients to simulate and calculate monthly credit payments. It provides an interface for credit simulation, submission of credit requests, and management of these requests.

## Features
- Credit simulation and calculation
- Submission of credit requests
- Listing and filtering of credit requests
- Status updates for credit requests with history tracking

## Technology Stack
- Java EE
- Apache Tomcat 10.1.302
- PostgreSQL Database
- Maven for dependency management
- JPA with Hibernate for ORM
- Servlets and JSP for web layer
- JUnit and Mockito for testing

## Project Structure
The project follows an MVC (Model-View-Controller) architecture:

```
src
├── main
│   ├── java
│   │   └── com
│   │       └── smartbank
│   │           ├── controller
│   │           ├── model
│   │           ├── service
│   │           ├── dao
│   ├── resources
│   │   └── META-INF
│   └── webapp
│       ├── WEB-INF
│       │   └── views
│       ├── css
│       └── js
└── test
    └── java
        └── com
            └── smartbank
                ├── service
                └── dao
```

## Setup and Installation
1. Clone the repository:
   ```
   git clone git@github.com:ouchin55edcx/SmartBank.git
   ```

2. Ensure you have the following installed:
    - JDK 11 or higher
    - Apache Tomcat 10.1.302
    - PostgreSQL
    - Maven

3. Configure the database:
    - Create a new PostgreSQL database for the project
