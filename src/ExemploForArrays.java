public class ExemploForArrays {
    public static void main(String[] args) {

        //em arrays o indice inicia com 0
        String alunos [] = {"Felipe", "Jonas", "Julia", "Marcos"};

        for (int x=0; x<alunos.length;x++){
            System.out.println("O aluno no indice x= " + x + " é " + alunos[x]);
        }
    }
}
