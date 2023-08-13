public class CreditPaymentService {
    public double calculate(int loanAmount, int loanTerm, double interestRate) {
        loanTerm = loanTerm * 12;
        interestRate = interestRate / 12 / 100;
        return (double) loanAmount * (interestRate * Math.pow(1 + interestRate, loanTerm)) / (Math.pow(1 + interestRate, loanTerm) - 1);
    }

}
