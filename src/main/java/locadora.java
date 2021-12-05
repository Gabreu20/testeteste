/**
 *
 * @author gabreu e lucas
 */

import java.io.File; // biblioteca para ler arquivos;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.lang.String;
import java.util.List;
import java.util.ArrayList;

import com.google.gson.Gson;

public class locadora {
    public static void main(String[] args) throws FileNotFoundException {

        int controle = 0;
        File arquivo = new File("data.txt");
        Scanner leitura = new Scanner(arquivo);

        String dados = "";
        while (leitura.hasNextLine()) {
            dados = dados + leitura.nextLine() + '\n';
        }

        ArrayList<carro> carros = new ArrayList<>();
        Dono dono = new Dono(dados);

        while (controle >= 0) {
            JTextField CPF = new JTextField();
            JTextField Senha = new JPasswordField();
            Object[] message = {
                    "CPF:", CPF,
                    "Senha:", Senha
            };

            int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
            if (option == JOptionPane.OK_OPTION) {
                if (CPF.getText().equals(dono.CPF) && Senha.getText().equals(dono.senha)) {
                    System.out.println("Login successful");
                    controle=1;
                    while(controle==1){

                    }

                } else {
                    System.out.println("login failed");
                }
            } else {
                System.out.println("Login canceled");
                controle = -1;
            }
        }

        //System.out.println("cnpj: " + dono.cnpj + "\nsenha: " + dono.senha + "\nnCarros: " + dono.numCar + "\nsaldo: "
        //        + dono.saldoCompanhia + "\nnome: " + dono.nome);

        /*
         * int[] a = new int[3];
         * a[0] = 20;
         * a[1] = 20;
         * a[2] = 2000;
         * Dono dono = new Dono();
         * System.out.println(dono.numCar + " " + dono.saldoCompanhia);
         * carro cCar = dono.comprarCarro("PLACA", "MARCA", "COR", 0, a, 100, true,
         * 1000);
         * System.out.println(dono.numCar + " " + dono.saldoCompanhia);
         * 
         * ArrayList<carro> carros = new ArrayList<>();
         * carros.add(cCar);
         */

        /*
         * String teste = "AAAAAA";
         * String teste2 = "BBBBBB";
         * 
         * ArrayList<String> cacaca = new ArrayList<>();
         * cacaca.add(teste);
         * cacaca.add(teste2);
         * 
         * System.out.println(cacaca.get(0));
         */
    }
}