package ifElseStatements;

public class ifElse {
    public static void main(String []args){
        int x=19;
        if( x < 24 )
        {
            System.out.println("This value is below 20");
        }
        else if (x==100){
            System.out.println("This is 100");
        }
        else if (x==80){
            System.out.println("This is 80");
        }
        else if (x==50){
            System.out.println("This is 50");
        }
        else{
            System.out.println("This value does not exist");
        }

    }
}
