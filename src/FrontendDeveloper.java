public class FrontendDeveloper extends Developer implements Frontender{
    public FrontendDeveloper(String name) {
        super(name);
    }

    @Override
    public void getDevelopGUI() {
        CreateForm();
    }

    @Override
    public void CreateForm() {
        System.out.println(toString() + " I create form.");
    }

    @Override
    public String toString() {
        return "I am " +  getName() + ". I am Frontender.";
    }
}
