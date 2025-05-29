package Object;

public class Bullet extends MovableObject implements IMovableObject{
    private int CurentDamage;
    private int MaxDamage;



    public boolean SetCurentDamage(int CurentDamage) {
        if(CurentDamage > 0 && CurentDamage <= this.MaxDamage){
            this.CurentDamage = CurentDamage;
            return true;
        }
        return false;
    }


    public boolean SetMaxDamage(int MaxDamage) {
        if(MaxDamage > 0 && MaxDamage <= 10){
            this.MaxDamage = MaxDamage;
            return true;
        }
        return false;
    }


    public int GetCurentDamage() {
        return CurentDamage;
    }
    public int GetMaxDamage() {
        return MaxDamage;
    }

    @Override
    public void Next(Runnable R) {
        new Thread(R).start();
    }

    @Override
    public void Reduction(int reduction) {
        this.CurentDamage -= reduction;
    }

    @Override
    public void Increase(int increase) {
        this.CurentDamage += increase;
    }

    @Override
    public boolean Collision(GameObject other) {
        return false;
    }

    @Override
    public boolean Destroy(GameObject other) {
        other =null;
        System.gc();
        return true;
    }
}
