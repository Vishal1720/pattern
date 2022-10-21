import pattern.name;
import java.io.*;
class patty
{
       public static void main(String args[])throws IOException
	   {
	   int num;
	   name ob=new name();
	   DataInputStream db=new DataInputStream(System.in);
	   System.out.println("Enter number of lines you want");
	   num=Integer.parseInt(db.readLine());
	   System.out.println("Enter symbol you want to print");
	   String sybl=db.readLine();
	   System.out.println("Enter choice \na.Easy pyramid \nb.EasyDownward pyradmid\nc.normasctriangle\nd.normdestriangle\ne.hollow rectangle\nf.Triangle pyramid");
	   System.out.print("g.downtripyramid\nh.NormalN\ni.TestZ");
	   String ope=db.readLine();
	   switch(ope)
	   {
		   
	   case "a":ob.easypyramid(num,sybl);
	          break;
	   case "b":ob.easydpyramid(num,sybl);
	   break;
	   case "c":ob.normalasctriangle(num,sybl);
	   break;
	   case "d":ob.normdestriangle(num,sybl);
	   break;
	   case "e":ob.hollowsqr(num,sybl);
	   break;
	   case "f":ob.trianglepyramid(num,sybl);
	   break;
	   case "g":ob.downtripyramid(num,sybl);
	   break;
	   case "h":ob.normalN(num,sybl);
	   break;
	   case "i":ob.testZ(num,sybl);
	   break;
	   default:System.out.println("not found");
	   }
	   }

}