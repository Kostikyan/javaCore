package bookExamples.chapter5;

public class Example28 {

    public static void main(String[] args) {

        boolean t = true;
        System.out.println("Дo возврата.");
        if(t) return; // возврат в вызывающий код
        System.out.println("Этот оператор выполняться не будет.");

    }

}
