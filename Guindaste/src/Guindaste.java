
public class Guindaste {
	
	public Guindaste(Operador operador, int massaContrapeso, int pesoCargaMaxima, int alturaMaximaIcamento) {
		this.operador = operador;
		this.massaContrapeso = massaContrapeso;
		this.pesoCargaMaximaLevantada = pesoCargaMaxima;
		this.alturaMaximaIcamento = alturaMaximaIcamento;
	}
	
	
	private String nome;
	private Base base; 
	private Operador operador;
	private int alturaMastro;
	private int comprimentoLanca;
	private int comprimentoBracoMenor;
	private int materialContrapeso;
	private int massaContrapeso;
	private int alturaMaximaIcamento;
	private int pesoCargaMaximaLevantada;
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
	public int getPesoCargaMaximaLevantada() {
		return pesoCargaMaximaLevantada;
	}
	public void setPesoCargaMaximaLevantada(int cargaMaximaLevantada) {
		this.pesoCargaMaximaLevantada = cargaMaximaLevantada;
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
		
		if(pesoCarga > pesoCargaMaximaLevantada) {
			Logger.mensagemDeErro("O peso " + pesoCarga + "Kg e maior que o permitido: " + pesoCargaMaximaLevantada + "Kg.");
			return;
		}
		
		
		pesoCargaIcada = pesoCarga;
		Logger.mensagem("O peso " + pesoCarga + "Kg foi adicionado.");
	}
	
	private boolean podeGuichar() {
		
		if(operador == null) {
			Logger.mensagemDeErro("Guindaste sem operador.");
			return false;
		}		
			
		
		if(!operador.podeOperar())		
			return false;
		
		if(pesoCargaIcada <= 0) {
			Logger.mensagemDeErro("Guindaste sem peso para içar.");
			return false;
		}
		
		Logger.mensagem("Pode guinchar.");
		return true;
	}
	
	
	public void subirCarga(int quantidadeParaSubir) {
		
		int alturaTotalDesejada = quantidadeParaSubir + alturaIcamento;
		
		if(!podeGuichar())
			return;
		
		if(alturaTotalDesejada > alturaMaximaIcamento) {
			Logger.mensagemDeErro("Altura ultrapassa em "+ (alturaTotalDesejada - alturaMaximaIcamento) + " metros o limite de içamento: " + alturaMaximaIcamento + " metros.");
		}		
		else {
			alturaIcamento += quantidadeParaSubir;
			Logger.mensagem("Altura atual: " + alturaIcamento);
		}
	}
	
	public void descerCarga(int quantidadeParaDescer) {
			
		int alturaTotalDesejada = alturaIcamento - quantidadeParaDescer;
		
		if(!podeGuichar())
			return;
		
		if(alturaTotalDesejada < 0) {
			Logger.mensagemDeErro("Altura ultrapassa em "+ alturaTotalDesejada + " metros o solo.");
		}		
		else {
			alturaIcamento -= quantidadeParaDescer;
		}
	}
	
	public void exibirStatusDoGuindaste() {
		Logger.mensagem("==STATUS== : Peso atual da carga:" + pesoCargaIcada + " Altura atual: " + alturaIcamento );
	}
}
