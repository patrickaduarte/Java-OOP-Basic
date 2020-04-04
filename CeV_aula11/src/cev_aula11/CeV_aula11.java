package cev_aula11;

public class CeV_aula11 {

    public static void main(String[] args) {
        Visitor visitor1 = new Visitor();
        Student student1 = new Student();
        Scholarship student2 = new Scholarship();
        
        student1.payMonthlyFee();
        student2.payMonthlyFee();
    }
    
}
