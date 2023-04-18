public class CreditPaymentService {
    public double CreditPaymentServicecalculate(int amount, int month, double bet) {
        double bet1 = (bet * 0.01) / 12;
        System.out.println(bet1);
        double bet3 = Math.pow((1 + bet1), month);
        System.out.println(bet3);
        double payment = ((bet1 * amount) * bet3) / (bet3 - 1);

        return payment;

    }
}
