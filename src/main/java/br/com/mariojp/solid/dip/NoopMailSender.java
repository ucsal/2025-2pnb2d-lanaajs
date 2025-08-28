package br.com.mariojp.solid.dip;

public class NoopMailSender implements MailSender{

    @Override
    public void send(String to, String subject, String body) {
        
        // simula envio, sem fazer nada
        System.out.printf("[DRY_RUN] Would send email to %s with subject %s%n", to, subject);
    }

}