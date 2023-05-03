
public class Guindaste {
	
	private String nome;
	private Base base; 
	private Operador operador;
	private int alturaMastro;
	private int comprimentoLanca;
	private int comprimentoBracoMenor;
	private int materialContrapeso;
	private int massaContrapeso;
	private int alturaMaximaIcamento;
	private int cargaMaximaLevantada;
	private int pesoCargaIcada;
	
	private int alturaIcamento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Base getBase() {
		return base;
	}
	public void setBase(Base base) {
		this.base = base;
	}
	public int getAlturaMastro() {
		return alturaMastro;
	}
	public void setAlturaMastro(int alturaMastro) {
		this.alturaMastro = alturaMastro;
	}
	public int getComprimentoLanca() {
		return comprimentoLanca;
	}
	public void setComprimentoLanca(int comprimentoLanca) {
		this.comprimentoLanca = comprimentoLanca;
	}
	public int getComprimentoBracoMenor() {
		return comprimentoBracoMenor;
	}
	public void setComprimentoBracoMenor(int comprimentoBracoMenor) {
		this.comprimentoBracoMenor = comprimentoBracoMenor;
	}
	public int getMaterialContrapeso() {
		return materialContrapeso;
	}
	public void setMaterialContrapeso(int materialContrapeso) {
		this.materialContrapeso = materialContrapeso;
	}
	public int getMassaContrapeso() {
		return massaContrapeso;
	}
	public void setMassaContrapeso(int massaContrapeso) {
		this.massaContrapeso = massaContrapeso;
	}
	public int getAlturaMaximaIcamento() {
		return alturaMaximaIcamento;
	}
	public void setAlturaMaximaIcamento(int alturaMaximaIcamento) {
		this.alturaMaximaIcamento = alturaMaximaIcamento;
	}
	public int getCargaMaximaLevantada() {
		return cargaMaximaLevantada;
	}
	public void setCargaMaximaLevantada(int cargaMaximaLevantada) {
		this.cargaMaximaLevantada = cargaMaximaLevantada;
	}
		
	public Operador getOperador() {
		return operador;
	}
	public void setOperador(Operador operador) {
		this.operador = operador;
	}
	public int getAlturaIcamento() {
		return alturaIcamento;
	}
	public void setAlturaIcamento(int alturaIcamento) {
		this.alturaIcamento = alturaIcamento;
	}
	
	
	public void adicionarCargaParaIcamento(int pesoCarga) {
		//realizar validacoes 
	}
	
	private boolean podeGuichar() {
		
		return false;
	}
	
}
