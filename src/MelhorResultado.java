public class MelhorResultado {
    public static void main(String[] args) {
        int nota = 3;

        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota<7 ? "Recuperação" : "Reprovado";
        //após interrogação identifica a opcao True, senão vai pra condição falsa
        System.out.println(resultado);
    }
}
