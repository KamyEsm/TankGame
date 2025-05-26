package Object;

abstract public class MovableObject extends GameObject {
    private enum Speed{
        VERYLOW, LOW, MEDIUM, HIGH, VERYHIGH,NONE;

        @Override
        public String toString() {
            if(this == VERYLOW)
                return "1";
            else if (this == LOW)
                return "2";
            else if (this == MEDIUM)
                return "3";
            else if (this == HIGH)
                return "4";
            else if (this == VERYHIGH) {
                return "5";
            } else if (this == NONE) {
                return "0";
            }
            return "-1";
        }
    }
    private Speed speed;
    private enum Rotation{
        LEFT, RIGHT,TOP, BOTTOM,NONE;
        @Override
        public String toString() {
            if (this == LEFT)
                return "1";
            else if (this == TOP)
                return "2";
            else if (this == RIGHT)
                return "3";
            else if (this == BOTTOM)
                return "4";
            else if (this == NONE)
                return "0";
            return "-1";
        }
    }
    private Rotation rotation;


    private int MaxX;
    private int MaxY;
    private int MinX;
    private int MinY;


    public MovableObject() {
        super();
        this.rotation = Rotation.NONE;
        this.speed = Speed.NONE;
    }
    public MovableObject(int x, int y, int MinSizeX, int MinSizeY,int MaxSizeX,int MaxSizeY,int Speed,int Rotation) {
        super(x, y, MinSizeX, MinSizeY, MaxSizeX, MaxSizeY);
        this.SetSpeed(Speed);
        this.SetRotation(Rotation);
    }


    public MovableObject(int x, int y, int MinSizeX, int MinSizeY,int MaxSizeX,int MaxSizeY,
                         int Speed,int Rotation,int MaxX,int MaxY,int MinX,int MinY) {
        super(x, y, MinSizeX, MinSizeY, MaxSizeX, MaxSizeY);
        this.SetSpeed(Speed);
        this.SetRotation(Rotation);
        this.SetMaxX(MaxX);
        this.SetMaxY(MaxY);
        this.SetMinX(MinX);
        this.SetMinY(MinY);
    }


    //------------------------------->>>Setter

    public boolean SetSpeed(int speed) {
        if (speed == 1){
            this.speed = Speed.VERYLOW;
            return true;
        }
        else if (speed == 2){
            this.speed = Speed.LOW;
            return true;
        }
        else if (speed == 3){
            this.speed = Speed.MEDIUM;
            return true;
        }
        else if (speed == 4){
            this.speed = Speed.HIGH;
            return true;
        }
        else if (speed == 5){
            this.speed = Speed.VERYHIGH;
            return true;
        }
        return false;
    }


    public boolean SetRotation(int rotation) {
        if (rotation == 1){
            this.rotation = Rotation.LEFT;
            return true;
        }
        else if (rotation == 2){
            this.rotation = Rotation.TOP;
            return true;
        }
        else if (rotation == 3){
            this.rotation = Rotation.RIGHT;
            return true;
        }
        else if (rotation == 4){
            this.rotation = Rotation.BOTTOM;
            return true;
        }
        return false;
    }


    public boolean SetMaxX(int MaxX) {
        if (MaxX >=0 && MaxX < 1920){
            this.MaxX = MaxX;
            return true;
        }
        return false;
    }

    public boolean SetMaxY(int MaxY) {
        if (MaxY >=0 && MaxY < 1080){
            this.MaxY = MaxY;
            return true;
        }
        return false;
    }

    public boolean SetMinX(int MinX) {
        if (MinX >=0 && MinX < 1920){
            this.MinX = MinX;
            return true;
        }
        return false;
    }

    public boolean SetMinY(int MinY) {
        if (MinY >=0 && MinY < 1080){
            this.MinY = MinY;
            return true;
        }
        return false;
    }





    //------------------------------------->>>Getter



    public String getSpeed() {
        return speed.toString();
    }

    public String getRotation() {
        return rotation.toString();
    }

    public int getMaxX() {
        return this.MaxX;
    }
    public int getMaxY() {
        return this.MaxY;
    }
    public int getMinX() {
        return this.MinX;
    }
    public int getMinY() {
        return this.MinY;
    }



    //------------------------------------->>>Function

    @Override
    abstract public boolean Collision(GameObject other);
    @Override
    abstract public boolean Destroy(GameObject other);


}
