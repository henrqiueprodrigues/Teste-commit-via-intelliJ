//------------------------- AULA 1--------------------------------
//tipos de declaração de variaveis
public class Tipo_de_dados {
    public static void main(String[] args) {

        int i;
        int I;
        int _1a; //ferre boas praticas começa com _
        int $aq; //fere boas praticas começa com $

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        int asrn24678md;
        int asrn24678_md = 10; //fere boas praticas usa o _

        asrn24678md = 100;

        int quantidadeProdruto = 50;
        final int NUMERO_TENTATIVAS = 5;
        int QUANTIDADE_OPCOES = 25; //ferre boas praticas variaves não finais devem usar notação camelo
        System.out.println("-----------AULA1-----------");
        System.out.println("i= " + i);
        System.out.println("I= " + I);
        System.out.println("_1a= " + _1a);
        System.out.println("$aq= " + $aq);

        System.out.println("j= " + j);
        System.out.println("asrn24678md= " + asrn24678md);
        System.out.println("asrn24678md= " + asrn24678_md);

        System.out.println("quantidadeProdruto= " + quantidadeProdruto);
        System.out.println("NUMERO_TENTATIVAS= " + NUMERO_TENTATIVAS);
        System.out.println("QUANTIDADE_OPCOES= " + QUANTIDADE_OPCOES);

    }
}
