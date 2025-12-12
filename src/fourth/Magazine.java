package fourth;

public class Magazine implements Printable {
    private String title;
    private int issue;

    public Magazine(String title, int issue) {
        this.title = title;
        this.issue = issue;
    }

    @Override
    public void print() {
        System.out.println("Журнал: '" + title + "' номер: " + issue);
    }
}