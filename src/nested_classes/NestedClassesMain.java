package nested_classes;

import java.util.Arrays;
import java.util.Comparator;


public class NestedClassesMain {

    private int x = 20;

    public static void main(String[] args) {
        //nestedInit();
        //anonymousClassTest();
        comparatorAnonymousClassTest();
    }

    private static void comparatorAnonymousClassTest() {

        Apple yellow = new Apple(Apple.AppleColor.YELLOW);
        Apple red = new Apple(Apple.AppleColor.RED);
        Apple green = new Apple(Apple.AppleColor.GREEN);
        Apple[] basket = { yellow, red, green };
        System.out.println(Arrays.toString(basket));
        Arrays.sort(basket, new Comparator<Apple>() {
            @Override
            public int compare(Apple apple1, Apple apple2) {
                return apple1.toString().compareTo(apple2.toString());
            }
        });
        Arrays.sort(basket, (a1, a2) -> a1.toString().compareTo(a2.toString()));
        System.out.println(Arrays.toString(basket));
    }

    private static void anonymousClassTest() {
        Button btn = new Button();
        btn.click(); //ON
        btn.click(); //OFF
        btn.click(); //ON
    }

    private static void nestedInit() {
        Outer.StaticNestedClass snc = new Outer.StaticNestedClass();

        Outer outer = new Outer();
        Outer.InnerClass inc = outer.new InnerClass();

        new NestedClassesMain().localClasses();
    }

    private void localClasses() {
        /* Local class and locals variables access */
        class Local {
            int y = 10;
        }
        Local l = new Local();
        class Local2 {
            void f() {
                l.y = 15;
                System.out.print(x + l.y);
            }
        }
        Local2 l2 = new Local2();
        l2.f();
    }
}
