package org.example.generics.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        //Collection
//        Collection<String> collectionNumbers = new ArrayList<>();
//        collectionNumbers.add("One");
//        collectionNumbers.add("Two");
//        collectionNumbers.add("Three");
//        collectionNumbers.add("Four");
//        collectionNumbers.add("Five");
//        collectionNumbers.add("Six");
//        collectionNumbers.removeIf(element -> element.equalsIgnoreCase("SIX"));
//        collectionNumbers.forEach(element -> System.out.println(element.concat(" element collection!")));


//        //List
//        List<String> listNumbers = new ArrayList<>();
//        listNumbers.add("One");
//        listNumbers.add("Two");
//        listNumbers.add("Three");
//        listNumbers.add("Four");
//        listNumbers.add("Five");
//        listNumbers.set(1, "New one");
//        listNumbers.forEach(element -> System.out.println(element + " element list!"));
//        System.out.println("\n");


//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("One");
//        arrayList.add("One");
//        arrayList.add("Two");
//        arrayList.add("Three");
//        arrayList.add("Four");
//        arrayList.add("Five");
//        arrayList.remove(3);
//        arrayList.forEach(element -> System.out.println(element.concat(" element array list!")));
//        System.out.println(arrayList);


//        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
//        arrayDeque.add("One");
//        arrayDeque.add("One");
//        arrayDeque.add("Two");
//        arrayDeque.add("Three");
//        arrayDeque.add("Four");
//        arrayDeque.add("Five");
//        arrayDeque.remove("Three");
//        arrayDeque.forEach(element -> System.out.println(element.concat(" element array deque!")));
//        System.out.println(arrayDeque);


//        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.add("One");
//        linkedList.add("One");
//        linkedList.add("Two");
//        linkedList.add("Three");
//        linkedList.add("Four");
//        linkedList.add("Five");
//        linkedList.remove(3);
//        linkedList.forEach(element -> System.out.println(element.concat(" element linked list!")));
//        System.out.println(linkedList);


//        //ListIterator
//        ListIterator<String> listIteratorNumbers;
//        listIteratorNumbers.add("One");


//        //HashSet
//        HashSet<String> hashSetNumbers = new HashSet<>();
//        hashSetNumbers.add("One");
//        hashSetNumbers.add("One");
//        hashSetNumbers.add("Two");
//        hashSetNumbers.add("Three");
//        hashSetNumbers.add("Four");
//        hashSetNumbers.add("Five");
//        hashSetNumbers.remove("Three");
//        hashSetNumbers.forEach(element -> System.out.println(element.concat(" element hash set!")));


//        TreeSet<String> treeSetNumbers = new TreeSet<>();
//        treeSetNumbers.add("One");
//        treeSetNumbers.add("One");
//        treeSetNumbers.add("Two");
//        treeSetNumbers.add("Three");
//        treeSetNumbers.add("Four");
//        treeSetNumbers.add("Five");
//        treeSetNumbers.remove("Three");
//        treeSetNumbers.forEach(element -> System.out.println(element.concat(" element tree set!")));
//        System.out.println(treeSetNumbers);
//        System.out.println(treeSetNumbers + "\nTime work tree set: " + (System.currentTimeMillis() - start));


//        EnumSet<Enum> enumSet = EnumSet.of(Enum.JAVA);
//        enumSet.add(Enum.PYTHON);
//        enumSet.forEach(System.out::println);
//        System.out.println(enumSet + " enum!");


        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("One");
        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        linkedHashSet.add("Three");
        linkedHashSet.remove("Three");
        linkedHashSet.forEach(element -> System.out.println(element + " element linked hash set!"));
        System.out.println(linkedHashSet);



//        Queue<String> queue = new ArrayDeque<>();
//        queue.add("One");
//        queue.add("One");
//        queue.add("Two");
//        queue.add("Three");
//        queue.add("Four");
//        queue.add("Five");
//        queue.forEach(element -> System.out.println(element.concat(" element queue!")));


        //        //Map
//        Map<Integer, String> mapNumbers = new HashMap<>();
//        mapNumbers.put(1, "One");
//        mapNumbers.put(1, "one");
//        mapNumbers.put(2, "Two");
//        mapNumbers.put(3, "Three");
//        mapNumbers.put(4, "Four");
//        mapNumbers.put(5, "Five");
//        System.out.print("\n");
//        System.out.println("Numbers: " + mapNumbers.keySet() + "\n" + "Objects: " + mapNumbers.entrySet());
//        //One way
//        Iterator<String> iterator = collection.iterator();
//        iterator.forEachRemaining(element -> System.out.println(element.concat(" element!")));

    }
}
