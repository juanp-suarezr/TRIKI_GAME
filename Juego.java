package TRIKI;
import TRIKI.*;

import java.awt.event.*;
import java.awt.*;

import javax.swing.JTextField;
import javax.swing.text.AttributeSet.FontAttribute;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Juego extends JFrame {
    
    

    JTextField sup_izq;  JTextField sup_cen; JTextField sup_der; 
    JTextField cen_izq;  JTextField centro;  JTextField cen_der;
    JTextField inf_izq;  JTextField inf_cen; JTextField inf_der;

    JTextField player_1;
    JTextField player_2;
    JPanel bn;
    JPanel pantalla_triki;
    JButton boton;
    JLabel ganador;
    JLabel ganador1;

    int high_left; int high_center; int high_right;
    int center_left; int center; int center_right;
    int down_left; int down_center; int down_right;
    
    Integer suma_sup_horizontal;
    Integer suma_center_horizontal;
    Integer suma_inf_horizontal;
    Integer suma_left_vertical;
    Integer suma_center_vertical;
    Integer suma_right_vertical;
    Integer suma_left_downright;
    Integer suma_right_downleft;
    
    

    public Juego() {
        
        setSize(500, 500);
        
        setTitle("triki");
        
        setLocationRelativeTo(null);

        titulo();
        pantalla_triki();
        eventos();
        
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    public void titulo() {
        
        
        JPanel titulo = new JPanel();
        titulo.setBackground(Color.BLUE);
        getContentPane().add(titulo, BorderLayout.NORTH);

        JLabel titule = new JLabel("TRIKI");
        titule.setFont(new Font("default", Font.BOLD, 50));
        
        titulo.add(titule); 


        String text = Player.player_1.getText();
        player_1 = new JTextField(text);
        player_1.setBackground(Color.green);
        player_1.setFont(new Font("default", Font.BOLD, 20));
        titulo.add(player_1); 


        String text2 = Player.player_2.getText();
        player_2 = new JTextField(text2);
        player_2.setBackground(Color.red);
        player_2.setFont(new Font("default", Font.BOLD, 20));
        titulo.add(player_2); 


    }
        
        
    public void pantalla_triki() {
       
        bn = new JPanel();
        bn.setBackground(Color.WHITE);
        getContentPane().add(bn, BorderLayout.SOUTH);
        boton = new JButton("retry");
        boton.setFont(new Font("default", Font.BOLD, 40));
        bn.add(boton); 
        
        pantalla_triki = new JPanel();  //creacion de panel
       
        pantalla_triki.setLayout(new GridLayout(3,3));
       
        getContentPane().add(pantalla_triki);
        
        sup_izq = new JTextField("-");
        sup_izq.setBackground(Color.CYAN);
        sup_izq.setFont(new Font("default", Font.ITALIC, 50));
        sup_izq.setHorizontalAlignment(JTextField.CENTER);
        pantalla_triki.add(sup_izq);
        
        sup_cen = new JTextField("-");
        sup_cen.setBackground(Color.CYAN);
        sup_cen.setFont(new Font("default", Font.ITALIC, 50));
        sup_cen.setHorizontalAlignment(JTextField.CENTER);
        pantalla_triki.add(sup_cen);

        sup_der = new JTextField("-");
        sup_der.setBackground(Color.CYAN);
        sup_der.setFont(new Font("default", Font.ITALIC, 50));
        sup_der.setHorizontalAlignment(JTextField.CENTER);
        pantalla_triki.add(sup_der);

        cen_izq = new JTextField("-");
        cen_izq.setBackground(Color.CYAN);
        cen_izq.setFont(new Font("default", Font.ITALIC, 50));
        cen_izq.setHorizontalAlignment(JTextField.CENTER);
        pantalla_triki.add(cen_izq);

        centro = new JTextField("-");
        centro.setBackground(Color.CYAN);
        centro.setFont(new Font("default", Font.ITALIC, 50));
        centro.setHorizontalAlignment(JTextField.CENTER);
        pantalla_triki.add(centro);

        cen_der = new JTextField("-");
        cen_der.setBackground(Color.CYAN);
        cen_der.setFont(new Font("default", Font.ITALIC, 50));
        cen_der.setHorizontalAlignment(JTextField.CENTER);
        pantalla_triki.add(cen_der);

        inf_izq = new JTextField("-");
        inf_izq.setBackground(Color.CYAN);
        inf_izq.setFont(new Font("default", Font.ITALIC, 50));
        inf_izq.setHorizontalAlignment(JTextField.CENTER);
        pantalla_triki.add(inf_izq);

        inf_cen = new JTextField("-");
        inf_cen.setBackground(Color.CYAN);
        inf_cen.setFont(new Font("default", Font.ITALIC, 50));
        inf_cen.setHorizontalAlignment(JTextField.CENTER);
        pantalla_triki.add(inf_cen);

        inf_der = new JTextField("-");
        inf_der.setBackground(Color.CYAN);
        inf_der.setFont(new Font("default", Font.ITALIC, 50));
        inf_der.setHorizontalAlignment(JTextField.CENTER);
        pantalla_triki.add(inf_der);

        
        
    }
    
    
    
    public void eventos() {

        
        ActionListener accionensup_izq = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String punto = sup_izq.getText();
                
                if (punto.toLowerCase().equals("x") ) {
                    sup_izq.setBackground(Color.green);
                    sup_izq.setEditable(false);
                    high_left = 1;
                    condiciones();
                    playerGreen();
                    
                    
                } else if (punto.toLowerCase().equals("o")) {
                    sup_izq.setBackground(Color.red);
                    sup_izq.setEditable(false);
                    high_left = -1;
                    condiciones();
                    playerRed();
                }
                
                

            }
            };
            sup_izq.addActionListener(accionensup_izq); 
                
            
        ActionListener accionensup_cen = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
    
                String punto = sup_cen.getText();
                    
                if (punto.toLowerCase().equals("x") ) {
                    sup_cen.setBackground(Color.green);
                    sup_cen.setEditable(false);
                    high_center = 1;
                    condiciones();
                    playerGreen();
                        
                        
                } else if (punto.toLowerCase().equals("o")) {
                    sup_cen.setBackground(Color.red);
                    sup_cen.setEditable(false);
                    high_center = -1;
                    condiciones();
                    playerRed();
                }
                    
                    
    
            }
            };
            sup_cen.addActionListener(accionensup_cen); 


        ActionListener accionensup_der = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        
                String punto = sup_der.getText();
                        
                if (punto.toLowerCase().equals("x") ) {
                    sup_der.setBackground(Color.green);
                    sup_der.setEditable(false);
                    high_right = 1;
                    condiciones();
                    playerGreen();
                } else if (punto.toLowerCase().equals("o")) {
                    sup_der.setBackground(Color.red);
                    sup_der.setEditable(false);
                    high_right = -1;
                    condiciones();
                    playerRed();
                }
            }
            };  sup_der.addActionListener(accionensup_der); 


        ActionListener accionescen_izq = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            
                String punto = cen_izq.getText();
                            
                if (punto.toLowerCase().equals("x") ) {
                    cen_izq.setBackground(Color.green);
                    cen_izq.setEditable(false);
                    center_left = 1;
                    condiciones();
                    playerGreen();
                } else if (punto.toLowerCase().equals("o")) {
                    cen_izq.setBackground(Color.red);
                    cen_izq.setEditable(false);
                    center_left = -1;
                    condiciones();
                    playerRed();
                }
            }
            }; cen_izq.addActionListener(accionescen_izq);


        ActionListener accionencentro = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String punto = centro.getText();
                                
                if (punto.toLowerCase().equals("x") ) {
                    centro.setBackground(Color.green);
                    centro.setEditable(false);
                    center = 1;
                    condiciones();
                    playerGreen();
                } else if (punto.toLowerCase().equals("o")) {
                    centro.setBackground(Color.red);
                    centro.setEditable(false);
                    center = -1;
                    condiciones();
                    playerRed();
                }
            }
            }; centro.addActionListener(accionencentro);

        ActionListener accionencen_der = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    
                String punto = cen_der.getText();
                                    
                if (punto.toLowerCase().equals("x") ) {
                    cen_der.setBackground(Color.green);
                    cen_der.setEditable(false);
                    center_right = 1;
                    condiciones();
                    playerGreen();
                } else if (punto.toLowerCase().equals("o")) {
                    cen_der.setBackground(Color.red);
                    cen_der.setEditable(false);
                    center_right = -1;
                    condiciones();
                    playerRed();
                }        
            }
            }; cen_der.addActionListener(accionencen_der);

        ActionListener accionesinf_izq = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                        
                 String punto = inf_izq.getText();
                                        
                if (punto.toLowerCase().equals("x") ) {
                    inf_izq.setBackground(Color.green);
                    inf_izq.setEditable(false);
                    down_left = 1;
                    condiciones();
                    playerGreen();
                } else if (punto.toLowerCase().equals("o")) {
                    inf_izq.setBackground(Color.red);
                    inf_izq.setEditable(false);
                    down_left = -1;
                    condiciones();
                    playerRed();
                }
            }
            }; inf_izq.addActionListener(accionesinf_izq); 


        ActionListener accionesinf_cen = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                            
                String punto = inf_cen.getText();
                                            
                if (punto.toLowerCase().equals("x") ) {
                    inf_cen.setBackground(Color.green);
                    inf_cen.setEditable(false);
                    down_center = 1;
                    condiciones();
                    playerGreen();
                } else if (punto.toLowerCase().equals("o")) {
                    inf_cen.setBackground(Color.red);
                    inf_cen.setEditable(false);
                    down_center = -1;
                    condiciones();
                    playerRed();
                }                               
            }
            }; inf_cen.addActionListener(accionesinf_cen); 


            ActionListener accionesinf_der = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                                
                    String punto = inf_der.getText();
                                                
                    if (punto.toLowerCase().equals("x") ) {
                        inf_der.setBackground(Color.green);
                        inf_der.setEditable(false);
                        down_right = 1;
                        condiciones();
                        playerGreen();
                    } else if (punto.toLowerCase().equals("o")) {
                        inf_der.setBackground(Color.red);
                        inf_der.setEditable(false);
                        down_right = -1;
                        condiciones();
                        playerRed();
                    }                                                                      
                }
            }; inf_der.addActionListener(accionesinf_der); 

            ActionListener retry = new ActionListener() {
                public void actionPerformed(ActionEvent e) {      
                    
                    boton.setBackground(Color.cyan);
                    
                    
                    
        
                }
            }; 
            boton.addActionListener(retry); 
            
            
    }

    public void condiciones() {
        suma_sup_horizontal = high_left+ high_center+ high_right;
        suma_center_horizontal = center_left+ center+ center_right;
        suma_inf_horizontal = down_left+ down_center+ down_right;
        
//-----------------------------------------------------------
        suma_left_vertical = high_left+ center_left+ down_left;
        suma_center_vertical = high_center+ center+ down_center;
        suma_right_vertical = high_right+ center_right+ down_right;
//-----------------------------------------------------------
        suma_left_downright = high_left+ center+ down_right;
        suma_right_downleft = high_right+ center+ down_left;


    }
    public void playerGreen(){ 
        String name = Player.player_1.getText();
        if ( suma_center_horizontal == 3 || suma_sup_horizontal ==3 || suma_inf_horizontal == 3 || suma_left_vertical == 3 || suma_center_vertical == 3 || suma_right_vertical == 3 || suma_left_downright == 3 || suma_right_downleft == 3 ) {
            
            pantalla_triki.removeAll();
            pantalla_triki.setBackground(Color.green);
            getContentPane().add(pantalla_triki);

            ganador = new JLabel();
            ganador.setHorizontalAlignment(center);
            ganador.setText("EL GANADOR ES "+name);
            ganador.setFont(new Font("default", Font.BOLD, 40));
            pantalla_triki.add(ganador);

        }  
     
    }

    public void playerRed() {
        String name1 = Player.player_2.getText();
        if ( suma_center_horizontal == -3 || suma_sup_horizontal == -3 || suma_inf_horizontal == -3 || suma_left_vertical == -3 || suma_center_vertical == -3 || suma_right_vertical == -3 || suma_left_downright == -3 || suma_right_downleft == -3 ){
            
            pantalla_triki.removeAll();
            pantalla_triki.setBackground(Color.red);
            getContentPane().add(pantalla_triki);

            ganador1 = new JLabel("El ganador es el jugador "+name1);
            ganador1.setHorizontalAlignment(center);
            ganador1.setFont(new Font("default", Font.ITALIC, 40));
            pantalla_triki.add(ganador1);
    }
    }
}




