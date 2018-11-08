package carStore;

public class Veiculo implements IAutomovel {

	private int consumoUrbano;
	private int consumoRodoviario;
	private int conforto;
	//Enum combustivel
	private int passageiros;
	private int velocidadeMax;
	
	public String nome;
	
	public int getConsumoUrbano() {
		return consumoUrbano;
	}
	public void setConsumoUrbano(int consumoUrbano) {
		this.consumoUrbano = consumoUrbano;
	}
	public int getConsumoRodoviario() {
		return consumoRodoviario;
	}
	public void setConsumoRodoviario(int consumoRodoviario) {
		this.consumoRodoviario = consumoRodoviario;
	}
	public int getConforto() {
		return conforto;
	}
	public void setConforto(int conforto) {
		this.conforto = conforto;
	}
	public int getPassageiros() {
		return passageiros;
	}
	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
	public int getVelocidadeMax() {
		return velocidadeMax;
	}
	public void setVelocidadeMax(int velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}
	
}
