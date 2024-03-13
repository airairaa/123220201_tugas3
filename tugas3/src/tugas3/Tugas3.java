/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas3;


import javax.swing.*;

/**
 * 
 * @author airaa
 */
public class Tugas3 extends JFrame{
JLabel lkalkulator = new JLabel("Kalkulator");
JTextField finput = new JTextField(10);
JTextField fhasil = new JTextField(10);

//button angka
JButton one = new JButton ("1");
JButton two = new JButton ("2");
JButton three = new JButton ("3");
JButton four = new JButton ("4");
JButton five = new JButton ("5");
JButton six = new JButton ("6");
JButton seven = new JButton ("7");
JButton eight = new JButton ("8");
JButton nine = new JButton ("9");
JButton zero = new JButton ("0");

//button perhitungan
JButton clear = new JButton ("c");
JButton plus = new JButton ("+");
JButton minus = new JButton ("-");
JButton times = new JButton ("*");
JButton divide = new JButton ("/");
JButton hundred = new JButton ("00");
JButton delete = new JButton ("d");
JButton result = new JButton ("=");
JButton comma = new JButton (".");
JButton persen = new JButton ("%");
Tugas3(){
           setTitle("Kalkulator 123220201");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setLayout(null);
        add(finput);
        add(fhasil);
        
        add(clear);
        add(persen);
        add(delete);
        add(divide);
        
        add(seven);
        add(eight);
        add(nine);
        add(times);
        
        add(four);
        add(five);
        add(six);
        add(minus);
        
        add(one);
        add(two);
        add(three);
        add(plus);
        
        add(hundred);
        add(zero);
        add(comma);
        add(result);
        
        finput.setBounds(10, 8, 233, 20);
        fhasil.setBounds(10,30, 233, 20);
        
        clear.setBounds(10, 65, 50, 35);
        delete.setBounds(70, 65, 50, 35);
        persen.setBounds(130, 65, 50, 35);
        divide.setBounds(190, 65, 50, 35);
        
        seven.setBounds(10, 105, 50, 35);
        eight.setBounds(70, 105, 50, 35);
        nine.setBounds(130, 105, 50, 35);
        times.setBounds(190, 105, 50, 35);
        
        four.setBounds(10, 145, 50, 35);
        five.setBounds(70, 145, 50, 35);
        six.setBounds(130, 145, 50, 35);
        minus.setBounds(190,145, 50, 35);
        
        one.setBounds(10, 185, 50, 35);
        two.setBounds(70, 185, 50, 35);
        three.setBounds(130, 185, 50, 35);
        plus.setBounds(190,185, 50, 35);
        
        hundred.setBounds(10, 225, 50, 35);
        zero.setBounds(70, 225, 50, 35);
        comma.setBounds(130, 225, 50, 35);
        result.setBounds(190,225, 50, 35);
}



}

