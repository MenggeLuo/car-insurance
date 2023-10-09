package model;

import java.util.ArrayList;

public class CarInsuranceDirectory {
    private ArrayList<Person> personList;
    private ArrayList<InsurancePolicy> policyList;
    private ArrayList<Car> carList;


   
    public CarInsuranceDirectory() {
        personList = new ArrayList<Person>();
        policyList = new ArrayList<InsurancePolicy>();
        carList = new ArrayList<Car>();

    }


  
    public Person addNewPerson(String first_name, String last_name, String birth_date, String ssn, String homeAddress, String workAddress, String localAddress){
        Person newPerson =  new  Person(first_name, last_name, birth_date, ssn, homeAddress, workAddress, localAddress);
        personList.add(newPerson);
        return newPerson;
    }
    public void removePerson(int index){
        personList.remove(index);
    }

    public void clearAllElements(){
        personList.clear();
    }

    public void printPersonList(){

        System.out.println("Printing person list:");

        for (Person person : personList){
            System.out.print(personList.indexOf(person) + 1 + ".");
            person.printInformation();
        }
        printNumberOfElements();
    }


    public void printInsurancePolicyList() {
        System.out.println("Printing insurance policy list:");

        for (InsurancePolicy policy : policyList) {
            System.out.println("Policy Holder: " + policy.getPolicy_holder());
            System.out.println("Second Driver: " + policy.getSecond_driver());
            System.out.println("Start Date: " + policy.getDate_start());
            System.out.println("End Date: " + policy.getDate_end());
            
            policy.getPerson().printInformation();
            ArrayList<Car> carList = policy.getCarList();
            if (carList != null && !carList.isEmpty()) {
               System.out.println("Cars:");
               for (Car car : carList) {
                    System.out.println("  " + car.toString());
            }
        }
            System.out.println("Coverage Limit: " + policy.getLimit());
            System.out.println("-------------------");
        }
    }

    public InsurancePolicy addNewInsurancePolicy(String policy_holder, String second_driver, Person person, Car car, String date_start,String date_end,int limit){
        InsurancePolicy newInsurancePolicy = new InsurancePolicy(policy_holder, second_driver, person , car, date_start, date_end,limit);
        policyList.add(newInsurancePolicy);
        return newInsurancePolicy;

    }

    public Car addNewCar(Car car) {
        carList.add(car);
        return car;
    }

    public Person addNewPerson(Person person) {
        personList.add(person);
        return person;
    }

    public void printNumberOfElements(){
        System.out.println("Number of elements in the list:" + personList.size());
    }
}
