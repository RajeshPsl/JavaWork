package JARDemo;

import java.util.Arrays;

public class Demo {

	public static void main (String[] args)
	{	
		System.out.println("Hello");	
		//Compare2Arrays();
	}


public static void Compare2Arrays()
{
	int arr1[] = {1, 2, 3};
    int arr2[] = {1, 2, 4};
    if (Arrays.equals(arr1, arr2))
    {
    	System.out.println("Same");
    }
    else
    {
    	System.out.println("Not same");
    }
}


}