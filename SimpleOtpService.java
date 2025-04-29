public class SimpleOtpService {

    private String otp;

    
    public void generateOtp() {
        otp = String.format("%06d", (int)(Math.random() * 1000000));
        System.out.println("OTP sent: " + otp);
    }

    
    public boolean verifyOtp(String inputOtp) {
        return otp != null && otp.equals(inputOtp);
    }

    public static void main(String[] args) {
        SimpleOtpService otpService = new SimpleOtpService();

        otpService.generateOtp();

    
        String receivedOtp = otpService.otp; // assume received from email/mobile
        boolean isValid = otpService.verifyOtp(receivedOtp);

        System.out.println("OTP verified: " + isValid);
    }
}