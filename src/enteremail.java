
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.util.Properties;

public class enteremail {


        public static void main(String[] args) {
            final String fromEmail = "efremovegor0911@yandex.ru";
            final String password = "в тг напишу";
            final String toEmail = "egefremov2013@gmail.com";

            System.out.println("Запуск электронной почты SSL");
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.yandex.ru");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class",
                    "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");
            Authenticator auth = new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(fromEmail, password);
                }
            };
            Session session = Session.getDefaultInstance(props, auth);
            System.out.println("Сессия создана");
            emailutil.sendEmail(session, toEmail,"Ваш код авторизации", "Ваш код авторизации: 123-123,\n Если вы не выполняли авторизацию, смените пароль.");
        }
    }

