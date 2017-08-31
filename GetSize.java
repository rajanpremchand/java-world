import java.io.File;

class A
{
	public long getFileSize(String filename)
	{
		File file = new File(filename);
		if(!file.exists())
		{
			System.out.println("File dosen't exists");
			return -1;
		}
			return file.length();

	}

}




class GetSize
{


public static void main(String args[]){

	A obj=new A();
	long size=obj.getFileSize("D:\\EntertenmenT\\video song\\aa.mp4");//your file here
	System.out.println("File size"+size+" in bytes");

}


}