package razorpay;

public class RazorpayGateway {

    public String payByCreditCard(String creditCard, String cvv, String expiry){
        System.out.println("Payment Done by Razorpay");
        return "09234";
    }

    public boolean checkPaymentStatus(String id){
        return true;
    }
}
