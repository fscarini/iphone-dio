package edu.digitalinovationone.poo.iphone;
import edu.digitalinovationone.poo.aparelhotelefonico.AparelhoTelefonico;
import edu.digitalinovationone.poo.navegador.Navegador;
import edu.digitalinovationone.poo.reprodutormusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, Navegador, ReprodutorMusical{
    
    private String modelo;
    private String cor;
    
    public String getCor(){
        return cor;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número de telefone: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ouvindo mensagem no correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página através do link: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }

    @Override
    public void tocar() {
        System.out.println("Dando play na faixa atual!");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a faixa atual");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }
    
}
