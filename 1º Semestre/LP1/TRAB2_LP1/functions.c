#include <stdio.h>
#include <string.h>
#include <locale.h>
#include "functions.h"

void Func1(){ // MENU 1

	setlocale(LC_ALL,"");
	//pra não bugar os caracteres brasileiros (ex: Ç)
	
	int menu1=0, menu2;
    //declaração de variaveis
    
    while(menu1 == 0){
	    do{
	    	printf("MENU 1 \n \n");
		    printf("Deseja iniciar o programa? (0 - Sim / 1 - Nao) \n");
		    scanf("%d", &menu1);   
			
			if(menu1 != 0 && menu1 != 1) {
				printf("\nCodigo invalido\n");
			}
			 
		}while(menu1 != 0 && menu1 != 1);
	
		if(menu1 == 0){
	    //caso o usuario digite o valor 0 (SIM), chamará a função menu 2
	    	Func2();
		}else{
		//caso o usuario digite o valor 1, o programa se encerrará.
			menu2 = 1;
		}
	}
}

void Func2(){ // MENU 2
	
	int menu1=0, menu2=0, menuAux, idade, salario, escolaridade, vagas[5] = {5,3,2,1,2}, idadeCheck = 0, sexoCheck = 0, salCheck = 0, escolaridadeCheck = 0, aceitar, aviso=0;
	char sexo;
	
	candidato User;
	
	Vagas vaga[5];
	
	lerArquivo(vaga);
	
	while(menu1==0) {
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
		    
	    switch(menuAux) {
	    	case 0:
			    printf("\nDigite sua idade: \n");
			    scanf("%d", &User.idade);
			    idadeCheck = 1; // a variavel idadeCheck é utilizada para no menu 4 verificar se todas as informações foram digitadas		    
		    	break;
		    
		    case 1:
		    	printf("\nDigite o seu sexo (m - masculino ou f - feminino): \n");
			    scanf("%s", &User.sexo);
			    sexoCheck = 1; // a variavel sexoCheck é utilizada para no menu 4 verificar se todas as informações foram digitadas
				break;
				
			case 2:
				printf("\nDigite sua pretensão salarial: \n");
			    scanf("%d", &User.salario);
			    salCheck = 1; // a variavel salCheck é utilizada para no menu 4 verificar se todas as informações foram digitadas
			    break;
			    
			case 3:
				printf("\nQual o seu nível de escolaridade? \n");
		    	printf("0 - Fundamental completo  \n");
		    	printf("1 - Ensino médio completo \n");
		    	printf("2 - Superior completo     \n");
		    	scanf("%d", &User.escolaridade);
		    	escolaridadeCheck = 1; // a variavel escolaridadeCheck é utilizada para no menu 4 verificar se todas as informações foram digitadas
		    	break;
		    	
		    case 4:
		    	if(escolaridadeCheck == 0 || salCheck == 0 || idadeCheck == 0 || sexoCheck ==0 ){
		        // caso o usuario não tenha preenchido alguma das informações, o programa solicitara que ele retorne e faça isso (Utilizando as variaveis check)
					printf("Você precisa preencher todas as informações");
			    }else{
			   	//caso estejam devidamente preenchidas 
	
				   	if(User.salario<=1500 && User.idade>=18 && User.sexo == 'f' && User.escolaridade > 0 && vagas[0]>0){
				   	//caso as informações digitadas batam com as requisições da vaga, ela será mostrada ao usuario
				   		printf("\nHá vagas de RECEPCIONISTA disponíveis\ndeseja aceitar a vaga? (1 - Sim ou 2 - Nao)\n");
				   		scanf("%d", &aceitar);
				   		if(aceitar == 1){
				   		//caso o usuario aceite a vaga, a vaga em questão terá uma vaga a menos para o próximo usuario
					   	    vagas[0] = vagas[0] - 1;
					   	    aviso = 1;
					   	    //a variavel aviso recebe o valor 1, desta maneira, não entrará no meu IF da linha 128 que mostra a mensagem "Sem vagas disponiveis"
						}
					}
					
					if(User.salario<=900 && 16 <= User.idade <= 20 && User.sexo == 'm' && User.escolaridade >= 0 && vagas[1]>0){
					    printf("\nHá vagas de AJUDANTE GERAL disponiveis\nDeseja aceitar a vaga? (1- Sim ou 2 - Nao)\n");
						scanf("%d", &aceitar);
						if(aceitar == 1){
						    vagas[1] = vagas[1] - 1;
						    aviso = 1;
						}
					}
					
					if(User.salario<=4500 && User.idade >= 30 && User.escolaridade > 1 && vagas[2]>0){
					    printf("\nHá vagas de GERENTE DE RH disponiveis\nDeseja aceitar a vaga? (1- Sim ou 2 - Nao)\n");
						scanf("%d", &aceitar);
						if(aceitar == 1){
						    vagas[2] = vagas[2] - 1;
						    aviso = 1;
						}
					}
					
					if(User.salario<=3500 && User.idade >= 25 && User.escolaridade > 1 && vagas[3]>0){
					    printf("\nHá vagas de ANALISTA DE SISTEMAS disponiveis\nDeseja aceitar a vaga? (1- Sim ou 2 - Nao)\n");
						scanf("%d", &aceitar);
						if(aceitar == 1){
					    vagas[3] = vagas[3] - 1;
					    aviso = 1;
					}else{}
					}
					if(User.salario<=1200 && 35 <= User.idade <= 50 && User.escolaridade >= 0 && vagas[4]>0){
					    printf("\nHá vagas de PORTEIRO disponiveis\nDeseja aceitar a vaga? (1- Sim ou 2 - Nao)\n");
						scanf("%d", &aceitar);
						if(aceitar == 1){
						    vagas[4] = vagas[4] - 1;
						    aviso = 1;
						}
					}
					if(aviso == 0){
					//se não estiver de acordo com nenhuma vaga, a variavel aviso continuara recebendo o valor 0, por tanto a mensagem será exibida
						printf("Não há vagas disponiveis de acordo com suas informações");
					}
			    }//fim do else
				break;
				
			case 5:
			//mostra as vagas disponiveis
	//    		printf("Recepcionista: %d\n", User.vagas[0]);
	//			printf("Ajudante geral: %d\n", User.vagas[1]);
	//    		printf("Gerente de RH: %d\n", User.vagas[2]);
	//    		printf("Analista de sistemas: %d\n", User.vagas[3]);
	//    		printf("Porteiro: %d\n", User.vagas[4]);
				mostrarVaga(vaga);			
				break;
				
			case 6:
				printf("Deseja voltar ao primeiro menu? (0 - Sim / 1 - Não)");
		        scanf("%d", &menu1);
		        //caso o usuario queira voltar ao menu 1, a var menu1 receberá o valor 0 (Valor da condição while do menu1), enquanto o menu2 receberá o valor 1 para quebrar o laço do segundo menu
		        menu2 = 1;
		        system("cls"); 
		        break;
			
			default:
			// caso o usuario digite um valor não incluso na lista de menus, o programa fará o devido alerta
	        	printf("Você só pode selecionar uma das opções acima \n");
		}
	}
}

