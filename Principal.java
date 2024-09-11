package ClasseAbstrata;

public class Principal {
	
	public static void main (String [] args) {
		
		Carro ferrari = new Carro("00000","F1","Vermelho",2023);
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.virar();
		ferrari.frear();
		
		System.out.println("-------------------------------");
		
		Onibus marcopolo = new Onibus("11111","XB1","Prata",2023);
		marcopolo.ligar();
		marcopolo.acelerar();
		marcopolo.virar();
		marcopolo.frear();
		
		System.out.println("-------------------------------");
		
		Moto BMW = new Moto("22222","X1","Preta",2023);
		BMW.ligar();
		BMW.acelerar();
		BMW.virar();
		BMW.frear();
		
		System.out.println("-------------------------------");
		
		Carro mustang = new Carro("00000","F1","Vermelho",2023);
		mustang.ligar();
		mustang.acelerar();
		mustang.virar();
		mustang.frear();


		

	}

}
