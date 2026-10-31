package br.com.poliveira.factory;

import br.com.poliveira.carro.ICarro;
import br.com.poliveira.motor.IMotor;

public interface IFabricaDeVeiculos {
    ICarro criarCarro();

    IMotor criarMotor();
}
