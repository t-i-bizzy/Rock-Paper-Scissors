import java.util.ArrayList;

public class Main
{
    private ArrayList<String> memory;
    
    public Main()
    {
        memory = new ArrayList<String>();
    }

    public void input(String in)
    {
        memory.add(in);
    }

    public String output()
    {
        double sFrequency = frequency("scissors");
        double rFrequency = frequency("rock");
        double pFrequency = frequency("paper");

        String list[] = {"scissors", "rock", "paper"};

        double control = .499;
        if(memory.size() < 3)
        {
            return list[((int)(Math.random() * 3))];
        }
        else if(sFrequency > control)
        {
            return "rock";
        }
        else if(rFrequency > control)
        {
            return "paper";
        }
        else if(pFrequency > control)
        {
            return "scissors";
        }
        else
        {
            return list[((int)(Math.random() * 3))];
        }
        
    }

    public double frequency(String find)
    {
        double count = 0;
        for(int i = 0; i < memory.size(); i++)
        {
            if(memory.get(i).equals(find))
            {
                count++;
            }
        }
        return count / memory.size();
    }
}