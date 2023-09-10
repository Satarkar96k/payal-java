package New_folder;

public class BreakContinueDemo {
    //breakdemo
    public static void main(String[] args) {
        
            for(int i=1;i<=10;i++)
            {
                if(i==5)
                     break;
            
            System.out.println(i);
        }
        System.out.println("continue demo");
        for(int i=1;i<=10;i++)
        {
            if(i==5)
            continue;
            System.out.println(i);
        }
        
    }
    
}
