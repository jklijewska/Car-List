package pl.jklijewska.carlist.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.jklijewska.carlist.model.Car;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    private List<Car> carList;

    public CarController(){
        this.carList=new ArrayList<>();
       // carList.add(1L, "Toyota", "Yaris", new Color.getColor("RED") );
    }
}
