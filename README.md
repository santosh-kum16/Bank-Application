# Bank Application

This is a simple banking web application built using Java, JSP, Servlets, and Oracle database. It is designed to simulate a basic online banking system where a customer can log in, check their balance, transfer money, change password, view statements, and apply for a loan.

The project is a good example of how web pages, backend Java logic, and database connectivity work together in a real application.

## What this project does

This project acts like a mini bank portal. A user can:

- Log in with their customer ID and password
- View their account details
- Check available balance
- Transfer money to another account
- Change their password
- See a summary of account activity
- Apply for a loan
- Log out securely

In simple words, this project is a small banking system that works through a website.

---

## Why this project is useful

This project is useful because it shows how a real banking system can be built using web technologies. It combines:

- Frontend pages for user interaction
- Backend Java code to process requests
- Database operations to store and fetch data
- Session handling to keep the user logged in
- Business logic for banking functions

It is a practical project for learning how full-stack Java web applications are structured.

---

## Technologies used

This project uses:

- Java
- Java Servlets
- JSP (JavaServer Pages)
- HTML
- Oracle Database
- JDBC (Java Database Connectivity)
- Apache Tomcat / Java EE web environment

The backend logic is written in Java classes under the `src/com/abc/bankapp` package, and the frontend pages are stored inside `WebContent`.

---

## Project structure

The repository is organized like this:

- `src/com/abc/bankapp`  
  Contains the main Java classes like:
  - `Login.java`
  - `Model.java`
  - `Transfer.java`
  - `ChangePwd.java`
  - `CheckBalance.java`
  - `GetStatement.java`
  - `ApproveLoan.java`
  - `Logout.java`

- `WebContent`  
  Contains the web pages and UI files like:
  - `index.html`
  - `home.jsp`
  - `transfer.jsp`
  - `ChangePwd.jsp`
  - `ApplyLoan.jsp`
  - `GetStatementSuccess.jsp`
  - success and error pages

- `WebContent/WEB-INF/web.xml`  
  This file configures the servlets and filters used in the project.

- `lib`  
  Contains external libraries required by the project, including the Oracle JDBC driver.

---

## How the application works

### 1. User login
The user enters their customer ID and password on the login page.  
The request goes to the `Login` servlet, which validates the information against the database.

If the credentials are correct:
- the user is allowed inside the application
- the account number and name are saved in the session
- the user is redirected to the home page

If the credentials are wrong:
- the user is sent to an error page

This is the starting point of the application.

### 2. Session management
Once the user logs in, the application stores important user details in the session, such as:

- account number
- customer name

This helps the system know which customer is currently active without asking for login details again and again.

### 3. Balance checking
The user can check their available balance.  
The system reads the account number from the session, queries the database, and shows the current balance.

### 4. Fund transfer
To transfer money, the user enters:
- the receiver's account number
- the transfer amount

The backend logic deducts the amount from the sender's account and adds it to the receiver's account.  
It also records transactions in the statement table so that both accounts show the update.

### 5. Password change
The user can change their password using a secure request flow.  
The backend updates the password in the database for that specific account.

### 6. Loan application
The application also allows a user to enter loan-related details such as:
- first name
- last name
- loan amount
- interest
- loan type
- salary
- duration
- occupation

These values are stored in the loan table for processing.

### 7. Statement viewing
The system fetches all transaction records for the current account and displays them to the user. This helps track money coming in and going out.

---

## Main backend class: `Model.java`

This is the heart of the project.

`Model.java` contains most of the business logic and database operations. It is responsible for:

- establishing connection with Oracle DB
- validating login credentials
- fetching account balance
- updating password
- transferring funds
- inserting loan details
- reading transaction statement

This class acts like the bridge between the web pages and the database.

---

## Why this is a good learning project

This project is a strong learning example because it includes many important concepts:

- Java web programming
- Database connectivity
- Servlet-based request handling
- Session management
- CRUD operations
- Form processing
- Navigation between pages
- Real-world domain modeling using banking logic

If someone is learning Java web development, this project gives a very practical understanding of how a full application is built.

---

## Important note

This project is simple and educational, but it is not a production-grade banking application. In a real banking system, you would need stronger security features like:

- password hashing
- encrypted data transfer
- secure session management
- role-based authorization
- proper transaction handling
- validation and exception handling
- better database architecture

Still, for learning and demonstration purposes, this project is very effective.

---

## Summary

In simple terms, this project is a mini online banking system where users can log in, manage their accounts, transfer money, and apply for loans. It uses Java backend logic, web pages for the interface, and Oracle database for storing data. It is a solid beginner-friendly project that shows how web applications and databases work together in a real business application.

If you want, I can also turn this into:
- a more polished README for GitHub
- a shorter version for assignment submission
- a project explanation with flowchart style
- a professional documentation version with tables and diagrams
