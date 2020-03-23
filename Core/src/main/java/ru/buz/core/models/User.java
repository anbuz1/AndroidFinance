package ru.buz.core.models;

import java.util.List;

public class User {
    int id;
    String name;
    String pass;
    List<Wallet> wallets;
    List<Transactions> transactions;
    List<Magazine> magazines;
}
