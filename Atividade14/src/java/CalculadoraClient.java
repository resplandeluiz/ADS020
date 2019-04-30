
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class CalculadoraClient {

    public static void main(String[] args) {

        Properties jndiProperties = new Properties();
        jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");

        try {

            Context context = new InitialContext(jndiProperties);
            CalculadoraRemota ejb = (CalculadoraRemota) context.lookup("ejb:/Atividade14//CalculadoraRemota!CalculadoraRemota");

            System.out.println("2 + 2 é igual a " + ejb.somar(2, 2));
            System.out.println("2 - 2 é igual a " + ejb.subtrair(2, 2));
            System.out.println("2 x 2 é igual a " + ejb.multiplicar(2, 2));
            System.out.println("2 / 2 é igual a " + ejb.dividir(2, 2));

        } catch (NamingException e) {

            System.err.println("Falha ao chamar o objeto remoto.\n" + e.getMessage());
        }

    }
}
