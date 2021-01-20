public class Main {
    public static void main(String[] abs)
    { CreditPaymentService service = new CreditPaymentService();
        double sum = 1000000;
        double procent =9.99;
        double period =36;
        int payment=service.calculate(sum,procent,period);
        System.out.print(payment);
    }

}
