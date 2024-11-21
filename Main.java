import java.util.ArrayList;

public class Main
{
    private ArrayList<String> memory;
    
    public Main()
    {
        memory = new ArrayList<String>();
    }

    public class TypeNum
    {
        private String type;
        private int num;
        public TypeNum(String type, int num)
        {
            this.type = type;
            this.num = num;
        }
        public String getType()
        {
            return type;
        }
        public int getNum()
        {
            return num;
        }
    }

    public TypeNum most()
    {
        int sCount = 0;
        int rCount = 0;
        int pCount = 0;
        for(int i = 0; i < memory.size(); i++)
        {
            if(memory.get(i).equals("scissors"))
            {
                sCount++;
            }
            else if(memory.get(i).equals("rock"))
            {
                rCount++;
            }
            else if(memory.get(i).equals("paper"))
            {
                pCount++;
            }
        }

        if(sCount > rCount && sCount > pCount)
        {
            return new TypeNum("scissors", sCount);
        }
        else if(rCount > sCount && rCount > pCount)
        {
            return new TypeNum("rock", rCount);
        }
        else
        {
            return new TypeNum("paper", pCount);
        }
    }

    public String output()
    {
        String list[] = {"scissors", "rock", "paper"};
        String play = list[((int)(Math.random() * 3))];

        if(memory.size() == 0)
            return play;

        

        
    }

    public void input(String opp)
    {
        memory.add(opp);
    }
}