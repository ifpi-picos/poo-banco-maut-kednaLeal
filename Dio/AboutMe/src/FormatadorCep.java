public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376504");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            e.printStackTrace();
            System.out.println("O cep não está correto");
        }
    }

    static String formatarCep (String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();
        return "23.765-064";
    }
}
