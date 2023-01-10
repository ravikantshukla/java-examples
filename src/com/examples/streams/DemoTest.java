package com.examples.streams;

import java.util.*;

public class DemoTest {
    private static void sortByFrequency(int[] inputArray)
    {
         // Linkedhashmap to maintain insertion order
        Map<Integer, Integer> elementCountMap = new LinkedHashMap<>();


        for (int i = 0; i < inputArray.length; i++)
        {
            if (elementCountMap.containsKey(inputArray[i]))
            {

                elementCountMap.put(inputArray[i], elementCountMap.get(inputArray[i])+1);
            }
            else
            {
                elementCountMap.put(inputArray[i], 1);
            }
        }

        ArrayList<Integer> sortedElements = new ArrayList<>();

        elementCountMap.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(entry -> {
                    for(int i = 1; i <= entry.getValue(); i++)
                        sortedElements.add(entry.getKey());
                });
        sortedElements.stream().forEach(System.out::print);
        System.out.println();

        System.out.println("--------------distinct sorted element--------" );
            // distinct element
            sortedElements.stream().distinct().forEach(System.out::print);
    }

    public static void main(String[] args)
    {
        sortArrayElementsByFrequency(new int[] {7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3});
    }
}
