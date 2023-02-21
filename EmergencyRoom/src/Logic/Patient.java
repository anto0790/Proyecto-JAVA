package Logic;

/**
 * This class creates an object representing a patient.
 * @author Antonela Diomedi
 *
 */
public class Patient {
	
	protected int dni;
	protected String birthdate;
	protected String socialWork;
	protected int room;
	
	/**
	 * This constructor initializes the patient data.
	 * @param d is a dni entered.
	 * @param birth is a birthdate entered.
	 * @param sw is a social work entered.
	 * @param bed is a room entered.
	 */
	public Patient(int d, String birth, String sw, int bed, int prio){
		dni=d;
		birthdate=birth;
		socialWork=sw;
		room=bed;
	}
	
	public Patient() {
		dni=0;
		birthdate="";
		socialWork="";
		room=0;
	}
	
	/**
	 * This method shows a patient's dni.
	 * @return a patient's dni.
	 */
	public int getDni() {
		return dni;
	}
	
	/**
	 * This method shows a patient's birthday.
	 * @return a patient's birthday.
	 */
	public String getBirthdate() {
		return birthdate;
	}
	
	/**
	 * This method shows a patient's social work.
	 * @return a patient's social work.
	 */
	public String getSocialWork() {
		return socialWork;
	}
	
	/**
	 * This method shows a patient's room.
	 * @return a patient's room.
	 */
	public int getRoom() {
		return room;
	}
	
}
