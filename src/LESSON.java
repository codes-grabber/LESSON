public class LESSON {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(myMethod());
        System.out.println(myAnotherMethod());
//        byte myByte = 8; //целое число 8 бит  -128 до 127
//        short myShort = 16; //целое число 2 байта (16 бит) -32768 до 32767
//        int myInt = 32; //целое число 4 байта (32 бит) использовать по умолчанию
//        long myLong = 212132121231L; //целое число 8 байт (64 бит)
//        float myFloat = 64.23f; //число с плав запятой -  4 байт
//        double myDouble = 64.121312132; //число с плавающей запятой - 8 байт
//        char myChar = '♦'; //символьный тип данных - 16 бит (2 байта)
//        boolean myBoolean = true; //логический тип данных
        int g = 1;
        switch(g){
            case 1:
                System.out.println("Это 1");
                break;
            case 5:
                System.out.println("This 5");
                break;
        }
    }


    public static int myMethod(){
        int a = 5, b=3;
        int c = a + b;
        return c;
    }
    public static char myAnotherMethod(){
        return 'c';
    }

    public static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_ Banana");
        System.out.println("_ Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 3;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = -10;
        if (value <= 0) {
            System.out.println("Желтый");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Красный");
        } else {System.out.println("Зеленый");} //Почему выводит??
    }
    public static void compareNumbers(){
        int a = 2;
        int b = 3;
        if (a >= b){
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }
}
