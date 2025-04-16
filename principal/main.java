package com.mycompany.ahorcado.principal;

import com.mycompany.ahorcado.vista.FormularioRegistro;
import com.mycompany.ahorcado.vista.IniciarSesion;

import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args) {
        // Configura apariencia
        JFrame.setDefaultLookAndFeelDecorated(true);

        // Crea la ventana principal
        JFrame frame = new JFrame("JUEGO DEL AHORCADO");
        frame.setLocation(700, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new GridLayout(4, 1, 10, 10));

        // Botón Login
        JButton login = new JButton("Cargar");
        login.addActionListener(e -> {
            new IniciarSesion(); // abre ventana de login
            frame.dispose(); // cierra esta ventana
        });

        // Botón Registrarse
        JButton registro = new JButton("Registrate");
        registro.addActionListener(e -> {
            new FormularioRegistro(); // abre ventana de registro
            frame.dispose(); // cierra esta ventana
        });

        // Botón Información (por ahora sin acción)
        JButton informacion = new JButton("Información");

        // Botón Salir
        JButton salir = new JButton("Salir");
        salir.addActionListener(e -> System.exit(0)); // cierra la app

        // Añadir botones a la ventana
        frame.add(login);
        frame.add(registro);
        frame.add(informacion);
        frame.add(salir);
        frame.setVisible(true);
    }
}
