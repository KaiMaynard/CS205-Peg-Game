/*
The peg class. creates a place for storing the information about the pegs.

this will probably change as I don't really know what the end data structure will be.
*/


public class Peg
{
   private String name;//instantiation: this is the name it displays when printed using the UI class.
   private boolean isEmpty = true;//determines if the peg is empty. I added this mostly for a possible extended emptypeg class.
   private int location;  //location on the UI. might be unecessary, but I included it just incase
   
   public Peg(int loc,String nme)  //constructor, requires location on UI and a name.
	{
      location = loc;
      name = nme;
      isEmpty = false;
   }
   public Peg(Peg peg) //copy constructor if one wishes to copy a peg as a new peg.
   {
      name = peg.getName();
      location = peg.getLocation();
      isEmpty = false;
   }
   
   public void setName(String n)//setters
   {
     name = n;
   }
   
   public void setLocation(int x)
   {
      location = x;
   }
   
   public void setStatus(boolean status)
   {
      isEmpty = status;
   }
   
   public String getName()//getters
   {
      return name;
   }
   
   public int getLocation()
   {
      return location;
   }
   
   public boolean getStatus()
   {
      return isEmpty;
   }
  
}
