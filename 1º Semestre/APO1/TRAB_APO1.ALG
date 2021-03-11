Algoritmo "TRAB_APO1"
// Disciplina  : APO1
// Professor   : Sérgio
// Descrição   : Programa de controle de empregos disponíveis
// Autor(a)    : Gabriel Souza Pereira BP3007944 e Saulo Rodrigues Martins BP3008053
// Data atual  : 25/11/2019

Var

inteiro menu1=0, idadeCheck = 0, sexoCheck = 0, salCheck = 0, escolaridadeCheck = 0, aceitar, aviso=0;

Inicio

procedimento
            recepcionista: vetor[0..5] de inteiro
	         ajudante: vetor[0..3] de inteiro
	         gerenteRh: vetor[0..2] de inteiro
	         analista: vetor[0..1] de inteiro
	         porteiro: vetor[0..2] de inteiro

fimprocedimento vagas


funcao menu1Func()
       escreval("MENU 1")
       escreva("Deseja iniciar o programa? (0 - Sim / 1 - Nao)")
	    leia(menu1)

fimfuncao menu1

funcao menu2Func()
       inteiro menu2

       escreva("MENU 2")
       escreva("0 - Cadastrar idade")
       escreva("1 - Cadastrar sexo")
       escreva("2 - Cadastrar pretensão salarial")
       escreva("3 - Cadastrar nivel de escolaridade")
       escreva("4 - Buscar vagas")
       escreva("5 - Quantidade de vagas disponiveis")
       escreva("6 - Voltar ao menu anterior")

       escreva("Digite a opção desejada:")
       leia(menuAux)

fimfuncao menuAux

funcao idadeFunc()
       inteiro idade

       escreva("Digite sua idade:")
       leia(idade)

fimfuncao idade

funcao sexoFunc()
       caracter sexo

       escreva("Digite o seu sexo (m - masculino ou f - feminino):")
       leia(sexo)

fimfuncao sexo

funcao salarioFunc()
       real salario

       escreva("Digite sua pretensão salarial:")
		 leia(salario)

fimfuncao salario

funcao escolaridadeFunc()
       inteiro escolaridade

       escreva("\nQual o seu nível de escolaridade?")
       escreva("0 - Fundamental completo  ")
       escreva("1 - Ensino médio completo ")
       escreva("2 - Superior completo     ")
       leia(escolaridade)

fimfuncao escolaridade

enquanto(menu1 == 0)faca
   menu1Func()
   se(menu1 == 0)entao
      menu2 = 0
      senao
         menu2 = 1
   fimse

   enquanto(menu2 == 0)
      menu2Func()

      se(menuAux !=0 e menuAux !=1 e menuAux !=2 e menuAux !=3 e menuAux !=4 e menuAux !=5 e menuAux !=6) entao
         escreva("Você só pode selecionar uma das opções acima")
      fimse

      se(menuAux ==0)entao
         idadeFunc()
         idadeCheck = 1
      fimse

      se(menuAux ==1)entao
         sexoFunc()
         sexoCheck = 1
      fimse

      se(menuAux ==2)entao
         salarioFunc()
         salCheck = 1
      fimse

      se(menuAux ==3)entao
         escolaridadeFunc()
	    	escolaridadeCheck = 1

      se(menuAux ==4)entao
		       se(escolaridadeCheck == 0 || salCheck == 0 || idadeCheck == 0 || sexoCheck ==0 )entao
                  escreva("Você precisa preencher todas as informações");
		       senao

               se(salario<=1500 e idade>=18 e sexo == 'f' e escolaridade > 0 e vagas.recepcionista>0)entao
                  escreva("Há vagas de RECEPCIONISTA disponíveis, deseja aceitar a vaga? (1 - Sim ou 2 - Nao)")
			   	  leia(aceitar)
			   	  se(aceitar == 1)entao
                    vagas.recepcionista = vagas.recepcionista - 1
			   	    aviso = 1
			   	    //a variavel aviso recebe o valor 1, desta maneira, não entrará no meu se da linha 128 que mostra a mensagem "Sem vagas disponiveis"
                  fimse
               fimse

               se(salario<=900 e 16 <= idade <= 20 e sexo == 'm' e escolaridade >= 0 e vagas.ajudante>0)entao
                  escreva("Há vagas de AJUDANTE GERAL disponiveis, deseja aceitar a vaga? (1- Sim ou 2 - Nao)")
				  leia(aceitar)
				  se(aceitar == 1)entao
				    vagas.ajudante = vagas.ajudante - 1
				    aviso = 1
				  fimse
                fimse

				se(salario<=4500 e idade >= 30 e escolaridade > 1 e vagas.gerenteRh>0)entao
				    escreva(Há vagas de GERENTE DE RH disponiveis, deseja aceitar a vaga? (1- Sim ou 2 - Nao)")
					leia(aceitar)
					se(aceitar == 1)entao
				       vagas.gerenteRh = vagas.gerenteRh - 1
				       aviso = 1
					fimse
				fimse

				se(salario<=3500 e idade >= 25 e escolaridade > 1 e vagas.analista>0)entao
				    escreva("Há vagas de ANALISTA DE SISTEMAS disponiveis, deseja aceitar a vaga? (1- Sim ou 2 - Nao)")
					leia(aceitar)
					se(aceitar == 1)entao
				        vagas.analista = vagas.analista - 1
				        aviso = 1
					fimse
				fimse

				se(salario<=1200 e 35 <= idade <= 50 e escolaridade >= 0 e vagas.porteiro>0)entao
				    escreva("Há vagas de PORTEIRO disponiveis, deseja aceitar a vaga? (1- Sim ou 2 - Nao)")
					leia(aceitar)
					se(aceitar == 1)entao
				        vagas.porteiro = vagas.porteiro - 1
				        aviso = 1
					fimse
				fimse

				se(aviso == 0)entao
				//se não estiver de acordo com nenhuma vaga, a variavel aviso continuara recebendo o valor 0, por tanto a mensagem será exibida
					escreva("Não há vagas disponiveis de acordo com suas informações")
				fimse
            fimse



	    	se(menuAux ==5)entao
	    	//mostra as vagas disponiveis
	    		escreva("Recepcionista:" vagas.recepcionista)
				escreva("Ajudante geral:" vagas.ajudante)
	    		escreva("Gerente de RH:" vagas.gerenteRh)
	    		escreva("Analista de sistemas:" vagas.analista)
	    		escreva("Porteiro:" vagas.porteiro)
	    	fimse

	    	se(menuAux ==6)entao
			    escreva("Deseja voltar ao primeiro menu? (0 - Sim / 1 - Não)")
		        leia(menu1);
		        //caso o usuario queira voltar ao menu 1, a var menu1 receberá o valor 0 (Valor da condição while do menu1), enquanto o menu2 receberá o valor 1 para quebrar o laço do segundo menu
		        menu2 = 1
     		fimse

     		//ao fim de todas as operações, antes do programa encerrar o usuario terá a opção de voltar a um dos menus para não perder suas informações digitadas.
     		escreva("Voltar ao Menu 1 (Digite 1)")
			escreva("Continuar no Menu 2 (Digite 0)")
     		leia("menu2)

     		se(menu2 != 0 e menu2 != 1)entao
     			escreva("Apenas 0 ou 1")
     			escreva("Voltar ao Menu 1 (Digite 1)")
				escreva("Continuar no Menu 2 (Digite 0)")
     			leia("menu2)
			fimse

		fimenquanto

    fimenquanto

Fimalgoritmo