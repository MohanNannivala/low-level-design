package abstractfactory;

import abstractfactory.components.buttons.IOSButton;
import abstractfactory.components.dropdowns.IOSDropDown;
import abstractfactory.components.menus.IOSMenu;

public class IOSUIFactory implements UIFactory{
    @Override
    public IOSButton createButton() {
        return new IOSButton();
    }

    @Override
    public IOSDropDown createDropdown() {
        return new IOSDropDown();
    }

    @Override
    public IOSMenu createMenu() {
        return new IOSMenu();
    }
}
