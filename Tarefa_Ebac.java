public class Tarefa_Ebac {
    public static void main(String[] args) {
        matemática();
        adicaoDePontos();
        possiveisNotas();
        mediaGeral();
    }

    private static void matemática() {
        System.out.println("*** resultado ****");
        int num1 = 7;
        int num2 = 5;
        boolean isSoma = num1 > num2;
        System.out.println("Soma: " + isSoma);

        boolean isIgual = num1 == num2;
        System.out.println("Igual: " + isIgual);

        boolean isMenor = num1 < num2;
        System.out.println("Reprovado: " + isMenor);

        boolean isMaiorIgual = num1 >= num2;
        System.out.println("Aprovado: " + isMaiorIgual);
        //1...10
        boolean isDentro7 = num1 >= 1 && num1 <= 7;
        System.out.println("Aprovado: " + isDentro7);

        //1...10
        boolean isDentro_7 = num1 >= 1 || num1 <= 6;
        System.out.println("Aprovado: " + isDentro_7);

        boolean isMenorIgual = num1 <= 1 || num1 <= 1;
        System.out.println("Recuperação: " + isMenorIgual);
    }

    public static void adicaoDePontos() {
        System.out.println("*** pontoAdicional ****");

        int num1 = 1;
        System.out.println(num1);

        num1++;
        System.out.println(num1);

        num1--;
        System.out.println(num1);
    }


    private static void possiveisNotas() {
        System.out.println("*** futurasNotas ****");
        int numero1 = 5;
        int numero2 = 7;
        int numero3 = numero1 + numero2;
        System.out.println(numero3);
        numero3 /= numero3;
        int numero4 = numero3 + 3;
        System.out.println(numero3);
        System.out.println(numero4);
    }

       public static void mediaGeral() {
        System.out.println("*** mediaMaterias ****");
        int num1 = 6;
        int num2 = 5;
        int num3 = 8;
        int num4 = 3;
        int num5 = 7;
        int num6 = 7;
        int num8 = (num1 + num2 + num3 + num4 + num5 + num6)/6;


        System.out.println("geografia: " + num1);
        System.out.println("historia: " + num2);
        System.out.println("portugues: " + num3);
        System.out.println("quimica: " + num4);
        System.out.println("fisica: " + num5);
        System.out.println("filosofia: " + num6);

        System.out.println("*** resultadoDaMediaTotal ****");


        System.out.println("mediaTotal: " + num8);

        boolean isMaiorIgual = num1 >= num2;
        System.out.println("aprovado: " + isMaiorIgual);

         boolean isMenor = num8 < num2;
                 System.out.println("reprovado: " + isMenor);



    }
}