package com.mycompany.ahorcado.vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class partida {
    public partida() {
        JFrame frame = new JFrame("PARTIDA");
        frame.setSize(900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        JPanel panelIzquierdo = new JPanel();
        panelIzquierdo.setLayout(new BoxLayout(panelIzquierdo, BoxLayout.Y_AXIS));
        panelIzquierdo.setPreferredSize(new Dimension(180, 600));

        JLabel usadasLabel = new JLabel("Usadas:");
        JTextArea usadasArea = new JTextArea("X, L, W, M");
        usadasArea.setEditable(false);
        usadasArea.setPreferredSize(new Dimension(150, 60));
        usadasArea.setLineWrap(true);

        JLabel puntosLabel = new JLabel("Puntos:");
        JTextArea puntosArea = new JTextArea("Nombre1: ...\nNombre2: ...");
        puntosArea.setEditable(false);
        puntosArea.setPreferredSize(new Dimension(150, 100));
        panelIzquierdo.add(Box.createVerticalStrut(20));
        panelIzquierdo.add(usadasLabel);
        panelIzquierdo.add(usadasArea);
        panelIzquierdo.add(Box.createVerticalStrut(20));
        panelIzquierdo.add(puntosLabel);
        panelIzquierdo.add(puntosArea);

        JPanel panelSuperior = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel turnoLabel = new JLabel("Turno: ________");
        panelSuperior.add(turnoLabel, BorderLayout.CENTER);
        
        JPanel panelBotonSalir = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton salir = new JButton("Salir");
        salir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuOpciones mO = new menuOpciones();
                frame.dispose(); // Cierra el JFrame actual
            }
        });
        panelBotonSalir.add(salir);

        JPanel panelCentro = new JPanel();
        panelCentro.setLayout(new BorderLayout());

        JPanel panelDibujo = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawLine(50, 250, 150, 250); // base
                g.drawLine(100, 250, 100, 50); // poste
                g.drawLine(100, 50, 200, 50);  // barra superior
                g.drawLine(200, 50, 200, 80);  // cuerda
                // Aquí puedes agregar cabeza, cuerpo, etc.
            }
        };
        panelDibujo.setPreferredSize(new Dimension(400, 300));
        panelDibujo.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JPanel panelPalabra = new JPanel(new GridLayout(2, 1));
        JLabel definicionLabel = new JLabel("Definición o descripción de la palabra");
        JLabel palabraLabel = new JLabel("_ _ _ _ _", SwingConstants.CENTER);
        palabraLabel.setFont(new Font("Monospaced", Font.BOLD, 24));
        panelPalabra.add(definicionLabel);
        panelPalabra.add(palabraLabel);
        panelCentro.add(panelDibujo, BorderLayout.CENTER);
        panelCentro.add(panelPalabra, BorderLayout.SOUTH);

        JPanel panelLetras = new JPanel(new GridLayout(2, 13)); // 26 letras
        ButtonGroup grupoLetras = new ButtonGroup();
        for (char letra = 'A'; letra <= 'Z'; letra++) {
            JRadioButton botonLetra = new JRadioButton(String.valueOf(letra));
            grupoLetras.add(botonLetra);
            panelLetras.add(botonLetra);
        }

        frame.add(panelSuperior, BorderLayout.NORTH);
        frame.add(panelIzquierdo, BorderLayout.WEST);
        frame.add(panelCentro, BorderLayout.CENTER);
        frame.add(panelLetras, BorderLayout.SOUTH);
        frame.add(panelBotonSalir, BorderLayout.EAST);

        frame.setVisible(true);
    }
}

