import java.util.*;
public  class RoomRent
{ 
	public static Scanner cho=new Scanner(System.in);
	public static DataBase db=new DataBase();
	public static NewUser nu=new  NewUser();
	public static ExUser ex=new ExUser();
	public static Show sh=new Show();
	public static ShowUser shu=new ShowUser();
	public static Search srch=new Search();
	public static char Choice;
	public static DataBaseProdect ddb=new DataBaseProdect();
	
	
	public static void main(String[] args) 
	{
		ddb.DataBaseProdect();

		db.DataBase();
		RoomRent();
	}	

	public static void RoomRent()
	{
		ex.Name="null";
		System.out.print("\n\n _______________________________________________________________________________________________________________________________________________\n");
		System.out.print("|\t\t\t\t\t\t\t----------------WelCome--------------\t\t\t\t\t\t\t|\n");
		System.out.print("|\t\t\t\t\t\t\t------RoomRent ManegMent System------\t\t\t\t\t\t\t|\n");
		System.out.print("|_______________________________________________________________________________________________________________________________________________|\n");
		System.out.print("|_______________________________________________________________________________________________________________________________________________|\n");
		System.out.print("|\t\t\t\t\t\t\t-----------Enter Your Choice---------\t\t\t\t\t\t\t|\n");
		System.out.print("|_______________________________________________________________________________________________________________________________________________|\n");
		System.out.println("|\t1.New User? Ragister\t|\t2.Existing User? Login\t|\t3.Show All\t|\t4.Search\t|\t5.Close Program\t\t|");
		System.out.print("|_______________________________|_______________________________|_______________________|_______________________|_______________________________|\n\nEnter : ");
		Choice=cho.next().charAt(0);
		switch(Choice)
		{
			case '1':
			{
				nu.NewUser();
				RoomRent();
				break;
			}
			
			case '2':
			{
				ex.ExUser();
				RoomRent();
				break; 
			}
			
			case '3': 
			{
				sh.Show();
				RoomRent();
				break;
			}

			case '4':
			{
				srch.Search();
				RoomRent();
			}
			
			case '5':
			{
				System.out.println("\nThanks for using our program");
				break;	
			}			
			case '6':
			{
				shu.ShowUser();
				RoomRent();
				break;
			}

				default :
			{
				System.out.println("\t\t\t\t\t\t\t??????????Wrong Choice :)????????\t\t\t\t\t\t\t ");
				RoomRent();
			}
		}
	}
}


class DataBase
{
	public static String [][]Data=new String[100][5];
	public static int l =Data.length;
	public static void DataBase()
	{
	    Data[0][0]="1";
		Data[0][1]="1";
		Data[0][2]="dipesh";
		Data[0][3]="khatima";
		Data[0][4]="dipeshjoshi228@gmail.com";

		Data[1][0]="1234567890";
		Data[1][1]="qwerty";
		Data[1][2]="dip";
		Data[1][3]="khatima";
		Data[1][4]="dipeshjoshi227@gmail.com";
	}	
}


class DataBaseProdect
{
	public static String [][]Data=new String[30][8];
	public static int l =Data.length;
	public static void DataBaseProdect()
	{
		Data[0][0]="1";
		Data[0][1]="dipesh";
		Data[0][2]="1000";
		Data[0][3]="One-Room";
		Data[0][4]="Monthly";
		Data[0][5]="No Kichen";
		Data[0][6]="Shared Toilet";
		Data[0][7]="Alloted     ";

		Data[1][0]="2";
		Data[1][1]="dipesh";
		Data[1][2]="1000";
		Data[1][3]="One-Room";
		Data[1][4]="Monthly";
		Data[1][5]="No Kichen";
		Data[1][6]="Shared Toilet";
		Data[1][7]="Not Alloted";

	    Data[2][0]="1";
		Data[2][1]="dipesh";
		Data[2][2]="1000";
		Data[2][3]="One-Room";
		Data[2][4]="Monthly";
		Data[2][5]="No Kichen";
		Data[2][6]="Shared Toilet";
		Data[2][7]="Not Alloted";

		Data[3][0]="1";
		Data[3][1]="dipesh";
		Data[3][2]="1000";
		Data[3][3]="One-Room";
		Data[3][4]="Monthly";
		Data[3][5]="No Kichen";
		Data[3][6]="Shared Toilet";
		Data[3][7]="Not Alloted";

		Data[4][0]="1";
		Data[4][1]="dipesh";
		Data[4][2]="1000";
		Data[4][3]="One-Room";
		Data[4][4]="Monthly";
		Data[4][5]="No Kichen";
		Data[4][6]="Shared Toilet";
		Data[4][7]="Not Alloted";

		Data[5][0]="1";
		Data[5][1]="dipesh";
		Data[5][2]="1000";
		Data[5][3]="One-Room";
		Data[5][4]="Monthly";
		Data[5][5]="No Kichen";
		Data[5][6]="Shared Toilet";
		Data[5][7]="Not Alloted";
	}
}


