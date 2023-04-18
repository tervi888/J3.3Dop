public class CreditPaymentService {
    public double CreditPaymentServicecalculate(int amount, int month, double bet) {
        double bet1 = (bet * 0.01) / month;
        double bet3 = Math.pow((1 + bet1), month);
        double payment = ((bet1 * amount) * bet3) / (bet3 - 1);

        return payment;

    }
}
