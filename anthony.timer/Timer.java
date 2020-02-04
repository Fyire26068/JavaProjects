package anthony.timer;
//imports
import java.util.Calendar;
import java.awt.Toolkit;

/*
Anthony Garrard
2/20
Countdown Timer
*/


//Class Decleration
public class Timer{
	//Constructor
	public Timer(){
		Calendar x = Calendar.getInstance();
		x.add(Calendar.MINUTE, 1);
		while (true){
			Calendar time = Calendar.getInstance();
			int check = time.compareTo(x);
			if (check == 0){
				Runnable sound1 = (Runnable)Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.default");
				sound1.run();
				
				x = Calendar.getInstance();
				x.add(Calendar.MINUTE, 1);
			}
		}
		
	}
	
	//Main entry point
	public static void main(String[] args) {
		new Timer();
	}
	
}