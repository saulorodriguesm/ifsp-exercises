#include <stdio.h>
#include <locale.h>

//authors : Saulo Rodrigues Martins(BP3008053) e Gabriel Souza(BP3007944)

int main(){
	setlocale(LC_ALL,"");
	//pra não bugar os caracteres brasileiros (ex: Ç)
	
	int menu1=0, menu2, menuAux, idade, salario, escolaridade, vagas[5] = {5,3,2,1,2}, idadeCheck = 0, sexoCheck = 0, salCheck = 0, escolaridadeCheck = 0, aceitar, aviso=0;
	char sexo;
    //declaração de variaveis
    
    while(menu1 == 0){
    // laço usado para conseguir voltar a este menu quando eu estiver em "outra" tela
        printf("MENU 1 \n \n");
	    printf("Deseja iniciar o programa? (0 - Sim / 1 - Nao) \n");
	    scanf("%d", &menu1);
	    
	    if(menu1 == 0){
	    //caso o usuario digite o valor 0 (SIM), a variavel menu1 receberá o valor 0, iniciando o laço do menu2
	    menu2 = 0;
		}else{
		//caso o usuario digite o valor 1 (ou qualquer outro), o programa se encerrará.
			menu2 = 1;
		}
	    	
		while(menu2 == 0){
		    system("cls"); // Limpa a tela 
	        printf("MENU 2 \n \n");
	        printf("0 - Cadastrar idade\n");
	        printf("1 - Cadastrar sexo\n");
	        printf("2 - Cadastrar pretensão salarial\n");
	        printf("3 - Cadastrar nivel de escolaridade\n");
	        printf("4 - Buscar vagas\n");
	        printf("5 - Quantidade de vagas disponiveis\n");
	        printf("6 - Voltar ao menu anterior"); // Todas as opções são listadas na tela do usuario
	    
		    printf("\n\nDigite a opção desejada: \n");
		    scanf("%d", &menuAux);
		    // o programa receberá um dos valores e entrará no menu desejado
	
      		if(menuAux !=0 && menuAux !=1 && menuAux !=2 && menuAux !=3 && menuAux !=4 && menuAux !=5 && menuAux !=6){
      		// caso o usuario digite um valor não incluso na lista de menus, o programa fará o devido alerta
		        printf("Você só pode selecionar uma das opções acima \n");
		    }
		
		    if(menuAux ==0){
			    printf("\nDigite sua idade: \n");
			    scanf("%d", &idade);
			    idadeCheck = 1; // a variavel idadeCheck é utilizada para no menu 4 verificar se todas as informações foram digitadas
		    }
		
		    if(menuAux ==1){
			    printf("\nDigite o seu sexo (m - masculino ou f - feminino): \n");
			    scanf("%s", &sexo);
			    sexoCheck = 1; // a variavel sexoCheck é utilizada para no menu 4 verificar se todas as informações foram digitadas
		    }
		
		    if(menuAux ==2){
			    printf("\nDigite sua pretensão salarial: \n");
			    scanf("%d", &salario);
			    salCheck = 1; // a variavel salCheck é utilizada para no menu 4 verificar se todas as informações foram digitadas
		    }
		
	       	if(menuAux ==3){
		    	printf("\nQual o seu nível de escolaridade? \n");
		    	printf("0 - Fundamental completo  \n");
		    	printf("1 - Ensino médio completo \n");
		    	printf("2 - Superior completo     \n");
		    	scanf("%d", &escolaridade);
		    	escolaridadeCheck = 1; // a variavel escolaridadeCheck é utilizada para no menu 4 verificar se todas as informações foram digitadas
	    	}
			
		    if(menuAux ==4){
		       if(escolaridadeCheck == 0 || salCheck == 0 || idadeCheck == 0 || sexoCheck ==0 ){
		       // caso o usuario não tenha preenchido alguma das informações, o programa solicitara que ele retorne e faça isso (Utilizando as variaveis check)
			   printf("Você precisa preencher todas as informações");
			   }else{
			   	//caso estejam devidamente preenchidas 
	
			   	if(salario<=1500 && idade>=18 && sexo == 'f' && escolaridade > 0 && vagas[0]>0){
			   	//caso as informações digitadas batam com as requisições da vaga, ela será mostrada ao usuario
			   		printf("\nHá vagas de RECEPCIONISTA disponíveis\ndeseja aceitar a vaga? (1 - Sim ou 2 - Nao)\n");
			   		scanf("%d", &aceitar);
			   		if(aceitar == 1){
			   		//caso o usuario aceite a vaga, a vaga em questão terá uma vaga a menos para o próximo usuario
			   	    vagas[0] = vagas[0] - 1;
			   	    aviso = 1;
			   	    //a variavel aviso recebe o valor 1, desta maneira, não entrará no meu IF da linha 128 que mostra a mensagem "Sem vagas disponiveis"
				    }else{}
				}
				
				if(salario<=900 && 16 <= idade <= 20 && sexo == 'm' && escolaridade >= 0 && vagas[1]>0){
				    printf("\nHá vagas de AJUDANTE GERAL disponiveis\nDeseja aceitar a vaga? (1- Sim ou 2 - Nao)\n");
					scanf("%d", &aceitar);
					if(aceitar == 1){
				    vagas[1] = vagas[1] - 1;
				    aviso = 1;
					}else{}
				}
				
				if(salario<=4500 && idade >= 30 && escolaridade > 1 && vagas[2]>0){
				    printf("\nHá vagas de GERENTE DE RH disponiveis\nDeseja aceitar a vaga? (1- Sim ou 2 - Nao)\n");
					scanf("%d", &aceitar);
					if(aceitar == 1){
				    vagas[2] = vagas[2] - 1;
				    aviso = 1;
					}else{}
				}
				
				if(salario<=3500 && idade >= 25 && escolaridade > 1 && vagas[3]>0){
				    printf("\nHá vagas de ANALISTA DE SISTEMAS disponiveis\nDeseja aceitar a vaga? (1- Sim ou 2 - Nao)\n");
					scanf("%d", &aceitar);
					if(aceitar == 1){
				    vagas[3] = vagas[3] - 1;
				    aviso = 1;
					}else{}
				}
				if(salario<=1200 && 35 <= idade <= 50 && escolaridade >= 0 && vagas[4]>0){
				    printf("\nHá vagas de PORTEIRO disponiveis\nDeseja aceitar a vaga? (1- Sim ou 2 - Nao)\n");
					scanf("%d", &aceitar);
					if(aceitar == 1){
				    vagas[4] = vagas[4] - 1;
				    aviso = 1;
					}else{}
				}
				if(aviso == 0){
				//se não estiver de acordo com nenhuma vaga, a variavel aviso continuara recebendo o valor 0, por tanto a mensagem será exibida
					printf("Não há vagas disponiveis de acordo com suas informações");
				}
			    }//fim do else	   
	    	}
	    	
	    	if(menuAux ==5){
	    	//mostra as vagas disponiveis 
	    		printf("Recepcionista: %d\n", vagas[0]);
				printf("Ajudante geral: %d\n", vagas[1]);
	    		printf("Gerente de RH: %d\n", vagas[2]);
	    		printf("Analista de sistemas: %d\n", vagas[3]);
	    		printf("Porteiro: %d\n", vagas[4]);
	    	}
		
	    	if(menuAux ==6){
			    printf("Deseja voltar ao primeiro menu? (0 - Sim / 1 - Não)");
		        scanf("%d", &menu1);
		        //caso o usuario queira voltar ao menu 1, a var menu1 receberá o valor 0 (Valor da condição while do menu1), enquanto o menu2 receberá o valor 1 para quebrar o laço do segundo menu
		        menu2 = 1;
		        system("cls");
     		}
     		
     		//ao fim de todas as operações, antes do programa encerrar o usuario terá a opção de voltar a um dos menus para não perder suas informações digitadas. 
     		printf("\n\n\nVoltar ao Menu 1 (Digite 1)");
			printf("\nContinuar no Menu 2 (Digite 0)\n");
     		scanf("%d", &menu2);
     		if(menu2 != 0 && menu2 != 1){
     			printf("Apenas 0 ou 1");
     			printf("\nVoltar ao Menu 1 (Digite 1)");
				printf("\nContinuar no Menu 2 (Digite 0)\n");
     			scanf("%d", &menu2);
			 } 
			 system("cls");
     	
		}
	}
	
	return 0;
}
		
		
