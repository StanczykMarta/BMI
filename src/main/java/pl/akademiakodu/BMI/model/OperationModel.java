package pl.akademiakodu.BMI.model;

public class OperationModel {
    private double weight;
    private double hight;

    public OperationModel(){

    }

    public OperationModel(double weight){
        this.weight=weight;
    }

    public OperationModel(double weight, double hight) {
        this.weight = weight;
        this.hight = hight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }
}
