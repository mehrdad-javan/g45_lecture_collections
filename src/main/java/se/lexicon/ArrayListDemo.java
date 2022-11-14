package se.lexicon;

import java.util.*;

public class ArrayListDemo {

  public static void main(String[] args) {
    ex6();
  }


  public static void ex1() {

    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(100);
    numbers.add(100);
    numbers.add(400);
    numbers.add(300);
    numbers.add(200);
    System.out.println("Size: " + numbers.size());

    Iterator<Integer> iterator = numbers.iterator();
    /*while (iterator.hasNext()) {
      Integer currentElement = iterator.next();
      //System.out.println("iterator -> element = " + currentElement);
      if (currentElement == 400) {
        iterator.remove();
      }
    }*/

    System.out.println("Size: " + numbers.size());
    System.out.println("-----------------");
    /*for (Integer currentElement : numbers) { // 5
      //System.out.println("for -> element = " + currentElement);
      if (currentElement == 400){
        numbers.remove(currentElement); // Exception in thread "main" java.util.ConcurrentModificationException
      }
    }*/

    for (int i = 0 ; i < numbers.size() ; i++){
      if (numbers.get(i) == 400){
        numbers.remove(numbers.get(i));
      }
    }
    System.out.println("Size: " + numbers.size());

    System.out.println(" index[0] = " + numbers.get(0));
    System.out.println(" index[1] = " + numbers.get(1));
    System.out.println(" index[2] = " + numbers.get(2));
    System.out.println(" index[3] = " + numbers.get(3));
    //System.out.println(" index[10] = " + numbers.get(10)); // Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 4, Size: 4


  }

  public static void ex2(){
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(100);
    numbers.add(100);
    numbers.add(400);
    numbers.add(300);
    numbers.add(200);
    System.out.println("Size: " + numbers.size());
    Integer number = new Integer(100);

    boolean isRemove = numbers.remove(number);
   Integer indexValue = numbers.remove(3);

   for(Integer element: numbers){
     System.out.println(element);
   }

    System.out.println("Size: " + numbers.size());

  }

  public static void ex3(){
    ArrayList<String> euCars = new ArrayList<>();
    euCars.add("Volvo");
    euCars.add("BMW");
    euCars.add("Volvo");

    ArrayList<String> usaCars = new ArrayList<>();
    usaCars.add("Tesla");

    euCars.addAll(2,usaCars);

    for (String element: euCars){
      System.out.println("element = " + element);
    }



  }

  public static void ex4(){
    List<String> strings = new ArrayList<>();
    strings.add("D");
    strings.add("B");
    strings.add("A");
    strings.add("C");
    strings.add("a");

    Collections.sort(strings); // [A, B, C, D, a]
    Collections.sort(strings, String.CASE_INSENSITIVE_ORDER); // [A, a, B, C, D]
    Collections.sort(strings, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER)); // [D, C, B, A, a]
    System.out.println(strings);

  }

  public static void ex5(){
    String test1 = "TEST";
    String test2 = "TEST";
    boolean isResult = test1.equals(test2); // true
    System.out.println("isResult = " + isResult);

    Person person1 = new Person(1,"Test1", "Test1", "test.test");
    Person person2 = new Person(1,"Test1", "Test1", "test.test");
    boolean isResult2 = person1.equals(person2); // true
    //System.out.println(person1 + " - " + person2);
    System.out.println("isResult2 = " + isResult2);
    System.out.println(person1.hashCode());
    System.out.println(person2.hashCode());


  }

  public static void ex6(){
    List<Person> people = new ArrayList<>();
    people.add(new Person(1, "test2", "test22", "test.test"));
    people.add(new Person(3, "test1", "test11", "test.test"));
    people.add(new Person(2, "test2", "test11", "test.test"));
    people.add(new Person(1, "test3", "test33", "test.test"));

    Collections.sort(people);
    for (Person person: people){
      System.out.println(person.getId() + " " + person.getFirstName());
    }

    System.out.println("--------------------------------");
    Collections.sort(people, new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
      }
    });

    for (Person person: people){
      System.out.println(person.getId() + " " + person.getFirstName());
    }

  }


}


