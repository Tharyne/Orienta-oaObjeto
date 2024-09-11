package ClasseAbstrata;

public class PrincipalAnimais {
	
	public static void main (String [] args) {
		
		Animais Lobo = new Lobo("Snoop","macho","Lobo ibérico");
		Lobo.dormir();
		Lobo.caminhar();
		Lobo.correr();
		Lobo.emitirSom();
		
		System.out.println("-------------------------------");
		
		Animais Leao = new Leao("Marley","macho","Leao africano");
	    Leao.dormir();
		Leao.caminhar();
		Leao.correr();
		Leao.emitirSom();
		
		System.out.println("-------------------------------");
		
		Animais Tigre = new Tigre ("Chico","macho","Tigre branco");
	    Tigre.dormir();
		Tigre.caminhar();
		Tigre.correr();
		Tigre.emitirSom();
		
		System.out.println("-------------------------------");
		
		Animais Cachorro = new Cachorro ("Luna","femea","pug");
	    Cachorro.dormir();
		Cachorro.caminhar();
		Cachorro.correr();
		Cachorro.emitirSom();
		
		System.out.println("-------------------------------");
		
		Animais Gato = new Gato ("Tereza","femea","persa");
	    Gato.dormir();
		Gato.caminhar();
		Gato.correr();
		Gato.emitirSom();
		
		
		
		
		
		
	}

}
