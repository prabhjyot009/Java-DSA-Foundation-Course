import java.util.LinkedHashMap;
import java.util.Map;

import javax.management.RuntimeErrorException;

public class FirstRepeatedElement {
    public static void main(String[] args) {
        char c=getFirstNonRepeatedChar("aabbcc");
        System.out.println("Non Repeated Character="+c);
    }
    public static char getFirstNonRepeatedChar(String str){
        Map<Character,Integer> countMap=new LinkedHashMap<Character,Integer>(str.length());
        for(char ch : str.toCharArray()){
            countMap.put(ch, countMap.containsKey(ch) ? countMap.get(ch) + 1: 1);
        }
        for (Map.Entry<Character,Integer> entry : countMap.entrySet()) {
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        throw new RuntimeErrorException(null, "didn't find any non repeated Character");
    }
    public static char getSecondNonRepeat(String str2){
        Map<Character,Integer> countMap1=new LinkedHashMap<Character,Integer>(str2.length());
        for(char)
    }
}