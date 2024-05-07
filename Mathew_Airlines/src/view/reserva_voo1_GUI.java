package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class reserva_voo1_GUI extends JFrame{
    private JPanel jp_reserva1;
    private JButton confirmarButton;
    private JButton voltarButton;
    private JTextField textField1;

    public reserva_voo1_GUI(){
        setContentPane(jp_reserva1);
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
        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String assento = textField1.getText();

                model.funcoes_DAO.reserva_voo1(assento);
            }
        });
    }
}
