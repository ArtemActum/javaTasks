//Создайте класс BankAccount, который будет представлять банковский счет.
//Класс должен содержать:
//Поля:
//Номер счета (accountNumber).
//Баланс (balance).
//Методы:
//deposit(double amount): пополнение счета.
//withdraw(double amount): снятие денег с проверкой на достаточность средств.
//getBalance(): возвращает текущий баланс.
package HomeWork2.Task2_OOP;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("balance increased on " + amount + ", result : " + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("balance reduced on " + amount + ", result : " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}
