public class Main {
    public static void main(String[] args) {

        int amount = 1_000_000;
        int mounth = 12;
        double bet = 9.9;
        double bet1 = bet / mounth;
        System.out.println(bet1);

        pow service = new pow();
        double g = service.powcalculate((1 + bet1), mounth);
        System.out.println(g);
        double a = bet1 * g;
        System.out.println(a);
        double b = g - 1;
        System.out.println(b);

        double ratio = a / b;
        System.out.println(ratio);
        double payment = amount * ratio;
        System.out.println(payment);


    }
}