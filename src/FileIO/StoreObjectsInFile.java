package FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class StoreObjectsInFile {
	public static void storeObject(Employee e) throws IOException{
		File f = new File("File3.txt");
		FileOutputStream os = new FileOutputStream(f);
		if (!f.exists())
			f.createNewFile();
		
		ObjectOutputStream obs = new ObjectOutputStream(os);
		obs.writeObject(e);
	}
	
	public static void displayObject() throws IOException, ClassNotFoundException
	{
		FileInputStream is = new FileInputStream(new File("File3.txt"));
		ObjectInputStream obis = new ObjectInputStream(is);
		Employee e = (Employee) obis.readObject();
		System.out.println(e.getName());
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Employee e = new Employee();
		e.setId(20);
		e.setName("gaurav");
		storeObject(e);
		displayObject();
		
	}
}


class Employee implements Serializable {
	int id;
	String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
