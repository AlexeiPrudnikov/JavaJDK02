public class BackendDeveloper extends Developer implements Backender{

    public BackendDeveloper(String name) {
        super(name);
    }

    @Override
    public void getDevelopGUI() {
        CreateServer();
    }

    @Override
    public void CreateServer() {
        System.out.println(toString() + " I create server.");
    }

    @Override
    public String toString() {
        return "I am " +  getName() + ". I am Backender.";
    }
}