class NewUser  
{
	public static Scanner l= new Scanner(System.in);
	public static ExUser ex=new ExUser();
	public static Show sh=new Show();
	public static char x;
	public static RoomRent rr=new RoomRent();
	public static Ragistretion r=new Ragistretion();

	public static void NewUser()
   {
		System.out.print(" _______________________________________________________________________________________________________________________________________________\n");
		System.out.print("|\t\t\t\t\t\t\t-----------Enter Your Choice---------\t\t\t\t\t\t\t|\n");
		System.out.print("|_______________________________________________________________________________________________________________________________________________|\n");
		System.out.println("|\t\t1.Register\t\t|\t\t2.Login\t\t|\t\t3.Show All\t\t|\t4.main menu\t\t|");
		System.out.print("|_______________________________________|_______________________________|_______________________________________|_______________________________|\n\nEnter : ");
		x=l.next().charAt(0);
		switch(x)
		{
			case '1':
			{
				r.Ragistretion();
				NewUser();
				break;
			}

			case '2':
			{
				ex.ExUser();
				NewUser();
				break;
			}

			case '3':
			{
				sh.Show();
				NewUser();
				break;
			}

			case '4':
			{
				
				break;
			}

			default :
			{
				NewUser();
			}
  		}
  	}
}


class ExUser 
{
	public static String Password,Phone,Name;
	public static DataBase db=new DataBase();
	public static Scanner a=new Scanner(System.in);
	public static int i;
	public static char j;
	public static AfterLogin al=new AfterLogin();

	public static void GetUserDetials()
	{ 
		for(i=0;i<db.l;i++)
		{
			if (Phone.equals(db.Data[i][0])) 
			{
				GetPassword();
				if (db.Data[i][1].equals(Password)) 
				{
					Name=db.Data[i][2];
					al.AfterLogin();
					i=db.l+1;
				}
				else 
				{
					System.out.print("\t\t\t\t\t\t\t-----------Worng Password---------\t\t\t\t\t\t\t\n\n");
					GetPhone();
					break;
				}
			}

			if (i==(db.l-1))
			{
				System.out.println("\t\t\t\t\t\t\t-----------Worng Phone---------\t\t\t\t\t\t\t\n\n");
				System.out.print(" _______________________________________________________________________________________________________________________________________________\n");
				System.out.println("|\t\t\t\t1.Go Home\t\t\t\t|\t\t\t\t2.ReTry\t\t\t\t\t|");
				System.out.print("|_______________________________________________________________________|_______________________________________________________________________|\n\nEnter : ");
		
				j=a.next().charAt(0);
				switch (j) 
				{
					case '1':
					{
						break;
					}

					case '2':
					{
						GetPhone();
						break;
					}

					default :
					{
						System.out.println("\t\t\t\t\t\t\t-----------Worng Choice---------\t\t\t\t\t\t\t\n");
						ExUser();
					}
				}
			}
		}
	}

	public static void GetPhone()
	{
		System.out.print("Enter Your Phone Number : ");
		Phone=a.next();
		GetUserDetials();
	}

