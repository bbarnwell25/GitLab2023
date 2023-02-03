public class GitLabHelper {
    private String[] persons;

    GitLabHelper(String[] persons) {
        this.persons = persons;
    }

    public void PrintWelcomeMessage() {
        System.out.print("This is a super fun and informative lesson on git made by " + Arrays.toString(persons));
    }
}