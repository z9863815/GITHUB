import java.io.*;
public class AS
{
	public static void main(String[] args)
{		
		int a=0;
		String c="";
		System.out.println("�����뵱ǰ�¶�:");
try
{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		c = input.readLine();
}	
		catch(IOException e){System.out.println(e);}
		a = Integer.parseInt(c);
		
		
		
		if(a<10)
			{
			System.out.println(""+c+"���϶��е���");}
		else 
		if(a<25)
			{
			System.out.println(""+c+"���϶�������");}
		else
		if(a<35){
			System.out.println(""+c+"���϶��е���");}
		else
			System.out.println(""+c+"���϶�̫����");

}

}