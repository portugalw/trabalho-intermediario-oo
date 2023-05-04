import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Logger {
	
	public static String criarDataFormatada() {
		return criarDataFormatada(LocalDate.now());
	}
	
	public static String criarDataFormatada(LocalDate data) {
		return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)); 
	}
	
	public static void mensagemDeErro(String mensagem) {
		System.out.println(criarDataFormatada() + " ERRO - " + mensagem);
	}
	
	public static  void mensagem(String mensagem) {
		System.out.println(criarDataFormatada() + "  OK  - " + mensagem);
	}

}
