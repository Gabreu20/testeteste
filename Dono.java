import java.util.List;

/**
 *
 * @author gabreu e lucas
 */
public class Dono {
    String senha = "";
    String cnpj = "";
    int numCar = 0;
    int saldoCompanhia = 0;

    public Dono(String dados){

        char existeDono=dados.charAt(11);
        int codigo=0;
        String input="";

        if(existeDono=='1'){
            //pega todas as informações da string de dados.
            for(int i=12;i<dados.length();i++){
                if(dados.charAt(i)=='='){
                    if(codigo==3){
                        while(dados.charAt(i)!='\n'){
                            i++;
                            input=input+dados.charAt(i);
                        }
                        input=input.substring(0, input.length() - 1);
                        i++;
                        saldoCompanhia=Integer.parseInt(input);
                        input="";
                        codigo=4;
                    
                    }

                    if(codigo==2){
                        while(dados.charAt(i)!='\n'){
                            i++;
                            input=input+dados.charAt(i);
                        }
                        input=input.substring(0, input.length() - 1);
                        i++;
                        numCar=Integer.parseInt(input);
                        input="";
                        codigo=3;
                    }

                    if(codigo==1){
                        while(dados.charAt(i)!='\n'){
                            i++;
                            input=input+dados.charAt(i);
                        }
                        input=input.substring(0, input.length() - 1);
                        i++;
                        senha=input;
                        input="";
                        codigo=2;
                    }

                    if(codigo==0){
                        while(dados.charAt(i)!='\n'){
                            i++;
                            input=input+dados.charAt(i);
                        }
                        input=input.substring(0, input.length() - 1);
                        i++;
                        cnpj=input;
                        input="";
                        codigo=1;
                    }
                }
            }
        }
        else{
            //caso ainda n exista o dono as informações podem ser inicializadas pelo usuario
        }
}

    public Boolean logar(String senha_){
        if(senha_ == senha)
            return true;      
        else
            return false;
    }
    
    public carro comprarCarro(String PLACA, String MARCA, String COR, float KMANDADO
            , int[] DATARETORNO, float PRECO, Boolean DISPONIVEL, float precoCarro){
                if(precoCarro < saldoCompanhia){
                    saldoCompanhia -= precoCarro;
                    carro car = new carro(PLACA, MARCA, COR, KMANDADO, DATARETORNO, PRECO, DISPONIVEL);
                    numCar++;
                    return car;
                }
                return null;
    }

    public void venderCarro(String PLACA, float PRECO, List<carro> carros){
        saldoCompanhia += PRECO;
        numCar--;
        for(int i = 0; i < carros.size(); i++){
            carro a = carros.get(i);
            if(a.placa == PLACA){
                carros.remove(i);
            }      
        }
    }
    
    public void contratarAtendente(String SENHA, float SALARIO, int BONUS){
        //atendende at = new atendente(SENHA,SALARIO,BONUS);
    }
    //public void demitirAtendente(List<atendente> at){ //ainda n existe a class atendente, por isso os erros
        // at.remove(i);
    //}
   
}
