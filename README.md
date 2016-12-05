##Nested Classes Additional Examples

Project has examples of simple using of all types of nested classes:
nested static classes, inner classes (non-static member class), 
local classes and anonymous classes.

##Array elements shifting utility method

Static method shift() provides shifting array's elements algorithm.  
Here is the solution:

```java
public static void shift(Object[] array) {
        for(int i = 0; i < array.length; ++i) {
            int min = i, max = array.length - 1;
            int r = (int)(min + (Math.random() * (max - min)));
            swap(array, i, r);
        }
    }

    public static void swap(Object[] array, int i, int r) {
        Object aCopy = array[i];
        array[i] = array[r];
        array[r] = aCopy;
    }
```