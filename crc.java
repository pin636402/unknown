import java.util.zip.CRC32;
public class crc
{ 
 	public static void main(String[] args) 
	{
        		String input = "Hello World!";
        		CRC32 crc = new CRC32();
        		crc.update(input.getBytes());
        		System.out.println("input:"+input);
        		System.out.println("CRC32:"+crc.getValue());
    	}
}
