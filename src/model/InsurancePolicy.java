package model;

import java.util.ArrayList;

public class InsurancePolicy {
    private String policy_holder;
    private String second_driver;
    private int premium_num;
    private String date_start;
    private String date_end;
    private Person person;
    private Address address;
    private Car car;
    private ArrayList<Car> carList;
    private int limit;


 
    public InsurancePolicy(String p, String d, Person person, Car car, String s, String e, int limit){
        this.policy_holder = p;
        this.second_driver = d;
        this.person = person;
        this.car = car;
        this.date_start= s;
        this.date_end = e;
        this.limit = limit;
        this.carList = new ArrayList<>();
        carList.add(car);
    }
    public String getPolicy_holder() {
        return policy_holder;
    }
    public void setPolicy_holder(String policy_holder) {
        this.policy_holder = policy_holder;
    }
    public String getSecond_driver() {
        return second_driver;
    }
    public void setSecond_driver(String second_driver) {
        this.second_driver = second_driver;
    }
    public int getPremium_num() {
        return premium_num;
    }
    public void setPremium_num(int premium_num) {
        this.premium_num = premium_num;
    }
    public String getDate_start() {
        return date_start;
    }
    public void setDate_start(String date_start) {
        this.date_start = date_start;
    }
    public String getDate_end() {
        return date_end;
    }
    public void setDate_end(String date_end) {
        this.date_end = date_end;
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
        
    }
        public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }
    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }
       public int getLimit() {
        return limit;
    }
    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void addCar(Car car) {
        carList.add(car);
    }


    public void printInformation() {
        System.out.println("Policy Holder: " + policy_holder);
        System.out.println("Second Driver: " + second_driver);
        System.out.println("Start Date: " + date_start);
        System.out.println("End Date: " + date_end);
        
        System.out.println("Address: " + address.toString());
        System.out.println("Person: " + person.toString());
        System.out.println("Car: " + car.toString());
        System.out.println("Coverage Limit: " + limit);
        for (Car c : carList){
            System.out.println(c.toString());
        }
    }
    


   
}
