public class Class5{
    private float x;
    Class5(){
    }

    Class5(float x){
        this.x = x;
    }

    public float Method1( float x, float y){
        double shedegi = 0;
        if (y!= 0){
            shedegi = x/y + x*y;
        }
        else {
            if (x<=0){
                shedegi = Math.pow(x,4)+y;
            }
        }
        return (float) shedegi;
    }

    public float Method2( float x, float y){
        return Math.max(x, y);
    }
}
