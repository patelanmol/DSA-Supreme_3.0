package Recursion;

import java.util.ArrayList;
import java.util.List;

public class subsequence {
    public static void main(String[] args) {

        String s = "abc";
        List<String> subsequenceList = new ArrayList<>();
        addSubsequence(s, 0, "", subsequenceList);
        System.out.println(subsequenceList);
        System.out.println(subsequenceList.size());
    }

    public static void addSubsequence(String s, int index, String res, List<String> sub){

        if(index == s.length()){
            sub.add(res);
            return;
        }

        // include
        addSubsequence(s, index+1, res+s.charAt(index), sub);

        // exclude
        addSubsequence(s, index+1, res, sub);
    }
}
