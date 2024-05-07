package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class voo2_GUI extends JFrame{
    private JPanel jp_voo2;
    private JButton btn_voltar;
    private JButton btn_reservar;
    private JLabel lb_a1;
    private JLabel lb_a2;
    private JLabel lb_a3;
    private JLabel lb_a4;
    private JLabel lb_a5;
    private JLabel lb_a6;

    public voo2_GUI() {
        setContentPane(jp_voo2);
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setVisible(true);

        lb_a1.setText(model.funcoes_DAO.assentosvoo2[0]);
        lb_a2.setText(model.funcoes_DAO.assentosvoo2[1]);
        lb_a3.setText(model.funcoes_DAO.assentosvoo2[2]);
        lb_a4.setText(model.funcoes_DAO.assentosvoo2[3]);
        lb_a5.setText(model.funcoes_DAO.assentosvoo2[4]);
        lb_a6.setText(model.funcoes_DAO.assentosvoo2[5]);
        btn_voltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                consultar_GUI consul = new consultar_GUI();
            }
        });
        btn_reservar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reserva_voo2_GUI reserva = new reserva_voo2_GUI();
            }
        });
    }
}
