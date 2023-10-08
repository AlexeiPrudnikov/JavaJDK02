import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BackendDeveloper backendDeveloper = new BackendDeveloper("Luck");
        FullstackDeveloper fullstackDeveloper = new FullstackDeveloper("Karl");
        FrontendDeveloper frontendDeveloper = new FrontendDeveloper("Michael");
        List<Developer> developers = new ArrayList<>();
        developers.add(fullstackDeveloper);
        developers.add(backendDeveloper);
        developers.add(frontendDeveloper);
        for (Developer developer: developers) {
            developer.getDevelopGUI();
        }
    }
}