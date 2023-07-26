public class Flipkart {

    PaymentGateway paymentGateway;

    Flipkart(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    public void makePaymentViaCreditCard(String cardNumber, int cvv, int expiryMonth, int expiryYear){
        Long transactionId = paymentGateway.payViaCreditCard(cardNumber, cvv, expiryMonth, expiryYear);

        while (!paymentGateway.getStatus(transactionId).equals(PaymentStatus.SUCCESS)){
            System.out.println("waiting");
        }
    }
}
