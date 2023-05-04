import java.time.LocalDate;

public class TestaGuindaste {

	public static void main(String[] args) {

			//testarGuindasteComOperadorComPermissao();
			//testarGuindasteComOperadorSemPermissao();
			//testarGuindasteSemOperador();
		
	}
	
	
	public static void testarGuindasteComOperadorComPermissao() {
		System.out.println("===================TESTE COM OPERADOR COM PERMISSÃO=================================");
		
		Operador operadorComPermissao = new Operador("Gustavo Cerbasi",  LocalDate.of(1985,1,1), "7845454-8", LocalDate.of(2025,1,1));
		Guindaste guindaste = new Guindaste(operadorComPermissao,20000, 21000, 70);
		
		guindaste.adicionarCargaParaIcamento(20000);
		
		guindaste.subirCarga(10);
		guindaste.subirCarga(10);
		guindaste.subirCarga(20);
		guindaste.subirCarga(29);
		guindaste.subirCarga(5);
		
		guindaste.exibirStatusDoGuindaste();
		
		guindaste.descerCarga(100);
		
		guindaste.descerCarga(69);
		
		guindaste.exibirStatusDoGuindaste();
		
		System.out.println("===================FIM TESTE COM OPERADOR COM PERMISSÃO=================================");
	}
	
	public static void testarGuindasteComOperadorSemPermissao() {
		System.out.println("===================TESTE COM OPERADOR SEM PERMISSÃO=================================");
		
		Operador operadorSemPermissao = new Operador("Oster Vencidão ", LocalDate.of(1945, 01,25), "7845454-8", LocalDate.of(2022, 12, 1));
		Guindaste guindaste = new Guindaste(operadorSemPermissao,20000, 21000, 70);
		
		guindaste.adicionarCargaParaIcamento(20000);
		
		guindaste.subirCarga(10);
		guindaste.subirCarga(10);
				
		guindaste.exibirStatusDoGuindaste();
		
		
		System.out.println("===================FIM TESTE COM OPERADOR SEM PERMISSÃO=================================");
	}
	
	
	public static void testarGuindasteSemOperador() {
		System.out.println("===================TESTE SEM OPERADOR=================================");
		
		Guindaste guindaste = new Guindaste(null, 20000, 21000, 70);
		
		guindaste.adicionarCargaParaIcamento(20000);
		
		guindaste.subirCarga(10);
				
		guindaste.exibirStatusDoGuindaste();
		
		
		System.out.println("===================FIM TESTE SEM OPERADOR=================================");
	}

}
