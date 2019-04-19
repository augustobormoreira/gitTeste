	public class Aluno extends Pessoa{
		private String rga;

		public static int quantidadeAlunos;

		public Aluno(String nome, String cpf, String rga){
			super(nome, cpf);
			this.rga = rga;
			quantidadeAlunos++;
		}

		public String getNome(){
			return super.getNome();
		}

		public void setNome(String nome){
			super.setNome(nome);
		}

		public String getCpf(){
			return super.getCpf();
		}

		public void setCpf(String cpf){
			super.setCpf(cpf);
		}

		public String getRga(){
			return rga;
		}

		public void setRga(String rga){
			this.rga = rga;
		}

		public static int getQuantidadeAlunos(){
			return quantidadeAlunos;
		}

		public static void setQuantidadeAlunos(int alunos){
			quantidadeAlunos = alunos;
		}

		public void toAluno(){
			System.out.printf("%s " , super.getNome());
		}
	}