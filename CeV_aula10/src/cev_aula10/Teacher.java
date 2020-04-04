package cev_aula10;

public class Teacher extends People {
    private String specialty;
    private float salary;
    
    public void ReceiveRaise(float increase) {
        this.setSalary(this.getSalary() + increase);
    }
    
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    
    
    
}
