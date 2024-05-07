package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class escolha_voo_GUI extends JFrame{

    private JPanel jp_escolha_voo;
    private JTextField tf_escolha;
    private JLabel lb_intro;
    private JLabel lb_sair;
    private JButton btn_reservar;
    private JButton btn_sair;
    private JLabel lb_titulo;
    private JButton Consultar;


    public escolha_voo_GUI(){


        setTitle("Companhia Aerea");
        setContentPane(jp_escolha_voo);

        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setVisible(true);
        btn_reservar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               reserva_principal_GUI resp = new reserva_principal_GUI();

            }
        });
        btn_sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Obrigado, volte sempre!");
                System.exit(0);

            }
        });
        Consultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                consultar_GUI tela = new consultar_GUI();
            }
        });
    }
}
