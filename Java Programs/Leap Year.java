import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        if(n>=1900 && n<=100000){
            if (((n % 4 == 0) && (n % 100!= 0)) || (n % 400 == 0))
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}
  
