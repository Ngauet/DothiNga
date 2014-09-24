package KTraTG;

public class Tamgiac {
	int a,b,c;
	public String Tamgiac(int a, int b,int c){
		String test = null;
		if(a<0||b<0||c<0){
			if(a<b+c && b<c+a && c<a+b){
				test="Scalene";
				if(a==b||b==c||a==c){
					test="Isosceles";
				}
				if(a==b && b==c && a==c)  test="Equilateral";
			}
		}
		else test="NotATriangle";
		return test;
	}
	public static void main(){
		int a = 0,b=0,c=0;
		Tamgiac p=new Tamgiac();
		p.Tamgiac(a, b, c);
	}
}
