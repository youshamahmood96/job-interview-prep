## Authentication & Authorization

1. Use salting and hashing
2. Session management using JWT
3. Implement RBAC, ABAC

## Common Security Vulnerabilities

### SQL Injection

SQL Injection is a web security vulnerability that allows an attacker to interfere with the queries that an application makes to its database. It usually occurs when you ask a user for input, like their username/userid, and instead of a name/id, the user gives you an SQL statement that you will unknowingly run on your database

**HOW TO PREVENT**

- Use parameterized queries with prepared statements. This works because prepared statment that is created from parameterized query treat the input as a literal string.

Example:

```javascript
app.get("/user/:userID", (req, res) => {
  const userID = req.params.userID; // parametrized query
  pool.query(
    "SELECT * FROM users WHERE userID = ?", // prepared statement
    [userID],
    (error, results) => {
      //
    }
  );
});
```

- User input validation and sanitization
- Output encoding

### Cross-Site SCripting (XSS)

Cross-Site Scripting (XSS) is a type of security vulnerability that occurs in web applications. It allows an attacker to inject malicious scripts into web pages viewed by other users. These scripts can be used to steal sensitive information, impersonate the user, or perform any action that the user can perform on the site

3 types of XSS:

1. Stored XSS: The malicious script is stored on the server and is displayed to other users when they access a particular page or resource.
2. The malicious script is included in the URL or input fields of a web page, and the server reflects it back to the user's browser without proper sanitization. This type of XSS usually requires social engineering to trick users into clicking on a malicious link.
3. The attack payload is executed as a result of modifying the Document Object Model (DOM) in the victim's browser, typically through client-side scripts.

**HOW TO PREVENT**

- Input validation and output encoding. Output encoding is basically maing sure that any user input is treated as a plain text instead of executable js/html
- Implementing CSP (Content Security Policy)
  Example:

````htmlembedded=
```<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Example CSP Page</title>
    <!-- Content Security Policy -->
    <meta http-equiv="Content-Security-Policy" content="default-src 'self'; script-src 'self' https://trusted-scripts.com; style-src 'self' https://trusted-styles.com; img-src 'self' https://trusted-images.com">
</head>
<body>
    <h1>Content Security Policy Example</h1>
    <p>This page demonstrates the implementation of a Content Security Policy (CSP).</p>
    <script src="https://trusted-scripts.com/script.js"></script>
    <link rel="stylesheet" href="https://trusted-styles.com/style.css">
    <img src="https://trusted-images.com/image.jpg" alt="Trusted Image">
</body>
</html>

````

- Implement XSS filter
- HTTPOnly Cookies [Read about cookies](https://www.freecodecamp.org/news/everything-you-need-to-know-about-cookies-for-web-development/)

### CSRF (Cross-site request forgery)

it is a type of attack which impersonates a user in other sites where the user is logged in. Usually it is done when there is an action to change of state in the server, e.g, changing account settings, transactions etc.

**How to prevent**

- Generate unique csrf tokens for each user session and include them in forms/links/ajax requests.
- set SameSite attribute in cookies to "Strict"
- Use POST for change of data in the server, csrf attacks usually target GETs
- Implement CORS
