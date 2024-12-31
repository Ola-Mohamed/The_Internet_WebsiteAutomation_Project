# **The Internet Website Automation Project**  

![Project Banner](https://github.com/Ola-Mohamed/The_Internet_WebsiteAutomation_Project/blob/main/media/Screenshot%20(110).png)

## **About the Project**  
This project demonstrates the automation of various functionalities on [The Internet](https://the-internet.herokuapp.com/) website, a popular platform for testing web application features. Built using **Selenium WebDriver with Java**, the project showcases industry-standard practices for automation testing, including test case design, framework development, and integration with TestNG.

---

## **Key Features**  
- **Page Object Model (POM):** Organized page classes for better maintainability.  
- **Data-Driven Testing:** Test cases executed with dynamic input using TestNG.  
- **Error Handling:** Robust exception handling for stable test execution.  

---

## **Tech Stack**  
- **Programming Language:** Java  
- **Automation Tools:** Selenium WebDriver  
- **Test Framework:** TestNG  
- **Build Tool:** Maven 
- **Version Control:** Source Tree and GitHub

---

## **Test Cases Automated**  
The project automates the following functionalities of **The Internet**:  
- **Login:** Valid and invalid login scenarios.  
- **Dynamic Controls:** Testing elements' visibility and interactivity.  
- **File Upload:** Uploading files and verifying success messages.  
- **Dropdown:** Selecting options and handling default values.  
- **Alerts:** Handling JavaScript alerts, confirmations, and prompts.  
- **Hover Menu:** Testing nested menu display and interactivity.  
- **Broken Images:** Identifying and reporting broken image URLs.  
- **Form Authentication:** Validating login, session persistence, and logout flows.  
- **Checkboxes:** Verifying selection and deselection functionality.  
- **Infinite Scroll:** Testing content loading during scrolling.  
- **Key Presses:** Validating key press detection and output.  
- **Basic Authentication:** Testing HTTP authentication scenarios.  
- **Drag and Drop:** Automating drag-and-drop functionality.  
- **Frames:** Interacting with elements inside iframes.  
- **Context Menu:** Verifying right-click and menu interactions.  

---

This project has strengthened my skills in:  
🔹 Framework design and test organization.  
🔹 Debugging and handling exceptions.  
🔹 Generating insightful test reports with ExtentReports.  

--- 

## **Getting Started**  

### **Prerequisites**  
- **Java Development Kit (JDK):** Version 11 or higher.  
- **Maven:** Installed and configured in your system.  
- **IDE:** IntelliJ IDEA, Eclipse, or any Java-supported IDE.  

### **Installation**  
1. Clone this repository:  
   ```bash
   git clone https://github.com/Ola-Mohamed/The_Internet_WebsiteAutomation_Project.git
   ```
2. Navigate to the project directory:  
   ```bash
   cd The_Internet_WebsiteAutomation_Project
   ```
3. Open the project in your preferred IDE.  
4. Run the following command to resolve dependencies:  
   ```bash
   mvn clean install
   ```

---

## **Usage**  

### **How to Run Tests**  
1. Open the terminal and navigate to the project directory.  
2. Execute the following Maven command:  
   ```bash
   mvn test
   ```
3. View the generated reports in the `reports/` directory.

---

## **Test Cases Automated**  
The project automates the following functionalities of [The Internet](https://the-internet.herokuapp.com/):  
- **Login:** Valid and invalid login scenarios.  
- **Dynamic Controls:** Testing elements' visibility and interactivity.  
- **File Upload:** Uploading files and verifying success messages.  
- **Dropdown:** Selecting options and handling default values.  
- **Alerts:** Handling JavaScript alerts, confirmations, and prompts.  

---

## **Folder Structure**  
```
The_Internet_WebsiteAutomation_Project/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── base/                # Base classes for common functionality
│   │   │   ├── pages/               # Page Object Model classes
│   │   │   ├── utils/               # Utilities (e.g., for reading test data)
│   ├── test/
│   │   ├── java/                    # Test cases
│   │   │   ├── tests/               # Test classes
├── pom.xml                          # Maven configuration file
├── README.md                        # Project documentation
```

---

## **License**  
This project is licensed under the MIT License. See the `LICENSE` file for details.  

---

## **Acknowledgements**  
- [The Internet](https://the-internet.herokuapp.com/) by Dave Haeffner.  
- [Test Automation University](https://testautomationu.applitools.com/).  
