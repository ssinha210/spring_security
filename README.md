# Spring Boot Project with Role-Based Authentication

This project is a Spring Boot application that demonstrates role-based authentication using Spring Security. It includes endpoints that are accessible based on user roles.

## Project Setup

### Overview

- When you hit `http://localhost:8080/`, it is accessible by all without any authentication.
- The `/admin` endpoint returns a 401 Unauthorized error if accessed without proper authentication.
- With authentication, both `/admin` and `/user` endpoints are accessible based on the user roles.

### Endpoints

- **Home Page**: Accessible by all without any authentication.
- **Admin Dashboard**: Accessible only by users with the `ADMIN` role.
- **User Dashboard**: Accessible only by users with the `USER` role.

### Testing with Postman

1. **Open Postman** and create a new request.
2. **Set the request type to GET** and enter the URL for the endpoint you want to test.
3. **Go to the Authorization tab**:
   - Select **Basic Auth**.
   - Enter the appropriate credentials:
     - For `/admin`: Username: `admin`, Password: `admin`
     - For `/user`: Username: `user`, Password: `user`
4. **Send the request**.

### Notes

- The home page (`/`) is accessible by all without any authentication.
- The `/admin` endpoint returns a 401 Unauthorized error if accessed without proper authentication.
- With authentication, both `/admin` and `/user` endpoints are accessible based on the user roles.
