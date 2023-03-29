import java.util.Scanner;

public class Javaflix{
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in); 
		Conta log = new Conta();
		
		int menuPrincipal;
		do {
		System.out.println("\n------------------------------------\n");
		System.out.println("Menu Principal");
		System.out.println("1- Assinatura");
        System.out.println("2- Usuário");
        System.out.println("3- Suporte");
        System.out.println("4- Filmes e Séires");
        System.out.println("0- Sair\n");
        System.out.println("Digite a Opção Escolhida:");
       		
        menuPrincipal = scanner.nextInt();
       				
		switch (menuPrincipal) {
		
		case 1:
			
		Assinatura login = new Assinatura();
			
        System.out.println("1- Formas de Pagamentos");
        System.out.println("2- Cobrança");
        System.out.println("3- Pré-Pago");
        System.out.println("4- Acesso");
        System.out.println("5- Plano\n");
        System.out.println("Digite a Opção Escolhida:");
        int menu1 = scanner.nextInt();
		
		//PRIMEIRO NÍVEL
		switch (menu1) {
			case 1:
			
			System.out.println("Qual a Forma de Pagamento?\n");
			System.out.println("1- Crédito");
	        System.out.println("2- Débito");
	        System.out.println("3- Pix");
	        System.out.println("4- Boleto\n");
	        System.out.println("Digite a Opção Escolhida:");
	        			
			Scanner scanner1 = new Scanner (System.in);
			int menu11 = scanner1.nextInt();
			//SEGUNDO NÍVEL
			switch (menu11) {
			case 1:
				login.setformasDePag("N°do Cartão de crédito: 'xxxx xxxx xxxx xxxx'");
				System.out.println("Informe o número do seu cartão:\n");
				break;
			case 2:
				login.setformasDePag("N°do Cartão de débito: 'xxxx xxxx xxxx xxxx'");
				System.out.println("Informe o número do seu cartão:\n");
				break;
			case 3:
				login.setformasDePag("Pagamento por Pix");
				System.out.println("QR code: ...\n");
				System.out.println("código: ...\n");
				break;
			case 4:
				login.setformasDePag("Pagamento por boleto");
				System.out.println("Gerando Boleto ...\n");
				
			}
			break;
		
		case 2:
			
			System.out.println("Menu:\n");
			System.out.println("1- Histórico de Cobrança");
	        System.out.println("2- Alterar Data de Cobrança\n");
	        System.out.println("Digite a Opção Escolhida:");
	        			
			Scanner scanner2 = new Scanner (System.in);
			int menu21 = scanner2.nextInt();
						
			//SEGUNDO NÍVEL
			switch (menu21) {
			case 1:
				login.setcobranca("carregando histórico");
				System.out.println("carregando histórico\n");
				break;
			case 2:
				login.setcobranca("A sua data de Pagamento é: **/**/****");
				System.out.println("Informe a Nova Data de Pagamento: __/__/__\n");
				break;
			}
			break;
			
		case 3: 
			System.out.println("Menu:\n");
			System.out.println("1- Resgatar Cartão Pré-Pago");
			System.out.println("2- Comprar Cartão Pré-Pago\n");
			System.out.println("Digite a Opção Escolhida:");
			
			Scanner scanner3 = new Scanner (System.in);
			int menu31 = scanner3.nextInt();
												
			//SEGUNDO NÍVEL
			switch(menu31) {
			
			case 1:
				login.setprePago("O código do seu cartão é: ***** ***** *****");
				System.out.println("Informe o Código do Seu Cartão Pré-Pago:\n");
				break;
			case 2: 
				System.out.println("Qual Valor: \n");
				System.out.println("1- R$ 18,90");
				System.out.println("2- R$ 25,90");
				System.out.println("3- R$ 39,90");
				System.out.println("4- R$ 55,90\n");
				System.out.println("Digite a Opção Escolhida:");
				
				Scanner scanner4 = new Scanner (System.in);
				int menu32 = scanner4.nextInt();
																
				//TERCEIRO NÍVEL
				switch (menu32) {
				case 1:
					login.setprePago("N° do cartão de R$ 18,90: ***** ***** *****");
					System.out.println("Carregando Card no valor de  R$ 18,90...\n");
					break;
				case 2:
					login.setprePago("N° do cartão de R$ 25,90: ***** ***** *****");
					System.out.println("Carregando Card no valor de  R$ 25,90...\n");
					break;
				case 3:
					login.setprePago("N° do cartão de R$ 39,90: ***** ***** *****");
					System.out.println("Carregando Card no valor de  R$ 39,90...\n");
					break;
				case 4:
					login.setprePago("N° do cartão de R$ 55,90: ***** ***** *****");
					System.out.println("Carregando Card no valor de  R$ 55,90...\n");
					break;
				}
			}
			
			break;
		case 4: 
			System.out.println("Menu:\n");
			System.out.println("1- Gerenciar Acesso de Aparelhos");
			System.out.println("2- Deslogar Aparelhos Conectados\n");
			System.out.println("Digite a Opção Escolhida:");
			
			Scanner scanner5 = new Scanner (System.in);
			int menu41 = scanner5.nextInt();
						
			//SEGUNDO NÍVEL
			switch (menu41) {
			
			case 1:
				login.setacesso("Esse é o histórico de aparelhos conectados");
				System.out.println("Histórico de Conecções\n");
				break;
			case 2: 
				
				System.out.println("Realmente Quer Deslogar os Aparalhos?\n");
				System.out.println("1- SIM");
				System.out.println("2- NÃO\n");
				System.out.println("Digite a Opção Escolhida:");
				Scanner scanner6 = new Scanner (System.in);
				int menu42 = scanner6.nextInt();
				
				if(menu42 == 1) {	
					login.setacesso("Não há aparelhos conectados.");
					System.out.println("TODOS OS APARELHOS SERÃO DESLOGADOS.\n");		
				}else {
					break;
				}
			}
			
			break;
		case 5:
			System.out.println("Selecione o Plano Desejado:\n");
			System.out.println("1- Básico com Anúncio - R$ 18,90");
			System.out.println("2- Básico - R$ 25,90");
			System.out.println("3- Padrão - R$ 39,90");
			System.out.println("4- Premium R$ 55,90\n");
			System.out.println("Digite a Opção Escolhida:\n");
			
			Scanner scanner7= new Scanner (System.in);
			int menu51 = scanner7.nextInt();
						
			//SEGUNDO NÍVEL
			switch (menu51) {
			
			case 1:
				login.setplano("Seu plano atual é o Básico com anúncio no valor de R$ 18,90");
				System.out.println("Parabéns Pelo Contrado do Plano Básico com Anúncio - R$ 18,90\n");
				break;
				
			case 2:
				login.setplano("Seu plano atual é o Básico com anúncio no valor de R$ 25,90");
				System.out.println("Parabéns Pelo Contrado do Plano Básico - R$ 25,90\n");
				break;
				
			case 3:
				login.setplano("Seu plano atual é o Básico com anúncio no valor de R$ 39,90");
				System.out.println("Parabéns Pelo Contrado do Plano Padrão - R$ 39,90\n");
				break;
				
			case 4: 
				login.setplano("Seu plano atual é o Básico com anúncio no valor de R$ 55,90");
				System.out.println("Parabéns Pelo Contrado do Plano Premium - R$ 55,90\n");
				break;				
			}
			
			break;														
		}
		break;
		
		case 2:
			int submenu1;
			do {
			System.out.println("\n-------------------------------------\n");	
			Usuario login1 = new Usuario();
			
			System.out.println("1- Alterar Email");
	        System.out.println("2- Alterar Senha");
	        System.out.println("3- Alterar Telefone");
	        System.out.println("4- Idioma");
	        System.out.println("5- Modo Criança");
	        System.out.println("0- Voltar\n");
	        System.out.println("Digite a Opção Escolhida:");
	        Scanner scanner8 = new Scanner (System.in);
			submenu1 = scanner8 .nextInt();
			
	        switch (submenu1) {
	        
	        case 1:
	        	
	        	login1.setemail("Seu Email atual é: xxxxxxxxx@gmail.com");
	        	System.out.println("Informe o novo Email: _______________@____.___\n");
	        	System.out.println("Email alterado com sucesso!\n");
	        	break;
	        
	        case 2: 
	        	
	        	System.out.println("Informe sua nova Senha:____________");
	        	System.out.println("Confirme sua nova senha:____________\n");
	        	System.out.println("Senha alterada com sucesso!\n");
	        	break;
	        	
	        case 3:
	        	        	
	        	System.out.println("Informe seu novo número:____________\n");
	        	System.out.println("Confirme o código de verificação: __.__.__.__\n");	        
	        	login1.settelefone("Seu número é (**) 9****-****");
	        	System.out.println("Número confirmado com sucesso!\n");
	        	
	        	break;
	        	
	        case 4:
	        	login1.setidioma("O idioma atual é: BR");
	        	System.out.println("\nCarregando lista de Linguagens...\n");
	        	break;
	        	
	        case 5: 
	        	
	        	System.out.println("Deseja alterar para o modo criança?\n");
	        	System.out.println("1- SIM");
	        	System.out.println("2- NÃO\n");
	        	System.out.println("Digite a opção escolhida: ");
				Scanner scanner9 = new Scanner (System.in);
				int submenu2 = scanner9 .nextInt();
	        	if (submenu2 == 1) {
	        		System.out.println("\nModo criança ativado com Sucesso!\n");
	        		break;
	        	}else {
	        		break;
	        	}
	        	default:
	        		System.out.println("Opção indisponível.");
	        		
	        		break;
	        }
						
			}while(submenu1 != 0);
			break;
					
		case 3:
			int submenu3;
			do {
			System.out.println("\n-------------------------------------\n");	
				
			Suporte login2 = new Suporte();
			
			System.out.println("\n1- Algumas dúvidas comuns");
		    System.out.println("2- Erros comuns");
		    System.out.println("3- Fale com nossa equipe de suporte");
		    System.out.println("4- Termos de privacidade");
		    System.out.println("5- Cancelar conta");
		    System.out.println("0- Voltar\n");
		    System.out.println("Digite a Opção Escolhida:\n");
		    Scanner scanner10 = new Scanner (System.in);
		    submenu3 = scanner10.nextInt();
		    
		    switch (submenu3) {
		    
		    case 1:
		    	
		    	System.out.println("Essas são as dúvidas mais comuns:\n");
		    	System.out.println("Como alterar a senha da Netflix\n");
		    	System.out.println("Recebi um email dizendo que houve um novo acesso à minha conta.\n");
		    	System.out.println("Como mudar de plano\n");
		    	System.out.println("Como assistir à Netflix na TV\n");
		    	System.out.println("Caso sua dúvida não esteja aqui, entre em contato no menu anterior.\n");
		    	break;
		    	
		    case 2:
		    	
		    	System.out.println(" Smart TV Erro tvq-rnd-100 da Netflix\n");		    			
		    	System.out.println("Mensagem da Netflix: “Este aplicativo não é compatível com seu aparelho”.\n");
		    	System.out.println("A Netflix informa que preciso me cadastrar quando tento acessar minha conta.\n");
		    	System.out.println("Como mudar de plano\n");
		    	System.out.println("Como assistir à Netflix na TV\n");
		    	System.out.println("Caso sua dúvida não esteja aqui, entre em contato no menu anterior.\n");
		    	
		    	break;
		    
		    case 3:
		    	
		    	System.out.println("Você está sendo redirecionado até um dos nossos atendentes.\n");
		    	break;
		    	
		    case 4:
		    	
		    	System.out.println("Carregando os termos de privaciadade...\n");
		    	break;
		    	
		    case 5:
		    	
		    	System.out.println("Tem certeza que deseja cancelar a conta?\n");
	        	System.out.println("1- SIM");
	        	System.out.println("2- NÃO\n");
	        	System.out.println("Digite a opção escolhida: ");
				Scanner scanner11 = new Scanner (System.in);
				int submenu4 = scanner11 .nextInt();
	        	if (submenu4 == 1) {
	        		System.out.println("\n Conta cancelada com Sucesso!\n");
	        		break;
	        	}else {
	        		break;
	        	}
	        default:
	        	System.out.println("Opção indisponível.");	        		
	        	break;
		    	
		    }
						
			}while(submenu3 != 0);
			break;
			
		case 4:
			int submenu4;
			do {
			System.out.println("\n-------------------------------------\n");
			Filme login5 = new Filme();
			
			System.out.println("1- Minha Lista");
		    System.out.println("2- Bombando");
		    System.out.println("3- Novidades");
		    System.out.println("4- Notificação");
		    System.out.println("5- Download");
		    System.out.println("0- Voltar\n");
		    System.out.println("Digite a Opção Escolhida:");
		    Scanner scanner12 = new Scanner (System.in);
		    submenu4 = scanner12.nextInt();
			
		    switch (submenu4) {
		    
		    case 1:
		    	
		    	System.out.println("Sua lista de filmes favoritos:\n");
		    	System.out.println("******, ********, ******, ******.\n");
		    	System.out.println("Sua lista de séries favoritas:\n");
		    	System.out.println("******, ********, ******, ******.\n");		    	
		    	break;
		    
		    case 2:
		    	
		    	System.out.println("Lista de filmes em alta:\n");
		    	System.out.println("******, ********, ******, ******.\n");
		    	System.out.println("Lista de séries em alta:\n");
		    	System.out.println("******, ********, ******, ******.\n");		    	
		    	break;
		    	
		    case 3:
		    	
		    	System.out.println("Filmes novidades na Netflix:\n");
		    	System.out.println("******, ********, ******, ******.\n");
		    	System.out.println("Séries novidades na Netflix:\n");
		    	System.out.println("******, ********, ******, ******.\n");		    	
		    	break;
		    	
		    case 4:
		    	
		    	System.out.println("Os filmes de Harry potter chegarão dia 15/04.");
		    	System.out.println("A pantera cor de rosa - o filme, será lançado dia 12/04.");
		    	break;
		    	
		    case 5:
		    	
		    	System.out.println("Esses são seus últimos downloads:");
		    	System.out.println("******, ********, ******, ******.\n");
		    	break;
		    			    	
		    }			
			}while(submenu4 != 0);
			break;
		}
		}while(menuPrincipal != 0);
		System.out.println("Menu finalizado, agradecemos a interação.");
		System.out.println("Qualquer erro ligue: (81) 98447-9047");
		
		scanner.close();	
	}
}
		
	
	
