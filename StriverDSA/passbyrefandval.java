package StriverDSA;

//pass by value when you call functions and pass numbers then a copy goes but the orignal number(memory) did not go.
public class passbyrefandval {
    public static void dosomething(int num) {
        System.out.println(num);
        num += 5;
        System.out.println(num);
        num += 5;
        System.out.println(num);
        num += 5;
    }

    public static void main(String[] args) {
        int num = 10;
        dosomething(num);
        System.out.println(num);
    }
}
//pass by reference:
// public class passbyrefandval {
//     public static void dosomething(int[] arr) {
//         arr[0] = 5;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 4 };
//         dosomething(arr);
//         System.out.println(arr[0]);
//     }
// }
//in string
// public class passbyrefandval {
//     public static void dosomething(String str) {
//         str = "hello";
//     }

//     public static void main(String[] args) {
//         String str = "world";
//         dosomething(str);
//         System.out.println(str);
//     }
// }
// public class passbyrefandval {
//     public static void dosomething(StringBuilder str) {
//         str.append("hello");
//     }

//     public static void main(String[] args) {
//         StringBuilder str = new StringBuilder("world");
//         dosomething(str);
//         System.out.println(str);
//     }
// }
