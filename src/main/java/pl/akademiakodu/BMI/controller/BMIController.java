package pl.akademiakodu.BMI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.akademiakodu.BMI.model.BMI;
import pl.akademiakodu.BMI.model.OperationModel;

import javax.persistence.GeneratedValue;

@Controller
public class BMIController {

    BMI bmi1 = new BMI();
    OperationModel operationModel1 = new OperationModel();

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("operationModel", operationModel1);
        return "home";
    }

    @RequestMapping(params = "bmi", method = RequestMethod.POST)
    public String bmi2(@ModelAttribute("operationModel")OperationModel operationModel, Model model){
        model.addAttribute("result", bmi1.bmi3(operationModel.getWeight(), operationModel.getHight()));
        return "home";
    }
}
