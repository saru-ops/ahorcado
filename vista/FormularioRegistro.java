package com.mycompany.ahorcado.vista;

import com.mycompany.ahorcado.principal.Main;

import javax.swing.*;
import java.awt.*;

public class FormularioRegistro {

    public FormularioRegistro() {
        JFrame ventana = new JFrame("Registro de nuevo jugador");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(520, 430);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(new BorderLayout());

        // Panel central con GridBagLayout para campos
        JPanel panelCentral = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Campos
        String[] etiquetas = {"Nombre:", "Apellido:", "Usuario:", "Contraseña:", "Correo:", "Cuenta bancaria:"};
        JTextField[] camposTexto = new JTextField[etiquetas.length];

        for (int i = 0; i < etiquetas.length; i++) {
            gbc.gridx = 0;
            gbc.gridy = i;
            panelCentral.add(new JLabel(etiquetas[i]), gbc);

            gbc.gridx = 1;
            camposTexto[i] = new JTextField(20);
            panelCentral.add(camposTexto[i], gbc);
        }

        // Panel de tipo de cuenta (normal o premium)
        JPanel panelTipo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelTipo.setBorder(BorderFactory.createTitledBorder("Tipo de cuenta"));
        JRadioButton cuentaBasica = new JRadioButton("Básica");
        JRadioButton cuentaPremium = new JRadioButton("Avanzada");
        ButtonGroup grupoCuentas = new ButtonGroup();
        grupoCuentas.add(cuentaBasica);
        grupoCuentas.add(cuentaPremium);
        panelTipo.add(cuentaBasica);
        panelTipo.add(cuentaPremium);

        gbc.gridx = 0;
        gbc.gridy = etiquetas.length;
        gbc.gridwidth = 2;
        panelCentral.add(panelTipo, gbc);

        // Panel inferior con botones
        JPanel panelInferior = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton volver = new JButton("Volver");
        JButton continuar = new JButton("Crear cuenta");

        volver.setPreferredSize(new Dimension(130, 30));
        continuar.setPreferredSize(new Dimension(130, 30));

        volver.addActionListener(e -> {
            new main(); // Volver al menú principal
            ventana.dispose();
        });

        continuar.addActionListener(e -> {
            new IniciarSesion(); // Ir al login tras registro
            ventana.dispose();
        });

        panelInferior.add(volver);
        panelInferior.add(continuar);

        // Añadir paneles a la ventana
        ventana.add(panelCentral, BorderLayout.CENTER);
        ventana.add(panelInferior, BorderLayout.SOUTH);

        ventana.setVisible(true);
    }
}



