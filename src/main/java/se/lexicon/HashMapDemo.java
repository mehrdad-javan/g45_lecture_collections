package se.lexicon;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

  public static void main(String[] args) {
    ex1();
  }

  public static void ex1() {
    Map<String, String> contactMap = new HashMap<>();
    contactMap.put("Simon", "simon.elbrink@lexicon.se");
    contactMap.put("Mehrdad", "mehrdad.javan@lexicon.se");

    System.out.println(contactMap.get("Simon"));
    System.out.println(contactMap.containsKey("Simon"));
    System.out.println(contactMap.containsValue("mehrdad.javan@lexicon.se"));
    System.out.println(contactMap.containsValue("test"));

    System.out.println(contactMap.putIfAbsent("test", "test.test"));
    System.out.println(contactMap.replace("Mehrdad", "test.test@lexicon.se"));

    System.out.println("----------------------");

    for (Map.Entry entry : contactMap.entrySet()) {
      System.out.println(entry.getKey() + "  " + entry.getValue());
    }
    System.out.println("----------------------");


    Map<Integer, String> contactMap2 = new HashMap<>();
    contactMap2.put(1, "simon.elbrink@lexicon.se");
    contactMap2.put(2, "mehrdad.javan@lexicon.se");

    System.out.println(contactMap2.get(2));


  }
}
