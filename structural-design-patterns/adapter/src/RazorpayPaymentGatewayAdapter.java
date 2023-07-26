import razorpay.RazorpayGateway;

public class RazorpayPaymentGatewayAdapter implements PaymentGateway{

    private RazorpayGateway razorpayGateway = new RazorpayGateway();

    @Override
    public Long payViaCreditCard(String cardNumber, int cvv, int expiryMonth, int expiryYear) {
        String transactionId = razorpayGateway.payByCreditCard(cardNumber,
                                                               String.valueOf(cvv),
                                                        String.valueOf(expiryMonth)+"/"+String.valueOf(expiryYear));

        return Long.parseLong(transactionId);
    }

    @Override
    public PaymentStatus getStatus(Long id) {
        boolean status = razorpayGateway.checkPaymentStatus(String.valueOf(id));

        if(status ==  true){
            return PaymentStatus.SUCCESS;
        }

        return PaymentStatus.FAILURE;
    }
}
