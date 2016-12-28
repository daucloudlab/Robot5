package kz.kaznitu.lessons.main;


import kz.kaznitu.lessons.interfaces.Hand;
import kz.kaznitu.lessons.interfaces.Head;
import kz.kaznitu.lessons.interfaces.Leg;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public  class Robot implements InitializingBean, DisposableBean {

    private Hand hand;
    private Leg leg;
    private Head head;

    public void destroy() throws Exception {
        System.out.println("Robot will destroyed!");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("After Properties set: Robot was initialized! ");
    }





    public Robot(Hand hand,Head head, Leg leg) {
        this.hand = hand ;
        this.leg = leg;
        this.head = head;
    }

    public Robot() {
    }

    public void action(){
        hand.catchSomething();
        head.calc();
        leg.go();
    }
    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }
}