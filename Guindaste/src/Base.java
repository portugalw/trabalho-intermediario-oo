
public class Base {
	
	public Base(int altura, int largura, int comprimento, int peso) {
		super();
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;
		this.peso = peso;
	}
	
	private int altura;
	private int largura;
	private int comprimento;
	private int peso;
	
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
}
