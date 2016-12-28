package kz.kaznitu.lessons.models.toshiba;


import kz.kaznitu.lessons.interfaces.Leg;

public class ToshibaLeg implements Leg {
    public ToshibaLeg() {
    }

    public void go(){
        System.out.println("Go to Toshiba!");
    }

    public void toshibaLegInitMethod() {
        System.out.println("Toshiba Leg Init Method ");
    }

    public void toshibaLegDestroyMethod() {
        System.out.println("Toshiba Leg destroy method");
    }
}