	public static void GetPassword()
	{
		System.out.print("Enter Password : ");
		Password=a.next();
	}

	public static void ExUser()
	{
		System.out.print(" _______________________________________________________________________________________________________________________________________________\n");
		System.out.print("|\t\t\t\t\t\t\t-----------Welcome To Login---------\t\t\t\t\t\t\t|\n");
		System.out.print("|_______________________________________________________________________________________________________________________________________________|\n\n");
		GetPhone();
	}
}


class Show
{
	public static int i,j,k,m=4,f=0,zx;
	public static char s;
	public static DataBaseProdect db=new DataBaseProdect();
	public static Scanner l=new Scanner(System.in);
	public static ExUser ex=new ExUser();
	public static NewUser nu=new NewUser();
	public static AddNew ad=new AddNew();
	
	public static void Slect()
	{
		System.out.println("\nEnter What Room You Choice To Allotment");
		zx=l.nextInt();
		f=zx-1;
		SlectConfirm();
	}

	public static void SlectConfirm()
	{
		if (db.Data[f][7].equals("Alloted     "))
		{
			System.out.println("\t\t\t\t\t\t\t-----------Sorry Alredy Alloted---------\t\t\t\t\t\t\t\n\n");
			System.out.print(" _______________________________________________________________________________________________________________________________________________\n");
			System.out.println("|\t\t\t1.Reslect\t\t\t|\t\t2.Show\t\t|\t\t\t3.Go Back\t\t\t|");
			System.out.print("|_______________________________________________________|_______________________________|_______________________________________________________|\n\nEnter : ");
			s=l.next().charAt(0);
			switch (s) 
			{
				case '1':
				{
					Slect();
					break;
				}

				case '2':
				{
					Show();
					break;
				}

				case '3':
				{
					break;
				}

				default:
				{
					System.out.println("\t\t\t\t\t\t\t-----------Worng Choice Try Again---------\t\t\t\t\t\t\t\n\n");
					Slect();
					break;
		
				}
			}
		}
		else 
		{
			System.out.println("\n\t\tYou Slect\n");
			System.out.println(" _______________________________\t");
		  	System.out.println("|\t"+db.Data[f][0]+"\t\t\t|\t");
		  	System.out.println("|\t"+db.Data[f][1]+"\t\t\t|\t");
		  	System.out.println("|\t"+db.Data[f][2]+"\t\t\t|\t");
		  	System.out.println("|\t"+db.Data[f][3]+"\t\t|\t");
	  		System.out.println("|\t"+db.Data[f][4]+"\t\t\t|\t");
	 	 	System.out.println("|\t"+db.Data[f][5]+"\t\t|\t");
		  	System.out.println("|\t"+db.Data[f][6]+"\t\t|\t");
		  	System.out.println("|\t"+db.Data[f][7]+"\t\t|\t");
	  		System.out.println("|_______________________________|\t");
	  		Confirm();
		}
	}

	public static void Confirm()
	{
		System.out.println("\t\t\t\t\t\t\t-----------Confirm It ---------\t\t\t\t\t\t\t\n\n");
		System.out.print("\n _______________________________________________________________________________________________________________________________________________\n");
		System.out.println("|\t\t\t\t1.Yes\t\t\t\t\t|\t\t\t\t2.No\t\t\t\t\t|");
		System.out.print("|_______________________________________________________________________|_______________________________________________________________________|\n\nEnter : ");
	  	String cn=l.next();
	  	switch(cn)
	  	{
	  		case "1":
	  		{
	  			//System.out.println(f);
	  			db.Data[f][7]="Alloted     ";
	  			System.out.println("\t\t\t\t\t\t\t-----------Thank For Choice A Room---------\t\t\t\t\t\t\t\n");
				Show();
				break;
	  		}

	  		case "2":
	  		{
	  			No();
	  			break;
	  		}

	  		default:
	  		{
	  			System.out.println("\t\t\t\t\t\t\t-----------Sorry :( Worng Choice ...---------\t\t\t\t\t\t\t\n\n");
	  			Confirm();
	  		}
	  	}
	}

