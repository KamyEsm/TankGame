package Object;

public class Tank extends MovableObject implements IMovableObject{
    private int CurentHp;
    private int MaxHp;

    public Tank(int CurentHp, int MaxHp) {}


    public boolean SetMaxHp(int MaxHp) {
        if(MaxHp >0 && MaxHp <= 10) {
            this.MaxHp = MaxHp;
            return true;
        }
        return false;
    }


    public boolean SetCurentHp(int CurentHp) {
        if(CurentHp > 0 && CurentHp <= 10) {
            this.CurentHp = CurentHp;
            return true;
        }
        return false;
    }




    public int GetCurentHp() {
        return CurentHp;
    }

    public int GetMaxHp() {
        return MaxHp;
    }

    @Override
    public boolean Collision(GameObject other) {
        return false;
    }

    @Override
    public boolean Destroy(GameObject other) {
        return false;
    }


    @Override
    public void Next(Runnable R) {
        new Thread(R).start();
    }

    @Override
    public void Reduction(int reduction) {
        this.CurentHp -= reduction;
    }

    @Override
    public void Increase(int increase) {
        this.CurentHp += increase;
    }


}
