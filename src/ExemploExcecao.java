import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
       /* Se escrever o codigo abaixo vai aparecer um erro
       No comentario consta java.lang.NumberFormatException
       usaremos o number format para tratar essa exceção
        Number valor = Double.valueOf("a1.75");
        System.out.println(valor);*/
        Number valor = null;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
