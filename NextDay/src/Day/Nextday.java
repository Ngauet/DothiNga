package Day;
import java.io.InputStream;
import java.util.*;
public class Nextday {
	class Day{
		int day;
		int month;
		int year;
	}
	public Day NextDay(int ng, int th,int na){
		Day next= new Day();
		System.out.println("Nhap vao ngay thang nam theo thu tu:");
		next.day=ng;
		next.month=th;
		next.year=na;
		Scanner nhap = Scanner(System.in);
		ng=nhap.nextInt();
		th=nhap.nextInt();
		na=nhap.nextInt();
	if(((th==1||th==3||th==5||th==7||th==8||th==10||th ==12)&&ng<=31||((th==4||th==6||th==9||th==11)&&(ng <=30))||th==2&&(ng<=29&&((na%4==0&&na%100!=0)||(na%400==0)&&na>1812 &&na<2012))||th==2&&ng<=28) && (na>0) && (ng>0))
	{
		if((th==1||th==3||th==5||th==7||th==8||th==10||th==12)&& ng<31||((th==4||th==6||th==9|| th==11)&&ng<30)||th==2 && (ng<29&& (na%4==0 &&na%100==0)))
			System.out.println("Ngay "+ (next.day+1) +" Thang "+next.month+" Nam "+ next.year);
		else if(ng==31&&th==12)
				System.out.println("Ngay "+(next.day=1)+" Thang "+(next.month=1)+" Nam " +(next.year+1));
			 else
					System.out.println("Ngay "+(next.day=1)+" Thang "+(next.month+1)+" Nam "+next.year);
	}
	return next;
	}
}
