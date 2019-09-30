package Gau;

public class TestStudent {
    String name;
    public String lastName;
    private int age;
    protected int course;


    public void printData(){
        System.out.println(name+" "+lastName+" "+age+" "+course);
    }

    public  void SetAge(int _age){
        age = _age;
    }
}
