package New_folder;

public class NestedFor {
    public static void main(String[]args)
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
            System.out.print("\t"+j);
           }
        System.out.println("");
    }
 //reverse
 for(int i=3;i>=1;i--)   
 {
    for(int j=1;j<=i;j++)
    {
        System.out.print("\t"+j);

    }
    System.out.println("");
 }
}
}
