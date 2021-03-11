typedef struct{
	int idade;
	char sexo;
	float salario;	
	int escolaridade;			
	
}candidato;

typedef struct
{
	char cargo[20];
	int escolaridade;
	char sexo;
	int idadeMax;	
	int idadeMin;
	float salario;
	int vagas;		
} Vagas;
	
	void Func1();
	
	void Func2();
	
	int lerArquivo(Vagas *vaga);
	
	void mostrarVaga(Vagas vaga[]);

