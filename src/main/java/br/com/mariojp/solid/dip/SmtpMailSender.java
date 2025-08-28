package br.com.mariojp.solid.dip;

public class SmtpMailSender implements MailSender {
    
    public SmtpMailSender() {
        if (!"true".equals(System.getenv("SMTP_AVAILABLE"))) {
            throw new IllegalStateException("SMTP not available");
        }
    }

    @Override
    public void send(String to, String subject, String body) {
        // lógica real de envio
        System.out.printf("Sending email to %s with subject %s%n", to, subject);
    }
}
