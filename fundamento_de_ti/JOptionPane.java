package bofao;

import javax.swing.JOptionPane;

public class Bofao {

    public static void main(String[] args) {
        Object[] options = {"Sim",
            "Não"};
        int n = JOptionPane.showOptionDialog(null,
                "Você gostaria de passar por umas perguntas "
                + "a fim de feedback?",
                "pesquisa",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);
        if (n == 0) {
            String nomes = JOptionPane.showInputDialog("digite o seu nome");
            JOptionPane.showMessageDialog(null, "Bem vindo, " + nomes);
            String idade = JOptionPane.showInputDialog("digite a sua idade");
            int numidade = Integer.parseInt(idade);
            if (numidade >= 16) {
                String msg = "Que legal " + nomes + ", você tem " + idade + " anos";
                JOptionPane.showMessageDialog(null, msg);
            } else {
                JOptionPane.showMessageDialog(null, "Precisa de no minimo 16 para desbloquear", "Aviso", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ok, tchau!");
        }
    }
}
