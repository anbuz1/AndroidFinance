package ru.buz.core;

import java.util.Currency;
import java.util.List;

public interface Storage {

    //работа с валютой
    void addCurrency(Currency currency);
    void deleteCurrency(Currency currency);
    Currency getCurrency(Currency currency);
    List<Currency> getAllCurrency(String code);

    //Работа с балансом
    

}
