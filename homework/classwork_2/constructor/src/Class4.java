public class Class4 {
    Class4(){
        System.out.println("hello My Class");
    }

    public double Method1( int x, int y){
        double shedegi = 0;
        if (x>0){
            shedegi = Math.pow(4,x)-y;
        }
        else {
            shedegi = Math.pow(2,x)+y;
        }
        return shedegi;
    }

    public double Method2( int x, int y){
        double shedegi = 0;
        if (y>0){
            shedegi = Math.pow(4,x)+y;
        }
        else {
            shedegi = Math.pow(2,x)-y;
        }
        return shedegi;
    }
}
