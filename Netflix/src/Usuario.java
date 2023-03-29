
public class Usuario {
	private String email;
	private String senha;
	private String telefone;
	private String idioma;
	private String criança;
	
	public Usuario() {
		System.out.println("Menu de Usuario iniciado");
	}
		
				
	//métodos
		public String getemail () {
			return this.email;
		}
		public void setemail (String opcao) {
			this.email = opcao;
			
		}
		public String getsenha() {
			return this.senha;
		}
		public void setsenha (String opcao ) { 
			this.senha = opcao;
			
		}
		public String gettelefone () {
			return this.telefone;
		}
		public void settelefone (String opcao) {
			this.telefone = opcao;
			
		}
		public String getidioma () {
			return this.idioma;
			
		}
		public void setidioma(String opcao) {
			this.idioma = opcao;
		}
		public String getcriança () {
			return this.criança;
			
		}
		public void setcriança (String opcao) {
			this.criança =  opcao;
			
		}
				
	
	
	
}

