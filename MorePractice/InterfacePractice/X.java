package InterfacePractice;
public class X extends AbstractA implements InterfaceB{
    public void foo() {
        System.out.println("Class x : foo");
        System.out.println("value" +InterfaceB.VAL);
    }
 }