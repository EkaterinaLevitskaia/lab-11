package My2Pack;
import MyPack.A;

public class C {

    public void index() {
        System.out.println("Вызов метода класса C");
        A a = new A();
//        Нельзя получить доступ
//        a.protected;
    }
}