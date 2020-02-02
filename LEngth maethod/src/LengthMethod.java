import java.util.*;
import javax.swing.*;
public class LengthMethod {

	public static void main(String []srgd) {
		Scanner inp=new Scanner(System.in);
		String he=JOptionPane.showInputDialog("enter your Paswword less than 8 digit");
		int l=he.length();
		//hell
	//	System.out.println(l);
		if(he.length()>8) {
			System.out.println("enter the pasword again");
		}
		else {
			System.out.println("Access Granted");
		}
	}
}
