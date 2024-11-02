package src.edu.thales.primeirasemana;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int ano = 2021;
        ano = 2022;

//        final String BR = "Brasil";
//        BR = "Brazil";

        String meuNome = "Thales";

        int anoFabricacao = 2024;

        boolean trueOrFalse = true;

        String primeiroNome = "Thales";
        String segundoNome = "Alencar";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}