package homework.homework15.medicalCenter;

public interface ChangeDataCommands {

    String EXIT2 = "0";
    String CHANGE_NAME = "1";
    String CHANGE_SURNAME = "2";
    String CHANGE_EMAIL = "3";
    String CHANGE_PHONE_NUMBER = "4";
    String CHANGE_PROFESSION = "5";
    String CHANGE_ALL = "6";

    static void printCommands(){
        System.out.println("input: " + EXIT2 + ") for exit");
        System.out.println("       " + CHANGE_NAME + ") for change name");
        System.out.println("       " + CHANGE_SURNAME + ") for change surname");
        System.out.println("       " + CHANGE_EMAIL + ") for change email");
        System.out.println("       " + CHANGE_PHONE_NUMBER + ") for change phone number");
        System.out.println("       " + CHANGE_PROFESSION + ") for change profession");
        System.out.println("       " + CHANGE_ALL + ") for change all");
    }

}
