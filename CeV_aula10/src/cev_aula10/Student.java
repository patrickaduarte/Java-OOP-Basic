package cev_aula10;

public class Student extends People {
    private int registration;
    private String course;
    
    public void cancelRegister (){
        this.setRegistration(0);
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
