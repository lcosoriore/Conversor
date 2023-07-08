/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConversorMoneda;

/**
 *
 * @author luisa
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MonedaConversorGUI {
    private JFrame frame;
    private JTextField txtCantidad;
    private JComboBox<String> cbMonedaOrigen;
    private JComboBox<String> cbMonedaDestino;
    private JButton btnConvertir;
    private JLabel lblResultado;

    public MonedaConversorGUI() {
        initialize();
        addEventListeners();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Conversor de Monedas");
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

        JLabel lblMonedaOrigen = new JLabel("Moneda Origen:");
        lblMonedaOrigen.setBounds(20, 50, 100, 20);
        frame.getContentPane().add(lblMonedaOrigen);

        cbMonedaOrigen = new JComboBox<String>();
        cbMonedaOrigen.setBounds(130, 50, 90, 20);
        cbMonedaOrigen.addItem("USD");
        cbMonedaOrigen.addItem("EUR");
        cbMonedaOrigen.addItem("GBP");
        frame.getContentPane().add(cbMonedaOrigen);

        JLabel lblMonedaDestino = new JLabel("Moneda Destino:");
        lblMonedaDestino.setBounds(20, 80, 100, 20);
        frame.getContentPane().add(lblMonedaDestino);

        cbMonedaDestino = new JComboBox<String>();
        cbMonedaDestino.setBounds(130, 80, 90, 20);
        cbMonedaDestino.addItem("USD");
        cbMonedaDestino.addItem("EUR");
        cbMonedaDestino.addItem("GBP");
        frame.getContentPane().add(cbMonedaDestino);

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
                    String monedaOrigen = cbMonedaOrigen.getSelectedItem().toString();
                    String monedaDestino = cbMonedaDestino.getSelectedItem().toString();
                    double resultado = MonedaConversor.convertir(cantidad, monedaOrigen, monedaDestino);
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
