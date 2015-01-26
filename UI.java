
/*
Triangle Solitare shitty ascii UI:

basically just creates an array of peg objects, and is capable of printing them
out via the command line.

My plan is to make two UI's, one for triangular and one for english (this one being the former).

I'd love input. more updates to follow
*/

public class UI
{
   
   private Peg[] order;//instantiation of variables
   private int size;
   
   public UI(int i)  //constructor of the UI class
   {
      size = i;
      order = new Peg[i]; 
   }
   /*
   This adds a peg to the UI.
   */   
   public void addPeg(int i, Peg p)
   {
      order[i] = p;
   }
   /*
   This gets a specific peg stored from the array.
   */
   public Peg getPeg(int loc)
   {
      return order[loc];
   }
   /*
   This print function prints out the current state of the UI. I may play with the spacing a bit,
   but that shouldnt have any impact really.
   */
   public void print()
   {
      
      System.out.println("          "+order[0].getName());
      System.out.println("        "+order[1].getName()+"  "+order[2].getName());
      System.out.println("      "+order[3].getName()+"  "+order[4].getName()+"  "+order[5].getName());
      System.out.println("    "+order[6].getName()+"  "+order[7].getName()+"  "+order[8].getName()+"   "+order[9].getName());
      System.out.println("  "+order[10].getName()+" "+order[11].getName()+" "+order[12].getName()+" "+order[13].getName()+"  "+order[14].getName());

      
   }
}
   
   
