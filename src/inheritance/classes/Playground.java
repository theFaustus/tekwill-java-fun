package inheritance.classes;

import java.util.ArrayList;
import java.util.List;

public class Playground {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Programmer programmer = new Programmer();
        Astronaut astronaut = new Astronaut();
        Doctor doctor = new Doctor();

        manager.reportProjectStatus();
        programmer.writeCode();
        astronaut.fixSpaceStation();
        doctor.performSurgery();

        manager.reportWorkHours();
        programmer.reportWorkHours();
        doctor.reportWorkHours();
        astronaut.reportWorkHours();

        manager.signContract("Contract-2343456wert");
        programmer.signContract("Contract-2343434556");
        doctor.signContract("Contract-234456633456");
        astronaut.signContract("Contract-2323542sdf43456");

        System.out.println(manager);
        System.out.println(programmer);
        System.out.println(doctor);
        System.out.println(astronaut);

        HR hr = new HR();
        hr.reportWorkHours();
        hr.sendInvitationToMeeting(manager);
        hr.sendInvitationToMeeting(programmer);
        hr.sendInvitationToMeeting(astronaut);
        hr.sendInvitationToMeeting(doctor);

        programmer.debugCode();
        programmer.writeCode();

        List<Employee> employees = new ArrayList<>();
        employees.add(manager);
        employees.add(doctor);
        employees.add(programmer);
        employees.add(astronaut);

        for (Employee employee : employees) {
            employee.reportWorkHours();
            employee.signContract("Contract-789456-Vacation");
        }

        List<Person> persons = new ArrayList<>();
        persons.add(manager);
        persons.add(doctor);
        persons.add(programmer);
        persons.add(astronaut);
        persons.add(new SuperHero());

        for (Person person : persons) {
            person.live();
        }

    }
}
