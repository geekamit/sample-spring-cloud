package com.array;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Sum is "+calculate("30-22+213"));
        Set<Person> setValue = new TreeSet<>();
        setValue.add(new Person(4,"Amit"));
        setValue.add(new Person(1,"Kumar"));
        setValue.add(new Person(2,"Ranjit"));
        setValue.add(new Person(2,"Ranjit"));

        System.out.println(setValue);

        TreeMap<Person,Integer> map = new TreeMap<>();

        for (Person person : setValue){
            if (map.containsKey(person)){
                Integer count = map.get(person);
                map.put(person, count++);
            }else {
                map.put(person,1);
            }
        }
        System.out.println(map);

    }


    static class Person implements Comparable<Person>{
        Integer id;
        String name;

        Person(Integer id, String name){
            this.id = id;
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public int compareTo(Person o) {
            if(o.id > this.id) return -1;
            if(o.id < this.id) return 1;
            return  0;

        }
    }

    private static int calculate(String input) {
        String parsedInteger = "";
        int aggregate = 0;
        int length = input.length();
        String operator = "";
        for (int i=0;i<length;i++){
            char c = input.charAt(i);
            if (isDigit(c)){
                parsedInteger += c;
            }
            if (!isDigit(c) || i == length-1){
                int parsed = Integer.parseInt(parsedInteger);
                if (operator.equals("")) {
                    aggregate = parsed;
                }else if (operator.equals("+")){
                    aggregate = aggregate + parsed;

                }else if(operator.equals("-")){
                    aggregate = aggregate - parsed;

                }
                operator = ""+c;
                parsedInteger = "";
            }
        }


        return aggregate;
    }

    public static boolean isDigit(char c){
        return Character.isDigit(c);

    }

}
