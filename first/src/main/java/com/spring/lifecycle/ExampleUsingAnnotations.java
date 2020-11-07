package com.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ExampleUsingAnnotations {
private String subject;

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

@Override
public String toString() {
	return "ExampleUsingAnnotations [subject=" + subject + "]";
}
@PostConstruct
public void Start() {
	System.out.println("Starting init method");
}
@PreDestroy
public void End() {
	System.out.println("Ending destroy method");
}

}
