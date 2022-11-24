package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;

@Controller
public class CarsController {

    private final CarService carService;

    @Autowired
    protected CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping ("/cars")
    public String getCar (@RequestParam (value = "count", required = false, defaultValue = "5") int count,
                          Model model) {
        model.addAttribute("car", carService.getCarList(count));
        return "cars";
    }

}
