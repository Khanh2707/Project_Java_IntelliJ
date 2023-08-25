public class dequy {
    public static int dequyFunction(int num) {
        if (num > 0) {
            dequyFunction(num - 1);
        }
        System.out.println(num);
        return num;
    }
    public static void main(String[] args) {
        System.out.println(dequyFunction(7));
    }
}
