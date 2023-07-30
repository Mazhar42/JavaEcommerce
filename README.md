# JavaEcommerce

**JavaEcommerce** is an ecommerce application where user can see the products and add products to the cart. Then the total cart item will be changed dynamically. If the user click at the Cart then the checkout page will be served where the products items been added to the cart being shown and the total price of the products been calculated and shown there. 

There will be two pages in the frontend.First one is the product list page where products are shown in a table with barebone css. Another one is the checkout page where cart item and their price with total price been shown. The key thing of this project is the functionality being implemented properly. Thats why the design has been overlooked to focus the functionality.  

# Tools, Language, Framework

- Java SE 20.0.1
- Spring Boot 3.1.2
- Gradle - Groovy
- IntelliJ IDEA Community Edition
- Git
- JUnit 

# Getting Started 

To getting started with this project you need to hava Java SE version:20 installed in your local machine.
You can download the zip file from this repository. Then unzip this on any directory of your local machine. 
If you have git installed then open up the terminal, then run the following command: 

```bash
git clone https://github.com/Mazhar42/JavaEcommerce.git

cd JavaEcommerce

.\gradlew.bat bootRun
```

Open [http://localhost:8080](http://localhost:8080) with your browser to see the result.

You can see the product API with your browser in this url : [http://localhost:8080/api/v1/products](http://localhost:8080/api/v1/products) as well as the Cart API in this url :  [http://localhost:8080/api/v1/cart/all](http://localhost:8080/api/v1/products/cart/all).

# Testing

This repository contains test cases and test automation scripts for testing an ecommerce application. The tests cover various aspects of the application, such as product list and shopping cart functionality.

## Features
- Test cases for different e-commerce application scenarios.
- Test automation scripts using JUnit testing.

## Installation

To set up the testing environment and execute the test scripts, follow these steps:

1. Clone this repository to your local machine using:

```bash
git clone https://github.com/Mazhar42/JavaEcommerce.git

cd JavaEcommerce

.\gradlew.bat bootTestRun
```
You can also use this command to test the application,

```bash
./gradlew clean test --info
```
