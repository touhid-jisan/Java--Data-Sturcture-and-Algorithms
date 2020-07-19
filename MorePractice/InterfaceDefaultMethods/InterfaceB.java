package InterfaceDefaultMethods  ;

public interface InterfaceB {
    int VAL = TestClient.getVal();
    void foo();  
    default void go() {
        System.out.println("B : Default go() method");
    }
}