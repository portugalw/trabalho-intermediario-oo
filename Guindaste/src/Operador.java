import java.util.Date;

public class Operador {
	
	public Operador(String nome, Date dataNascimento, String numeroLicenca, Date dataVencimentoLicenca) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.numeroLicenca = numeroLicenca;
		this.dataVencimentoLicenca = dataVencimentoLicenca;
	}
	
	private String nome;
	private Date dataNascimento;
	private String numeroLicenca;
	private Date dataVencimentoLicenca;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNumeroLicenca() {
		return numeroLicenca;
	}
	public void setNumeroLicenca(String numeroLicenca) {
		this.numeroLicenca = numeroLicenca;
	}
	public Date getDataVencimentoLicenca() {
		return dataVencimentoLicenca;
	}
	public void setDataVencimentoLicenca(Date dataVencimentoLicenca) {
		this.dataVencimentoLicenca = dataVencimentoLicenca;
	}
	
	
	public boolean podeOperar() { 
		return dataVencimentoLicenca.before(new Date());
	}
}
