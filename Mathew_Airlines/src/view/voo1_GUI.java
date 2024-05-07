package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class voo1_GUI extends JFrame{
    private JPanel jp_voo1;
    private JLabel lb_a1;
    private JLabel lb_a2;
    private JLabel lb_a3;
    private JLabel lb_a4;
    private JLabel lb_a5;
    private JLabel lb_a6;
    private JButton voltarButton;
    private JButton reservarButton;
    private JLabel lb_voo1;

    public voo1_GUI(){
        setContentPane(jp_voo1);
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setVisible(true);

        lb_a1.setText(model.funcoes_DAO.assentosvoo1[0]);
        lb_a2.setText(model.funcoes_DAO.assentosvoo1[1]);
        lb_a3.setText(model.funcoes_DAO.assentosvoo1[2]);
        lb_a4.setText(model.funcoes_DAO.assentosvoo1[3]);
        lb_a5.setText(model.funcoes_DAO.assentosvoo1[4]);
        lb_a6.setText(model.funcoes_DAO.assentosvoo1[5]);
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                consultar_GUI consulta = new consultar_GUI();
            }
        });
        reservarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reserva_voo1_GUI reserva = new reserva_voo1_GUI();
            }
        });
    }
}
