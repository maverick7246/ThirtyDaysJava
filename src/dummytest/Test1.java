package dummytest;

public class Test1 {
    int a;
    String s;
    char c;

    public Test1(int d, String e, char f) {
//        a = d;
//        s = e;
//        c= f;

        d=d;
        e=e;
        f=f;
    }

    public static void main(String[] args) {
        Test1 t= new Test1(1, "def",'d');
        Test1 t1= new Test1(2, "defj",'f');
        System.out.println(t.a+" "+t.s+" "+t.c);
        System.out.println(t1.a+" "+t1.s+" "+t1.c);
    }


}
