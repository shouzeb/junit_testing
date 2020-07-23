package Lab_1;

public class even_odd {

    public boolean isEven(int i){
        boolean flag=false;
        if(i%2==0)
        {
            flag=true;
        }
        else
        {
            flag =false;
        }
        return flag;
    }
    public boolean isOdd(int i){
        boolean flag=false;
        if(i%2==0)
        {
            flag=false;
        }
        else
        {
            flag =true;
        }
        return flag;
    }
}
