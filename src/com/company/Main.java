package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        //окно
        JFrame frame = new JFrame("My first add");
        frame.setLayout(null);
        frame.setBounds(50, 50, 500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        //панель
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0, 500,200);
        panel.setBackground(Color.YELLOW);
        //добавим панель на фрейм
        frame.add(panel);
        panel.setVisible(true);
        //Надпись
        JLabel label = new JLabel("Какой-то текст");
        label.setBounds(10, 10, 250, 30);
        label.setForeground(Color.BLACK);
        label.setFont(new Font("MyFont", Font.ITALIC, 25));
        label.setOpaque(true);
        label.setBackground(Color.BLUE);
        panel.add(label);
        //поле ввода текста
        JTextField textField1 = new JTextField();
        textField1.setBounds(10, 50, 250, 30);
        JTextField textField2 = new JTextField();
        textField2.setBounds(10, 90, 250, 30);
        //добавим всё это на панель
        panel.add(textField1);
        panel.add(textField2);
        //кнопка
        JButton button = new JButton("Нажми на меня");
        button.setBounds(10,130, 250, 30);
        panel.add(button);
        //обработчик нажатие на кнопку
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setText("Ой на меня нажали");
                button.setBackground(Color.RED);
                int a = Integer.parseInt(textField1.getText());
                int b = Integer.parseInt(textField2.getText());
                JOptionPane.showMessageDialog(null, a+b+"");
                String stroka = JOptionPane.showInputDialog("напишите что-то");
                label.setText(stroka);
            }
        });
        frame.setVisible(true);
    }
}











