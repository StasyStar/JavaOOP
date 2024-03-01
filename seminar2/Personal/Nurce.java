package hw.seminar2.Personal;

public class Nurce extends Personal {
    public Nurce(String name) {
        super(name);
    }
    public void doVaccine(){
        System.out.println(getClass().getSimpleName() +" is making a vaccine");
    }
}
