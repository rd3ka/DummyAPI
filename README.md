# Frameworkless RESTful API

**A Simple RESTful API without any frameworks.**

## Overview
Demonstrates a basic RESTful API built using Core Java and `HttpServer` class with only the GET HTTP Request. It serves a JSON response containing a message

## Usage
To run this API:

1. Simply compile the source file.
2. Run the compiled class from the source file.

## API Endpoint

### `/api/go`
* **Method**: GET
* **Response**: Static JSON
```json
{
    "message": "Hello World! from Frameworkless RESTFull API",
    "data": [1, 2, 3]
}

``` 