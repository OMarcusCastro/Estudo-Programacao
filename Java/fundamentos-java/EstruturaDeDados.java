import java.util.ArrayList;
import java.util.List;


public class EstruturaDeDados {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("marcus");
        nomes.add("Diego");
        
        System.out.println(nomes.get(0));
        System.out.println(nomes);

        for(String nome:nomes){
            System.out.println("O nome é:"+nome);
        }

        nomes.forEach(nome -> System.out.println(nome));
        nomes.forEach(System.out::println);


    }
}
