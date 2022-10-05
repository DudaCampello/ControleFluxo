public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;  //variavel local
        double valorSolicitado = 22.0;  //variavel local

        if (valorSolicitado < saldo) {  //controle de fluxo
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo " + saldo);
        } else
            System.out.println("Saldo Insuficiente");
        }
}
