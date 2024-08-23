package entidade;
	
	public class ContaCorrente extends Conta{
	
		private double limite;
		
		public ContaCorrente(int numero, String nome, double saldo, double limite) {
			super(nome, numero, saldo, limite);
			this.limite = limite;
		}
		
		public String toString() {
			return "ContaCorrente" + mostrar() + "limite" + limite + "";
		}

}
