# 🚗 Projeto Fábrica de Veículos - Abstract Factory em Java

Implementação prática do padrão de projeto criacional **Abstract Factory** em Java, desenvolvida como parte dos estudos de Arquitetura de Software e Orientação a Objetos. O objetivo é demonstrar a criação de famílias de objetos relacionados (Carros e Motores) de forma desacoplada e modular.

---

## 🏗️ Estrutura de Pacotes

O projeto segue uma arquitetura modularizada, separando claramente contratos (interfaces), produtos concretos e fábricas:

```text
src/
└── br/
    └── com/
        └── poliveira/
            ├── App.java
            ├── carro/
            │   ├── Carro.java
            │   ├── CarroEsportivo.java
            │   └── CarroPopular.java
            ├── motor/
            │   ├── Motor.java
            │   ├── MotorV8.java
            │   └── Motor1Ponto0.java
            └── factory/
                ├── FabricaDeVeiculos.java
                ├── FabricaEsportiva.java
                └── FabricaEconomica.java
```
