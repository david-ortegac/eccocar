package com.eccocar.eccocar.adapter.restful.v1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;

@Setter
@Getter
public class VehiculosAdapter {

    public int id;

    public String marca;

    public String linea;

    public int modelo;

    public BigInteger kilometraje;

}
