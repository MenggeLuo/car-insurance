import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.JobHoldUntil;

import model.Person;
import model.Address;
import model.Car;
import model.InsurancePolicy;
import model.InsurancePolicyRegister;
import model.CarInsuranceDirectory;

public class CarInsuranceMain {
    public static void main(String[] args) throws Exception {
        CarInsuranceDirectory directory = new CarInsuranceDirectory();
        InsurancePolicyRegister policyRegister = new InsurancePolicyRegister("ooo Insurance");

        
        Address address1 = new Address("123 ddd St", "Apt 100", "boston", "02111", "MA");
        Address address2 = new Address("223 ddd St", "Apt 200", "boston", "02211", "MA");
        Address address3 = new Address("323 ddd St", "Apt 300", "boston", "02311", "MA");
        Car car1 = new Car("vin1","toyata","abd","2020");
        Car car2 = new Car("vin2","toyata","bbc","2022");
        Car car3 = new Car("vin3","toyata","dds","2023");
        Person person1 = new Person("John", "Smith", "10/1987", "8888",address1);
        Person person2 = new Person("Alice", "Johnson", "5/1995", "7777",address2);
        Person person3 = new Person("Amy", "Liu", "9/1998", "6666",address3);
        directory.addNewPerson(person1);
        directory.addNewPerson(person2);

        directory.addNewCar(car1);
        directory.addNewCar(car2);
        directory.addNewCar(car3);
        directory.addNewInsurancePolicy("Policy1", "Driver1", person1, car1,"10/2023", "10/2024",100);
        directory.addNewInsurancePolicy("Policy2", "Driver2", person2, car1,"11/2023", "11/2024",100);
        directory.addNewInsurancePolicy("Policy3", "Driver3", person2, car1,"1/2023", "1/2024",100);
        directory.addNewInsurancePolicy("Policy4", "Driver4",  person2, car2,"11/2023", "11/2024",100);
        directory.addNewInsurancePolicy("Policy5", "Driver5",  person2, car2,"11/2023", "11/2024",100);
        directory.addNewInsurancePolicy("Policy6", "Driver6",  person2, car2,"11/2023", "11/2024",100);
        directory.addNewInsurancePolicy("Policy7", "Driver7",  person2, car2,"11/2023", "11/2024",100);
        directory.addNewInsurancePolicy("Policy8", "Driver8",  person2, car2,"11/2023", "11/2024",100);
        directory.addNewInsurancePolicy("Policy9", "Driver9", person3, car3,"11/2023", "11/2024",100);
        directory.addNewInsurancePolicy("Policy10", "Driver10", person2, car3,"11/2023", "11/2024",100);
        directory.addNewInsurancePolicy("Policy11", "Driver11", person2, car3,"11/2023", "11/2024",100);
        directory.addNewInsurancePolicy("Policy12", "Driver12", person3, car3,"11/2023", "11/2024",100);
        directory.addNewInsurancePolicy("Policy13", "Driver13", person2, car3,"11/2023", "11/2024",100);
        directory.addNewInsurancePolicy("Policy14", "Driver14", person2, car3,"11/2023", "11/2024",100);
        directory.addNewInsurancePolicy("Policy15", "Driver15", person3, car3,"11/2023", "11/2024",100);   


       
        directory.printInsurancePolicyList();
        
       

    
    }
  
}
