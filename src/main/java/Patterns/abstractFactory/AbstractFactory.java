package Patterns.abstractFactory;

/**
 * Created by Andriy on 1/11/2016.
 */
public class AbstractFactory {
    public static void main(String[] args) {

        DeviceFactory deviceFactory = getFactoryByCountry("UA");
        Mouse mouse = deviceFactory.getMouse();
        Keyboard keyboard = deviceFactory.getKeyboard();
        Touchpad touchpad = deviceFactory.getTouchpad();

        mouse.click();
        keyboard.print();
        touchpad.track(10,50);


        DeviceFactory deviceFactoryEn = getFactoryByCountry("EN");
        Mouse mouseEn = deviceFactoryEn.getMouse();
        Keyboard keyboardEn = deviceFactoryEn.getKeyboard();
        Touchpad touchpadEn = deviceFactoryEn.getTouchpad();

        mouseEn.doubleClick();
        keyboardEn.println();
        touchpadEn.track(100,50);
    }

    private static DeviceFactory getFactoryByCountry(String lang) {
        if (lang.equals("UA")) {
            return new UaDeviceFactory();
        } else if (lang.equals("EN")) {
            return new EnDeviceFactory();
        }
        throw new RuntimeException("Unsupported country Code :" + lang);
    }

}
    interface Mouse{
        void click();
        void doubleClick();
        void scroll(int direction);
    }

    interface Keyboard{
        void print();
        void println();
    }

    interface Touchpad{
        void track(int deltaX, int deltaY);
    }

    interface DeviceFactory{
        Mouse getMouse();
        Keyboard getKeyboard();
        Touchpad getTouchpad();
    }

    class UaMouse implements Mouse{


        public void click() {
            System.out.println("Одне натиснення");
        }


        public void doubleClick() {
            System.out.println("Подвійне натиснення");
        }


        public void scroll(int direction) {
            if (direction > 0){
                System.out.println("Скролл вверх");
            } else if (direction < 0){
                System.out.println("Скролл вниз");
            }
            System.out.println("Не скролим");
        }
    }

    class UaKeyboard implements Keyboard{

        public void print() {
            System.out.println("Друкує");
        }

        public void println() {
            System.out.println("Друкує з переходом на інакший рядок");
        }
    }

    class UaTouchpad implements Touchpad{

        public void track(int deltaX, int deltaY) {
            int s = (int) Math.sqrt(Math.pow(deltaX,2) + Math.pow(deltaY, 2));
            System.out.println("Переміщено на " + s + " пікселів");
        }
    }

    class EnMouse implements Mouse{


        public void click() {
            System.out.println("One click");
        }


        public void doubleClick() {
            System.out.println("Double click");
        }


        public void scroll(int direction) {
            if (direction > 0){
                System.out.println("Scroll to top");
            } else if (direction < 0){
                System.out.println("Scroll to bottom");
            }
            System.out.println("Don't scroll");
        }
    }

    class EnKeyboard implements Keyboard{

        public void print() {
            System.out.println("Printing");
        }

        public void println() {
            System.out.println("Printing with new line");
        }
    }

    class EnTouchpad implements Touchpad{

        public void track(int deltaX, int deltaY) {
            int s = (int) Math.sqrt(Math.pow(deltaX,2) + Math.pow(deltaY, 2));
            System.out.println("Moved on " + s + " pixels");
        }
    }

    class UaDeviceFactory implements DeviceFactory{

        public Mouse getMouse() {
            return new UaMouse();
        }

        public Keyboard getKeyboard() {
            return new UaKeyboard();
        }

        public Touchpad getTouchpad() {
            return new UaTouchpad();
        }
    }

    class EnDeviceFactory implements DeviceFactory{

        public Mouse getMouse() {
            return new EnMouse();
        }

        public Keyboard getKeyboard() {
            return new EnKeyboard();
        }

        public Touchpad getTouchpad() {
            return new EnTouchpad();
        }
    }

