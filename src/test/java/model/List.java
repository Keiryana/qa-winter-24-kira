package model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class List {

    @Test

public void WorkingWithLists() {
        java.util.List <String> names = new ArrayList<>();

        names.add("Kira");
        names.add("Svetlana");
        names.add("Valeriy");
        names.add("Lucky");

        //---------------------FOR----------------------- проходит по всему списку
        //      from    to   step
        for (int i = 0; i < names.size(); i = i + 1) {    //i = i + 1 => i++; i < digit or names.size()
            System.out.println(names.get(i));
        }

        //-------------------FOREACH----------------------

        for (String name : names ) {
            System.out.println(name);

        }


//        System.out.println(names.isEmpty());
//        System.out.println(names.size());
//        System.out.println(names.get(3));



    }




}
