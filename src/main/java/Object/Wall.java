package Object;

public class Wall extends UnMovableObject implements IUnMovableObject{


    @Override
    public void Reduction(int reduction) {

    }

    @Override
    public void Increase(int increase) {

    }

    @Override
    public boolean Collision(GameObject other) {
        return false;
    }

    @Override
    public boolean Destroy(GameObject other) {
        return false;
    }
}
