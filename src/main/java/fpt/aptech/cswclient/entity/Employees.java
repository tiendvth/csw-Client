package fpt.aptech.cswclient.entity;

public class Employees {
    private int id;
    private String name;
    private String salary;
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
