package parquimetro.fundamentos.pucrs.br;

public class Parquimetro {
	// Permite inserir moedas no parquimetro (soma no saldo)
	// Valores 
	//possíveis: 1, 5, 10, 25, 50 e 100 (1 real)
	// Gera 
	//InvalidValueException no caso de valor inválido
	private double saldo;
	public void insereMoeda(double valor)
	{
		saldo = saldo+valor;
	}
	// Retorna o saldo acumulado no parquimetro
	public double getSaldo(){   
		return saldo;
	}
	// Emite um ticket de 2 reais se houver saldo disponível. 
	// Retorna true se a operação foi possível
	public boolean  emiteTicket(){ 
		return true;
	}
	// Devolve o saldo existente. Retorna o valor devolvido
	public double devolve(){
		if(saldo>0){
		return saldo;
		}
		return 0;
				
	}
}
