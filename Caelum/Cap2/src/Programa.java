public class Programa {
    public static void main(String[] args) {
       /*Conta minhaConta = new Conta();
        minhaConta.titular = "Duke";
        minhaConta.numero = 12345;
        minhaConta.saldo = 1000;

        minhaConta.saca(5000);

        System.out.println(minhaConta.saldo);

        minhaConta.deposita(453);

        System.out.println(minhaConta.saldo); */




        // ********TESTANDO A REFERENCIA DO ENDEREÇO DOS OBJETOS*************

        /* Conta c1 = new Conta();
        c1.titular = "Jacieldo";
        c1.numero = 1234;
        c1.saldo = 500;

        //Conta c2 = new Conta(); //Para a comparação no if= FALSE
        Conta c2 = c1;  //Para a comparação no if = TRUE
        c2.titular = "Anna";
        c2.numero = 12364;
        c2.saldo = 5500; */

        Conta minhaConta = new Conta();
        Cliente c = new Cliente();
        minhaConta.titular = c;
        System.out.println(c);

        /* if (c1 == c2){ //c1 e c2 fazem referência a um espaço na memória e não aos valores de cada atributo. Serão iguais mesmo que se os valores dos atributos de c1 e c2 forem diferentes
            System.out.println("São iguais!");
        } else {
            System.out.println("As contas são diferentes!");
        } */
    }
}
