/**
 * StringSum
 */
public class StringSum {

    public static void main(String[] args) {
        String input = "1xy23";
        int sum = 0;
        String[] numbers = input.split("");
        for (String number : numbers) {
            if(Character.isDigit(number.charAt(0))){
                sum += Integer.parseInt(number);
            }
        }
        System.out.println(sum);
    }
}