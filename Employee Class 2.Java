Public class EmployeeClassTest{
    public static void main( String [] args){

        Employee employee1 = new Employee();
        Employee employee2 = new Employee( "Mark Jones" , 39119 );
        Employee employee3 = new Employee( "Joy Rogers", 81774, "Manufacturing", "Engineer" );

        employee1.name = "Kay";

        System.out.println( "Name\t\tID Number\t\tDepartment\t\tPosition" );
        System.out.println( employee1. getName() + "\t\t" + employee1
    }
}