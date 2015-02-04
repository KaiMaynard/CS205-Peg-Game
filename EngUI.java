
/*
Triangle Solitare shitty ascii UI:

basically just creates an array of peg objects, and is capable of printing them
out via the command line.

My plan is to make two UI's, one for triangular and one for english (this one being the former).

I'd love input. more updates to follow
*/

public class EngUI
{
   
   private Peg[] order;//instantiation of variables
   private int size;
   
   public EngUI(int i)  //constructor of the UI class
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
   This print function prints out the current state of the UI.

   */
   public void print()
   {
      
      System.out.println("          "+order[0].getName()+""+order[1].getName()+""+order[2].getName()+"");
      System.out.println("          "+order[3].getName()+""+order[4].getName()+""+order[5].getName()+"");
      System.out.println(""+order[6].getName()+""+order[7].getName()+""+order[8].getName()+""+order[9].getName()+""+order[10].getName()+""+order[11].getName()+""+order[12].getName()+"");
      System.out.println(""+order[13].getName()+""+order[14].getName()+""+order[15].getName()+""+order[16].getName()+""+order[17].getName()+""+order[18].getName()+""+order[19].getName()+"");
      System.out.println(""+order[20].getName()+""+order[21].getName()+""+order[22].getName()+""+order[23].getName()+""+order[24].getName()+""+order[25].getName()+""+order[26].getName()+"");
      System.out.println("          "+order[27].getName()+""+order[28].getName()+""+order[29].getName()+"");
      System.out.println("          "+order[30].getName()+""+order[31].getName()+""+order[31].getName()+"");

      
   }
}
   
   
