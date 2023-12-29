package pro.sky.skyprospringinterview;

import javax.persistence.*;
@Entity
@Table(name = "Employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String department;
    private long salary;
}

