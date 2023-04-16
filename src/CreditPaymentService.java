public class CreditPaymentService {
    public double CreditPaymentServicecalculate(int amount, int month, double bet) {
        pow service = new pow();
        double bet1 = (bet * 0.001) / month;
        double bet3 = service.powcalculate((1 + bet1), month);
        double payment = ((bet1 * amount) * bet3) / (bet3 - 1);
        return payment;

    }
}
