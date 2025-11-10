package services;

public interface OnlinePaymentService {
    double paymantFee (double amount);
    double interest(double amount, int months);
}
