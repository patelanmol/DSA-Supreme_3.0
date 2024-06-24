package BitwiseOperator;

public class numberOfSetBits {
    public static void main(String[] args) {
        getNumberOfSetBits(3);
    }

    public static void getNumberOfSetBits(Integer num){

        int setBitCount = 0;
        while(num!=0){
            if((num & 1) == 1)
                setBitCount+=1;

            num >>= 1;
        }
        System.out.println(setBitCount);
    }
}
