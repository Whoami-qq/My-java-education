/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.pkg7;

import javax.swing.JOptionPane;

/**
 *
 * @author capsl
 */
public class Lesson7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String in = JOptionPane.showInputDialog(null, "Введите положительное число");
        if (in == null || in.equals(" ") || in.equals("")) { 
            JOptionPane.showMessageDialog(null, "Вы ничего не ввели");
            return;
        }
        Double a = Double.parseDouble(in);
        if (a < 0) {
            JOptionPane.showMessageDialog(null, "Вы ввели отрицательное число");
            return;
        }else
            if (a == 0) {
                JOptionPane.showMessageDialog(null, "Вы ввели ноль");
                return;
            }
        String in1 = JOptionPane.showInputDialog(null, "Введите число отличное от нуля");
        if (in1.equals(null) || in1.equals(" ") || in1.equals(""))
            JOptionPane.showMessageDialog(null, "Вы ничего не ввели");
        Double b = Double.parseDouble(in1);
        if (b == 0)
            JOptionPane.showMessageDialog(null, "Резульат бесконечность");
        else JOptionPane.showMessageDialog(null,"Результатом деления числа " + a + " на число " + b + " = " +  a / b);
            
        }
        
            
    }
    

