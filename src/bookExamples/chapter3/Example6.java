package bookExamples.chapter3;

public class Example6 {

    public static void main(String[] args) {
        int х; // эта переменная доступна всему
                //коду из метода main()
        х = 10;

        if (х == 10) { // начало новой области действия,
            int у = 20;
            //доступной только этому блоку кода
            // обе переменные х и у доступны в
            //этой области действия
            System.out.println("x и у: " + х + " " + у);
            х = у * 2;
        }

        // у= 100; //ОШИБКА! переменная у недоступна
        // в этой области действия, тогда как
        // переменная х доступна и здесь
        System.out.println("x равно " + х);
    }

}
