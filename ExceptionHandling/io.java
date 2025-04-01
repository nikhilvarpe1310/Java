import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class io
{
	public static void main(String args[])
	{
		System.out.println("Program started..");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try{
		br.readLine();
		}catch(IOException e){
			System.out.println(e);
			}
		System.out.println("Program ended..");
 	
	}
}