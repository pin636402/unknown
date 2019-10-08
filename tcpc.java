import java.io.*;
import java.net.*;
public class tcpc
{
	public static void main(String[] args) throws Exception
	{
		Socket s=new Socket("127.0.0.1",3000);
		DataOutputStream d=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			String st=br.readLine();
			d.writeUTF(st);
			if(st.equalsIgnoreCase("exit"))
				break;
		}
	}
}
