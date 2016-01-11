package Patterns.strategy;

/**
 * Created by Andriy on 1/11/2016.
 */
public class Model {
    private Graphics model;

    public Model(Graphics model){
        this.model = model;
    }

    public void video(){
        System.out.println(model);

    }

}
