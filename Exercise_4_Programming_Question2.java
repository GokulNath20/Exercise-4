import java.util.Scanner;
class Exercise_4_Programming_Question2{
    static Scanner gk = new Scanner(System.in);
    public static void main(String []args){

        Staff employ = new Staff();

        System.out.print("Please enter staff name");
        String name = gk.next()+gk.nextLine();
        System.out.print("Please enter staff ID");
        String id = gk.next()+gk.nextLine();
        System.out.print("Please enter staff working day");
        int wday = gk.nextInt();

        employ.setStaffInfo(name,id,wday);
        employ.calculateSalary();

        System.out.println("Name: "+employ.getName()+"\n"+"ID: "+employ.getStaffID()+
                            "\n"+"Total Salary: "+employ.getSalary());

    }
}
