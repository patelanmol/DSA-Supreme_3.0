package Recursion;

public class printDigits {

    public static void main(String[] args) {

        getDigits(0);
    }

    public static void getDigits(int num){

        if(num == 0)
            return;

        System.out.println(num%10);

        getDigits(num/10);

    }

}