	public static void No()
	{
		System.out.print(" _______________________________________________________________________________________________________________________________________________\n");
		System.out.println("|\t\t\t1.ReChoice\t\t\t|\t\t2.Show\t\t|\t\t\t3.Go Back\t\t\t|");
		System.out.print("|_______________________________________________________|_______________________________|_______________________________________________________|\n\nEnter : ");
		char z=l.next().charAt(0);
		switch(z) 
		{
			case '2':
			{
				Show();
				break;
			}

			case '1':
			{
				Slect();
				break;
			}

			case '3':
			{
				break;
			}

			default:
			{
				No();
			}
		}
	}

	public static void Show()
	{
		System.out.println("\n");
		m=3;f=0;
		for (i=0;i<db.l;i++) 
		{
			for (j=0;j<8;j++) 
			{
				if(m<db.l)
				if (db.Data[i][j]!=null)
				{
					for (k=f;k<m;k++)
					if (db.Data[k][j]!=null)
					System.out.print(" _______________________________\t\t");
					k=f;if (db.Data[k][j]!=null)
					System.out.print("\n");
					for (k=f;k<m;k++)
					if (db.Data[k][j]!=null)
					System.out.print("|\t"+db.Data[k][0]+"\t\t\t|\t\t");
					k=f;if (db.Data[k][j]!=null)
					System.out.print("\n");
					for (k=f;k<m;k++)
					if (db.Data[k][j]!=null)
					System.out.print("|\t"+db.Data[k][1]+"\t\t\t|\t\t");
					k=f;if (db.Data[k][j]!=null)
					System.out.print("\n");
					for (k=f;k<m;k++)
					if (db.Data[k][j]!=null)
					System.out.print("|\t"+db.Data[k][2]+"\t\t\t|\t\t");
					k=f;if (db.Data[k][j]!=null)
					System.out.print("\n");
					for (k=f;k<m;k++)
					if (db.Data[k][j]!=null)
					System.out.print("|\t"+db.Data[k][3]+"\t\t|\t\t");
					k=f;if (db.Data[k][j]!=null)
					System.out.print("\n");
					for (k=f;k<m;k++)
					if (db.Data[k][j]!=null)
					System.out.print("|\t"+db.Data[k][4]+"\t\t\t|\t\t");
					k=f;if (db.Data[k][j]!=null)
					System.out.print("\n");
					for (k=f;k<m;k++)
					if (db.Data[k][j]!=null)
					System.out.print("|\t"+db.Data[k][5]+"\t\t|\t\t");
					k=f;if (db.Data[k][j]!=null)
					System.out.print("\n");
					for (k=f;k<m;k++)
					if (db.Data[k][j]!=null)
					System.out.print("|\t"+db.Data[k][6]+"\t\t|\t\t");
					k=f;if (db.Data[k][j]!=null)
					System.out.print("\n");
					for (k=f;k<m;k++)
					if (db.Data[k][j]!=null)
					System.out.print("|\t"+db.Data[k][7]+"\t\t|\t\t");
					k=f;if (db.Data[k][j]!=null)
					System.out.print("\n");
					for (k=f;k<m;k++)
					if (db.Data[k][j]!=null)
					System.out.print("|_______________________________|\t\t");
					if (db.Data[k][j]!=null)
					{
						System.out.print("\n");
						System.out.print("\n");
					}
					f=k;
					m=m+k;
				}
			}
		}

		System.out.print("\n\n\n _______________________________________________________________________________________________________________________________________________\n");
		System.out.println("|\t\t\t\t1.Allote A Room\t\t\t\t|\t\t\t\t2.Back\t\t\t\t\t|");
		System.out.print("|_______________________________________________________________________|_______________________________________________________________________|\n\nEnter : ");
		s=l.next().charAt(0);
		switch(s) 
		{
			case '1':
			{
				if (ex.Name.equals("null")) 
				{
					System.out.println("\t\t\t\t\t\t\t-----------Login First---------\t\t\t\t\t\t\t\n\n");
					nu.NewUser();
				}
				else
				Slect();
			}
			
			case '2': 
			{
				break;
			}
			
			default:
			{
				Show();
			}
		}			
	}	
}


