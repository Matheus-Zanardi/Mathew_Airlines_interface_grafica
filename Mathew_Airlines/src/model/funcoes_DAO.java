package model;

import view.voo1_GUI;
import view.voo2_GUI;

import javax.swing.*;
import java.util.Objects;

public class funcoes_DAO {
    public static String[] assentosvoo1 = {"1[ ]", "2[ ]", "3[ ]", "4[ ]", "5[ ]", "6[ ]"};
    public static String assentovoo1 = assentosvoo1[0]+" "+assentosvoo1[1]+"\n"+assentosvoo1[2]+" "+assentosvoo1[3]+"\n"+assentosvoo1[4]+" "+assentosvoo1[5];
    public static String[] assentosvoo2 = {"1[ ]", "2[ ]", "3[ ]", "4[ ]", "5[ ]", "6[ ]"};
    public static String assentovoo2 = assentosvoo2[0]+" "+assentosvoo2[1]+"\n"+assentosvoo2[2]+" "+assentosvoo2[3]+"\n"+assentosvoo2[4]+" "+assentosvoo2[5];


    public static void consultar_voo(String voo){
        if (voo.equals("2734")){
            view.voo1_GUI voo1 = new voo1_GUI();
        }else if (voo.equals("3866")){
            view.voo2_GUI voo2 = new voo2_GUI();
        }else{
            JOptionPane.showMessageDialog(null, "O valor inserido é invalido!");
        }

    }

