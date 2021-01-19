package codingtest;

import java.util.ArrayList;

public class Bluemoon_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getPrime(100));
		
	}
	
	public static ArrayList<Integer> getPrime(int n){
		
		ArrayList<Integer> primeArr = new ArrayList<Integer>();
		int cnt = 0;
		int sum = 0;
		boolean [] primeChk = new boolean[n+1];
		
		for(int i=2; i<=n; i++) {
			if(primeChk[i] == false) {
				cnt += 1;
				primeArr.add(i);
				sum += i;
			}
			
			for(int j=i*2; j<=n; j+=i) {
				primeChk[j] = true;
			}
		}
		
		System.out.println(sum + " 총합");
		System.out.println(cnt + "개");
		
		
		return primeArr;
				
	}

}