class Search
{
	public static Scanner l=new Scanner(System.in);
	public static char rm;
	public static int i,j;
	public static String rn;
	public static DataBaseProdect db=new DataBaseProdect();

	public static void Search()
	{
		db.DataBaseProdect();
	   System.out.println("\n\t\t\tEnter Your Choice\n\n1.Search By Room\t\t2.Search By Rent\t\t3.Back To Home");
	   char Choice=l.next().charAt(0);
	   switch (Choice) 
	   {
			case '1':
			{
				Room();
				Search();
				break;
			}   	

			case '2':
			{
				Rent();
				Search();
				break;
			}

			case '3':
			{
				break;
			}	

			default:
			{
				Search();
			}
	   }
	}

	public static void Room()
	{
		System.out.print("\n\t\t\t\tselect any one\n\n1.One-Room\t\t2.Two-Room\t\t3.Three-Room\t\t4.Four-Room\n");
		rm=l.next().charAt(0);
		System.out.print("\n\n");
		System.out.print("__________________________________________________________________________________________________________________________________________\n");
		System.out.print("Rent\t\tNumber Of Room\t\tTime\t\tKichen Detials\t\tToilet Detials\t\tOwner Name\tSlecting Number\n\n");
		System.out.print("__________________________________________________________________________________________________________________________________________\n");
		
		switch(rm)
		{
			case '1':
			{
				for (i=0;i<db.l;i++) 
				{	if (db.Data[i][1]!=null)
					{
						if(db.Data[i][1].equals("One-Room"))
						{
							for (j=0;j<7;j++) 
							{
								System.out.print(db.Data[i][j]+"\t\t");
							}
							System.out.print("\n__________________________________________________________________________________________________________________________________________\n");
		
						}
					}
				}break;
			}

			case '2':
			{
				for (i=0;i<db.l;i++) 
				{	if (db.Data[i][1]!=null)
					{
						if(db.Data[i][1].equals("Two-Room"))
						{
							for (j=0;j<7;j++) 
							{
								System.out.print(db.Data[i][j]+"\t\t");
							}
							System.out.print("\n__________________________________________________________________________________________________________________________________________\n");
		
						}
					}
				}break;
			}

			case '3':
			{
				for (i=0;i<db.l;i++) 
				{	if (db.Data[i][1]!=null)
					{
						if(db.Data[i][1].equals("Three-Room"))
						{
							for (j=0;j<7;j++) 
							{
								System.out.print(db.Data[i][j]+"\t\t");
							}
							System.out.print("\n__________________________________________________________________________________________________________________________________________\n");
		
						}
					}
				}break;
			}

			case '4':
			{
				for (i=0;i<db.l;i++) 
				{	if (db.Data[i][1]!=null)
					{
						if(db.Data[i][1].equals("Four-Room"))
						{
							for (j=0;j<7;j++) 
							{
								System.out.print(db.Data[i][j]+"\t\t");
							}
							System.out.print("\n__________________________________________________________________________________________________________________________________________\n");
		
						}
					}
				}	
			}break;

			default:
			{
				Room();
			}
		}
	}

	public static void Rent()
	{
		System.out.print("\n\nEnter Rent : ");
		rn=l.next();
		for (i=0;i<db.l;i++) 
		{	
			if (db.Data[i][0]!=null)
			{
				if(db.Data[i][0].equals(rn))
				{
					for (j=0;j<7;j++) 
					{
						System.out.print(db.Data[i][j]+"\t\t");
					}
					System.out.print("\n__________________________________________________________________________________________________________________________________________\n");
		
				}
			}	
		}	
	}
}


