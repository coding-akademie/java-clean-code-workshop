package de.coding.akademie.names;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rule_3_Describe_the_Problem_Not_The_Implementation {

    // Bad
    private List<clean.code.names.Employee> employeeArrayList = new ArrayList<>();

    private Map<Integer, clean.code.names.Employee> integerEmployeeMap = new HashMap<>();



    // Clean Code
    private List<clean.code.names.Employee> employees = new ArrayList<>();


    // Vorschlag
    private Map<Integer, clean.code.names.Employee> employeeById = new HashMap<>();
    private Map<String, clean.code.names.Employee> employeeByName = new HashMap<>();




    public static void main(String[] args) {
        clean.code.names.Rule_3_Describe_the_Problem_Not_The_Implementation demo = new clean.code.names.Rule_3_Describe_the_Problem_Not_The_Implementation();




    }
}
