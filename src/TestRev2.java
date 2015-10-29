import hsa.*;

public class TestRev2 
{
    public static void main(String[] args) 
    {
        Console c = new Console();
        
        String survey[][] = {
            {"BOB", "C"},
            {"SUE", "C"},
            {"JOE", "V"},
            {"AMY", "S"},
            {"GREG", "S"},
            {"TOM", "C"},
            {"JACK", "C"},
        };
        
        String cpeople[] = countFlavor(survey, "C");
        String vpeople[] = countFlavor(survey, "V");
        String speople[] = countFlavor(survey, "S");
        
        c.println("Here are the survey results: \n");
        
        c.println("CHOCOLATE\n==============");
        for(int x = 0; x < cpeople.length; x ++)
            c.println(cpeople[x]);
        
        c.println("\nVANILLA\n==============");
        for(int x = 0; x < vpeople.length; x ++)
            c.println(vpeople[x]);
        
        c.println("\nSTRAWBERRY\n==============");
        for(int x = 0; x < speople.length; x ++)
            c.println(speople[x]);
            
    }
    
    public static String[] countFlavor(String d[][], String f)
    {
        //count how big the array needs to be
        int count = 0;
        
        for(int x = 0; x < d.length; x ++)
        {
            if(d[x][1].equals(f)) count ++;
        }
        
        //create name array
        String names[] = new String[count];
        
        count = 0;
        //go through again and build list of names
        for(int x = 0; x < d.length; x ++)
        {
            if(d[x][1].equals(f)) 
            {
                //add the name to the list
                names[count] = d[x][0];
                
                count ++; //go to next location in names
            }
        }
        
        return names;
    }
}