class ShowUser
{
	public static int i,j=1,k;
	public static DataBase db=new DataBase();
	public static void ShowUser()
	{
		Desain();
		for (i=0;i<10;i++) 
		{
			if (db.Data[i][j]!=null) 
			{
				k=j;
				System.out.println("|\t"+db.Data[i][0]+"\t|\t"+db.Data[i][1]+"\t\t|\t"+db.Data[i][2]+"\t\t|\t"+db.Data[i][3]+"\t\t|\t"+db.Data[i][4]+"\t\t|");
			}
	
			if (db.Data[i][k]!=null)
			{
				System.out.println("|_______________________|_______________________|_______________________|_______________________|_______________________________________________|");
			}
		}
	}	

	public static void Desain()
	{

		System.out.println(" _______________________________________________________________________________________________________________________________________________");
		System.out.println("|\tPhone\t\t|\tPassWord\t|\tName\t\t|\tAddress\t\t|\t\tEmail\t\t\t\t|");
		System.out.println("|_______________________|_______________________|_______________________|_______________________|_______________________________________________|");
	}
}


class Ragistretion
{
	public static Scanner l= new Scanner(System.in);
	public static String Name,Addresss,Email,Phone,Password,PasswordAgain;	
	public static DataBase db=new DataBase();
	public static int i,j;
	public static NewUser nu=new  NewUser();

	public static void GetName()
	{
		System.out.print("Enter Name : ");
		Name=l.next();
		if (Name.length()>=3) 
		{
			for (i=0;i<db.l;i++) 
			{
				if (db.Data[i][2]==null) 
				{
					j=i;
					db.Data[i][2]=Name;
					GetPhone();
					break;
				}
			}
		}
		else
		{
			System.out.println("Name Is To Short Plz Re Try..");
			GetName();
		}	
	}

	public static void GetPhone()
	{
		System.out.print("Enter 10 Digit Phone Number : ");
		Phone=l.next();	
		if(Phone.length()==10)	
		{
			db.Data[j][0]=Phone;
			GetEmail();
		}
		else 
		{
			System.out.println("Phone Number Is Only 10 Digit  Plz Re Try...");
			GetPhone();
		}
	}

	public static void GetEmail()
	{
		System.out.print("Enter Email : ");
		Email=l.next();
		if(Email.length()>11)
		{
			db.Data[j][4]=Email;
			GetAddresss();
		}
		
		else
		{
			System.out.println("wrong... \nMust Use  \"@gmail.com\" ");
			GetEmail();
		}
	}

	public static void GetAddresss()
	{
		System.out.print("Enter Full Addresss : ");
		Addresss=l.next();
		db.Data[j][3]=Addresss;
		GetPassword();
	}

	public static void GetPassword()
	{
		System.out.print("Enter Password Must Have 6 Digit : ");
		Password=l.next();
		if (Password.length()>=6) 
		{
			GetPasswordAgain();
		}
		
		else 
		{
			System.out.println("Password Is to Short Re Try");
			GetPassword();
		}
	}

	public static void GetPasswordAgain()
	{
		System.out.print("Enter Password Again : ");
		PasswordAgain=l.next();
		if(PasswordAgain.equals(Password))
		{
			db.Data[j][1]=Password;
			System.out.println("\n\t\t\t\t\t\t\t--------SecussFull Ragister-------\t\t\t\t\t\t\t\n");
		}
		else
		{
			System.out.println("Password Not Mach :) Try Again");
			GetPassword();
		}
	}

	public static void Ragistretion()
	{
		db.DataBase();
		System.out.print(" _______________________________________________________________________________________________________________________________________________\n");
		System.out.print("|\t\t\t\t\t\t\t--------Welcome To Ragistration-------\t\t\t\t\t\t\t|\n");
		System.out.print("|_______________________________________________________________________________________________________________________________________________|\n\n");
		GetName();	
	}
}		


class AfterLogin
{
	public static DataBase db=new DataBase();
	public static Scanner l= new Scanner(System.in);
	public static char i;
	public static char j;
	public static Show sh=new Show();
	public static RoomRent rr=new RoomRent();
	public static Search srch=new Search();
	public static AddNew ad=new AddNew();
	public static ExUser ex=new ExUser();
	

