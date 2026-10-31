package br.com.poliveira.factory;

import br.com.poliveira.carro.CarroPopular;
import br.com.poliveira.carro.ICarro;
import br.com.poliveira.motor.IMotor;
import br.com.poliveira.motor.Motor1Ponto0;

public class FabricaEconomica implements IFabricaDeVeiculos {

    @Override
    public ICarro criarCarro() {
        return new CarroPopular();
    }

    @Override
    public IMotor criarMotor() {
        return new Motor1Ponto0();
    }

}
