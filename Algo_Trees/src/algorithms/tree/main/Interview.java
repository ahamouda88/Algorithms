package algorithms.tree.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

/*
 * The Interview class is used to print Candidates in a specific format using their Date of birth and Age 
 */
public class Interview {
	// Used ArrayList instead of LinkedList, because getting an element in an ArrayList takes one step
	private List<String> candidates = new ArrayList<>();
	
	/**
	 * A Method to add some candidates into a list.
	 */
	public void loadCandidates(){
		candidates.clear();
		candidates.add("MARY");
		candidates.add("JOE");
		candidates.add("SIENNA");
		candidates.add("PETER");
	}

	/**
	 * A method to First: convert each name in the list to mixed case. Second: calculate each candidate's birthday. 
	 * Third: load candidates' names, and date of birth into a Map. Finally: print candidates in a specific format
	 */
	public void setupAndPrintCandidateData(){		
		// In-case the candidates list is set to null!
		if(candidates == null)	return;
		
		Map<String, Date> candidateBirthdays = new HashMap<>();
		Calendar cal = Calendar.getInstance(Locale.US);		
		Date birthday;
		// Used StringBuilder because it is faster, and consume less memory
		StringBuilder builder;
		String tempString;
		int size = candidates.size();
		// Loop to convert each name in the list to mixed case, and load the map with candidate names, and date of birth
		for (int i = 0; i < size; i++) {
			builder = new StringBuilder("");
			tempString = candidates.get(i);
			builder.append(tempString.substring(0, 1).toUpperCase());
			builder.append(tempString.substring(1, tempString.length()).toLowerCase());		
			
			// This part of the code is used to calculate candidates' birthday and load the hashMap with candidate names, and date of birth
			cal.set(1990 - tempString.length(), 3, 6);
			birthday = cal.getTime();
			candidateBirthdays.put(builder.toString(), birthday);
		}
		printCandidates(candidateBirthdays);		
	}
	
	private void printCandidates(Map<String, Date> candidateBirthdays){
		Calendar cal = Calendar.getInstance(Locale.US);		
		for(Entry<String, Date> entry : candidateBirthdays.entrySet()){			
			cal.setTime(entry.getValue());
			int age = calculateAge(entry.getValue());
			System.out.println(entry.getKey()+" was born in "+cal.get(Calendar.YEAR)+" and is "+age+" years old");
		}
	}
	
	// A method to calculate candidate's age, give his date of birth
	private int calculateAge(Date dateOfBirth){
		// Create calendar for current time
		long currentTime = System.currentTimeMillis();
		Calendar todayCal = Calendar.getInstance(Locale.US);
		todayCal.setTimeInMillis(currentTime);		
		// Create calendar for date of birth
		Calendar dobCal = Calendar.getInstance(Locale.US);
		dobCal.setTimeInMillis(dateOfBirth.getTime());
		
		if(todayCal.get(Calendar.YEAR) > dobCal.get(Calendar.YEAR)){
			int year = todayCal.get(Calendar.YEAR) - dobCal.get(Calendar.YEAR);
			int month = todayCal.get(Calendar.MONTH) - dobCal.get(Calendar.MONTH);
			int day = todayCal.get(Calendar.DATE) - dobCal.get(Calendar.DATE);

			/* If month less than 0, means that his birth day date doesn't come yet.
			 * If month equal to 0, means that the person was born in current month,
			 * Then the day will decided if his birth day has come or not
			 * */
			if(month < 0 || (month == 0 && day < 0)){
				year--;
			}
			return year;
		}else{
			// Custom Exception can be thrown here!
			System.out.println("Sorry but Today's Date should be greater than Date of Birth! ");
			return -1;
		}
	}

	public List<String> getCandidates() {
		return candidates;
	}
	
	// Created this to allow the user to set his own list
	public void setCandidates(List<String> candidates) {
		this.candidates = candidates;
	}	
}
