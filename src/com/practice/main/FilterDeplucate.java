package com.practice.main;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class FilterDeplucate {

	public  Integer[] removeDuplicateElements(Integer[] numbers){  
         
        //This array has duplicate elements
        System.out.println( Arrays.toString(numbers) );
         
        //Create set from array elements
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(numbers) );
         
        //Get back the array without duplicates
        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
         
        //Verify the array content
        System.out.println( Arrays.toString(numbersWithoutDuplicates) );
        
        return numbersWithoutDuplicates ;
    }  
	
}
