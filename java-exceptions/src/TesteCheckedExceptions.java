import java.io.FileNotFoundException;

public class TesteCheckedExceptions {
    public static void main(String[] args) {

        try {
            exemploChecked();
        }catch (FileNotFoundException e){
            System.out.println("Deu ruim aqui! " + e.getMessage());
        }

    }

    public static void exemploChecked() throws FileNotFoundException{
        throw new FileNotFoundException("Segura a bomba aí!");
    }

    public static void exemploUnchecked(){
        throw new RuntimeException("Deu ruim!!");
    }
}
