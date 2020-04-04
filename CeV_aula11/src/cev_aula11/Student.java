package cev_aula11;

public class Student extends People {
    private int registration;
    private String course;
    
    public void payMonthlyFee(){
        System.out.println("Pagando mensalidade de aluno");
    }
   
    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
    
}
