import java.io.*;
import java.net.*;
public class tcps
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket s=new ServerSocket(3000);
		Socket sc=s.accept();
		System.out.println("connected");
		DataInputStream dis=new DataInputStream(sc.getInputStream());
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			String st=dis.readUTF();
			System.out.println(st);
			if(st.equalsIgnoreCase("exit"))
				break;
		}
	}
}
