
package Common;

import java.util.Random;
import java.util.Scanner;


public class Library {
    Scanner sc = new Scanner(System.in);
    
    public String getValue(String msg){
        System.out.print(msg);
        return sc.nextLine();
    }
    
    public int getIntForMenu(String msg, int min, int max){
        int a = -1;
        while(true){
            System.out.print(msg);
            try {
                a = Integer.parseInt(sc.nextLine());
                if(a >= min && a <= max){
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between " + min + " and " + max);
            }
        }
        return a;
    }
    
    
    public int[] createArray(int size_Array) {
        int[] array = new int[size_Array];
        Random rd = new Random();
        for (int i = 0; i < size_Array; i++) {
            array[i] = rd.nextInt(100);
        }
        return array;
    }

    public void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println("");
    }
}
