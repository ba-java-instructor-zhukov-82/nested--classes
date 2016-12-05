package nested_classes;


public class Outer {
    private int field;

    /*----- Static nested class -----*/
    public static class StaticNestedClass {

        //private int f = Outer.this.field;
    }

    /*----- Member class -----*/
    public class InnerClass {
        private int f = Outer.this.field;
    }
}
