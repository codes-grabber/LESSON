public class LESSON {
    public static void main(String[] args) {
        System.out.println(myMethod(1, 15));
        System.out.println(myAnotherMethod(-4));
        System.out.println(myThirdMethod(4));
        myFourMethod("Hi", 5);

    }

    public static boolean myMethod(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        } else return false;
    }

    public static String myAnotherMethod(int c) {
        if (c >= 0) {
            return "Положительное";
        } else return "Отрицательное";
    }

    public static boolean myThirdMethod(int d) {
        if (d >= 0) {
            return true;
        } else return false;
    }

    public static void/*String*/ myFourMethod(String a, int b) {
//        int i = 0;
//        String g = " ";
//        while (i < b) {
//            g += "\n" + a;
//            i++;
//        }
//        return g;
        int i = 0;
        while (i != b){
            System.out.println(a);
            i++;
        if (i == b) {
            break;
        }
        }
    }
}
