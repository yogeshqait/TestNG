package com.qainfotech;

import java.util.*;
 
public class CheckConsecutive 
{
    public ArrayList<String> filtered = new ArrayList<String>();
    public ArrayList<String> check(ArrayList<String> array)
    {
        for (int counter = 0; counter < array.size(); counter++) { 		      
            char[] characters = array.get(counter).toCharArray();
            for(int i=1; i < characters.length; i++) {
                if(characters[i] == characters[i-1]) {
                    filtered.add(array.get(counter));
                    break;
                }
            }
        }   
        return filtered;
    }
}
