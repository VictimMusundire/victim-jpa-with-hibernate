package com.victim.related_entities;

import java.util.ArrayList;
import java.util.List;

import com.victim.embedded_entities.Address;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
public class Student {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String name;

	@Embedded
	private Address address;

	@OneToOne(fetch = FetchType.LAZY)
	private Passport passport;

	@ManyToMany
	@JoinTable(name = "STUDENT_COURSE", joinColumns = @JoinColumn(name = "STUDENT_ID"), inverseJoinColumns = @JoinColumn(name = "COURSE_ID"))
	private List<Course> courses = new ArrayList<>();


	public Student(String name) {
		this.name = name;
	}

	public void addCourse(Course course) {
		this.courses.add(course);
	}

	@Override
	public String toString() {
		return String.format("Course[%s]", name);
	}

}