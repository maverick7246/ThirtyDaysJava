package dummytest;
class Test
{
    int test_a;
    int test_b;
    Test(int a, int b)
    {
        test_a = a;
        test_b = b;
    }
    public static void main (String args[])
    {
        Test test = new Test(1,2);
        System.out.println(test.test_a+" "+test.test_b);



    }


    public static void  run(){
        System.out.println(" this is a static run method");

    }
}