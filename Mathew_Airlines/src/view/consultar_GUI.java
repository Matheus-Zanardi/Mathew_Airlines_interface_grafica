package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class consultar_GUI extends JFrame{
    private JPanel jp_consultar;
    private JTextField tf_nmr_voo;
    private JButton btn_consultar;
    private JLabel lb_voo1;
    private JLabel lb_voo2;
    private JButton btn_voltar;
    private JButton btn_sair;


    public consultar_GUI() {
        setContentPane(jp_consultar);
        setTitle("Companhia Aerea");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setVisible(true);
        btn_voltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                escolha_voo_GUI volta = new escolha_voo_GUI();
            }
        });
        btn_sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btn_consultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String voo = tf_nmr_voo.getText();
                model.funcoes_DAO.consultar_voo(voo);

            }
        });
    }
}
