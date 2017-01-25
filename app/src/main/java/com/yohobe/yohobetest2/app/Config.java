package com.yohobe.yohobetest2.app;

/**
 * Created by root on 19/1/17.
 */

public class Config {
    // server URL configuration
    public static final String URL_REQUEST_SMS = "http://100.68.24.87:8080/api/sendOtp";
    public static final String URL_RESEND_OTP = "http://100.68.24.87:8080/api/resendOtp";
    public static final String URL_GET_USER_DETAILS = "http://100.68.24.87:8080/api/getUserDetails";
    public static final String URL_VERIFY_OTP = "http://192.168.0.101/android_sms/msg91/verify_otp.php";

    // SMS provider identification
    // It should match with your SMS gateway origin
    // You can use  MSGIND, TESTER and ALERTS as sender ID
    // If you want custom sender Id, approve MSG91 to get one
    public static final String SMS_ORIGIN = "YOHOBE";

    // special character to prefix the otp. Make sure this character appears only once in the sms
    public static final String OTP_DELIMITER = ":";
}
