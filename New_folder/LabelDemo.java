package New_folder;

public class LabelDemo {
    public static void main(String[] args) {
        Outer:
        for(int i=1;i<=10;i++)
        {
                System.out.println("outer loop"+i);
                for(int j=1;j<=10;j++)
                {
                    if(j>i)
                    break Outer;
                }
                
        }
        System.out.println("I am outside the loop");
        }
    }
    

