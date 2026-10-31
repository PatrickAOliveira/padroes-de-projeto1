package br.com.poliveira;

import br.com.poliveira.carro.ICarro;
import br.com.poliveira.factory.FabricaEconomica;
import br.com.poliveira.factory.FabricaEsportiva;
import br.com.poliveira.factory.IFabricaDeVeiculos;
import br.com.poliveira.motor.IMotor;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=== TESTANDO FÁBRICA DE VEÍCULOS (ABSTRACT FACTORY MODULAR) ===");

        // 1. Linha Esportiva
        System.out.println("\n--- Produzindo Linha Esportiva ---");
        IFabricaDeVeiculos fabricaEsportiva = new FabricaEsportiva();
        ICarro carroEsporte = fabricaEsportiva.criarCarro();
        IMotor motorEsporte = fabricaEsportiva.criarMotor();

        carroEsporte.exibirDetalhes();
        motorEsporte.exibirEspecificacoes();

        // 2. Linha Econômica
        System.out.println("\n--- Produzindo Linha Econômica ---");
        IFabricaDeVeiculos fabricaEconomica = new FabricaEconomica();
        ICarro carroPopular = fabricaEconomica.criarCarro();
        IMotor motorPopular = fabricaEconomica.criarMotor();

        carroPopular.exibirDetalhes();
        motorPopular.exibirEspecificacoes();
    }
}
