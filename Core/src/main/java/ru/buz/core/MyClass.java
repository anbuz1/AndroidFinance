package ru.buz.core;


import java.util.ArrayList;
import java.util.List;

public class MyClass {
   static String getr(String name, List<String> asd){
       for (String o : asd) {
           if(o.equals(name)) return o+"12312312321";
       }
return null;
   }

    public static void main(String[] args) {
        List sdf = new ArrayList();
        sdf.add("123");
        sdf.add("125");
        sdf.add("124");

        String cvb = getr("123",sdf);
        System.out.println("MyCore START----------------------------------");
    }
}
