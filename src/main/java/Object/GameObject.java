package Object;

abstract public class GameObject {
    protected int x;
    protected int y;
    private int MinSizeX;
    private int MinSizeY;
    private int MaxSizeX;
    private int MaxSizeY;
    private boolean  isDestroyed;
    private boolean isMovable;

    public GameObject() {
        this.x = 0;
        this.y = 0;
        this.MinSizeX = 0;
        this.MinSizeY = 0;
        this.MaxSizeX = 0;
        this.MaxSizeY = 0;
    }


    //----------------------------------->>>Setter
    public boolean SetX(int x) {
        if(x>=0 && x<=1920){
            this.x = x;
            return true;
        }
        return false;
    }

    public boolean SetY(int y) {
        if(y>=0 && y<=1080){
            this.y = y;
            return true;
        }
        return false;
    }

    public boolean SetMinSizeX(int MinSizeX) {
        this.MinSizeX = MinSizeX;
        return true;
    }
    public boolean SetMinSizeY(int MinSizeY) {
        this.MinSizeY = MinSizeY;
        return true;
    }

    public boolean SetMaxSizeX(int MaxSizeX) {
        this.MaxSizeX = MaxSizeX;
        return true;
    }
    public boolean SetMaxSizeY(int MaxSizeY) {
        this.MaxSizeY = MaxSizeY;
        return true;
    }

    public void SetIsDestroyed(boolean IsDestroyed) {
        this.isDestroyed = IsDestroyed;
    }

    public void SetIsMovable(boolean IsMovable) {
        this.isMovable = IsMovable;
    }

    //---------------------------->>>Getter
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }


    public int getMinSizeX() {
        return this.MinSizeX;
    }


    public int getMinSizeY() {
        return this.MinSizeY;
    }


    public int getMaxSizeX() {
        return this.MaxSizeX;
    }

    public int getMaxSizeY() {
        return this.MaxSizeY;
    }

    public boolean isDestroyed() {
        return this.isDestroyed;
    }

    public boolean isMovable() {
        return this.isMovable;
    }


    //----------------------->>>Function

    abstract public boolean Collision(GameObject other);

    abstract public boolean Destroy(GameObject other);






}
