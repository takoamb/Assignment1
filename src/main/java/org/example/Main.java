package org.example;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 15, 7, 0, 11, 13};
        int evenNumbers = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers++;
            }
        }

        if (evenNumbers == 0) {
            System.out.println("მასივში არ არის ლუწი რიცხვი");
        } else {
            System.out.println("მასივში არის " + evenNumbers + " ლუწი რიცხვი");
        }


        While.task2();
        Length.task3();
        checkNumber(0);
        hasTeen(12, 13, 14);
    }

    public static void checkNumber(double oddOrEven) {
        if (oddOrEven > 0) {
            System.out.println("დადებითი");  // Positive number
        } else if (oddOrEven < 0) {
            System.out.println("უარყოფითი");  // Negative number
        } else {
            System.out.println("ნოლი");  // Zero
        }
    }

    public static void hasTeen(int range1, int range2, int range3) {
        if ((range1 >= 13 && range1 <= 19) || (range2 >= 13 && range2 <= 19) || (range3 >= 13 && range3 <= 19)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

class While {
    public static void task2() {
        String name = "Tako Ambokadze";
        int i = 2;

        while (i < name.length()) {
            if (name.charAt(i) == 'z') break;
            System.out.println(name.charAt(i));
            i += 3;
        }
    }
}

class Length {
    public static void task3() {
        String evenOrOdd = "abcdd";
        int length = evenOrOdd.length();

        if (length % 2 == 0) {
            System.out.println("ლუწია");
        } else {
            System.out.println("კენტია");
        }
    }
}

