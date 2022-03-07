package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {
	
	private String topicname;
	private String user;
	
	public SubscribeMsg(String topicname, String user) {
		this.topicname = topicname;
		this.user = user;
	}
	
	public String getTopicname() {
		return topicname;
	}

	public void setTopicname(String topicname) {
		this.topicname = topicname;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "CreateTopicMsg [topicname=" + topicname + ", user=" + user + ", getTopicname()=" + getTopicname()
				+ ", getUser()=" + getUser() + ", getType()=" + getType() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	// message sent from client to subscribe on a topic 

	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
		
}
