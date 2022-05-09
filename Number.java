package vd;

public class Number {

	
	    private int num;
	    Number(int num){
	        this.num=num;
	    }
	    public boolean isZero(){
	        return num == 0;
	    }
	    public boolean isPositive() {
	        return num >= 0;
	    }
	    public boolean isNegative() {
	        return num <= 0;
	    }
	    public boolean isOdd() {
	        return num%2!=0;
	    }
	    public  boolean isEven() {
	        return num%2==0;
	    }
	    public boolean isArmstrong(){
	        int temp=num;
	        int  ans=0;
	        while(num!=0){
	            ans=ans+(int)(Math.pow(num%10,3));
	            num=num/10;
	        }
	        return ans==temp;
	    }
	    public  boolean isPrime(){
	        for(int i=2;i<=Math.sqrt(num);i++){
	           if(num/i==0){
	               return false;
	           }
	        }
	        return true;
	    }
	    public  int getFactorial(){
	       int ans=1;
	       while(num!=0){
	           ans=ans*num;
	           num--;
	       }
	       return ans;
	    }
	    public  double getSqrt(){
	        return Math.sqrt(num);
	    }
	    public  double getSqure(){
	        return Math.pow(num,2);
	    }
	    public  int SumDigit(){
	        int ans=0;
	        while(num!=0){
	            ans=ans+num%10;
	            num--;
	        }
	        return ans;
	    }
	    public  int Reverse(){
	        int ans=0;
	        while(num!=0){
	            ans=ans*10+num/10;
	            num--;
	        }
	        return ans;
	    }
	    public void DisplayBinary(){
	        System.out.println(Integer.toBinaryString(num));
	    }

	}

