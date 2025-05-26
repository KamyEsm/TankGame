package Object;

abstract public class UnMovableObject extends GameObject {
    public UnMovableObject() {
        super();
    }
    public UnMovableObject(int x, int y) {
        super(x, y);
    }
    public UnMovableObject(int x, int y, int MinSizeX, int MinSizeY, int MaxSizeX, int MaxSizeY) {
        super(x, y, MinSizeX, MinSizeY, MaxSizeX, MaxSizeY);
    }
    @Override
    abstract public boolean Collision(GameObject other);
    @Override
    abstract public boolean Destroy(GameObject other);
}
