package hibernate.entiti;


import javax.persistence.*;

@Entity
@Table(name = "emploi")
public class Emploi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "departments")
    private String departments;
    @Column(name = "salary")
    private String salary;

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Emploi(){}

    public Emploi(int id, String name, String surname, String departments, String salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.departments = departments;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emploi{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", departments='" + departments + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

}
