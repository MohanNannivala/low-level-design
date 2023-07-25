package abstractfactory;

public class Flutter {

    public void setTheme(){
        System.out.println("Setting theme");
    }

    public void setRefreshRate(){
        System.out.println("Setting refresh rate");
    }

    public UIFactory createUIFactory(String platform){
        if(platform.equals("Android")){
            return new AndroidUIFactory();
        }else if(platform.equals("IOS")){
            return new IOSUIFactory();
        }

        return null;
    }
}
