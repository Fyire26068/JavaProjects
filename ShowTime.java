import java.util.Calendar;

/*
Anthony Garrard
2/20
ShowTime activity
program will show current system time
*/

//Class decleration
public class ShowTime{
	//constructor
	public ShowTime(){
		System.out.println(Calendar.getInstance().getTime());
	}
	
	//main entry point
	public static void main(String[] args){
		new ShowTime();
	}
}