
public class Filme {
	private String minhaLista;
	private String bombando;
	private String novidade;
	private String notificaçao;
	private String download;
	
	public Filme() {
		System.out.println("Menu de Filme iniciado");
	}
		
					
	
		//métodos
		public String getminhaLista () {
			return this.minhaLista;
		}
		public void setminhaLista (String opcao) {
			this.minhaLista = opcao;
			
		}
		public String getbombando() {
			return this.bombando;
		}
		public void setbombando (String opcao ) { 
			this.bombando = opcao;
			
		}
		public String getnovidade () {
			return this.novidade;
		}
		public void setnovidade (String opcao) {
			this.novidade = opcao;
			
		}
		public String getnotificaçao () {
			return this.notificaçao;
			
		}
		public void setnotificaçao(String opcao) {
			this.notificaçao = opcao;
		}
		public String getdownload () {
			return this.download;
			
		}
		public void setdownload (String opcao) {
			this.download =  opcao;
			
		}
				
	
	
	
}

