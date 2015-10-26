import hsa.*;

public class TestRev1 
{
    static Console c;
    public static void main(String[] args) 
    {
        c = new Console();
        
        String ath[] = {"Bob", "Sue", "Joe", "Amy", "Fred", "Kim"};
        
        double times[][] = {
            {18.2, 19.1, 18.5},
            {17.5},
            {21.5, 21.2, 20.5, 21.1, 19.5},
            {19.5, 18.9},
            {20.5},
            {14.3, 12.3, 11.8, 10.1}
        };
        
        stats(ath, times);
        
        //get an array of averages for each athlete
        double avg[] = getAvg(times);
        
        //print the averages
        for(int x = 0; x < avg.length; x ++)
        {
            c.print(ath[x] + "\t");
            c.println(avg[x]);
        }
    }
    
    public static void stats(String a[], double t[][])
    {
        //loop through 4 athletes
        for(int x = 0; x < a.length; x ++)
        {
            c.print(a[x] + "\t");
            //print all times beside for each athlete
            
            for(int y = 0; y < t[x].length; y ++)
            {
                c.print(t[x][y] + "\t");
            }
            
            c.println(""); //force a new line
        }
    } //ends stats method
    
    public static double[] getAvg(double t[][])
    {
        double result[] = new double[t.length];
        //loop through each inner array
        double total;
        
        for(int x = 0; x < t.length; x ++)
        {
            total = 0;
            
            for(int y = 0; y < t[x].length; y ++)
            {
                total += t[x][y];
            }
            
            result[x] = total / t[x].length; //calculate average and add to array
        }
        
        return result;
    }
    
} //end the class
