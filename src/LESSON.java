public class LESSON {
    public static void main(String[] args) {
        System.out.println(myMethod(1,15));
        System.out.println(myAnotherMethod(-4));

    }
    public static boolean myMethod(int a, int b){
        int c;
        if(c >= 10 && c <= 20){ //java: variable c might not have been initialized
            return true;

        } else return false;
    }
    public static String myAnotherMethod(int c){
        if (c >= 0){
            return "Положительное";
        } else return "Отрицательное";
    }
}
