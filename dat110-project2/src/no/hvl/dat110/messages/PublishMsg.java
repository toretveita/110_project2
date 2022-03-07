package no.hvl.dat110.messages;

import no.hvl.dat110.common.TODO;

public class PublishMsg extends Message {
	
	private String topicname;
	private String user;
	private String message;
	
	public PublishMsg(String topicname, String user, String message) {
		this.topicname = topicname;
		this.user = user;
		this.message = message;
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


	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	@Override
	public String toString() {
		return "PublishMsg [topicname=" + topicname + ", user=" + user + ", message=" + message + ", getTopicname()="
				+ getTopicname() + ", getUser()=" + getUser() + ", getMessage()=" + getMessage() + ", getType()="
				+ getType() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	// message sent from client to create publish a message on a topic 

	// TODO:
	// Implement object variables - a topic and a message is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
}
