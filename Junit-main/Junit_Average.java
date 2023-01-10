package Com.demo.main;

public class Junit_Average {
	public static int average(int[]First,int n1) {
		int sum=First[0];	
		 n1=First.length;
		for (int i = 0; i < n1; i++) 
            sum += First[i];   
        return sum / n1;
    }
     
	}