int lerArquivo(Vagas *vaga) {
	
	FILE *arq;
	int i = 0, k = 0, cont = 0;
	char aux[25];			
	
	if((arq = fopen("vagas.txt", "r")) == NULL) return 1;
							
	// O fgets lê uma linha do arquivo e testa se não é retonado NULL, o que significaria que chegou no final do arquivo
	while((fgets(aux, sizeof(aux), arq) != NULL)){

		// Como a linha foi lida em aux com sucesso, é preciso atribuir o conteúdo no campo certo da struct
		// A primeira leitura é do "cargo"
		k = 0;
		// O while é para retirar o \n no final da string e colocar o \0 no lugar
		while(aux[k] != '\n') k++;
		aux[k] = '\0';		
		strncpy(vaga[i].cargo, aux, sizeof(vaga[i].cargo));		
		
		// Repete o processo anterior para para nível de escolaridade 
		fgets(aux, sizeof(aux), arq);
		k = 0;
		while(aux[k] != '\n') k++;
		aux[k] = '\0';		
		vaga[i].escolaridade = atoi(aux);		
		
		// Repete para sexo
		fgets(aux, sizeof(aux), arq);
		k = 0;
		while(aux[k] != '\n') k++;
		aux[k] = '\0';		
		// Como sempre é um char, a atribuição pode ser direta
		vaga[i].sexo = aux[0];		
			
		
		// Repete para idade máxima
		fgets(aux, sizeof(aux), arq);
		k = 0;
		while(aux[k] != '\n') k++;
		aux[k] = '\0';		
		vaga[i].idadeMax = atoi(aux);
				
		
		// Repete para Idade mínima
		fgets(aux, sizeof(aux), arq);
		k = 0;
		while(aux[k] != '\n') k++;
		aux[k] = '\0';		
		vaga[i].idadeMin = atoi(aux);			
		
		// Repete para Salario (atof) para float
		fgets(aux, sizeof(aux), arq);
		k = 0;
		while(aux[k] != '\n') k++;
		aux[k] = '\0';		
		vaga[i].salario = atof(aux);		
		
		// Repete para número de vagas
		fgets(aux, sizeof(aux), arq);
		k = 0;
		while(aux[k] != '\n') k++;
		aux[k] = '\0';		
		vaga[i].vagas = atoi(aux);		
			
		// Insere a linha em branco entre os cargos		
		fgets(aux, sizeof(aux), arq);
		cont++;
		i++;				
	}
			
	fclose(arq);
	
	for(i = 0; i < cont; i++){
		printf("%s\n%s\n%c\n%d\n%d\n%f\n%d\n\n", vaga[i].cargo, vaga[i].escolaridade, vaga[i].sexo, vaga[i].idadeMax, vaga[i].idadeMin, vaga[i].salario, vaga[i].vagas);
	}
	
	if((arq = fopen("vagas.txt", "w")) == NULL) return 1;
	
	for(i = 0; i < cont; i++){
		
		// Reescrevendo o arquivo com fprintf
		fprintf(arq, "%s\n", vaga[i].cargo);
		fprintf(arq, "%s\n", vaga[i].escolaridade);
		fprintf(arq, "%c\n", vaga[i].sexo);
		fprintf(arq, "%d\n", vaga[i].idadeMax);
		fprintf(arq, "%d\n", vaga[i].idadeMin);
		fprintf(arq, "%f\n", vaga[i].salario);
		fprintf(arq, "%d\n", vaga[i].vagas);
		fputs("\n", arq);
		
	}
	
	fclose(arq);
	
	return 0;			
}

void mostrarVaga(Vagas vaga[]) {
	
	int i;	
	printf("\n");	
	for(i = 0; i < 5; i++) {
		printf("%i \n", vaga[i].vagas);	
	 	
	}
		
}
