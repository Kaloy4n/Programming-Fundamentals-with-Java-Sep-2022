package ObjectsAndClasses.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String articleData = sc.nextLine();
        String[] articleParts = articleData.split(", ");
        String title = articleParts[0];
        String content = articleParts[1];
        String author = articleParts[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(sc.nextLine()); //count of commands
        for (int commandCount = 1; commandCount <= n ; commandCount++) {
            String command = sc.nextLine();
            //"Edit"
            //"ChangeAuthor"
            //"Rename"
            switch (command.split(": ")[0]) {
                case "Edit":
                    String newContent = command.split(": ")[1];
                    article.edit(newContent);
                    break;
                case "ChangeAuthor":
                    String newAuthor = command.split(": ")[1];
                    article.changeAuthor(newAuthor);

                    break;
                case "Rename":
                    String newTitle = command.split(": ")[1];
                    article.rename(newTitle);
                    break;
            }
        }
        System.out.println(article);
    }
}
