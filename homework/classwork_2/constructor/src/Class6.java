public class Class6{
    private float x;
    private float y;
    Class6(){
    }

    Class6(float x){
        this.x = x;
    }

    Class6(float x,float y){
        this.x = x;
        this.y = y;
    }

    public float Method1(float x, float y)
    {
        if (x == 0)
            return y;
        if (y == 0)
            return x;

        if (x == y)
            return x;

        if (x > y) {
            return Method1(x - y, y);
        }
        else {
            return Method1(x, y-x);
        }

    }

    public float Method2(float x, float y) {
        return (x * y) / Method1(x, y);
    }
}
