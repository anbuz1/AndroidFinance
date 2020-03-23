package ru.buz.core.models;

import java.io.Serializable;

public class SavedId implements Serializable {
    static int idUser = 0;
    static int idWallet = 0;
    static int idCount = 0;
    static long idMagazine = 0;
    static long idTransaction = 0;

    public static int getIdUser() {
        return idUser;
    }

    public static int getIdWallet() {
        return idWallet;
    }

    public static int getIdCount() {
        return idCount;
    }

    public static long getIdMagazine() {
        return idMagazine;
    }

    public static long getIdTransaction() {
        return idTransaction;
    }

    public static void newIdUser() {
        SavedId.idUser ++;
    }

    public static void newIdWallet() {
        SavedId.idWallet ++;
    }

    public static void newIdCount() {
        SavedId.idCount ++;
    }

    public static void newIdMagazine() {
        SavedId.idMagazine ++;
    }

    public static void newIdTransaction() {
        SavedId.idTransaction ++;
    }
}
