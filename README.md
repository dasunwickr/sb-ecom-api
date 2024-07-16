# Spring Boot Simple API

This project implements a RESTful API for managing products with image upload capabilities, built using Spring Boot, Spring Data JPA, Lombok, and an H2 in-memory database.

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Lombok
- H2 Database
- Maven

## Features
- **GET /api/products**: Retrieve all products.
- **GET /api/products/{id}**: Retrieve a product by ID.
- **POST /api/products**: Add a new product with an image file upload.
- **GET /api/products/{id}/image**: Retrieve the image of a product by ID.
- **PUT /api/products/{id}**: Update an existing product with an image file upload.
- **DELETE /api/products/{id}**: Delete a product by ID.
- **GET /api/search?keyword={keyword}**: Search for products by keyword in the product name.

## Installation
1. Clone the repository:
```bash
   git clone https://github.com/your-username/spring-boot-product-api.git
   cd spring-boot-product-api
   ```
2. Build the project using Maven:
```bash
Copy code
mvn clean install
```

3. Run the application:
```bash
Copy code
mvn spring-boot:run
```
The application will start on http://localhost:8080.

## Usages
- Use an API testing tool like Postman or curl to interact with the API endpoints.
- Ensure to include appropriate headers and request payloads as specified for each endpoint.

### Example Requests
- GET /api/products
```bash
  GET /api/products
```
- GET /api/products/{id}
```bash
  GET http://localhost:8080/api/products/1
```
- POST /api/products
```bash
POST http://localhost:8080/api/products
Content-Type: multipart/form-data

[Form Data]
product: {
  "name": "Sample Product",
  "price": 99.99,
  "description": "A sample product description."
}
imageFile: [Select File]
```
- PUT /api/products/{id}
```bash
PUT http://localhost:8080/api/products/1
Content-Type: multipart/form-data

[Form Data]
product: {
  "name": "Updated Product Name",
  "price": 109.99,
  "description": "Updated product description."
}
imageFile: [Select File]
```
- DELETE /api/products/{id}
```bash
DELETE http://localhost:8080/api/products/1
```


