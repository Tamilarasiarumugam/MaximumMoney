package Practice;

public class MaximumMoney {
	
	public static int money(int n,int k)
	{
		if(n%2==0)
			return (n/2)*k;
		else
			return (n/2+1)*k;
	}
	public static void main(String[] args)
	{
		int n=7;
		int k=10;
		System.out.println(money(n,k));
	}

}
