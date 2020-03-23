package ru.buz.core.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;

class Count implements Serializable {

    private int id;

    private String name;

    private Currency currency;

    private BigDecimal balance;

    private List<Transactions> transactions;

    public Count(int id, String name, Currency currency, BigDecimal balance, List<Transactions> transactions) {
        this.id = id;
        this.name = name;
        this.currency = currency;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Currency getCurrency() {
        return currency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public List<Transactions> getTransactions() {
        return transactions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    void addTransaction(Transactions transaction){
        this.transactions.add(transaction);
    }

    @Override
    public String toString() {
        return name;
    }
}
