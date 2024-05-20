/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaDados;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class Controle {
    private List<Motocicleta> motocas = new ArrayList();
    private DefaultTableModel modeloTabela;

    public List<Motocicleta> getMotocas() {
        return motocas;
    }
    
    public void Cadastrar(DefaultTableModel modeloTabela, String marca, String modelo, float velocidade) {
        Motocicleta motoca = new Motocicleta(marca, modelo, velocidade);
        motocas.add(motoca);
        atualizarTabela(modeloTabela);
    }
    
    public void Deletar(DefaultTableModel modeloTabela, int excluir) {
        for(int i = 0; i < motocas.size(); i++) {
            if (i == excluir) {
                motocas.remove(i);
                atualizarTabela(modeloTabela);
                return;
            }
        }
    }
    
    public void gravar(String endereco) throws IOException {
        Serializador.gravar(endereco, motocas);
    }
    
    public List<Motocicleta> ler(String endereco) throws IOException, FileNotFoundException, ClassNotFoundException {
        return (List<Motocicleta>) Serializador.ler(endereco);
    }
    
    public void atualizarTabela(DefaultTableModel modeloTabela) {
        modeloTabela.setRowCount(0); //limpa a tabela
        for(int i = 0; i < motocas.size(); i++) {
            Object[] moto = {motocas.get(i).getMarca(), motocas.get(i).getModelo(), motocas.get(i).getVelocidade()};
            modeloTabela.addRow(moto);
        }
    }
    public DefaultTableModel ListarMotocas() {
        return modeloTabela;
    }
            
}
