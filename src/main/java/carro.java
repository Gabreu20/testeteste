/**
 *
 * @author gabreu e lucas
 */
public class carro {
    String placa;
    String marca;
    String cor;
    float kmAndado;
    int[] dataRetorno = new int[3];
    float preco;
    Boolean disponivel;
    
    public carro(String PLACA, String MARCA, String COR, float KMANDADO, int[] DATARETORNO, float PRECO, Boolean DISPONIVEL){
        placa = PLACA; marca = MARCA; cor = COR; kmAndado = KMANDADO; 
        for(int i = 0; i < dataRetorno.length; i++){
            dataRetorno[i] = DATARETORNO[i];
        }
        preco = PRECO; disponivel = DISPONIVEL;
    }
    
    public void attPreco(float nPreco){
        preco = nPreco;
    }
    public void attKmAndado(float nKm){
        kmAndado = nKm;
    }
}