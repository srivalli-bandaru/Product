package Com;

public class Prime {
	static boolean prime(int n) {
		boolean b=false;
		int f=0;
		
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)
				f++;
		}
		if(f==1 || n==2)
			b=true;
		else
			b=false;
	    
		return b;
}


public static void main(String args[]) {
	if (prime(3))
		System.out.println("true");
}
}