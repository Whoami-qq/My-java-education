/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.pkg8;

import javax.swing.JOptionPane;

/**
 *
 * @author capsl
 */
public class Lesson8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int summ = 0;
        String in = JOptionPane.showInputDialog(null, "Введите положительное целочисленное число");
        if (in.equals(null) || in.equals(" "))
            JOptionPane.showMessageDialog(null, "Вы не ввели число");
        Double a = Double.parseDouble(in);
        if (!(a == 0) && a % 1 == 0 && a > 0);
        else {
            JOptionPane.showMessageDialog(null, "Вы ввели некорректные данные");
            return;
        }
         for (int i = 0; i <= a; i++)
             summ += i;
         System.out.print("Сумма всех чисел до " + a + " = " + summ );
             
         
       
        
        
            
            
            
    }

    
    
}
