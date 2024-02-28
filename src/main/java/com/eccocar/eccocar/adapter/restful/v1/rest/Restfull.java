package com.eccocar.eccocar.adapter.restful.v1.rest;

import com.eccocar.eccocar.aplication.IEccocar;
import com.eccocar.eccocar.domain.entities.VehiculosDomain;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/eccocar")
public class Restfull implements IEccocar {

    @Override
    public List<VehiculosDomain> getAllVehiculos() {
        return null;
    }
}
