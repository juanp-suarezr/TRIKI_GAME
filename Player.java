package TRIKI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextField;

public class Player extends JFrame {

    int change = 0;
    static JTextField player_1;
    static JTextField player_2;
    

    JButton botonp1;
    public Player() {
        
        setSize(500, 500);
        
        setTitle("triki");
        
        setLocationRelativeTo(null);

        name();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void name() {

        JPanel name = new JPanel();
        name.setBackground(Color.lightGray);
        getContentPane().add(name);

        JLabel bienvenido = new JLabel("BIENVENIDO A TRIKI PLUS");
        bienvenido.setFont(new Font("default", Font.BOLD, 20));
        bienvenido.setHorizontalAlignment(JLabel.CENTER);
        bienvenido.setForeground(Color.blue);
        bienvenido.setLayout(new FlowLayout());
        name.add(bienvenido);

        JLabel img = new JLabel();
        Image imagenInterna = new ImageIcon(
        getClass().getResource("titulo.png")).getImage();
        img.setIcon(new ImageIcon(imagenInterna));

        name.add(img);

        JLabel aks_name = new JLabel("Jugador 1 Cual es tu nombre");
        aks_name.setFont(new Font("default", Font.ITALIC, 20));
        aks_name.setHorizontalAlignment(JLabel.CENTER);
        name.add(aks_name);

        player_1 = new JTextField("-----------");
        player_1.setFont(new Font("default", Font.ITALIC, 20));
        player_1.setHorizontalAlignment(JLabel.CENTER);
        name.add(player_1);

        JLabel aks_name2 = new JLabel("Jugador 2 Cual es tu nombre");
        aks_name2.setFont(new Font("default", Font.ITALIC, 20));
        aks_name2.setHorizontalAlignment(JLabel.CENTER);
        name.add(aks_name2);

        player_2 = new JTextField("-----------");
        player_2.setFont(new Font("default", Font.ITALIC, 20));
        player_2.setHorizontalAlignment(JLabel.CENTER);
        
        name.add(player_2);

        JButton botonp1 = new JButton("Continue");
        botonp1.setFont(new Font("default", Font.ITALIC, 30));
        name.add(botonp1);


        ActionListener oyentedeaccionP = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            player_1.setEnabled(false);
            player_2.setEnabled(false);
            botonp1.setEnabled(false);
            change = 1;
            if (change == 1) {
                Juego jg = new Juego();
                setVisible(false);
                jg.setVisible(true);
                
            }


        }
        };

        botonp1.addActionListener(oyentedeaccionP);
        

    }

}
