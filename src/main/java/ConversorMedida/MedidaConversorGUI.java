/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConversorMedida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MedidaConversorGUI {
    private JFrame frame;
    private JTextField txtCantidad;
    private JComboBox<String> cbMedidaOrigen;
    private JComboBox<String> cbMedidaDestino;
    private JButton btnConvertir;
    private JLabel lblResultado;

    public MedidaConversorGUI() {
        initialize();
        addEventListeners();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Conversor de Medidas");
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

        JLabel lblMedidaOrigen = new JLabel("Medida Origen:");
        lblMedidaOrigen.setBounds(20, 50, 100, 20);
        frame.getContentPane().add(lblMedidaOrigen);

        cbMedidaOrigen = new JComboBox<String>();
        cbMedidaOrigen.setBounds(130, 50, 120, 20);
        cbMedidaOrigen.addItem("Pulgadas");
        cbMedidaOrigen.addItem("Centímetros");
        cbMedidaOrigen.addItem("Metros");
        cbMedidaOrigen.addItem("Pies");
        frame.getContentPane().add(cbMedidaOrigen);

        JLabel lblMedidaDestino = new JLabel("Medida Destino:");
        lblMedidaDestino.setBounds(20, 80, 100, 20);
        frame.getContentPane().add(lblMedidaDestino);

        cbMedidaDestino = new JComboBox<String>();
        cbMedidaDestino.setBounds(130, 80, 120, 20);
        cbMedidaDestino.addItem("Pulgadas");
        cbMedidaDestino.addItem("Centímetros");
        cbMedidaDestino.addItem("Metros");
        cbMedidaDestino.addItem("Pies");
        frame.getContentPane().add(cbMedidaDestino);

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
                    String medidaOrigen = cbMedidaOrigen.getSelectedItem().toString();
                    String medidaDestino = cbMedidaDestino.getSelectedItem().toString();
                    double resultado = MedidaConversor.convertir(cantidad, medidaOrigen, medidaDestino);
                    lblResultado.setText("Resultado: " + resultado);
                } catch (NumberFormatException ex) {
                    lblResultado.setText("Cantidad no válida");
                } catch (IllegalArgumentException ex) {
                    lblResultado.setText(ex.getMessage());
                }
            }
        });
    }

    public void show(){
        frame.setVisible(true);
    }
}
