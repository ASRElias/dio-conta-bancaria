public class ContaCorrente
{

	private int numeroConta;
	
	private String titularConta;
	
	private double saldoConta;
	
	private double limiteConta = 100;
	
	public ContaCorrente(int numero,String titular, double saldo)
	{
		setTitularConta(titular);
		setNumeroConta(numero);
		setSaldoConta(saldo);
	}
	
	public ContaCorrente(int numero, String titular, double saldo, double limite)
	{
		setTitularConta(titular);
		setNumeroConta(numero);
		setSaldoConta(saldo);
		
		if (limite > limiteConta)
		{
			System.out.printf("\nValor m‡ximo permitido: R$ %6.2f\n",limiteConta);
		
		} else {
		
			if (limite < 0) 
			{
				System.out.printf("\nValor n‹o permitido!\n");
			
			} else {
				
				setLimiteConta(limite);
			}
		}
	}

	public ContaCorrente(int numero, String titular)
	{
		setTitularConta(titular);
		setNumeroConta(numero);
		setSaldoConta(0);
		setLimiteConta(0);
	}

	private void setNumeroConta(int numero)
	{
		if (numero < 0) 
		{
			System.out.printf("\nNœmero de conta incorreto!\n");

		} else {

			numeroConta = numero;
		}
	}
	
	private void setTitularConta(String titular)
	{
		titularConta = titular;
	}
	
	private void setSaldoConta(double saldo)
	{
		saldoConta = saldo;
	}
	
	private void setLimiteConta(double limite)
	{
		limiteConta = limite;
	}
	
	public int getNumeroConta()
	{
		return numeroConta;
	}
	
	public String getTitularConta()
	{
		return titularConta;
	}
	
	public double getSaldoConta()
	{
		return saldoConta;
	}
	
	public double getLimiteConta()
	{
		return limiteConta;
	}
	public void deposito(double deposito)
	{
		if (deposito < 0)
		{
	
			System.out.printf("\nValor inv‡lido pra dep—sitos.\n");
	
		} else {
	
			saldoConta = saldoConta + deposito;
			
			System.out.printf("\nDep—sito realizado com sucesso.\n");
		}
	}
	
	public void saque(double saque)
	{
		if (saque > (saldoConta + limiteConta))
		{
			System.out.printf("\nSaldo insuficiente!\n");
		
		} else {
			
			if (saque < 0){
			
				System.out.printf("\nValor de saque incorreto!\n");
			
			} else {
			
				saldoConta = saldoConta - saque;
				
				System.out.printf("\nSaque realizado com sucesso.\n");
			}
		}
	}
	
	public void verDados()
	{
		System.out.printf("\n=====================================");
		System.out.printf("\n Conta		: %06d", getNumeroConta());
		System.out.printf("\n Titular	: %s", getTitularConta());
		System.out.printf("\n=====================================");
	}	
	
	public void verSaldo()
	{
		System.out.printf("\n=====================================");
		System.out.printf("\n Saldo		: R$ %6.2f", getSaldoConta());
		System.out.printf("\n Limite		: R$ %6.2f", getLimiteConta());
		System.out.printf("\n=====================================");
	}
}