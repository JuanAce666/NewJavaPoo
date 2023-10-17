package org.example.entidades;

public class UsuarioPorEvento extends Usuario {

    private double costoPorEvento;

    public UsuarioPorEvento() {
    }

    public UsuarioPorEvento(Integer id, String nombres, String documento, Integer ubicacion, String correoElectronico, double costoPorEvento) {
        super(id, nombres, documento, ubicacion, correoElectronico);
        this.costoPorEvento = costoPorEvento;
    }

    public double getCostoPorEvento() {
        return costoPorEvento;
    }

    public void setCostoPorEvento(double costoPorEvento) {
        this.costoPorEvento = costoPorEvento;
    }

    public void calcularDescuentoPorEvento(){

    }
}
