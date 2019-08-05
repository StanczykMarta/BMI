package pl.akademiakodu.BMI.model;


public class BMI {

    public String bmi3(double weight, double hight){
        double result =  (weight/(hight*hight))*10000;

        return   String.format("%.2f", result);
    }
}
