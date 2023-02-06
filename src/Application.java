import View.*;
import Controller.*;
import Repository.*;

public class Application {
    public static void main(String[] args) {
        View view = new View();
        Repository storage = new MemoryRepository();
        Controller ctrl = new Controller(storage, view);
        view.setController(ctrl);

        view.run();
    }
}
