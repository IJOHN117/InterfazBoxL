package org.example;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        //Edicion de ventana
        JFrame miVentana = new JFrame();
        miVentana.setSize(1000, 800);
        miVentana.setTitle("Catalogo de clientes");
        miVentana.setBackground(Color.white);
        miVentana.setLocation(480, 100);
        miVentana.setResizable(false);

        //Creacion de paneles
        JPanel panelGeneral = new JPanel();
        JPanel panelEncabezado = new JPanel();
        panelEncabezado.setBackground(Color.gray);
        JPanel panelCuerpo = new JPanel();
        panelCuerpo.setBackground(Color.lightGray);
        JPanel panelPie = new JPanel();

        //Creacion y edicion de encabezado
        JLabel lblEncabezado = new JLabel("Catalogo de clientes");
        lblEncabezado.setText("Catalogo de clientes");
        lblEncabezado.setFont(new Font("Arial",1,30));

        //Creacion y edicion de cuerpo
        JLabel lblClave = new JLabel("Clave");
        lblClave.setFont(new Font("Arial",1,15));
        JTextField jtxClave = new JTextField(1);
        jtxClave.setHorizontalAlignment(JTextField.CENTER);

        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setFont(new Font("Arial",1,15));
        JTextField jtxFNombre =new JTextField(1);
        jtxFNombre.setHorizontalAlignment(JTextField.CENTER);

        JLabel lblDireccion = new JLabel("Direccion");
        lblDireccion.setFont(new Font("Arial",1,15));
        JTextField jtxDireccion =new JTextField(1);
        jtxDireccion.setHorizontalAlignment(JTextField.CENTER);

        JLabel lblCiudad =new JLabel("Ciudad");
        lblCiudad.setFont(new Font("Arial",1,15));
        JComboBox <String> jCmbCiudad = new JComboBox<>();
        jCmbCiudad.addItem("Veracruz");
        jCmbCiudad.addItem("Xalapa");

        //Creacion y edicion de pie
        JButton jBtnAceptar = new JButton("  Aceptar");
        JButton jBtnCancelar = new JButton();
        jBtnCancelar.setText("Cancelar");

        // Edicion de layout para paneles
        panelEncabezado.setLayout(new BoxLayout(panelEncabezado,BoxLayout.X_AXIS));
        panelCuerpo.setLayout(new BoxLayout(panelCuerpo, BoxLayout.Y_AXIS));
        panelPie.setLayout(new BoxLayout(panelPie, BoxLayout.X_AXIS));
        panelGeneral.setLayout(new BoxLayout(panelGeneral, BoxLayout.Y_AXIS));

        //
        panelEncabezado.add(Box.createRigidArea(new Dimension(0, 100)));
        panelEncabezado.add(Box.createHorizontalGlue());
        panelEncabezado.add(lblEncabezado);
        panelEncabezado.add(Box.createHorizontalGlue());


        //Adicion de componentes a paneles
        panelCuerpo.add(lblClave);
        panelCuerpo.add(jtxClave);
        panelCuerpo.add(Box.createRigidArea(new Dimension(0, 100)));
        panelCuerpo.add(lblNombre);
        panelCuerpo.add(jtxFNombre);
        panelCuerpo.add(Box.createRigidArea(new Dimension(0, 100)));
        panelCuerpo.add(lblDireccion);
        panelCuerpo.add(jtxDireccion);
        panelCuerpo.add(Box.createRigidArea(new Dimension(0, 100)));
        panelCuerpo.add(lblCiudad);
        panelCuerpo.add(jCmbCiudad);
        panelCuerpo.add(Box.createRigidArea(new Dimension(0, 100)));


        panelPie.add(jBtnAceptar);
        panelPie.add(jBtnCancelar);
        panelPie.add(Box.createVerticalGlue());


        // Adición de paneles al panel general y a la ventana
        panelGeneral.add(panelEncabezado);
        panelGeneral.add(panelCuerpo);
        panelGeneral.add(panelPie);
        miVentana.add(panelGeneral);


        //sistema de muestra y cierre
        miVentana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        miVentana.setVisible(true);
    }
}