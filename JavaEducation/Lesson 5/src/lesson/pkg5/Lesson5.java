/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.pkg5;

/**
 *
 * @author capsl
 */
public class Lesson5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean t = true;
        boolean f = false;
        boolean f1 = false;
        System.out.println(t && !(f && f1));
        System.out.println(!t || f || f1);
        System.out.println(t ^ f ^ f1);
    }
    
}
