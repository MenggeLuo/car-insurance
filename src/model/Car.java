package model;

public class Car {
    private String VIN;
    private String make;
    private String model;
    private String year;

    public Car(String v, String ma, String mo, String i){
        this.VIN = v;
        this.make = ma;
        this.model = mo;
        this.year = i;

    }

    public Car(){

    }
    public String getVIN() {
        return VIN;
    }
    public void setVIN(String vIN) {
        VIN = vIN;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String toString() {
        return "VIN: " + VIN + ", Make: " + make + ", Model: " + model + ", Year: " + year;
    }

}
