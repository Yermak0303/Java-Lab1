/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab01;
import java.util.Scanner;
/**
 *
 * @author 1710502
 */
public class JavaLab01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any string > ");
        String str = in.nextLine();
        System.out.printf("You entered: %s\n", str);
in.close();
        // TODO code application logic here
    }
    
}
