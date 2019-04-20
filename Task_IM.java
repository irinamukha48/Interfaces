
/**
 * This is a class that represents a task.
 * The task has a name, priority, and complexity
 *
 * @IMukhametzhanova
 * @1.8
 * 4/8/19
 */
public class Task_IM implements Priority_IM, Complexity
{
    private String type;
    private int priority;
    private int complexity;

    /**
     * This is the constructor for the Task_IM class
     * It takes in the name of the task and its priority
     */
    public Task_IM(String t, int p, int c)
    {
        type = t;
        priority = p;
        complexity = c;
    }

    /**
     * This method changes the task's name to the entered one
     */
    public void setType(String t)
    {
        type = t;
    }

    /**
     * This method returns the task's name
     */
    public String getType()
    {
        return type;
    }

    /**
     * This method changes the task's priority to the entered one
     */
    public void setPriority(int p)
    {
        priority = p;
    }

    /**
     * This method returns the task's priority
     */
    public int getPriority()
    {
        return priority;
    }

    /**
     * This method changes the task's complexity to the entered one
     */
    public void setComplexity(int c) {
        complexity = c;
    }

    /**
     * This method returns the task's complexity
     */
    public int getComplexity()
    {
        return complexity;
    }

    /**
     * This method returns a string with all of the task's information
     */
    public String toString()
    {
        String output = type + "; Priority: " + priority + "; Complexity: " + complexity;
        return output;
    }
}