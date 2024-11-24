import java.util.Scanner;

public class Runner 
{
    public static void main(String[] args)
    {
        Main ai = new Main();
        int bot = 0;
        int opp = 0;

        Scanner scan = new Scanner(System.in);
        String huh = "encore";

        int totalPlays = 0;
        int over = 0;
        while(true)
        {
            int plays = 0;
        while(plays < 4)
        {
            String list[] = {"scissors", "rock", "paper"};
            String oppPlay = list[((int)(Math.random() * 3))];
            String aiPlay = ai.output();
            System.out.println("opp plays - " + oppPlay);
            System.out.println("ai plays - " + aiPlay);
            if((aiPlay.equals("scissors") && oppPlay.equals("paper")) || (aiPlay.equals("rock") && oppPlay.equals("scissors")) || (aiPlay.equals("paper") && oppPlay.equals("rock")))
            {
                System.out.println("ai wins");
                bot++;
            }
            else if(aiPlay.equals(oppPlay))
            {
                System.out.println("tie");
            }
            else
            {
                System.out.println("opp wins");
                opp++;
            }
            ai.input(oppPlay);
            System.out.println("\n" + bot + " - " + opp);
            //scan.next();
            plays++;
            totalPlays++;
            if(opp >= 2)
                over++;
            System.out.println((double)over / totalPlays);
        }
        bot = 0;
        opp = 0;
        plays = 0;
        
        }
    }
}
