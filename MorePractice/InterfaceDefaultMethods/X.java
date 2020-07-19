package InterfaceDefaultMethods;
public class X extends AbstractA implements InterfaceA, InterfaceB, InterfaceC{
    public void foo() {
        System.out.println("Class x : foo");
        System.out.println("value" +InterfaceB.VAL);
    }
    public void foobar() {
        System.out.println("Class x : foobar");
    }
    public void go() {
        System.out.println("X : Default go() method");
    }
 }