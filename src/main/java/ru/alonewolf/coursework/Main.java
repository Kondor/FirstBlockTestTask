package ru.alonewolf.coursework;

import ru.alonewolf.coursework.model.MyList;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyList<String> lst1 = new MyList<>();
        lst1.add("one");
        lst1.add("two");
        lst1.add("three");

        System.out.println(lst1.get(1));
        lst1.remove(lst1.get(1));
        System.out.println(Arrays.toString(lst1.toArray()));


        System.out.println(lst1.getAuthor());
        //lst1.remove(lst1.get(0));
       //System.out.println(Arrays.toString(lst1.toArray()));

//        System.out.println(Arrays.toString(lst1.toArray(new String[1])));
//        System.out.println(lst1.get(-1));
        //System.out.println(Arrays.toString(lst1.toArray()));

    }
}
