

public class ManipCarac {
    public static void main(String[] args) {
        int i;
        char c;
        int n;
//ESPECIFICADOR DE FORMATO PARA CARACTERE (%c)
//mostra o iésimo caractere da tabela ASCII
//ASCII - American Standard Code Information Interchange

        System.out.println("Caracteres Númericos:\n");
        for (i=48; i<=57; i++){
            System.out.printf("%C", i);
        }

        System.out.println("\n\nCaracteres Alfabéticos maiúsculos:\n");
        for (i=65; i<=90; i++){
            System.out.printf("%c", i);
        }

        System.out.println("\n\nCaracteres alfabéticos minúsculos:\n");
        for (i=97; i<=122; i++){
            System.out.printf("%c", i);
        }
        System.out.printf("\n");

/* Os caracteres são tipos ordinais, portanto, podem ser usados no controle de instruções de repetições */
        for (c='0'; c<='9'; c++){
        //Converte o caractere númerico no respectivo valor inteiro
        n = c -48;
        System.out.printf("%d X 10 = %d\n", n, (n * 10));
        }

    }
    
}
