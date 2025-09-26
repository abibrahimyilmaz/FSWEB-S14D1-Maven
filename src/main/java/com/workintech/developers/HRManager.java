package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;


    public HRManager(int id, String name, double salary){
        super(id,name,salary);

    }
    @Override
    public void work(){
        System.out.println("HRManager starts to working");
        setSalary(getSalary()+50000);
        System.out.println("Salary is set to " + getSalary());
    }
//    public void addEmployee(JuniorDeveloper developer) {
//        boolean added = false;
//        for (int i = 0; i < juniorDevelopers.length; i++) {
//            if (juniorDevelopers[i] == null) {
//                juniorDevelopers[i] = developer;
//                System.out.println("Junior Developer added at index " + i);
//                added = true;
//                break;
//            }
//        }
//        if (!added) {
//            System.out.println("No empty slot for Junior Developer!");
//        }
//    }
//
//    public void addEmployee(MidDeveloper developer){
//        boolean added=false;
//        for(int i=0;i<midDevelopers.length;i++) {
//            if(midDevelopers[i]==null){
//                midDevelopers[i]=developer;
//                System.out.println("MidDeveloper added at index" + i);
//                added=true;
//                break;
//            }
//        }
//        if(!added){
//            System.out.println("No empty slot for Mid Developer!");
//        }
//    }
}
