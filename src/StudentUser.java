public class StudentUser extends User {
    private String grade;

    public StudentUser(int id, String name, String grade) {
        super(id, name);
        this.grade = grade;
    }

    public String getGrade() { return grade; }

    @Override
    public String toString() {
        return "StudentUser{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", grade='" + grade + '\'' +
                ", issuedBooks=" + getIssuedBooks().size() +
                '}';
    }
}
