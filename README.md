# Spring Based RESTfull API

A Simple RESTfull API using the Spring Framework

## Overview
Demonstrates a basic RESTfull API built using Core Java and Spring framework. It serves a JSON resposne containing information about an Employee

## Prerequisites
The entire project is structured to be used using JetBrains Intellij, out of the box using spring initializer

## Usage
Intellij will recognize this as a maven based project, and you can directly run the application by hitting the run option from the class where the main method exist

### For manual usage
- Maven should be installed and kept in global path
- The project should be structured like this (the way this repo is already structured)
```
project-root/
    pom.xml
    src/
        main/
            java/
            resources/
        test/
            java/
            resources/
```
- In the directory which contains the pom.xml file, we execute this
``` bash
mvn clean install
```
- Now we can run the application by executing the main class which contains the main method. 
```bash
cd target/ 
java -jar SpringDummyApiApplication.jar
```

## API Endpoint
### `api/v1/employee`
- Method: GET
- Response: JSON
```json
[
  {
    "email": "john.doe@xyz.com",
    "identification_num": 204737,
    "dob": "1824-02-29",
    "firstName": "John",
    "lastName": "Doe"
  }
]
```