	public static void LoginAfter()
	{
		System.out.println(" __________________");
		System.out.println("| Welcome : "+ex.Name+" |");
		System.out.println("|__________________|");
		System.out.print(" _______________________________________________________________________________________________________________________________________________\n");
		System.out.print("|\t\t\t\t\t\t\t-----------Enter Your Choice---------\t\t\t\t\t\t\t|\n");
		System.out.print("|_______________________________________________________________________________________________________________________________________________|\n");
		System.out.println("|\t\t1.Show\t\t|\t\t2.Search\t\t|\t3.Edit Your Entry\t\t|\t4.Logout..\t\t|");
		System.out.print("|_______________________________|_______________________________________|_______________________________________|_______________________________|\n\nEnter : ");
		j=l.next().charAt(0);
		switch (j) 
		{
			case '1':
			{
				sh.Show();
				LoginAfter();
				break;
			}

			case '2':
			{
				srch.Search();
				LoginAfter();
				break;
			}

			case '3':
			{
				Edit();
				LoginAfter();
				break;
			}

			case '4':
			{
				
				break;
			}

			default :
			{
				LoginAfter();
				break;
			}
		}
	}


	public static void Edit()
	{
		System.out.println(" ________________");
		System.out.println("| Hello : "+ex.Name+" |");
		System.out.println("|________________|");
		System.out.print(" _______________________________________________________________________________________________________________________________________________\n");
		System.out.print("|\t\t\t\t\t\t\t-----------Enter Your Choice---------\t\t\t\t\t\t\t|\n");
		System.out.print("|_______________________________________________________________________________________________________________________________________________|\n");
		System.out.println("|\t\t1.Show\t\t|\t\t2.Add New\t\t|\t\t3.Search\t\t|\t4.Back To Home\t\t|");
		System.out.print("|_______________________________|_______________________________________|_______________________________________|_______________________________|\n\nEnter : ");
		i=l.next().charAt(0);
		switch (i) 
		{
			case '1':
			{
				sh.Show();
				Edit();
				break;
			}

			case '2':
			{
				ad.AddNew();
				Edit();
				break;
			}

			case '3':
			{
				srch.Search();
				Edit();
				break;
			}

			case '4':
			{
				
				break;
			}

			default :
			{
				Edit();
				break;
			}
		}
	}

	public static void AfterLogin()
	{
		System.out.print("\n _______________________________________________________________________________________________________________________________________________\n");
		System.out.print("|\t\t\t\t\t\t\t-----------Login secussFull---------\t\t\t\t\t\t\t|\n");
		System.out.print("|_______________________________________________________________________________________________________________________________________________|\n\n");
		LoginAfter();
	}
}


class AddNew
{
	public static Scanner l= new Scanner(System.in);
	public static String Rent,RoomsDetials,RoomsTimeDetials,KichenDetials,ToiletDetials;	
	public static DataBaseProdect db=new DataBaseProdect();
	public static ExUser ex=new ExUser();
	public static Ragistretion r=new Ragistretion();
	public static int i,j;
	public static char rd;

	
	public static void GetRoomsDetials()
	{
		System.out.println("\n\t\tWhich Type Of Your Room\n\n1.One-Room\t\t2.Two-Room\t\t3.Three-Room\t\t4.Four-Room ");
		rd=l.next().charAt(0);
		switch (rd) 
		{
			case '1':
			{
				RoomsDetials="One-Room";
				for (i=2;i<db.l;i++) 
				{
					if (db.Data[i][1]==null) 
					{
						j=i; 
						db.Data[i][1]=RoomsDetials;
						GetRent();
						break;
					}
				}
				break;
			}
		
			case '2':
			{
				RoomsDetials="Two-Room";
				for (i=2;i<db.l;i++) 
				{
					if (db.Data[i][1]==null) 
					{
						db.Data[i][1]=RoomsDetials;
						GetRent();
						break;
					}
				}
				break;
			}
	
			case '3':
			{
				RoomsDetials="Three-Room";
				for (i=2;i<db.l;i++) 
				{
					if (db.Data[i][1]==null) 
					{
						db.Data[i][1]=RoomsDetials;
						GetRent();
						break;
					}
				}break;
			}
		
			case '4':
			{
				RoomsDetials="Four-Room";
				for (i=2;i<db.l;i++) 
				{
					if (db.Data[i][1]==null) 
					{
						db.Data[i][1]=RoomsDetials;
						GetRent();
						break;
					}
				}
				break;
			}

			default :
			{
				break;
			}
		}
	}

