public class ClassEx {
    int x = 6;

    public static void main(String[] args) {
        Class o = new Class();
        System.out.println(o.val);

        ClassEx obj = new ClassEx();
        obj.x = 15;
        System.out.println(obj.x);
    }
}

class Class
{
    int val = 5;
}
