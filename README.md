# Getting started
Simple Udacity Exercise (Java Web Developer) demonstrating usage of JPA together with H2.

## Shortcuts
* [http://localhost:8080/test](http://localhost:8080/test) responds with a test message (GET-Request)
* [H2-Console](http://localhost:8080/h2-console) as entry point to inspect the db
* [http://localhost:8080/delivery](http://localhost:8080/delivery) takes POST-Requests in order to persist Delivery-Objects having the following form
  ``` 
  {
    "name": "Terry",
    "address": "1234 Sesame Blvd",
    "deliveryTime": "2020-03-07T18:07",
    "plants": [
      {"name": "Petunia", "price": "3.50"},
      {"name": "Tulip", "price": "2.50"}
    ]
  }
  ```
