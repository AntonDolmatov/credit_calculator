public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int monthlyPayment1 = (int) service.calculate(1000000, 1, 9.99);
        System.out.println("Ежемесячный платёж: " + monthlyPayment1);

        int monthlyPayment2 = (int) service.calculate(1000000, 2, 9.99);
        System.out.println("Ежемесячный платёж: " + monthlyPayment2);

        int monthlyPayment3 = (int) service.calculate(1000000, 3, 9.99);
        System.out.println("Ежемесячный платёж: " + monthlyPayment3);

    }

}
