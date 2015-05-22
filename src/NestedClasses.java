import java.util.concurrent.Callable;

/**
 * Created by jona on 17.05.15.
 */
public class NestedClasses {
    class DynSubClass {}
    DynSubClass getDyn() { return new DynSubClass(); }

    static class SubClass {
        int field;

        public SubClass(int val) { field = val; }
    }

    public static void main(String[] args) {
        Callable<String> test = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Very classy, much ad-hoc, wow.";
            }
        };
        try {
            System.out.println(test.call());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(new SubClass(10));
        System.out.println(new NestedClasses().getDyn());
    }
}