    public static void reserva_voo1(String assento){
        if(assentosvoo1[0].equals("1[x]") && assentosvoo1[1].equals("2[x]") && assentosvoo1[2].equals("3[x]") && assentosvoo1[3].equals("4[x]") && assentosvoo1[4].equals("5[x]") && assentosvoo1[5].equals("6[x]")) {
            JOptionPane.showMessageDialog(null, "Voo está lotado");
        }else {
            try {
                int esc = Integer.parseInt(assento);

                if (esc == 1) {

                    if (Objects.equals(assentosvoo1[0], "1[ ]")) {
                        assentosvoo1[0] = "1[x]";
                        assentovoo1 = assentosvoo1[0] + " " + assentosvoo1[1] + "\n" + assentosvoo1[2] + " " + assentosvoo1[3] + "\n" + assentosvoo1[4] + " " + assentosvoo1[5];
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    } else if (Objects.equals(assentosvoo1[0], "1[x]")) {
                        JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                    }
                } else if (esc == 2) {
                    if (Objects.equals(assentosvoo1[1], "2[ ]")) {
                        assentosvoo1[1] = "2[x]";
                        assentovoo1 =  assentosvoo1[0] + " " + assentosvoo1[1] + "\n" + assentosvoo1[2] + " " + assentosvoo1[3] + "\n" + assentosvoo1[4] + " " + assentosvoo1[5];
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    } else if (Objects.equals(assentosvoo1[1], "2[x]")) {
                        JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                    }
                } else if (esc == 3) {
                    if (Objects.equals(assentosvoo1[2], "3[ ]")) {
                        assentosvoo1[2] = "3[x]";
                        assentovoo1 =  assentosvoo1[0] + " " + assentosvoo1[1] + "\n" + assentosvoo1[2] + " " + assentosvoo1[3] + "\n" + assentosvoo1[4] + " " + assentosvoo1[5];
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    } else if (Objects.equals(assentosvoo1[2], "3[x]")) {
                        JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                    }
                } else if (esc == 4) {
                    if (Objects.equals(assentosvoo1[3], "4[ ]")) {
                        assentosvoo1[3] = "4[x]";
                        assentovoo1 =assentosvoo1[0] + " " + assentosvoo1[1] + "\n" + assentosvoo1[2] + " " + assentosvoo1[3] + "\n" + assentosvoo1[4] + " " + assentosvoo1[5];
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    } else if (Objects.equals(assentosvoo1[3], "4[x]")) {
                        JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                    }
                } else if (esc == 5) {
                    if (Objects.equals(assentosvoo1[4], "5[ ]")) {
                        assentosvoo1[4] = "5[x]";
                        assentovoo1 =assentosvoo1[0] + " " + assentosvoo1[1] + "\n" + assentosvoo1[2] + " " + assentosvoo1[3] + "\n" + assentosvoo1[4] + " " + assentosvoo1[5];
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    } else if (Objects.equals(assentosvoo1[4], "5[x]")) {
                        JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                    }
                } else if (esc == 6) {
                    if (Objects.equals(assentosvoo1[5], "6[ ]")) {
                        assentosvoo1[5] = "6[x]";
                        assentovoo1 =  assentosvoo1[0] + " " + assentosvoo1[1] + "\n" + assentosvoo1[2] + " " + assentosvoo1[3] + "\n" + assentosvoo1[4] + " " + assentosvoo1[5];
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    } else if (Objects.equals(assentosvoo1[5], "6[x]")) {
                        JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Esse lugar não existe no voo");
                }
            }catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"O valor inserido é invalido!");
                }
        }
        }

        public static void reserva_voo2(String assento){
            if(assentosvoo2[0].equals("1[x]") && assentosvoo2[1].equals("2[x]") && assentosvoo2[2].equals("3[x]") && assentosvoo2[3].equals("4[x]") && assentosvoo2[4].equals("5[x]") && assentosvoo2[5].equals("6[x]")){
                JOptionPane.showMessageDialog(null,"Voo está lotado");
            }else {

                try {
                    int esc = Integer.parseInt(assento);

                if (esc == 1){
                    if (Objects.equals(assentosvoo2[0], "1[ ]")){
                        assentosvoo2[0] = "1[x]";
                        assentovoo2 = assentosvoo2[0]+" "+assentosvoo2[1]+"\n"+assentosvoo2[2]+" "+assentosvoo2[3]+"\n"+assentosvoo2[4]+" "+assentosvoo2[5];
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    } else if (Objects.equals(assentosvoo2[0], "1[x]")) {
                        JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                    }
                } else if (esc == 2) {
                    if (Objects.equals(assentosvoo2[1], "2[ ]")){
                        assentosvoo2[1] = "2[x]";
                        assentovoo2 = assentosvoo2[0]+" "+assentosvoo2[1]+"\n"+assentosvoo2[2]+" "+assentosvoo2[3]+"\n"+assentosvoo2[4]+" "+assentosvoo2[5];
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    } else if (Objects.equals(assentosvoo2[1], "2[x]")) {
                        JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                    }
                } else if (esc == 3) {
                    if (Objects.equals(assentosvoo2[2], "3[ ]")) {
                        assentosvoo2[2] = "3[x]";
                        assentovoo2 = assentosvoo2[0]+" "+assentosvoo2[1]+"\n"+assentosvoo2[2]+" "+assentosvoo2[3]+"\n"+assentosvoo2[4]+" "+assentosvoo2[5];
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    } else if (Objects.equals(assentosvoo2[2], "3[x]")) {
                        JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                    }
                } else if (esc == 4) {
                    if (Objects.equals(assentosvoo2[3], "4[ ]")) {
                        assentosvoo2[3] = "4[x]";
                        assentovoo2 =assentosvoo2[0]+" "+assentosvoo2[1]+"\n"+assentosvoo2[2]+" "+assentosvoo2[3]+"\n"+assentosvoo2[4]+" "+assentosvoo2[5];
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    } else if (Objects.equals(assentosvoo2[3], "4[x]")) {
                        JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                    }
                } else if (esc == 5) {
                    if (Objects.equals(assentosvoo2[4], "5[ ]")) {
                        assentosvoo2[4] = "5[x]";
                        assentovoo2 = assentosvoo2[0]+" "+assentosvoo2[1]+"\n"+assentosvoo2[2]+" "+assentosvoo2[3]+"\n"+assentosvoo2[4]+" "+assentosvoo2[5];
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    } else if (Objects.equals(assentosvoo2[4], "5[x]")) {
                        JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                    }
                } else if (esc == 6) {
                    if (Objects.equals(assentosvoo2[5], "6[ ]")) {
                        assentosvoo2[5] = "6[x]";
                        assentovoo2 = assentosvoo2[0]+" "+assentosvoo2[1]+"\n"+assentosvoo2[2]+" "+assentosvoo2[3]+"\n"+assentosvoo2[4]+" "+assentosvoo2[5];
                        JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
                    } else if (Objects.equals(assentosvoo2[5], "6[x]")) {
                        JOptionPane.showMessageDialog(null, "O ascento já foi reservado!");
                    }
                }else {
                    JOptionPane.showMessageDialog(null, "Esse lugar não existe no voo");
                }
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"O valor inserido é invalido!");
            }
        }
    }
}






