public class Student 
{
    private String name;
    private int test[] = new int[3];

    public Student(String nm, int t[])
    {
        name = nm;
        test = t;
    }
    
    public Student(Student other)
    {
        this(other.name, other.test);
    }

    public void setName(String n)
    {
        name = n;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setScore(int i, int score)
    {
        test[i - 1] = score;
    }
    
    public int getScore(int i)
    {
        return test[i - 1];
    }
    
    public int getAverage()
    {
        int avg;
        avg = (test[0] + test[1] + test[2]) / 3;
        return avg;
    }
    
//    public int getHighScore()
//    {
//        int highest = mark1;
//        
//        if(mark2 > highest)
//            highest = mark2;
//        else if(mark3 > highest)
//            highest = mark3;
//        
//        return highest;
//    }
    
    public String validateData()
    {
        String em = null;
        
        if(name.equals(""))
            em = "Name is required.";
        
        if(test[0] < 0 || test[0] > 100 || test[1] < 0 || test[1] > 100 || test[2] < 0 || test[2] > 100)
        {
            if(em == null)
                em = "At least 1 mark is out of the acceptable range.";
            else
                em += "\nAt least 1 mark is out of the acceptable range.";
        }
                
        
        if(em != null)
            em += "\nPlease re-enter all data.";
        
        return em;
    }
    
    public String toString()
    {
        String str; 
        str = "Name:\t\t" + name + "\n";
        str += "" + getAverage();
        
        return str;
    }
}
