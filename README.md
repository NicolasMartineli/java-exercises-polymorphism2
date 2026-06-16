# Tax Calculator - Polymorphism & Abstract Methods Exercise

 **Note:** This repository is a personal training project developed to practice Inheritance, Polymorphism, and Abstract Classes/Methods in Java.

---

##  Exercise Description

The objective of this console application is to read data for $N$ taxpayers (where $N$ is provided by the user). Taxpayers can be either **individuals** (physical persons) or **companies** (legal entities). 

At the end of the execution, the program calculates and displays the tax amount paid by each contributor based on specific calculation rules, along with the total tax revenue collected from all of them combined.

### Tax Calculation Rules:
* **Individual Taxpayer:** 
  * If annual income is under `20000.00`, they pay a 15% tax rate.
  * If annual income is `20000.00` or higher, they pay a 25% tax rate.
  * If they have health expenditures, 50% of those expenses are deducted from the final tax amount.
* **Company Taxpayer:** 
  * Companies pay a standard 16% tax rate.
  * If the company has more than 10 employees, the tax rate drops to 14%.

---

##  Technologies Used

* **Java**
* **IntelliJ IDEA**

##  Key Concepts Practiced

* **Abstract Classes and Methods:** The base class `Taxpayer` is abstract, enforcing a contract that forces subclasses to override and implement their own specific `tax()` calculation method.
* **Inheritance:** Creating specialized subclasses (`Individual` and `Company`) that inherit common attributes like name and annual income from the parent `Taxpayer` class.
* **Polymorphism:** Storing different types of taxpayers inside a unified polymorphic list (`List<Taxpayer>`) and calculating their respective taxes seamlessly within a single loop.
* **Conditional Business Logic:** Writing clean structures to handle complex conditional business rules based on numerical limits and object types.
