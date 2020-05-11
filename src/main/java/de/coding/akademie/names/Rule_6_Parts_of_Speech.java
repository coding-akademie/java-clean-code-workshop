package de.coding.akademie.names;

public class Rule_6_Parts_of_Speech {

    // Schlechte Version!
    public void saySomething(clean.code.names.Employee e, String message){
        if(e.check())
            e.process(message);
    }



    // Bessere Version
    public void sayMessageToLateEmployee(clean.code.names.Employee employee, String message){
        if(employee.isLate())
            employee.reprimand(message);
    }



}
