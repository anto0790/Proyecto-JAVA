package Logic;

import Exceptions.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * This class creates an object representing a hospital with all its services.
 * @author Antonela Diomedi
 *
 */
public class Program {
	private Map<Integer,Patient> bedrooms;
	
	/**
	 * This constructor initializes the mapping containing the rooms.
	 */
	public Program() {
		bedrooms= new HashMap<Integer,Patient>();
	}
	
	/**
	 * This method assign a bedroom a new patient.
	 * @param p is a new patient.
	 * @return true if the patient is assigned a bedroom or  false in opposite case.
	 * @throws EmptyPatientException if the patient is a value null.
	 * @throws AssignBedroomException if the patient already exists.
	*/
	public boolean assignRoom(Patient p)throws EmptyPatientException {
		boolean assign=false;		
		
		if(p == null) {
			throw new EmptyPatientException("The patient has null or invalid data");
		}
		
		bedrooms.put(p.getDni(), p);	
		assign=bedrooms.containsKey(p.getDni());
		
		return assign;
	}
	
	/**
	 * This method shows los data according to a dni.
	 * @param dni of the patient.
	 * @return the data of patient.
	 * @throws EmptyPatientException if the patient not exists.
	 */
	public String datesPatient(int dni)throws EmptyPatientException {
		Patient patient=bedrooms.get(dni);
		String dates="";
		
		if(patient == null) {
			throw new EmptyPatientException("The patient doesn`t exist");
		}
		
		dates= "Birthdate: "+patient.getBirthdate()+" Social Work: "+patient.getSocialWork()+" Room: "+patient.getRoom();
		
		return dates;
	}
	
	/**
	 * This method deallocated a room.
	 * @param dni of patient that will be deallocated.
	 * @return dni of patient that will be deallocated.
	 * @throws EmptyPatientException if the patient not exists.
	 */
	public int unassignRoom(int dni)throws EmptyPatientException {
		Patient patient=bedrooms.remove(dni);
		int dniPatient=0;
		
		if(patient == null) {
			throw new EmptyPatientException("The patient not exists.");
		}
		
		dniPatient=patient.getDni();
		
		return dniPatient;
	}
	
	/**
	 * This method shows the total number of patients in a room.
	 * @param numberRoom is the room number.
	 * @return the total number of patients in a room.
	 * @throws VoidRoomException if the room is empty.
	 */
	public int patientsRoom(int numberRoom)throws VoidRoomException {
		int totalPatients=0;
		Collection<Patient> collectionPatients = bedrooms.values();
		
		if(collectionPatients == null) {
			throw new VoidRoomException("Void room.");
		}
		
		for(Patient p: collectionPatients) {
			if(p.getRoom() == numberRoom) {
				totalPatients+=1;
			}
		}
		
		return totalPatients;
	}
	
}
