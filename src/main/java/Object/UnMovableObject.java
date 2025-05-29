package Object;

abstract public class UnMovableObject extends GameObject {
    public UnMovableObject() {
        super();
    }
    public UnMovableObject(int x, int y) {
        super(x, y);
    }
    public UnMovableObject(int x, int y, int MinSizeX, int MinSizeY, int MaxSizeX,
                           int MaxSizeY,boolean isDestroyed,boolean isMoving) {
        super(x, y, MinSizeX, MinSizeY, MaxSizeX, MaxSizeY, isDestroyed, isMoving);
    }
    @Override
    abstract public boolean Collision(GameObject other);
    @Override
    abstract public boolean Destroy(GameObject other);
}
