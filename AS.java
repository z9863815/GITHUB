import java.io.*;
public class AS
{
	public static void main(String[] args)
{		
		int a=0;
		String c="";
		System.out.println("请输入当前温度:");
try
{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		c = input.readLine();
}	
		catch(IOException e){System.out.println(e);}
		a = Integer.parseInt(c);
		
		
		
		if(a<10)
			{
			System.out.println(""+c+"摄氏度有点冷");}
		else 
		if(a<25)
			{
			System.out.println(""+c+"摄氏度正合适");}
		else
		if(a<35){
			System.out.println(""+c+"摄氏度有点热");}
		else
			System.out.println(""+c+"摄氏度太热了");

}

}