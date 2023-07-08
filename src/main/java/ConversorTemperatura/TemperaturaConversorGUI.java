/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConversorTemperatura;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TemperaturaConversorGUI {
    private JFrame frame;
    private JTextField txtCantidad;
    private JComboBox<String> cbEscalaOrigen;
    private JComboBox<String> cbEscalaDestino;
    private JButton btnConvertir;
    private JLabel lblResultado;

    public TemperaturaConversorGUI() {
        initialize();
        addEventListeners();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Conversor de Temperatura");
        frame.setBounds(100, 100, 300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setBounds(20, 20, 80, 20);
        frame.getContentPane().add(lblCantidad);

        txtCantidad = new JTextField();
        txtCantidad.setBounds(100, 20, 120, 20);
        frame.getContentPane().add(txtCantidad);
        txtCantidad.setColumns(10);

        JLabel lblEscalaOrigen = new JLabel("Escala Origen:");
        lblEscalaOrigen.setBounds(20, 50, 100, 20);
        frame.getContentPane().add(lblEscalaOrigen);

        cbEscalaOrigen = new JComboBox<String>();
        cbEscalaOrigen.setBounds(130, 50, 90, 20);
        cbEscalaOrigen.addItem("Celsius");
        cbEscalaOrigen.addItem("Fahrenheit");
        cbEscalaOrigen.addItem("Kelvin");
        frame.getContentPane().add(cbEscalaOrigen);

        JLabel lblEscalaDestino = new JLabel("Escala Destino:");
        lblEscalaDestino.setBounds(20, 80, 100, 20);
        frame.getContentPane().add(lblEscalaDestino);

        cbEscalaDestino = new JComboBox<String>();
        cbEscalaDestino.setBounds(130, 80, 90, 20);
        cbEscalaDestino.addItem("Celsius");
        cbEscalaDestino.addItem("Fahrenheit");
        cbEscalaDestino.addItem("Kelvin");
        frame.getContentPane().add(cbEscalaDestino);

        btnConvertir = new JButton("Convertir");
        btnConvertir.setBounds(100, 110, 100, 30);
        frame.getContentPane().add(btnConvertir);

        lblResultado = new JLabel("");
        lblResultado.setBounds(20, 150, 200, 20);
        frame.getContentPane().add(lblResultado);
    }

    private void addEventListeners() {
        btnConvertir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double cantidad = Double.parseDouble(txtCantidad.getText());
                    String escalaOrigen = cbEscalaOrigen.getSelectedItem().toString();
                    String escalaDestino = cbEscalaDestino.getSelectedItem().toString();
                    double resultado = TemperaturaConversor.convertir(cantidad, escalaOrigen, escalaDestino);
                    lblResultado.setText("Resultado: " + resultado);
                } catch (NumberFormatException ex) {
                    lblResultado.setText("Cantidad no válida");
                } catch (IllegalArgumentException ex) {
                    lblResultado.setText(ex.getMessage());
                }
            }
        });
    }

    public void show() {
        frame.setVisible(true);
    }
}
