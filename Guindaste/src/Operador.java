import java.time.LocalDate;

public class Operador {
	
	public Operador(String nome, LocalDate dataNascimento, String numeroLicenca, LocalDate dataVencimentoLicenca) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.numeroLicenca = numeroLicenca;
		this.dataVencimentoLicenca = dataVencimentoLicenca;
	}
	
	private String nome;
	private LocalDate dataNascimento;
	private String numeroLicenca;
	private LocalDate dataVencimentoLicenca;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNumeroLicenca() {
		return numeroLicenca;
	}
	public void setNumeroLicenca(String numeroLicenca) {
		this.numeroLicenca = numeroLicenca;
	}
	public LocalDate getDataVencimentoLicenca() {
		return dataVencimentoLicenca;
	}
	public void setDataVencimentoLicenca(LocalDate dataVencimentoLicenca) {
		this.dataVencimentoLicenca = dataVencimentoLicenca;
	}
	
	
	public boolean podeOperar() { 
		boolean podeOperar = dataVencimentoLicenca.isAfter(LocalDate.now());
		
		if(!podeOperar) {
			Logger.mensagemDeErro(obterDados() +" esta com licenca vencida");
		}
		
		
		return podeOperar;
	}
	
	public String obterDados() {
		return "Operador: " + nome + ", Licenca: "+ numeroLicenca + " Data venc. licenca:" + Logger.criarDataFormatada(dataVencimentoLicenca);
	}
	
}
