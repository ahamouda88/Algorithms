package algorithms.tree.main;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class SocialMedia {

	/*
	 *  Function to Print level 1 friends first, then print level 2 friends....and so on.
	 *  Space Complexity: O(n)
	 *  Time Complexity: O(n2)
	 */
	public static void printFriends(Member m){
		if(m == null)
			return;
		// Used a queue data structure to keep track of the friends by their order of insertion.
		// As its main concept is First In, First Out.
		Queue<Member> queue = new LinkedList<>();
		
		// Used a set to check if a member is visited before or not.
		// Its main concept that it doesn't accept duplicates.
		Set<Member> visited = new HashSet<>();
		queue.add(m);
		Member temp;
		while(!queue.isEmpty()){
			temp = queue.poll();
			visited.add(temp);
			System.out.println("Member name:"+temp.name+" , email: "+temp.email);
			
			// Iterate through a member's friends and add them to the queue.
			for(int i = 0; i < temp.friends.size(); i++){
				if(!visited.contains(temp.friends.get(i))){
					queue.add(temp.friends.get(i));
					visited.add(temp.friends.get(i));
				}
			}
		}

	}
	
	/*
	 * This function is used to calculate the payout of a given member
	 */
	public static double calculatePayout(Member m){
		double payout = 0;
		if(m == null) 
			return payout;
		for(Member recruit: m.getRecruitedMembers()){
			payout += recruit.getMonthlyAmazonDollars() * 0.04; 
		}
		return payout + m.getMonthlyAmazonDollars() * 0.10;
	}

	
	public static void initFriends(){
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
		  
		  // Add m2 firnds
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
	}
}
