import br.com.mariojp.solid.dip.*;

public class Main {
    public static void main(String[] args) {
        System.setProperty("DRY_RUN", "true"); // deve usar NoopMailSender

        MailSender sender = MailSenderFactory.create();
        EmailNotifier notifier = new EmailNotifier(sender);

        notifier.welcome(new User("Ana", "ana@example.com"));

        System.out.println("Email enviado!");
    }
}

