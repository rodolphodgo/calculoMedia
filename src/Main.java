public class Main {
    public static void main(String[] args) {
        Integer qtd_numeros, soma, nota, lidos;
        Double media;
        System.out.print("Quantidade de números a calcular a média: ");
        qtd_numeros = Integer.parseInt(System.console().readLine());
        soma = 0;
        lidos = 0;
        while (lidos < qtd_numeros) {
            System.out.printf("Número %d: ", lidos + 1);
            nota = Integer.parseInt(System.console().readLine());
            soma = soma + nota;
            lidos = lidos + 1;
        }
        media = (double) soma / qtd_numeros;
        System.out.printf("Media dos números = %.1f\n", media);
    }
}