package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class reserva_principal_GUI extends JFrame{
    private JPanel panel1;
    private JButton a2734Button;
    private JButton a3866Button;
    private JButton voltarButton;

    public reserva_principal_GUI() {
        setContentPane(panel1);
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setVisible(true);


        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                escolha_voo_GUI esc = new escolha_voo_GUI();
            }
        });
        a2734Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reserva_voo1_GUI res1 = new reserva_voo1_GUI();
            }
        });
        a3866Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reserva_voo2_GUI res2 = new reserva_voo2_GUI();
            }
        });
    }
}
