package se.lexicon;

import java.util.*;

public class HashSetDemo {

  public static void main(String[] args) {
    ex3();
  }

  public static void ex1() {
    Set<String> countries = new HashSet<>();
    countries.add("Sweden");
    countries.add("Iran");
    countries.add("India");
    countries.add("Sweden");

    System.out.println("countries = " + countries);

    for (String country : countries) {
      System.out.println(country);
    }

  }

  public static void ex2() {
    Set<Person> hashSet = new HashSet<>();
    hashSet.add(new Person(1, "Test", "Test", "test.test"));
    hashSet.add(new Person(2, "Test2", "Test2", "test2.test"));
    hashSet.add(new Person(1, "Test", "Test", "test.test"));
    System.out.println(hashSet);
  }

  public static void ex3() {
    Set<String> set = new HashSet<>();
    set.add("123");
    set.add("456");

    List<String> list = new ArrayList<>();
    list.addAll(set);

    List<String> strings = Arrays.asList("a", "b", "c");
    System.out.println(strings);


  }
}
