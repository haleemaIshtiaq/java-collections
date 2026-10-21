package se.lexicon;
//HashMap stores student names as keys and grades as values
// so it helps to find student's grade by names
//TreeSet sorts grades automatically and remove duplicate values

import java.util.HashMap;
import java.util.TreeSet;

public class StudentGrades {
    void main(){
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("Ali", 75);
        grades.put("Sara", 92);
        grades.put("Ahmed", 75);
        grades.put("Zainab",90);
        grades.put("John", 50);
        grades.put("Emma", 65);

        //Find the students grade
        IO.println("Sara's grade: " +grades.get("Sara"));

        //Sort unique grades
        TreeSet<Integer> sortedGrades = new TreeSet<>(grades.values());

        IO.println("Students sorted by grades: ");
        //Outer loop through the sorted grades from highest to lowest
        //Inner loop through all student names stored in HashMap
        for(Integer grade: sortedGrades.descendingSet()){
              for(String name : grades.keySet()){

                  //Check if students grade matches the current grade
                  if(grades.get(name).equals(grade)){
                      IO.println(name +": " +grade);
                  }
              }
        }

    }

}
