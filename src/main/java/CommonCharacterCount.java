package main.java;

import java.util.HashMap;
import java.util.Map;

public class CommonCharacterCount {

   public int commonCharacterCount(String s1, String s2) {

       int commonCharacters = 0;

       //Check the characters only for the smaller string
       if(s1.length() <= s2.length()) {
           Map<Character, Integer> characterMap = buildCharacterMap(s2);
           for(Character toSearch : s1.toCharArray()){
               if(characterMap.containsKey(toSearch)) {
                   if(characterMap.get(toSearch) > 0) {
                       characterMap.put(toSearch, characterMap.get(toSearch)-1);
                       commonCharacters++;
                   } else {
                       characterMap.remove(toSearch);
                   }
               }
           }
       } else {
           Map<Character, Integer> characterMap = buildCharacterMap(s1);
           for(Character toSearch : s2.toCharArray()){
               if(characterMap.containsKey(toSearch)) {
                   if(characterMap.get(toSearch) > 0) {
                       characterMap.put(toSearch, characterMap.get(toSearch)-1);
                       commonCharacters++;
                   } else {
                       characterMap.remove(toSearch);
                   }
               }
           }
       }
        return commonCharacters;
    }

    private HashMap<Character, Integer> buildCharacterMap(String s){
       HashMap<Character, Integer> resultMap = new HashMap<>();
       for(Character c : s.toCharArray()){
           if(resultMap.containsKey(c)){
               resultMap.put(c,resultMap.get(c)+1);
           } else {
               resultMap.put(c,1);
           }
       }
       return resultMap;
    }

}
