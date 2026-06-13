 class HOD
{
     void Teach()
     {
     
        System.out.println("HOD  sir is teaching the chapter");
     }


     void Semister()
     {

        System.out.println("HOD  sir is informed all teacher semester is comeing soon");

     }
}

 class Teacher extends HOD 
{
     void Teach()
     {

        System.out.println("HOD sir is infomed student also semester is comeing soon");

     }
     void Schedule()
     {

        System.out.println("HOD sir is passed Schedule all students and Teachers on Today it self");

     }
}

public class DMD
{
  public static void main (String args[])
   {
      HOD obj1 = new Teacher();
      obj1.Semister();
      obj1.Teach();
   }
}