package Logic;
import Exceptions.*;

/**
 * It is a test to verify the proper functioning of the methods.
 * @author Antonela Diomedi
 *
 */
public class Test {

	public static void main(String[] args) {
		try {
		
		Patient patient1= new Patient(123, "1/1/1", "abcObraS1", 1, 3);
		Patient patient2= new Patient(234, "2/2/2", "bcdObraS2", 1, 5);
		Patient patient3= new Patient(345, "3/3/3", "bcdObraS3", 2, 1);
		Patient patient4=null;
		
		
		Program prog= new Program();
		
		boolean assign1= prog.assignRoom(patient1);
		boolean assign2= prog.assignRoom(patient2);
		boolean assign3= prog.assignRoom(patient3);
		//boolean assign4= prog.assignRoom(patient4); //show exception
		
		int cantPatientsInRoom=prog.patientsRoom(1);
		int cantPatientsInRoom2=prog.patientsRoom(7);
		
		System.out.println("Asigno paciente: "+assign1);
		System.out.println("Asigno paciente: "+assign2);
		System.out.println("Asigno paciente: "+assign3);
		//System.out.println("Asigno paciente: "+assign4); //show exception
		
		System.out.println("Datos paciente con dni (ejemplo 234)-> "+prog.datesPatient(234));
		System.out.println("Cantidad de pacientes en una habitación (ejemplo habitación 1): "+cantPatientsInRoom+" pacientes");
		System.out.println("Cantidad de pacientes en una habitación (ejemplo habitación 7): "+cantPatientsInRoom2+" pacientes");
	}
		catch(EmptyPatientException | VoidRoomException error) {
			error.printStackTrace();
		}	
	}
}
