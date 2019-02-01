package A_SRP.solucao;

import A_SRP.SendMail;

public class EmailService {

    public static Boolean isValid(String email) {
        return email.contains("@");
    }

    public static void enviar(String from, String to, String subject, String message) {
        SendMail sendMail = new SendMail(from, to, subject, message);
        sendMail.send();
    }
}
