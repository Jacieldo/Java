package um;

public class Primeiro {
    private static Integer variavel = 1;
    private Integer escopoClasse = 1;

    
    public static Integer metodoEstatico(){
        return variavel;
    }

    public void metodoPublico() {
        System.out.println(escopoClasse);
        escopoClasse = 2;
        System.out.println(escopoClasse);
        System.out.println(" ");
    }
    
    public void alteraVariavel(){
        System.out.println(escopoClasse);
        escopoClasse += 2;
        System.out.println(escopoClasse);
        System.out.println(" ");
    }
}
