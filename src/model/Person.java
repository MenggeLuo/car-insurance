package model;

import java.util.ArrayList;

public class Person {
    private String first_name;
    private String last_name;
    private String birth_date;
    private String ssn;
    private Address address;
    

    private String homeAddress;
    private String workAddress;
    private String localAddress;
    private ArrayList<Car> carList;





    public Person(String f, String l, String b, String s, Address address){
        first_name = f;
        last_name = l;
        birth_date = b;
        ssn = s;
        address = address;
        carList = new ArrayList<>();
        
    }

    public void addCarList(Car car){
        carList.add(car);
    }

    public Person(){

    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public String getLocalAddress() {
        return localAddress;
    }

    public void setLocalAddress(String localAddress) {
        this.localAddress = localAddress;
    }
      public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }

    public void printInformation() {
        System.out.println("Person Information:");
        System.out.println("First Name: " + first_name);
        System.out.println("Last Name: " + last_name);
        System.out.println("Birth Date: " + birth_date);
        System.out.println("SSN: " + ssn);
   
    }


 
    public String toString() {
        return "First name: " + first_name + ", Last name: " + last_name + ", Birthday: " + birth_date + ", SSN: " + ssn +", Address:" + address;
    }


  
}
