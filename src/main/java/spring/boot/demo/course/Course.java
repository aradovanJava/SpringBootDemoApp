package spring.boot.demo.course;

import spring.boot.demo.student.Student;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    
    @Column(name = "ects_points")
    private Integer numberOfECTS;

    @ManyToMany(targetEntity = Student.class, mappedBy = "courses")
    private List<Student> students;

    public String getName() {
        return name;
    }

    public Integer getNumberOfECTS() {
        return numberOfECTS;
    }
}
