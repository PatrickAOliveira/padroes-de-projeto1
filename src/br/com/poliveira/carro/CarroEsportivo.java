package br.com.poliveira.carro;

public class CarroEsportivo implements ICarro {

    @Override
    public void exibirDetalhes() {
        System.out.println("Carro: Modelo Esportivo (2 portas, aerofólio, design agressivo).");
    }
}
