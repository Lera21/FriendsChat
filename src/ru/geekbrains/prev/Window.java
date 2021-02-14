package ru.geekbrains.prev;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
  public Window (){
    setTitle("Friends Chat");
    setBounds(1000, 300, 600, 400);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    setLayout(new BorderLayout());
    JButton pushMessage = new JButton("Enter");
    // для отображения на экране текста
    JTextPane writeMessage = new JTextPane();
    JTextField messageWindow = new JTextField();
    setLayout(null);

    add (pushMessage);
    pushMessage.setBounds(450,310, 100,45);

    add(writeMessage);
    writeMessage.setBounds(10,310,400,45);

    add(messageWindow);
    messageWindow.setBounds(10,5, 500, 300);

    setVisible(true);

    pushMessage.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          messageWindow.setText("Me : " + writeMessage.getText());
          writeMessage.setText(null);
    }

  });
}}
