package packageName;

import java.util.*;

public class FibonacciNumbers {

    static int FibNums(int x){

        if(x==0 || x==1){
            return 0;
        } else if(x==2){
            return 1;
        } else {
            return (FibNums(x-1)+FibNums(x-2));
        }
    }



    public static void main(String[] args){

        System.out.println("Enter a number to output Fibonacci Sequence numbers: ");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        System.out.println("The number you entered is: " + userInput);
        ArrayList<Integer> fibArray = new ArrayList<>();
        for(int i = 1; i<=userInput; i++){
            fibArray.add(FibNums(i));
        }
        System.out.println("The Fibonacci Sequence numbers of " + userInput + " numbers: " + fibArray);
    }

}
