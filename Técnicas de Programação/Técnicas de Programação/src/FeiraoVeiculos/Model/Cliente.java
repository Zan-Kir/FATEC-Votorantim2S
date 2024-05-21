
package FeiraoVeiculos.Model;

public class Cliente extends Pessoa {
    //atributos
    float valorMax, valorMin;
    TipoVeiculo tipoveiculo;

    public Cliente(String nome, String telefone, String cpf, float valorMax, float valorMin, TipoVeiculo tipoveiculo) {
        super(nome, telefone, cpf);
        this.valorMax = valorMax;
        this.valorMin = valorMin;
        this.tipoveiculo = tipoveiculo;
    }
}
