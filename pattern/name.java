package pattern;
public class name
{
	int i,j,s;
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
					ini=1;}
					temp=s;
					while(s!=0)
					{System.out.print(" ");
					s--;}
					System.out.print(syb+"\n");
                   s=temp;
				   s--;
				}

			}

	   }
   }




}
