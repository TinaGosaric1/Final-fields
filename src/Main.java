public class Main {
    public static void main(String[] args) {
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        int pass = 5645;
        Password password = new ExtendedPassword(pass);
        password.storePassword();
        password.letMeIn(1);
        password.letMeIn(4545);
        password.letMeIn(534454);
        password.letMeIn(5645);
    }
}