	public static void GetRent()
	{
		System.out.print("\n\nWhat Is The Rent Of Your Room : ");
		Rent=l.next();
		for (i=0;i<db.l;i++) 
		{
			if (db.Data[i][0]==null) 
			{
				db.Data[i][0]=Rent;
				db.Data[i][5]=ex.Name;
				db.Data[i][6]=Integer.toString(i+1);
				db.Data[i][7]="Not Alloted";
				GetRoomsTimeDetials();
				break;
			}
		}
	}

	public static void GetRoomsTimeDetials()
	{
		System.out.println("\n\n\t\tWhat Is The Time Duretion On Your Roomom");
		System.out.println("\n1.Monthly\t\t2.Night-Day\t\t3.Night-Only");
		rd=l.next().charAt(0);
		switch (rd) 
		{
			case '1':
			{
				for (i=2;i<db.l;i++) 
				{
					if(db.Data[i][2]==null)
					{
						db.Data[i][2]="Monthly";
						GetKichendetials();
						break;
					}
				}break;
			}

			case '2':
			{
				for (i=2;i<db.l;i++) 
				{
					if(db.Data[i][2]==null)
					{
						db.Data[i][2]="Night-Day";
						GetKichendetials();
						break;
					}
				}break;
			}

			case '3':
			{
				for (i=2;i<db.l;i++) 
				{
					if(db.Data[i][2]==null)
					{
						db.Data[i][2]="Night-Only";
						GetKichendetials();
						break;
					}
				}break;
			}

			default :
			{
				GetRoomsTimeDetials();
				break;
			}
		}
	}

	public static void GetKichendetials()
	{
		System.out.println("\n\nEnter Kichen Detials\n\n1.Atteched With Room\t\t2.Not Atteched In Room\t\t3.No Kichen");
		rd=l.next().charAt(0);
		switch (rd) 
		{
			case '1':
			{
				for (i=2;i<db.l;i++) 
				{
					if(db.Data[i][3]==null)
					{
						db.Data[i][3]="Atteched With Room";
						GetToiletDetials();
						break;
					}
				}break;
			}

			case '2':
			{
				for (i=2;i<db.l;i++) 
				{
					if(db.Data[i][3]==null)
					{
						db.Data[i][3]="Not Atteched In Room";
						GetToiletDetials();
						break;
					}
				}break;
			}

			case '3':
			{
				for (i=2;i<db.l;i++) 
				{
					if(db.Data[i][3]==null)
					{
						db.Data[i][3]="No Kichen";
						GetToiletDetials();
						break;
					}
				}break;
			}

			default:
			{
				GetKichendetials();
				break;
			}
		}
	}

	public static void GetToiletDetials()
	{
		System.out.println("\n\nWich Type Of Toilet You Provide\n\n1.Atteched With Room\t\t2.Not Atteched In Room And Not Sheard\\t\t3.Sheard Toilet");
		rd=l.next().charAt(0);
		switch (rd) 
		{
			case '1':
			{
				for (i=0;i<db.l;i++) 
				{
					if(db.Data[i][4]==null)
					{
						db.Data[i][4]="Atteched With Room";
						break;
					}
				}break;
			}

			case '2':
			{
				for (i=0;i<db.l;i++) 
				{
					if(db.Data[i][4]==null)
					{
						db.Data[i][4]="Not-Attached-Not-Sheard";
						break;
					}
				}break;
			}

			case '3':
			{
				for (i=0;i<db.l;i++) 
				{
					if(db.Data[i][4]==null)
					{
						db.Data[i][4]="Sheard Toilet";
						break;
					}
				}break;
			}

			default:
			{
				GetToiletDetials();
				break;
			}
		}
	}

	public static void AddNew()
	{
		GetRoomsDetials();
	}
}