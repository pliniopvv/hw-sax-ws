import hw_sax_ws.yt.CertidaoNascimentoImpl;
import jakarta.xml.ws.Endpoint;

public class App {
	public static void main(String args[]) {
		CertidaoNascimentoImpl cN = new CertidaoNascimentoImpl();
		Endpoint.publish("http://localhost:8085/servico/certidao", cN);
		System.out.println("Serviço Publicado...");
	}
}