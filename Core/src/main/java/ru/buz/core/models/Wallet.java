package ru.buz.core.models;

import java.io.Serializable;
import java.util.List;

public class Wallet implements Serializable {
    int id;

    String name;

    List<Count> counts;
}
