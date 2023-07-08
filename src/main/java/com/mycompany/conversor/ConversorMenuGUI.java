/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversor;

/**
 *
 * @author luisa
 */
import ConversorMedida.MedidaConversorGUI;
import ConversorMoneda.MonedaConversorGUI;
import ConversorTemperatura.TemperaturaConversorGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ConversorMenuGUI {
    private JFrame frame;
    
    public ConversorMenuGUI() {
        initialize();
    }
    
    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Conversor");
        frame.setBounds(100, 100, 300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        
        JMenu mnConversores = new JMenu("Conversores");
        menuBar.add(mnConversores);
        
        JMenuItem mntmMoneda = new JMenuItem("Conversor de Monedas");
        mnConversores.add(mntmMoneda);
        mntmMoneda.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MonedaConversorGUI monedaConversorGUI = new MonedaConversorGUI();
                monedaConversorGUI.show();
            }
        });
        
        JMenuItem mntmMedida = new JMenuItem("Conversor de Medidas");
        mnConversores.add(mntmMedida);
        mntmMedida.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MedidaConversorGUI medidaConversorGUI = new MedidaConversorGUI();
                medidaConversorGUI.show();
            }
        });
        
        JMenuItem mntmTemperatura = new JMenuItem("Conversor de Temperatura");
        mnConversores.add(mntmTemperatura);
        mntmTemperatura.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TemperaturaConversorGUI temperaturaConversorGUI = new TemperaturaConversorGUI();
                temperaturaConversorGUI.show();
            }
        });
    }
    
    public void show() {
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        ConversorMenuGUI conversorMenuGUI = new ConversorMenuGUI();
        conversorMenuGUI.show();
    }
}
