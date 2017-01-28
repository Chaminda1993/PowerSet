import java.util.*;

public class powerSet{
    static char temp[];
    public static void main(String args[]){
        char a[]={'a','b','c','d'};
        int n=a.length;
		temp=new char[n];
        ps(a,0,n);
    }
	static int count=0;
    public static void ps(char a[],int k,int n){
        if(k<n){
            temp[k]=a[k];
        }
        if(k==n){
			System.out.print(++count+". ");
			System.out.println(Arrays.toString(temp));
        }
        if(k<n){
            ps(a,k+1,n);
            temp[k]=' ';
            ps(a,k+1,n);
        }
    }
}
