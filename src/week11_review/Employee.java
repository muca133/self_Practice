package week11_review;

public class Employee extends Person {


    private String employeeId, jobTitle;
    private double salary;


    public Employee(String name, int age, char gender, String employeeId, String jobTitle, double salary) {
        super(name, age, gender);
       setEmployeeId(employeeId);
       setJobTitle(jobTitle);
       setSalary(salary);
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        if (employeeId.charAt(0) == '0'){
            System.out.println(" Employee Id can not start with zero" );
            System.exit(1);
        }

        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {

        if (jobTitle==null){
            System.out.println("JobTitle can not be null");
            System.exit(1);
        }
        if (jobTitle.isEmpty()){
            System.out.println("JobTitle can not be empty ");
            System.exit(1);
        }

        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<0){
            System.out.println("Salary can not be negative");
            System.exit(1);
        }
        if (salary==0){
            System.out.println("Salary can not be zero");
            System.exit(1);

        }

        this.salary = salary;
    }

    public void work(){
        System.out.println(getName()+ " is working");

    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                super.toString()+
                "employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }



}
