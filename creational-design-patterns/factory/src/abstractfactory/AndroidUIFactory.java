package abstractfactory;

import abstractfactory.components.buttons.AndroidButton;
import abstractfactory.components.dropdowns.AdroidDropDown;
import abstractfactory.components.menus.AndroidMenu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AdroidDropDown createDropdown() {
        return new AdroidDropDown();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }
}
