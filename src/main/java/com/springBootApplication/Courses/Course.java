package com.springBootApplication.Courses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.springBootApplication.Topic.Topic;

@Entity
public class Course {
	///My second commit
	@Id
	private String Id;
	private String name;
	private String description;
	private String price;
	@ManyToOne
	private Topic topic;
	
	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public Course() {}
	
	public Course(String id, String name, String description, String topicId) {
		super();
		this.Id = id;
		this.name = name;
		this.description = description;
		this.topic = new Topic(topicId, "","");
		
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
