package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarsController {
    private final CarServiceImpl carService;

    //@Autowired
    public CarsController(CarServiceImpl carService) {
        this.carService = carService;
    }

    // Метод отвечающий за то, что отображается в html странице
    @GetMapping(value = "/cars") // при переходе в браузере на "/cars" мы попадем на метод printCars и он вернет cars.html
    public String printCars(@RequestParam(name = "count", required = false, defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("cars", carService.getCarsList(count));
        return "cars";
    }
}
