package br.com.poliveira.factory;

import br.com.poliveira.carro.CarroEsportivo;
import br.com.poliveira.carro.ICarro;
import br.com.poliveira.motor.IMotor;
import br.com.poliveira.motor.MotorV8;

public class FabricaEsportiva implements IFabricaDeVeiculos {

    @Override
    public ICarro criarCarro() {
        return new CarroEsportivo();
    }

    @Override
    public IMotor criarMotor() {
        return new MotorV8();
    }
}
