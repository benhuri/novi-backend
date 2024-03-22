
# Simple Image Slideshow Web Application
## Overview
This web application allows users to maintain a list of image URLs and play a slideshow with crossfade transitions.

## Technologies Used
- Java Spring Boot for the backend
- Relational database (e.g., MySQL, PostgreSQL) for storing image data

## Features

### Backend (Java Spring Boot)
- Implement RESTful APIs to handle the following operations:
 - /addImage: Add a new image URL with its duration
 - /deleteImage/{id}: Delete an existing image by its ID
 - /images: Retrieve a list of image URLs and their durations

### Backend Setup
- Clone this repository: git clone https://github.com/benhuri/novi-backend.git
- Import the backend project into your preferred IDE.
- Run the Spring Boot application.

OR

- Run ./mvnw clean package on command line
- java -jar target/demo-0.1.0.jar

### Error handling
- The controller methods (getAllImages(), addImage(), deleteImage()) do not explicitly handle exceptions or errors. They delegate exception handling to the Spring MVC framework.
- When an exception occurs during the execution of these methods, Spring MVC will handle it based on the configured exception handling mechanism. By default, Spring MVC provides a basic error handling mechanism   
  that returns an appropriate HTTP status code and an error message in the response body.
- For example, if an exception occurs while executing getAllImages(), Spring MVC will return an HTTP status code 500 (Internal Server Error) with a generic error message in the response body.

### Usage
You can test the backend app by using Postman (or any other API app) with the following options:
Base local URL http://localhost:8080/
- Get metod http://localhost:8080/images
- Post method http://localhost:8080/addImage with a JSON as an HttpRequest body (for example: {"id": 2, "url": "test3","duration": 3}
- DELETE method http://localhost:8080/deleteImage/{id} (Replace id with any number you wish to provide).
