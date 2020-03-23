package ru.buz.core.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Transactions implements Serializable {
    private long id;

    private Date date;

    private BigDecimal amount;

    private Magazine magazine;

    private Count count;

    public Transactions(long id, Date date, BigDecimal amount, Magazine magazine, Count count) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.magazine = magazine;
        this.count = count;
    }

    public long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Magazine getMagazine() {
        return magazine;
    }

    public Count getCount() {
        return count;
    }

    String getTransaction(){
        StringBuilder myTransaction = new StringBuilder();
        return myTransaction
                .append(date.toString()).append("|")
                .append(amount.toString()).append("|")
                .append(magazine.toString()).append("|")
                .append(count.toString()).toString();
    }
}
