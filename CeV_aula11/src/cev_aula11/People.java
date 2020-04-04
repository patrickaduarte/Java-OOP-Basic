package cev_aula11;
public abstract class People {
    private String name;
    private int age;
    private String sex;
    
    
    public final void birthday() {
        this.setAge(this.getAge() + 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "People{" + "name=" + name + ", age=" + age + ", sex=" + sex + '}';
    }
    
}
