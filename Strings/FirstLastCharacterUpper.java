package Strings;

public class FirstLastCharacterUpper {
    public static void main(String[] args) {
        String str = "take u forward is awesome";
        String[] words = str.split(" ");
        StringBuilder cap = new StringBuilder();
        for (String w : words) {
            if(w.length() >=2){
                String first = w.substring(0, 1);
                String afterFirst = w.substring(1, w.length() - 1);
                String last = w.substring(w.length() - 1);
                cap.append(first.toUpperCase()).append(afterFirst).append(last.toUpperCase()).append(" ");
            }
            else{
                cap.append(w.toUpperCase()).append(" ");
            } 
        }
        System.out.println(cap);
    }
}
