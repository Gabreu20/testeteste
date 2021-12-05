/**
 *
 * @author gabreu e lucas
 */

import java.io.File; // biblioteca para ler arquivos;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.lang.String;
import java.util.List;
import java.util.ArrayList;


public class locadora {
    public static void main(String[] args) throws FileNotFoundException {

        File arquivo = new File("data.txt");
        Scanner leitura = new Scanner(arquivo);

        String dados = "";
        while(leitura.hasNextLine()){
            dados=dados+leitura.nextLine()+'\n';
        }
        
        Dono dono = new Dono(dados);

        System.out.println("cnpj: " + dono.cnpj + "\nsenha: " + dono.senha + "\nnCarros: " + dono.numCar + "\nsaldo: " + dono.saldoCompanhia);
        



        /*int[] a = new int[3];
        a[0] = 20;
        a[1] = 20;
        a[2] = 2000;
        Dono dono = new Dono();
        System.out.println(dono.numCar + " " + dono.saldoCompanhia);
        carro cCar = dono.comprarCarro("PLACA", "MARCA", "COR", 0, a, 100, true, 1000);
        System.out.println(dono.numCar + " " + dono.saldoCompanhia);

        ArrayList<carro> carros = new ArrayList<>();
        carros.add(cCar);
        */
        
        /*
        String teste = "AAAAAA";
        String teste2 = "BBBBBB";
        
        ArrayList<String> cacaca = new ArrayList<>();
        cacaca.add(teste);
        cacaca.add(teste2);
        
        System.out.println(cacaca.get(0));
        */
    }
}
