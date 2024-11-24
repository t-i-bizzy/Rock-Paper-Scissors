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

        System.out.println(pFrequency + ", " + sFrequency + ", " + rFrequency);

        if(memory.size() < 3)
        {
            return list[((int)(Math.random() * 3))];
        }
        if(rFrequency == 1 || (sFrequency == 0 && rFrequency > 0 && pFrequency > 0))
        {
            return "paper";
        }
        if(pFrequency == 1 || (rFrequency == 0 && sFrequency > 0 && pFrequency > 0))
        {
            return "scissors";
        }
        if(sFrequency == 1 || (pFrequency == 0 && rFrequency > 0 && rFrequency > 0))
        {
            return "rock";
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