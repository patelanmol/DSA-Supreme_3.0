package BitwiseOperator;

public class evenOdd {
    public static void main(String[] args) {
        checkEvenOrOdd(5);
        checkEvenOrOdd(10);
    }

    public static void checkEvenOrOdd(Integer x){
        if((x & 1) == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}