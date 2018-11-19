
public class Main {

	public static void main(String[] args) {
		recsub("java",0,1);

	}
	
	public static void recsub(String str,int a,int b){
	    if(b>str.length()) {
	        System.out.println();
	        recsub(str,++a,a+1);
	    }
	    else {
	        System.out.print(str.substring(a,b)+" "); 
	    }
	    if((a+1)==str.length()) {

	    } 
	    else {
	        recsub(str,a,b+1);
	    }

}
}
