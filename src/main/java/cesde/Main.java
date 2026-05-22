package cesde;

import cesde.config.Config;
import cesde.userinterface.MenuApp;

public class Main {
    public static void main(String[] args) {

        MenuApp menuApp = Config.createMenuApp();
        menuApp.mainMenu();

    }

}
