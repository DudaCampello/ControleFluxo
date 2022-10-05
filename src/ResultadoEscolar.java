public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 10;
        //variavel local
        if (nota >=7)  //controle de fluxo
            System.out.println("Aprovado");

            else if (nota>=5 && nota<7)
            System.out.println("Prova de Recuperação");

            else
            System.out.println("Reprovado");
    }
}
