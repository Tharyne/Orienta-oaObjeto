package ClasseAbstrata;

public class Tigre extends Animais {
	
	public Tigre(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	@Override
	public void dormir() {
		System.out.println("O tigre está dormindo.");
	}
	@Override
	public void caminhar() {
		System.out.println("O tigre está caminhando.");
	}
	@Override
	public void correr() {
		System.out.println("O tigre está correndo.");
	}
	@Override
	public void emitirSom () {
		System.out.println("O tigre está rugindo.");
	}
	
 {

 }
}
