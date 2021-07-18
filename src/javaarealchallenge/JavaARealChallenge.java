package javaarealchallenge;

// import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaARealChallenge {

    public static void main(String[] args) {

        // https://open.kattis.com/problems/areal
        // simple calculation program
        // I get (Time Limit Exceeded, Run Time Error) in kattis.
        // RRRRRRRRRXXXXXXXXXXXX
        
        
        
        
        
        Scanner in = new Scanner(System.in);
        int area = GetInteger(in);
        System.out.println(SquareCircumference(area));

    }

    private static double SquareCircumference(int squareArea) {
        double side = Math.sqrt(squareArea);
        double circumference = 4 * side;
        return circumference;
    }

    private static int GetInteger(Scanner input) {
        int res = 0;
//        try {
            res = Integer.parseInt(input.nextLine());
//            if (res < 1)// || res > Math.pow(10, 18)) 
//            {
//                throw new InputMismatchException();
//            }

            return res;
//        } catch (Exception e) {
//            return GetInteger(input);
//        }
    }
}
