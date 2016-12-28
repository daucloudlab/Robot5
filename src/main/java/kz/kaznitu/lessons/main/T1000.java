package kz.kaznitu.lessons.main;


import kz.kaznitu.lessons.interfaces.Hand;
import kz.kaznitu.lessons.interfaces.Head;
import kz.kaznitu.lessons.interfaces.Leg;

public class T1000 extends Robot {
    private String color ;
    private int weight ;
    private int height ;

    public T1000() {
    }

    public T1000(String color, int weight, int height) {

        this.color = color;
        this.weight = weight;
        this.height = height;
    }

    public T1000(String color, int weight, int height, Hand hand, Head head, Leg leg) {
        super(hand, head, leg);
        this.color = color;
        this.weight = weight;
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void action() {
        super.action();
        System.out.println("Color is " + color);
        System.out.println("Weight is " + weight);
        System.out.println("Height is "  + height);
    }
}
