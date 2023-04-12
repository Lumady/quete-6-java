public class Classroom {
    public static void main(String[] args) {

        Wilder vincent = new Wilder("Vincent", false);
        System.out.println(vincent.whoAmI());
        Wilder samy = new Wilder("Samy", false);
        System.out.println(samy.whoAmI());
        Wilder denis = new Wilder("Denis", true);
        System.out.println(denis.whoAmI());
    }
}
