public class FormatadorCEP {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("52061070");
            System.out.println(cepFormatado);
        } catch (FormatadorExcecao e) {
            System.out.println("O CEP informado está incorreto");
        }
    }//vamos informar o metodo para formatar o CEP
    static String formatarCep(String cep) throws FormatadorExcecao{
        if(cep.length() != 8)
            throw new FormatadorExcecao();

        //simulando um CEP formatado
        return "52.061-010";
    }

}
