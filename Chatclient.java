import java.io.*;
import java.net.*;
class Chatclient{
	public static void main(String arg[]) 
	{
		try{
		Socket socket=new Socket("127.0.0.1",4545);
		PrintStream out=new PrintStream(socket.getOutputStream());
		DataInputStream in=new DataInputStream(socket.getInputStream());
		
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		String msgin="";
		
		while(!msgin.equals("bye"))
		{
			msgin=buffer.readLine();
			out.println(msgin);
		
			msgin=in.readLine();
	
			System.out.println(msgin);
		}
	}catch (Exception e){}
}
	
}