package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email email = new Email("Hiruni", "Senarathna");

//        email.setAlternateEmail("hiruniii99@gmail.com");
//        System.out.println(email.getAlternateEmail());

        System.out.println(email.showInfo());
    }
}
