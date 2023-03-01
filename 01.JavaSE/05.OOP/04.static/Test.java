public class Test{
    static{
        System.out.println("hello world");
    }
    
    private static Test tester = new Test();
    private static int count1;
    private static int count2 = 2;
    public Test(){
        count1++;
        count2++;
        System.out.println("count1: " + count1);
        System.out.println("count2: " + count2);
    }

    public static Test getTester(){
        return tester;
    }
    public static void main(String[] args) {
        Test.getTester();
        System.out.println("count1 value: " + count1);
        System.out.println("count2 value: " + count2);
    }
}