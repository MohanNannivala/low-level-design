package abstractfactory;

import abstractfactory.components.buttons.Button;
import abstractfactory.components.dropdowns.Dropdown;
import abstractfactory.components.menus.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createUIFactory("Android");

        Button button = uiFactory.createButton();
        Menu menu = uiFactory.createMenu();
        Dropdown dropdown = uiFactory.createDropdown();

    }
}