package br.com.poliveira.carro;

public class CarroPopular implements ICarro {

    @Override
    public void exibirDetalhes() {
        System.out.println("Carro: Modelo Popular (4 portas, econômico, compacto).");
    }
}
