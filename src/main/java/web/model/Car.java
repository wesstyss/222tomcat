package web.model;

public class Car {
    private String model;
    private String year;
    private String color;

    public Car(String model,String year,String color){
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getModel(){
        return model;
    }
    public String getYear(){
        return year;
    }
    public String getColor(){
        return color;
    }
}
