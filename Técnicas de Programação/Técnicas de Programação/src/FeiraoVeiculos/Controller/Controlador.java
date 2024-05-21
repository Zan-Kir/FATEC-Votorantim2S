
package FeiraoVeiculos.Controller;

import FeiraoVeiculos.Model.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Controlador implements Serializable {
    private List<Veiculo> listaVeiculo;
    private List<Pessoa> listaPessoa;
    
    public Controlador() {
        listaPessoa = new ArrayList<Pessoa>();
        listaVeiculo = new ArrayList<Veiculo>();
    }
    
    public void cadastrarCliente(String nome, String telefone, String cpf, float valorMax, float valorMin, TipoVeiculo tipoVeiculo) {
        listaPessoa.add(new Cliente(nome, telefone, cpf, valorMax, valorMin, tipoVeiculo));
    }
}
