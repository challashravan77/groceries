package shopping1;

import java.util.Scanner;

public class grocery{
	static float bill=0;
	static int e,b,k,c;

	public  static void Shopping()
	{
		int   billing=0;
		Scanner Sc=new Scanner(System.in);
		System.out.println("welcome to shopping store");
		String name;
		float amount=0;
		System.out.println("your name");
		name=Sc.nextLine();
		System.out.println("how much is your  budget");
		String budget = Sc.nextLine();

		System.out.println("please choose the items which u want");
		System.out.println("1.electronics");
		System.out.println("2.bath");
		System.out.println("3.kitchen");
		System.out.println("4.cloths");
		System.out.println("5.others");

		int choice = 0,s;
		choice=Sc.nextInt();
		switch(choice)
		{
		case 1:
			float a=0;
			System.out.println("electronics items available here");
			System.out.println("items id\t item description\t item cost\t aval item qunty");
			System.out.println("1.1\t fan\t rs-5000\t qty=1");
			System.out.println("1.2\t  freez\t  rs-20000\t  qty=1");
			a=Sc.nextFloat();
			if(a==1.1f)
			{
				System.out.println("choosen for fan");
				System.out.println("how many u want");
				int v= Sc.nextInt();
				bill=v*5000;
				System.out.println("your bill is:"+bill);

			}
			else if(a==1.2f)
			{
				System.out.println("choosen for freez");System.out.println("how many u want");
				int g=Sc.nextInt();
				bill=g*20000;
				System.out.println("your bill is:"+bill);

			}
			else {
				System.out.println("invalid input");
			}

			break;
		case 2:
			float b1=0;
			System.out.println("bath items available here");
			System.out.println("items id\\t item description\t item cost\t aval item qunty");
			System.out.println("2.1\t shampoo bottle\t rs-500\t qty=1");
			System.out.println("2.2\t soaps\t rs-1000\t qty=10packets");
			b1=Sc.nextFloat();
			if(b1==2.1f) 
			{
				System.out.println("choosen for shampoo bottle");
				System.out.println("how many u want");
				int z=Sc.nextInt();
				bill=z*500;
				System.out.println("your bill is:"+bill);

			}
			else  if(b1==2.2f)
			{
				System.out.println("choosen for soaps");System.out.println("how many u want");
				int j=Sc.nextInt();
				bill=j*1000;
				System.out.println("your bill is:"+bill);

			}
			else {
				System.out.println("invalid input");
			}

			break;
		case 3:
			float c1=0;
			System.out.println("kitchen items available here");
			System.out.println("items id\t item description\n item cost\t aval item qunty");
			System.out.println("3.1 rice-cooker\t rs-7000\t qty-1");
			System.out.println("3.2 induction stove\t rs-1500\t qty-1");
			c1=Sc.nextFloat();

			if(c1==3.1f) {
				System.out.println("choosen for rice cooker");System.out.println("how many u want");
				int t=Sc.nextInt();
				bill=t*7000;
				System.out.println("your bill is:"+bill);

			}
			else if(c1==3.2f)
			{
				System.out.println("choosen for induction stove");System.out.println("how many u want");
				int d=Sc.nextInt();
				bill=d*7000;
				System.out.println("your bill is:"+bill);

			}
			else {
				System.out.println("invalid input");
			}
			break;
		case 4:
			float i = 0;
			System.out.println("cloth items available here");
			System.out.println("items id\n item description\t item cost\t aval item qunty");
			System.out.println("4.1\t Denim jeans\t rs-2000\t qty=3");
			System.out.println("4.2\t Denim shirt\t rs-2000\t qty=3");
			i=Sc.nextFloat();
			if(i==4.1f) 
			{
				System.out.println("choosen for denim jeans");System.out.println("how many u want");
				int u=Sc.nextInt();
                bill=u*2000;
                System.out.println("your bill is:"+bill);

			}
			else if(i==4.2f)
			{
				System.out.println("choosen for denim shirt");System.out.println("how many u want");
				int n=Sc.nextInt();
				bill=n*2000;
				System.out.println("your bill is:"+bill);

			}
			else {
				System.out.println("invalid input");
			}
			System.out.println("4.1\t Denim jeans\t rs-2000\t qty=3");
			System.out.println("4.2\t Denim shirt\t rs-2000\t qty=3");
			break;






		}


	}
	public static void bill(){
		Scanner Sc=new Scanner(System.in);

		System.out.println("Shopping bill");
		System.out.println("enter your name ");
		String customername=Sc.next();
		System.out.println("name="+customername);
		System.out.println("total amount"+bill);
		Scanner sc=new Scanner(System.in);
		sc.nextInt();
	}	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		grocery grocery=new grocery();
		grocery.Shopping();


	}
}


