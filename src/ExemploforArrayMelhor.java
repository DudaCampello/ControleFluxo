public class ExemploforArrayMelhor {
    public static void main(String[] args) {
        String alunos[]={"Felipe", "Jonas", "Julia", "Marcos"};

        //os : diz que a cada intereção de alunos o aluno do indice atual vai atualizar automaticamente a variável
        for(String aluno:alunos){ //aluno é variável temporária, de escopo
            System.out.println("Nome do aluno é " + aluno);
        }
    }
}
