package PaqB05.interfaz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Peso extends JFrame {
    private JLabel lbPeso;
    private JPanel panel1;
    private JButton PTotal;

//test
    public Peso(int suma) {

        this.setContentPane(panel1);
        setBounds(200, 200, 200, 200);
        setVisible(true);
        PTotal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbPeso.setText("El peso total del hub es " + suma);
            }

        });
    }
}

