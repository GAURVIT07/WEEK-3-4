// //Q1
// import java.util.Scanner;

// public class FizzBuzz {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();

//         if (number > 0) {
//             for (int i = 1; i <= number; i++) {
//                 if (i % 3 == 0 && i % 5 == 0) {
//                     System.out.println("FizzBuzz");
//                 } else if (i % 3 == 0) {
//                     System.out.println("Fizz");
//                 } else if (i % 5 == 0) {
//                     System.out.println("Buzz");
//                 } else {
//                     System.out.println(i);
//                 }
//             }
//         }
//         sc.close();
//     }
// }




// // Q2
// import java.util.Scanner;

// public class PowerCalculation {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int base = sc.nextInt();
//         int exponent = sc.nextInt();

//         long result = 1;

//         if (base >= 0 && exponent >= 0) {
//             for (int i = 1; i <= exponent; i++) {
//                 result *= base;
//             }
//             System.out.println(result);
//         }
//         sc.close();
//     }
// }








// // Q3
// import java.util.Scanner;

// public class FindFactors {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();

//         if (number > 0) {
//             for (int i = 1; i <= number; i++) {
//                 if (number % i == 0) {
//                     System.out.print(i + " ");
//                 }
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }