package main.java;

import java.util.ArrayList;
import java.util.List;

public class AllLongestStrings {

    public static void main(String[] args) {

    }

    public String[] allLongestStrings(String[] inputArray) {

        List<String> resultList = new ArrayList<>();
        int max = 0;
        for(String s : inputArray){
            if(s.length() > max){
                max = s.length();
                resultList.clear();
                resultList.add(s);
            } else if( s.length() == max){
                resultList.add(s);
            }
        }
        String[] resultArray = new String[resultList.size()];
        return resultList.toArray(new String[]{});
    }

}
