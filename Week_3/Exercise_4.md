**Difference between JPA, Hibernate and Spring Data JPA**



**Java Persistence API (JPA)**



* JPA stands for Java Persistence API.
* It is a specification (JSR 338) for persisting, reading, and managing data from Java objects.
* It defines a standard way to map Java objects to relational database tables.
* JPA provides annotations such as @Entity, @Table, @Id, and @Column.
* It does not contain any implementation.
* It requires an implementation provider like Hibernate to perform database operations.



**Hibernate**



* Hibernate is an Object-Relational Mapping (ORM) framework.
* It is one of the most popular implementations of JPA.
* It converts Java objects into database records and vice versa.
* It automatically generates SQL queries for database operations.
* Hibernate manages sessions, transactions, caching, and object mapping.
* It reduces the need to write SQL queries manually.



**Spring Data JPA**



* Spring Data JPA is a Spring Framework module built on top of JPA.
* It does not implement JPA itself.
* It works with JPA providers like Hibernate.
* It reduces boilerplate code by providing repository interfaces such as JpaRepository.
* It provides built-in CRUD methods like save(), findAll(), findById(), and deleteById().
* It automatically manages transactions and repository implementations.
* It allows developers to focus on business logic instead of database management.

