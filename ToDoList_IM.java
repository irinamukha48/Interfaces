
/**
 * This is a representation of a to do list.
 * This is interactive, so, you can make your own.
 * Made to represent Task_IM class, Priority_IM interface, and Complexity interface.
 *
 * @IMukhametzhanova
 * @1.8
 * 4/8/19
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList_IM
{
    public static void main(String [] args)
    {
        Scanner scStr = new Scanner(System.in); //For strings
        Scanner scInt = new Scanner(System.in); //For integers

        ArrayList<Task_IM> toDoList = new ArrayList<Task_IM>(); //The list itself

        boolean done = false; //For quitting the while loop
        int choice; //For the options in the main menu
        int choiceChange; //For deciding what to change in the task
        int check = 0; //For checking if a task exists
        int oldPriority, oldComplexity;

        System.out.println("Welcome to your personal To Do List!");

        while (!done)
        {
            System.out.println("What would you like to do?\n1) Add a new task\n2) Print out my to do list\n3) Remove a task\n4) Change a task\n5) Quit");
            choice = scInt.nextInt(); //Choosing in the main menu

            System.out.println();
            if (choice == 1){ //Add a new task
                System.out.println("Please enter the name of the task");
                String task = scStr.nextLine();

                System.out.println("On a scale of 1 to 10, how important is his task?");
                int priority = scInt.nextInt();

                System.out.println("On a scale of 1 to 10, how complex is this task?");
                int complexity = scInt.nextInt();

                toDoList.add(new Task_IM(task, priority, complexity)); //new Task_IM object is created
                System.out.println();
            }else if (choice == 2){ // Print out my to do list
                if (toDoList.size() > 0){ //If there are tasks
                    for (int i = 0; i < toDoList.size(); i++){
                        System.out.println(toDoList.get(i));
                    }
                }else{ //If there are no tasks
                    System.out.println("You have no tasks yet");
                }
                System.out.println();
            }else if (choice == 3){ // Remove a task
                System.out.println("Which task?");
                String task = scStr.nextLine();
                for (int i = 0; i < toDoList.size(); i++){
                    if (toDoList.get(i).getType().equals(task)){
                        toDoList.remove(i);
                        check++; //Check that this task exists
                        System.out.println("Task removed");
                    }
                }
                if (check == 0){ //If there is no such a task
                    System.out.println("There is no such task");
                }
                check = 0; //Reset the checking value
                System.out.println();
            }else if (choice == 4){ //Change a task
                System.out.println("Change what?\n1) Type\n2) Priority\n3) Complexity");
                choiceChange = scInt.nextInt();

                System.out.println("What task?");
                String task = scStr.nextLine();
                if (choiceChange == 1){ //Change type
                    System.out.println("What do you want to change it to?");
                    String newTask = scStr.nextLine();
                    for (int i = 0; i < toDoList.size(); i++){
                        if (toDoList.get(i).getType().equals(task)){
                            toDoList.get(i).setType(newTask);
                            check++;
                            System.out.println("Task changed");
                        }
                    }
                }else if (choiceChange == 2){ //Change priority
                    System.out.println("How important is this task now?");
                    int newPriority = scInt.nextInt();
                    for (int i = 0; i < toDoList.size(); i++){
                        if (toDoList.get(i).getType().equals(task)){
                            oldPriority = toDoList.get(i).getPriority();
                            toDoList.get(i).setPriority(newPriority);
                            check++;
                            System.out.println("Priority changed from " + oldPriority + " to " + toDoList.get(i).getPriority());
                        }
                    }
                }else if (choiceChange == 3){
                    System.out.println("How complex is this task now?");
                    int newComplexity = scInt.nextInt();
                    for (int i = 0; i < toDoList.size(); i++){
                        if (toDoList.get(i).getType().equals(task)){
                            oldComplexity = toDoList.get(i).getPriority();
                            toDoList.get(i).setComplexity(newComplexity);
                            check++;
                            System.out.println("Complexity changed from " + oldComplexity + " to " + toDoList.get(i).getComplexity());
                        }
                    }
                }
                System.out.println();
            }else if (choice == 5){ //Quit
                System.out.println("Goodbye!");
                done = true;
            }else{ //No correct option
                System.out.println("Please enter a number from 1 to 5");
            }
        }
    }
}
/**
 * Welcome to your personal To Do List!
 * What would you like to do?
 * 1) Add a new task
 * 2) Print out my to do list
 * 3) Remove a task
 * 4) Change a task
 * 5) Quit
 * 1
 *
 * Please enter the name of the task
 * Do homework
 * On a scale of 1 to 10, how important is his task?
 * 9
 * On a scale of 1 to 10, how complex is this task?
 * 10
 *
 * What would you like to do?
 * 1) Add a new task
 * 2) Print out my to do list
 * 3) Remove a task
 * 4) Change a task
 * 5) Quit
 * 2
 *
 * Do homework; Priority: 9; Complexity: 10
 *
 * What would you like to do?
 * 1) Add a new task
 * 2) Print out my to do list
 * 3) Remove a task
 * 4) Change a task
 * 5) Quit
 * 1
 *
 * Please enter the name of the task
 * Practice guitar
 * On a scale of 1 to 10, how important is his task?
 * 10
 * On a scale of 1 to 10, how complex is this task?
 * 3
 *
 * What would you like to do?
 * 1) Add a new task
 * 2) Print out my to do list
 * 3) Remove a task
 * 4) Change a task
 * 5) Quit
 * 2
 *
 * Do homework; Priority: 9; Complexity: 10
 * Practice guitar; Priority: 10; Complexity: 3
 *
 * What would you like to do?
 * 1) Add a new task
 * 2) Print out my to do list
 * 3) Remove a task
 * 4) Change a task
 * 5) Quit
 * 4
 *
 * Change what?
 * 1) Type
 * 2) Priority
 * 3) Complexity
 * 1
 * What task?
 * Practice guitar
 * What do you want to change it to?
 * Practice accordeon
 * Task changed
 *
 * What would you like to do?
 * 1) Add a new task
 * 2) Print out my to do list
 * 3) Remove a task
 * 4) Change a task
 * 5) Quit
 * 2
 *
 * Do homework; Priority: 9; Complexity: 10
 * Practice accordeon; Priority: 10; Complexity: 3
 *
 * What would you like to do?
 * 1) Add a new task
 * 2) Print out my to do list
 * 3) Remove a task
 * 4) Change a task
 * 5) Quit
 * 4
 *
 * Change what?
 * 1) Type
 * 2) Priority
 * 3) Complexity
 * 2
 * What task?
 * Do homework
 * How important is this task now?
 * 3
 * Priority changed from 9 to 3
 *
 * What would you like to do?
 * 1) Add a new task
 * 2) Print out my to do list
 * 3) Remove a task
 * 4) Change a task
 * 5) Quit
 * 2
 *
 * Do homework; Priority: 3; Complexity: 10
 * Practice accordeon; Priority: 10; Complexity: 3
 *
 * What would you like to do?
 * 1) Add a new task
 * 2) Print out my to do list
 * 3) Remove a task
 * 4) Change a task
 * 5) Quit
 * 4
 *
 * Change what?
 * 1) Type
 * 2) Priority
 * 3) Complexity
 * 3
 * What task?
 * Practice accordeon
 * How complex is this task now?
 * 6
 * Complexity changed from 10 to 6
 *
 * What would you like to do?
 * 1) Add a new task
 * 2) Print out my to do list
 * 3) Remove a task
 * 4) Change a task
 * 5) Quit
 * 2
 *
 * Do homework; Priority: 3; Complexity: 10
 * Practice accordeon; Priority: 10; Complexity: 6
 *
 * What would you like to do?
 * 1) Add a new task
 * 2) Print out my to do list
 * 3) Remove a task
 * 4) Change a task
 * 5) Quit
 * 3
 *
 * Which task?
 * Do homework
 * Task removed
 *
 * What would you like to do?
 * 1) Add a new task
 * 2) Print out my to do list
 * 3) Remove a task
 * 4) Change a task
 * 5) Quit
 * 2
 *
 * Practice accordeon; Priority: 10; Complexity: 6
 *
 * What would you like to do?
 * 1) Add a new task
 * 2) Print out my to do list
 * 3) Remove a task
 * 4) Change a task
 * 5) Quit
 * 6
 *
 * Please enter a number from 1 to 5
 * What would you like to do?
 * 1) Add a new task
 * 2) Print out my to do list
 * 3) Remove a task
 * 4) Change a task
 * 5) Quit
 * 5
 *
 * Goodbye!
 */