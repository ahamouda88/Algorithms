package algorithms.random;


public class Main {
	
	public static void main(String[] args){
		// Test the interview challenge
		Interview interview = new Interview();
		interview.loadCandidates();
		interview.setupAndPrintCandidateData();
		
		// Test the Social Media Challenge
		Member m1 = new Member("A","A@gmail.com");
		Member m2 = new Member("B1","B1@gmail.com");
		Member m3 = new Member("C1","C1@gmail.com");
		Member m4 = new Member("D1", "D1@gmail.com");
		Member m5 = new Member("E2","E2@gmail.com");
		Member m6 = new Member("F2", "F2@gmail.com");
		Member m7 = new Member("G2", "G2@gmail.com");
		Member m8 = new Member("H2", "H2@gmail.com");
		Member m9 = new Member("I2", "I2@gmail.com");
		Member m10 = new Member("J2", "J2@gmail.com");
		Member m11 = new Member("K2", "K2@gmail.com");
		Member m12 = new Member("L2", "L2@gmail.com");
		Member m13 = new Member("M2", "M2gmail.com");
		Member m14 = new Member("N3", "N3@gmail.com");
		Member m15 = new Member("O3", "O3@gmail.com");
		Member m16 = new Member("P3", "P3@gmail.com");
		Member m17 = new Member("Q3", "Q3@gmail.com");
		Member m18 = new Member("R3", "R3@gmail.com");
		  
		// Add friends of M1.
		m1.AddFriend(m2);
		m1.AddFriend(m3);
		m1.AddFriend(m4);
		
		// Add m2 friends
		m2.AddFriend(m5);
		m2.AddFriend(m6);
		m2.AddFriend(m7);
		 
		// Add m3 friends
		m3.AddFriend(m8);
		m3.AddFriend(m9);
		m3.AddFriend(m10);
		
		// Add m4 friends
		m4.AddFriend(m11);
		m4.AddFriend(m12);
		m4.AddFriend(m13);
		
		// Add m5 friends
		m5.AddFriend(m14);
		m5.AddFriend(m15);
		m5.AddFriend(m16);
		
		// Add m6 friends
		m6.AddFriend(m17);
		m6.AddFriend(m18);
		  
		SocialMedia.printFriends(m1);
	}
}
