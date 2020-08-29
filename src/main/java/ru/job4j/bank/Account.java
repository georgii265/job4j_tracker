package ru.job4j.bank;

import java.util.Objects;

/**
 * модель банковского счета
 */
public class Account {

    private String requisite;
    private double balance;

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * “get” — “получать”
     * (т.е. “метод для получения значения поля”)
     * @return
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * set — “устанавливать”
     * (т.е. “метод для установки значения поля”).
     * @param requisite
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * метод который помогает оценить они возможно равны или неравны точно
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
