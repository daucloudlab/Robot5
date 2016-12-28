package kz.kaznitu.lessons.models.toshiba;


import kz.kaznitu.lessons.interfaces.Hand;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ToshibaHand implements Hand, InitializingBean, DisposableBean{
    public ToshibaHand() {
    }

    public void catchSomething(){
        System.out.println("Catched from Toshiba!");
    }

    public void toshibaHandInit() {
        System.out.println("Toshiba Hand Init Method");
    }

    public void toshibaHandDestroy(){
        System.out.println("Toshiba Hand Destroy Method");
    }

    public void destroy() throws Exception {
        System.out.println("Disposable Bean: ToshibaHand will destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean afterPropertiesSet: ToshibaHand has inited");

    }
}