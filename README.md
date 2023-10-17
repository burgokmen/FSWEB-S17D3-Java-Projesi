Brutech Zoo REST API

This is a Spring Boot project for creating a REST API for a zoo with two types of animals, Koalas and Kangaroos.

Prerequisites

Before you begin, ensure you have met the following requirements:

Java Development Kit (JDK) installed
Maven installed
Spring Initializr for project setup
Getting Started

To get started, follow these steps:

Create a Spring Boot project using Spring Initializr.
Add the Spring Web dependency to the project.
Use Maven for dependency management and install all dependencies.
Run the application on port 9000.
Task 1

In this task, we have set up the basic project structure and created two entity classes, Koala and Kangaroo, using Project Lombok annotations.

The Koala class has the following fields: id, name, weight, sleepHour, gender.
The Kangaroo class has the following fields: id, name, height, weight, gender, isAggressive.
Task 2

In this task, we have created two controllers, KangarooController and KoalaController, and implemented basic CRUD operations for managing Koalas and Kangaroos.

KangarooController maintains a map named "kangaroos" to store Kangaroo objects, and KoalaController maintains a map named "koalas" to store Koala objects. These maps are defined when the controller beans are first created.

Endpoints for Kangaroos:

[GET]/brutech/kangaroos: Get the list of all Kangaroos.
[GET]/brutech/kangaroos/{id}: Get the Kangaroo object with the specified ID.
[POST]/brutech/kangaroos: Add a Kangaroo object to the kangaroos list.
[PUT]/brutech/kangaroos/{id}: Update the Kangaroo object with the new data for the specified ID.
[DELETE]/brutech/kangaroos/{id}: Remove the Kangaroo object with the specified ID.
Endpoints for Koalas:

[GET]/brutech/koalas: Get the list of all Koalas.
[GET]/brutech/koalas/{id}: Get the Koala object with the specified ID.
[POST]/brutech/koalas: Add a Koala object to the koalas list.
[PUT]/brutech/koalas/{id}: Update the Koala object with the new data for the specified ID.
[DELETE]/brutech/koalas/{id}: Remove the Koala object with the specified ID.
Task 3

In this task, we have considered error scenarios and created error classes under the "exceptions" package. Error handling is managed from a global center and is not located under controller classes. When an error is returned, it is logged using the @Slf4j annotation.

This project provides a foundation for building a zoo management system with a RESTful API, and you can further enhance and customize it to meet your specific requirements.