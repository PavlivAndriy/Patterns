package Patterns.strategy;

/**
 * Created by Andriy on 1/11/2016.
 */
public class Strategy {
    public static void main(String[] args) {
            Model model;

            if (Strategy.videoAdapter()){
                model = new Model(new Graphics3D());
            } else {
                model = new Model(new Graphics2D());
            }
        model.video();
    }

    public static boolean videoAdapter(){
        return true;
    }
}
