package laboratorio3.parte2;
import java.util.function.Predicate;

public class Exercicio_1 {

    public static void main(String[] args) {
     
        Predicate<Integer> verificaIdadeIdosa = idade -> idade > 65;
        System.out.println("Idosa: " + verificaIdadeIdosa.test(20));
        
    }

}