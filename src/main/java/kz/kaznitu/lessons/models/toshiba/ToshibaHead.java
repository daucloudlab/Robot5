package kz.kaznitu.lessons.models.toshiba;


import kz.kaznitu.lessons.interfaces.Head;

public class ToshibaHead implements Head {
    public ToshibaHead() {
    }

    public void calc(){
        System.out.println("Thinking about Toshiba...");
    }

    public void toshibaHeadInit() {
        System.out.println("Toshiba Head Init Method");
    }

    public void toshibaHeadDestroyMethod() {
        System.out.println("Toshiba Head Destroy Method");
    }
}