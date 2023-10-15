package EdwarActivities.Entities;

public class Rectangle {
    
    private float base;
    private float height;

    public Rectangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    public Rectangle(){}

    // setters
    public void setBase(float base){
        this.base = base;
    }

    public void setHeight(float height){
        this.height = height;
    }

    // getters
    public float getBase(){
        return base;
    }

    public float getHeight(){
        return height;
    }

}
