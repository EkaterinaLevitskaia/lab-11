import MyPack.A;
import My2Pack.C;

public class Main {

    public static void main(String[] args) {


        System.out.println("Импорт кастомного пакета MyPack");
        A a = new A();

        System.out.println("Импорт кастомного пакета My2Pack");
        C c = new C();

        c.index();
    }
}