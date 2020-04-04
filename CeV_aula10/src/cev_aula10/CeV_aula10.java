
package cev_aula10;
public class CeV_aula10 {
    public static void main(String[] args) {
        People p1 = new People();
        Student p2 = new Student();
        Teacher p3 = new Teacher();
        Employee p4 = new Employee();
        
        p1.setName("Pedro");
        p2.setName("Maria");
        p3.setName("Cláudio");
        p4.setName("Fabiana");
        
        p1.setSex("M");
        p4.setSex("F");
        p2.setAge(18);

        p2.setCourse("Informática");
        p3.setSalary(2500.75f);
        p4.setSector("Estoque");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());


       
    }
    
}
