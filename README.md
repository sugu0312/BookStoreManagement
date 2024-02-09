# **BookStoreManagement**
- The aim of the project is to perform the basic CRUD operations.
- Spring initializer war used to create a spring boot application project.

# ![spring io](https://github.com/sugu0312/BookStoreManagement/assets/139035083/7da20146-b2ab-4b98-993c-57421efed1b4)

# Frameworks and Languages used :

+ Java
- Spring Boot

# Dependency Used : 
- Spring web
- Spring Boot Dev Tool
- My Sql
- Spring Data JPA
- Thymeleaf

# ![dependecies](https://github.com/sugu0312/BookStoreManagement/assets/139035083/5df6cfb7-d60a-4566-82bf-88f1c846a1e4)

# Home Page :
# ![home page](https://github.com/sugu0312/BookStoreManagement/assets/139035083/7c5ee43d-1712-45e7-85c1-51b7ac005118)
# Data Flow 
## _Controller Layer :_ ##
- It consists of UserController class which basically control the flow of data.
- @RestController annotation is used to make the UserController class as controller layer.
- @GetMapping , @PostMapping , @PutMapping , @DeleteMapping annotations are used to perform the CRUD operations.
# ![controller](https://github.com/sugu0312/BookStoreManagement/assets/139035083/1c439709-e6a1-4928-8d4a-970b917431bc)
## _Service Layer :_ ##
- It consists of UserService class which helps us to write the business functionalities.
- @Service annotation is used to make the class as a service layer.
# ![service](https://github.com/sugu0312/BookStoreManagement/assets/139035083/d66c7e50-c425-40cf-b9e4-e5e6208fa109)

## _Repositary Layer :_ ##
- It consists of UserDao which is used to manage the datas.
- @Repository annotation is used to make the class repository layer.
# ![repo](https://github.com/sugu0312/BookStoreManagement/assets/139035083/cafb0523-ff78-4f79-bbaf-a60af22c92c1)

## _Entity Layer :_ ##
- It consists of a User class which consists of Entity's used to model our data application.
- For each of our data , constructors , getters and setters are created.
# ![Entity](https://github.com/sugu0312/BookStoreManagement/assets/139035083/e912987f-500b-48c3-bf39-a142659c6123)

# API Reference 
## Add book
### `http://localhost:8080/book_register`
# ![add book](https://github.com/sugu0312/BookStoreManagement/assets/139035083/d87df00b-7742-487e-9827-a2dbe8d2c7cc)

