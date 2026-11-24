# Bank-Account-Java
A simple Bank Account Management System in Java demonstrating classes, objects, constructors, and encapsulation.


# Bank Account Management System (Java)

A simple console-based Bank Account Management System built in Java as part of an Object-Oriented Programming assignment. It demonstrates core OOP concepts such as classes, objects, constructors, encapsulation, and instance variables.

## Features

- Create bank accounts using a parameterized constructor
- Deposit money into an account
- Withdraw money, with an "insufficient balance" message when funds are too low
- Check the current balance
- Display full account details (account number, holder name, balance)
- Each account maintains its own independent balance

## Project Structure

```
bank-account-java/
├── BankAccount.java   # BankAccount class (data members + methods)
├── Main.java          # Driver class with main() method
└── README.md
```

## Class Overview

### `BankAccount`

| Member | Type | Description |
|---|---|---|
| `accountNumber` | `int` | Unique account number |
| `accountHolderName` | `String` | Name of the account holder |
| `balance` | `double` | Current account balance |

| Method | Description |
|---|---|
| `BankAccount(int, String, double)` | Parameterized constructor to initialize the account |
| `deposit(double amount)` | Adds the amount to the balance |
| `withdraw(double amount)` | Deducts the amount, or shows a message if the balance is insufficient |
| `checkBalance()` | Prints the current balance |
| `displayDetails()` | Prints account number, holder name, and balance |

### `Main`

Creates two `BankAccount` objects with different details, performs deposit and withdrawal operations on both, and displays the final details of each account.



## Concepts Demonstrated

- Classes and objects
- Parameterized constructors
- Encapsulation (private data members)
- Instance variables (independent state per object)
- Basic input validation




