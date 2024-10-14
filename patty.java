import java.io.*;
 class name
{
	int i,j,s;

public void pascal(int n)
{
int i,j,k,s,pos=0;
int[] arr=new int[100];
int[] arr2=new int[100];
n=10;
arr[0]=1;
arr2[0]=1;

for(i=0;i<n;i++)
{
    for(s=0;s<n-i;s++)
    {System.out.printf("%-4s","");
    }
    pos=0;
    //calculating arr
    for(k=0;k<i+1;k++)
    {
        if(k==0 || k== i){
        arr[k]=1;
        }
        else{
            arr[k]=arr2[k]+arr2[k-1];
        }
    }
    for(j=0;j<=i;j++)
    {
arr2[pos]=arr[pos];
System.out.printf("%-4s%-4s",arr[pos],"");
pos++;
}
   System.out.println();
    }	
}

public void easypyramid(int n,String syb)
{
for(i=1;i<=n;i++)
{
    for(j=1;j<=n;j++)
	    {
		if(j<=n-i)
		System.out.print(" ");
		else
		System.out.print(syb+" ");
		
		}
		System.out.println("");
}
}

public void easydpyramid(int n,String syb)
{
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
			if(j<i)
				System.out.print(" ");
			else
				System.out.print(syb+" ");
		}System.out.println("");
	}	
}

public void normalasctriangle(int n,String syb)
{
	for(i=0;i<n;i++)
	{
		for(j=0;j<=i;j++)
		{
			System.out.print(syb);
		}System.out.println("");
	}
	
}

public void normdestriangle(int n,String syb)
{
	for(i=0;i<n;i++)
	{
		for(j=i;j<n;j++)
		{
			System.out.print(syb);
		}System.out.println("");
	}
}

public void hollowsqr(int n,String syb)
{
	for(i=1;i<=n;i++)
	{
		for (j=1;j<=n;j++)
		{
			if(i==1||j==1||i==n||j==n)
				System.out.print(syb);
			else
		System.out.print(" ");	
		}System.out.println();	
	}
}

public void trianglepyramid(int n,String syb)
{
int i,j,s;
for(i=0;i<n;i++)
{
	for(s=1;s<n-i;s++)
	{
		System.out.print(" ");
	}
    for(j=1;j<=(2*i)+1;j++)
	    {	
		System.out.print(syb);
		}
		System.out.println("");
}
}

public void downtripyramid(int n,String syb)
{
for(i=n-1;i>=0;i--)
{
	int s;
	for(s=i;s<n-1;s++)
	System.out.print(" ");
      for(j=1;j<=(2*i)+1;j++)
	  System.out.print(syb);
	  System.out.println("");
}
}

public void normalN(int n,String syb)
{
    for(i=1;i<=n;i++)
	  {
		for(j=1;j<=n;j++)
		{
                  if(j==1||j==n||i==j)
				  System.out.print(syb);
				  else
				  System.out.print(" ");
		}System.out.println();
	  }

}

public void testZ(int n,String syb)
{
	int temp,ini=0;//ini is used to get to next line for first time after printing entire line at i=1
	s=n-2;
	for(i=1;i<=n;i++)
	   {
        for(j=1;j<=n;j++)
		    {
               if(i==1||i==n)
                System.out.print(syb);
				else
				if(s!=0)
				{
					if(ini==0)//try removing ini three lines to understand why it is needed
					{System.out.println("");
					ini=1;
					}
					temp=s;
					while(s!=0)
					{System.out.print(" ");
					s--;
				    }
					System.out.print(syb+"\n");
                   s=temp;
				   s--;
				}
			}
	   }
}
   
   
   public void numberfield(int n){
	int nlines,i,j,ival,jval;
int ii=1,jj=1,nn,temp;

nlines=n+(n-1);

nn=nlines;
temp=n;
for(i=1;i<=nlines;i++){
  for(j=1;j<=nlines;j++){
    ii=1;jj=1;nn=nlines;n=temp;//reset again for while loop to work
  while(nn>=1 && n>=1){
    if(i==ii||j==jj||i==nn||j==nn)
    {
	 System.out.printf("%3d",n);
     break;     //if it is printed once we have to break
     }
    ii+=1;
    jj+=1;
    nn-=1;
    n-=1;
   }

  }  System.out.println();     
   }




}
}
class patty
{
       public static void main(String args[])throws IOException
	   {
	   int num=10;
	   String sybl="+";
	   name ob=new name();
	   DataInputStream db=new DataInputStream(System.in);
	   String ope="a";
	   while(!ope.equals("z")){
		
	   System.out.println("\na.Easy pyramid \nb.EasyDownward pyradmid\nc.normasctriangle\nd.normdestriangle\ne.hollow rectangle\nf.Triangle pyramid");
	   System.out.print("g.downtripyramid\nh.NormalN\ni.TestZ\nj.Pascal\nk.NumberFieldPattern\nz.Exit\nEnter choice ");
	   ope=db.readLine();
	   if(!ope.equals("z"))
	   {
		System.out.println("Ope "+ope);
	   System.out.println("Enter number of line a s you want");
	   num=Integer.parseInt(db.readLine());
	   }  
	   if(!ope.equals("j") && !ope.equals("k") && !ope.equals("z"))
	   {System.out.println("Enter symbol you want to print");
	   sybl=db.readLine();
	   }
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
	   case "j":ob.pascal(num);
	   break;
	   case "k":ob.numberfield(num);
	   break;
	   case "z":System.out.println("Exiting");
	   break;
	   default:{System.out.println("not found");}
	   }
	   }
	   }

}
