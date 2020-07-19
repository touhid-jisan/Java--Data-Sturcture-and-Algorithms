package InterfaceDefaultMethods;
public interface InterfaceC extends InterfaceA {
    void foobar();
    default void go() {
        System.out.println("C : default go() method");
    };
}