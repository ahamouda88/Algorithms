package algorithms.random;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Member {
    String name;
    String email;
    List<Member> friends ;   
    
	public Member(String name, String email) {
		this.name = name;
		this.email = email;
		friends = new ArrayList<>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Member> getFriends() {
		return friends;
	}
	public void setFriends(List<Member> friends) {
		this.friends = friends;
	}
    
	public void AddFriend(Member m){
		friends.add(m);
	}
	
    public double getMonthlyAmazonDollars(){return 100;}
    public Collection<Member> getRecruitedMembers(){
    	Member m2 = new Member("B1","B1@gmail.com");
		Member m3 = new Member("C1","C1@gmail.com");
		ArrayList<Member> list = new ArrayList<>();
		list.add(m3);
		list.add(m2);
		return list;
    }

}
