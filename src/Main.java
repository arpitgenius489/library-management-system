public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Add User");
            System.out.println("3. Show Books");
            System.out.println("4. Show Users");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(bookId, title, author));
                    System.out.println("Book added.");
                    break;
                case 2:
                    System.out.print("Enter User ID: ");
                    int userId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("User Type (1=Student, 2=Teacher): ");
                    int type = scanner.nextInt();
                    scanner.nextLine();
                    if (type == 1) {
                        System.out.print("Enter Grade: ");
                        String grade = scanner.nextLine();
                        library.addUser(new StudentUser(userId, name, grade));
                    } else {
                        System.out.print("Enter Subject: ");
                        String subject = scanner.nextLine();
                        library.addUser(new TeacherUser(userId, name, subject));
                    }
                    System.out.println("User added.");
                    break;
                case 3:
                    System.out.println("--- Books ---");
                    library.showBooks();
                    break;
                case 4:
                    System.out.println("--- Users ---");
                    library.showUsers();
                    break;
                case 5:
                    System.out.print("Enter Book ID to issue: ");
                    int issueBookId = scanner.nextInt();
                    System.out.print("Enter User ID to issue to: ");
                    int issueUserId = scanner.nextInt();
                    if (library.issueBook(issueBookId, issueUserId)) {
                        System.out.println("Book issued.");
                    } else {
                        System.out.println("Issue failed. Check IDs or book status.");
                    }
                    break;
                case 6:
                    System.out.print("Enter Book ID to return: ");
                    int returnBookId = scanner.nextInt();
                    System.out.print("Enter User ID to return from: ");
                    int returnUserId = scanner.nextInt();
                    if (library.returnBook(returnBookId, returnUserId)) {
                        System.out.println("Book returned.");
                    } else {
                        System.out.println("Return failed. Check IDs or book status.");
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}
