package string;

import java.util.*;

public class StringProbs{
    //non repeating character
    public Character findNonRepeatingCharacter(String str){
        Map<Character,Integer> map = new HashMap<>();
        for(var character : str.toCharArray()){
            map.put(character, map.getOrDefault(character, 0)+1);
        }
        
        for(char character : str.toCharArray()){
            if(map.get(character) == 1)
                return character;
        }
        return ' ';
    }


    //one away string
    public boolean isOneAwayString(String str1, String str2){
        var str1Length = str1.length();
        var str2Length = str2.length();

        if(str1Length-str2Length>2 || str2Length-str1Length>2){
            return false;
        }

        var countDifference = 0;
        if(str1Length == str2Length){
            for(var i=0; i<str1Length; i++){
                if(str1.charAt(i) != str2.charAt(i)){
                    countDifference++;
                }
            }
        }
        else{
            Set<Character> set = new HashSet<>();
            if(str1Length < str2Length){
                for(var character : str1.toCharArray()){
                    set.add(character);
                }
                for(var character : str2.toCharArray()){
                    if(set.add(character))
                        countDifference++;
                }
            }
            else{
                for(var character : str2.toCharArray()){
                    set.add(character);
                }
                for(var character : str1.toCharArray()){
                    if(set.add(character))
                        countDifference++;
                }
            }
        }

        return countDifference==1;
    }
}