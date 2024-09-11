package ClasseAbstrata;

public class Moto extends Veiculos {

	public Moto(String placa, String modelo, String cor, int ano) {
		super(placa, modelo, cor, ano);
	}
	@Override
	public void acelerar() {
		System.out.println("a moto está acelerando.");
	}
	@Override
	public void frear() {
		System.out.println("a moto está freando.");
	}
	@Override
	public void virar() {
		System.out.println("a moto está virando.");
	}
	@Override
	public void ligar() {
		System.out.println("a moto está ligada.");
	}

	
}
