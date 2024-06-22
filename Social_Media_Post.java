import java.util.Scanner;

class Post{
    String Author,Content;
    int likes;
    Post(String author,String Content,int likes){
        Author=author;
        this.Content=Content;
        this.likes=likes;

    }
}
class SocialMediaPlatform{
    Post array[]=new Post[10];
}
public class Social_Media_Post{
    public static void main(String[] args){
    Scanner Sc=new Scanner(System.in);
    System.out.print("Enter the name of author of the post:");
    String author1=Sc.nextLine();
    System.out.print("Enter the content of the post:");
    String content1=Sc.nextLine();
    System.out.print("Enter the number of likes of the post:");
    int likes1=Sc.nextInt();
    Post obj1=new Post(author1,content1,likes1);
    System.out.print("Enter the name of author of the post:");
    String author2=Sc.nextLine();
    System.out.print("Enter the content of the post:");
    String content2=Sc.nextLine();
    System.out.print("Enter the number of likes of the post:");
    int likes2=Sc.nextInt();
    Post obj2=new Post(author2,content2,likes2);
    System.out.print("Enter the name of author of the post:");
    String author3=Sc.nextLine();
    System.out.print("Enter the content of the post:");
    String content3=Sc.nextLine();
    System.out.print("Enter the number of likes of the post:");
    int likes3=Sc.nextInt();
    Post obj3=new Post(author3,content3,likes3);
    
    }
}