package practiceabstract;
public class ConcreteSubClass extends AbstractSubClass {
    void test2() {
        System.out.println("Test 2");
    }
    void test3() {
        System.out.println("Test 3");
    }

    public static void main(String[] args) {
        ConcreteSubClass concrete = new ConcreteSubClass();
        concrete.test1();
        concrete.test2();
        concrete.test3();
    }


}