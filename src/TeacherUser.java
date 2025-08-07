public class TeacherUser extends User {
    private String subject;

    public TeacherUser(int id, String name, String subject) {
        super(id, name);
        this.subject = subject;
    }

    public String getSubject() { return subject; }

    @Override
    public String toString() {
        return "TeacherUser{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", subject='" + subject + '\'' +
                ", issuedBooks=" + getIssuedBooks().size() +
                '}';
    }
}
