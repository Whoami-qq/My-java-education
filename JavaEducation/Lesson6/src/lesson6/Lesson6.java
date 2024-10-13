/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6;

/**
 *
 * @author capsl
 */
public class Lesson6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 5;
        int b = 10;
        String b_a = Integer.toBinaryString(a);
        String b_b = Integer.toBinaryString(b);
        System.out.println("Битовое значение числа " + a + " = " + b_a);
        System.out.println("Битовое значение числа " + b + " = " + b_b);
        System.out.println(a & b);
        System.out.println(a ^ b);
        System.out.println(a | b);
        System.out.println(Integer.toBinaryString(~a));
        System.out.println(a>>1);
        System.out.println(a<<1);
        
        
                
    }
    
}
