public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("8580220");
        } catch (CepInvalidException e) {
            System.out.println("O cep não corresponde com as regras de negócio!");
        }
    }

    static String formatarCep(String cep) throws CepInvalidException {
        if (cep.length() != 8) {
            throw new CepInvalidException();
        }

        return cep;
    }
}
