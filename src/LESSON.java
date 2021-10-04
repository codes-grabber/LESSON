public class LESSON {
    public static void main(String[] args) {
        System.out.println(myMethod(1,15));
        System.out.println(myAnotherMethod(-4));
        System.out.println(myThirdMethod(4));

    }
    public static boolean myMethod(int a, int b){

        if((a+b) >= 10 && (a+b) <= 20){
            return true;
        } else return false;
    }
    public static String myAnotherMethod(int c){
        if (c >= 0){
            return "Положительное";
        } else return "Отрицательное";
    }
    public static boolean myThirdMethod(int d){
        if (d >= 0){
            return true;
        } else return false;
    }
}
