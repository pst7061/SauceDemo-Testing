# SauceDemo UI Automation Testing Project

## 📌 Project Overview

This project is an automated UI testing framework for the [SauceDemo](https://www.saucedemo.com/) e-commerce web application. It uses **Selenium WebDriver**, **TestNG**, and **Java** to test core functionalities like login, invalid login, add to cart, and logout.

---

## 🧪 Technologies Used

- **Java** (JDK 21)
- **Selenium WebDriver**
- **TestNG** (v7.4.0)
- **ChromeDriver**
- **Maven** (optional)
- **Eclipse IDEA**

---

## ✅ Test Cases Covered

| Test Case          | Description                                                |
| ------------------ | ---------------------------------------------------------- |
| `validLoginTest`   | Verifies successful login with valid credentials           |
| `invalidLoginTest` | Verifies error message for invalid login attempt           |
| `addToCartTest`    | Verifies that item is added to cart successfully           |
| `logoutTest`       | Verifies user can logout successfully from the application |

---
## 🚀 Getting Started

### 📥 Clone the repository:

```bash
git clone https://github.com/pst7061/saucedemo-automation.git
```

### 🧑‍💻 Set up the project:

1. Open the project in **Eclipse**.
2. Download [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/) and set the path in your test class:

```java
System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");
```

3. Run `testng.xml`:
   - Right-click → Run As → TestNG Suite

---

## 📂 Folder Structure

```
SauceDemo-Automation/
├── src/
│   └── Automation_Testing/
│       └── SauceDemoTests.java
├── test-output/  <-- Auto-generated TestNG Reports
├── testng.xml
└── README.md
```

---

## 📊 Test Report Summary

TestNG generates HTML reports in the `test-output` folder after test execution. Open `index.html` to view the test result summary.

### 🖼️ Sample Test Output:

```
✅ Valid Login Test Passed
✅ Invalid Login Test Passed
✅ Add to Cart Test Passed
✅ Logout Test Passed
```

  

📊 **Test Report** → [https://pst7061.github.io/SauceDemo-Testing/](https://github.com/pst7061/SauceDemo-Testing/blob/main/test-output/index.html)  



## 👨‍💻 Author

**Pravin Thorat**\
📧 [pravinthorat.pt5573@gmail.com](mailto\:pravinthorat.pt5573@gmail.com)\
📍 Pune, India

---

## 📎 License

This project is for educational/demo purposes only.

