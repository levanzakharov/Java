package Student;

import Gau.TestClass;

public class Person {
    public Person(){
        TestClass t = new TestClass();
        t.printData();
    }

    public Person(String last){
        TestClass t = new TestClass();
        t.last = last;
        t.printData();
    }


}
