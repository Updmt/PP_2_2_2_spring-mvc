package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;


@Controller
public class CarController {


    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    /*CarServiceImpl carService = new CarServiceImpl();*/


    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "0") int id, Model model) {
        model.addAttribute("cars", carService.show(id));
        return "cars/cars";
    }

}
