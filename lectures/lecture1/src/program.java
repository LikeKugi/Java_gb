public class program {
    public static void main(String[] args) {
        int a = 13;
        boolean flag1 = 13 < 14;
        System.out.println(a);
        String msg = "Hello world";
        System.out.println(msg);
        var d = 123.456;
        String dType = getType(d);
        System.out.println(dType);
        System.out.println(Integer.MIN_VALUE);

        var b = 123;
        b = b-- - --b;
        System.out.println(b);
    }
    
    private static String getType(Object o){
        return o.getClass().getSimpleName();
    }
}
