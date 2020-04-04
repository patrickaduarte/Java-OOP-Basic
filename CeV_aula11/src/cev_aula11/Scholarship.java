package cev_aula11;
public final class Scholarship extends Student {
    private float valueScholarShip;
    
    public void renewScholarship(){
        System.out.println("Renovando mensalidade");
    }
    @Override
    public void payMonthlyFee(){
        System.out.println("Pagando mensalidade de bolsista");
    }
    public float getValueScholarShip() {
        return valueScholarShip;
    }

    public void setValueScholarShip(float valueScholarShip) {
        this.valueScholarShip = valueScholarShip;
    }
        
}
