	   	//herança
public class Assinatura {
	
	;
	private String formasDePag;
	private String cobranca;
	private String prePago;
	private String acesso;
	private String plano;
	
		public Assinatura() {
			System.out.println("Menu de Assinatura iniciado");
		}
		/*public Assinatura (String formasDePag, String prePago, String acesso, String plano, String cobranca) {
		this.formasDePag = formasDePag;
		this.prePago = prePago;
		this.acesso = acesso;
		this.plano = plano;
		this.cobranca = cobranca;
		}*/
					
	
		//métodos
		public String getformasDePag () {
			return this.formasDePag;
		}
		public void setformasDePag (String cartao) {
			this.formasDePag = cartao;
			
		}
		public String getprePago() {
			return this.prePago;
		}
		public void setprePago (String opcao ) { 
			this.prePago = opcao;
			
		}
		public String getacesso () {
			return this.acesso;
		}
		public void setacesso (String opcao) {
			this.acesso = opcao;
			
		}
		public String getcobranca () {
			return this.cobranca;
			
		}
		public void setcobranca(String opcao) {
			this.cobranca = opcao;
		}
		public String getplano () {
			return this.plano;
			
		}
		public void setplano (String opcao) {
			this.plano =  opcao;
			
		}							
}