
public class Suporte {
	private String duvida;
	private String erro;
	private String conversa;
	private String privacidade;
	private String cancelar;
	
	public Suporte() {
		System.out.println("Menu de Suporte iniciado");
	}			
	
		//métodos
		public String getduvida () {
			return this.duvida;
		}
		public void setduvidas (String opcao) {
			this.duvida = opcao;
			
		}
		public String geterro() {
			return this.erro;
		}
		public void seterro (String opcao ) { 
			this.erro = opcao;
			
		}
		public String getconversa () {
			return this.conversa;
		}
		public void setconversa (String opcao) {
			this.conversa = opcao;
			
		}
		public String getprivacidade () {
			return this.privacidade;
			
		}
		public void setprivacidade(String opcao) {
			this.privacidade = opcao;
		}
		public String getcancelar () {
			return this.cancelar;
			
		}
		public void setcancelar (String opcao) {
			this.cancelar =  opcao;
			
		}
				
	
	
	
}

