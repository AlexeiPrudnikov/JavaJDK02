public class FullstackDeveloper extends Developer implements Backender, Frontender{
    public FullstackDeveloper(String name) {
        super(name);
    }

    @Override
    public void getDevelopGUI() {
        CreateServer();
        CreateForm();
    }

    @Override
    public void CreateServer() {
        System.out.println(toString() + " I create server.");
    }

    @Override
    public void CreateForm() {
        System.out.println(toString() + " I create form.");
    }

    @Override
    public String toString() {
        return "I am " +  getName() + ". I am fullstack developer.";
    }
}
