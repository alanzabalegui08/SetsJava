package com.zabalegui.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){

        // Create objects
        Animal duck = new Animal("Duck", 3);
        Animal lion = new Animal("Lion", 4);
        Animal cat = new Animal("Cat", 2);
        Animal dog = new Animal("Dog", 5);

        /*
          HashSet is a simple class that implement
          Set instance no contains duplicate elements
         */
        System.out.println("HashSet implementation");
        Set<Animal> set = new HashSet<>();  //

        // Add objects to set
        set.add(duck);
        set.add(lion);
        set.add(cat);
        set.add(lion); // element is no add because Set not allowed
        set.add(dog);

        // remove element
        set.remove(lion);

        System.out.println(set);

        // Set no add elements in order
        for(Animal element: set)
            System.out.println(element.getName());

        // Clean all set
        set.clear();


        // Implement LinkedHashSet maintains the order in which the element are inserted

        System.out.println("LinkedHashSet implement");

        // Add objects to LinkedHashSet
        Set<Animal> setLinkedHashSet =  new LinkedHashSet<>();
        setLinkedHashSet.add(duck);
        setLinkedHashSet.add(lion);
        setLinkedHashSet.add(cat);

        // print LinkedHashSet
        for(Animal animal: setLinkedHashSet)
            System.out.println(animal.getName());


        /*
          TreeSet instance of AbstractSet.
          SortedSet is a subinterface of Set
          the elements in the set are sorted and provide methods
         */

        System.out.println("TreeSet implement");

        // Simple set
        Set<String> setCity = new HashSet<>();
        setCity.add("London");
        setCity.add("Tokyo");
        setCity.add("Milan");
        setCity.add("Madrid");
        setCity.add("Las Vegas");

        // TreeSet instance
        TreeSet<String> treeSet = new TreeSet<>(setCity);

        for (String citys: treeSet)
            System.out.println(citys);

        // Use the methods  in SortedSet and comparator interface
        System.out.println("first() " + treeSet.first()); // return first lower element in the set
        System.out.println("last() " + treeSet.last()); // return last highest element in the set
        System.out.println("headSet() " + treeSet.headSet("Madrid")); // return set whose elements are strictly less than toElement
        System.out.println("tailSet() " + treeSet.tailSet("Madrid")); // return set whose elements are greater than or equal to from toElement

    }
}
