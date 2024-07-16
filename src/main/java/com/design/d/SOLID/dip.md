# Dependency Inversion Principle

High-level modules/classes should not depend on low-level modules/classes. Instead, both should depend on abstractions (interfaces or abstract classes).

## Example:

How service class depends on Dao layer for database connection

### Benefits:

1)  Easy to switch between different implementation
2)  Easy testing using mock implementation of interfaces
3)  Reduced coupling
