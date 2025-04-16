package com.mycompany.ahorcado.vista;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class juegoNuevo {
    public juegoNuevo() {
        JFrame frame = new JFrame("JUEGO NUEVO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 300);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());
        
        JPanel panelSuperior = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JMenuBar barraMenu = new JMenuBar();
        JMenu idioma = new JMenu("IDIOMA");
        JMenuItem español = new JMenuItem("ESPAÑOL");
        JMenuItem ingles = new JMenuItem("INGLÉS");
        JMenuItem frances = new JMenuItem("FRANCES");
        panelSuperior.add(barraMenu);
        barraMenu.add(idioma);
        idioma.add(español);
        idioma.add(ingles);
        idioma.add(frances);
        frame.add(panelSuperior, BorderLayout.NORTH);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
        frame.add(panelPrincipal, BorderLayout.CENTER);


        JPanel panelTipo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel tipo = new JLabel("Tipo:");
        JRadioButton palabras = new JRadioButton("Palabras");
        JRadioButton frases = new JRadioButton("Frases");
        ButtonGroup tipoGrupo = new ButtonGroup();
        tipoGrupo.add(palabras);
        tipoGrupo.add(frases);
        panelTipo.add(tipo);
        panelTipo.add(palabras);
        panelTipo.add(frases);
        panelPrincipal.add(panelTipo);


        JPanel panelJugadoresNivel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelJugadoresNivel.add(new JLabel("Número de jugadores"));
        JTextField jugadoresTexto = new JTextField(5);
        panelJugadoresNivel.add(jugadoresTexto);
        panelJugadoresNivel.add(new JLabel("Partidas"));
        JTextField partidasTewxto = new JTextField(5);
        panelJugadoresNivel.add(partidasTewxto);
        panelJugadoresNivel.add(new JLabel("Dificultad"));
        JTextField dificultadTexto = new JTextField(5);
        panelJugadoresNivel.add(dificultadTexto);
        panelPrincipal.add(panelJugadoresNivel);

        JPanel panelnombresJugadores = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelnombresJugadores.add(new JLabel("Jugador 1"));
        JTextField jugador1 = new JTextField(10);
        panelnombresJugadores.add(jugador1);
        panelnombresJugadores.add(new JLabel("Jugador 2"));
        JTextField jugador2 = new JTextField(10);
        panelnombresJugadores.add(jugador2);
        panelnombresJugadores.add(new JLabel("Jugador3"));
        JTextField jugador3 = new JTextField(10);
        panelnombresJugadores.add(jugador3);
        panelPrincipal.add(panelnombresJugadores);

        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton ok = new JButton("Ok");
        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                partida P = new partida();
                frame.dispose(); // Cierra el JFrame actual
            }
        });
        JButton cancelar = new JButton("Cancelar");
        cancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuOpciones mO = new menuOpciones();
                frame.dispose(); // Cierra el JFrame actual
            }
        });
        panelBotones.add(ok);
        panelBotones.add(cancelar);
        frame.add(panelBotones, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}

