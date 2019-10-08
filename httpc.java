import java.net.*;
import java.io.*;
class httpc
{
	public static void main(String args[]) throws IOException
	{
		Socket s=new Socket(InetAddress.getByName("127.0.0.1"),3000);
		DataOutputStream ds=new DataOutputStream(s.getOutputStream());
		DataInputStream di=new DataInputStream(System.in);
		DataInputStream dn=new DataInputStream(s.getInputStream());
		System.out.println("Enter URL/HTTP Server to request: ");
		String y=di.readLine();
		ds.writeUTF(y);
		ds.flush();
		while(true)
		{
			String m=dn.readUTF();
			System.out.println(m);
		}
	}
}
