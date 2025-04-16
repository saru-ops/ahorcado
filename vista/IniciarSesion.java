package com.mycompany.ahorcado.vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IniciarSesion {
    public IniciarSesion() {
        JFrame frame = new JFrame("LOGIN");
        frame.setLocation(700, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
         // Establecer GridLayout con 3 filas y 2 columnas
         frame.setLayout(new GridLayout(4, 2, 10, 10));
        JLabel username = new JLabel("Username");
        JTextField usernameTexto = new JTextField(10);
        JLabel password = new JLabel("Password");
        JTextField passwordTexto = new JTextField(10);
        JButton recordar = new JButton("Recoradr contraseña");
        JButton login = new JButton("Login");
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuOpciones mO = new menuOpciones();
                frame.dispose(); // Cierra el JFrame actual
            }
        });
        frame.add(username);
        frame.add(usernameTexto);
        frame.add(password);
        frame.add(passwordTexto);
        frame.add(recordar);
        frame.add(login);
        frame.setVisible(true);
    }

}

    

