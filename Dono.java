import java.util.List;

/**
 *
 * @author gabreu e lucas
 */
public class Dono {
    String senha = "sexozin";
    String cnpj = "AHAHAHAHAHA";
    int numCar = 10;
    int saldoCompanhia = 1000000;
    
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

    public void venderCarro(String PLACA, float PRECO, List carros){
        saldoCompanhia += PRECO;
        numCar--;
        for(int i = 0; i < carros.size(); i++){
            //carros.get(i);
        }
    }
    
   
}
