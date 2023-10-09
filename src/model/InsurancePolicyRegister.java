package model;


import java.util.ArrayList;

public class InsurancePolicyRegister {
    
     private String companyName;
     private ArrayList<InsurancePolicy> InsurancePolicyList;

     public InsurancePolicyRegister(String companyName){
        this.companyName = companyName;
        this.InsurancePolicyList = new ArrayList<>();
     }

     public ArrayList<InsurancePolicy> getInsurancePolicyList() {
        return InsurancePolicyList;
    }

   

    public void addInsurancePolicy(InsurancePolicy insurancePolicy) {
        InsurancePolicyList.add(insurancePolicy);
    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
   

   

  
    public void printInsurancePolicy() {
        System.out.println("Company Name: " + companyName);
        System.out.println("List of Insurance Policies:");
        for (InsurancePolicy everyPolicy : InsurancePolicyList){
            everyPolicy.printInformation();
            System.out.println("-----------------");
        }
    
        }

        


    }
   


