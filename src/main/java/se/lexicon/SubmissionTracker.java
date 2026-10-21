package se.lexicon;

import java.util.HashSet;

//HashSet is chosen because it prevents duplicate submission.
//Stores unique student names and submission order does not matter
public class SubmissionTracker {
    void main(){
        //Eight  student submissions including duplicate
        String[] submissions = { "Ali", "Sara", "Ahmed", "Ijaz", "Ali", "Sara", "Zainab", "Abdullah","John"};
        //Pass array to submissionCheck  method
        submissionCheck(submissions);

    }
    public static void submissionCheck(String[] submissions){
        HashSet<String> students = new HashSet<>();

        //Check each submission
        for(String name: submissions){
            //add() returns false if name already exist
            if(!students.add(name)){
                IO.println("Rejected: " +name +" has already submitted.");
            }
        }
        //Print unique students and total count
        IO.println("Submitted students: " +students);
        IO.println("Total submissions: " + students.size());
    }
}
