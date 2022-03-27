// You can experiment here, it won’t be checked

public class Task {
  public static void main(String[] args) {
    char ch = 'a';
    int num = 0;
    switch(ch) {
      case 'a':
        num = 10;
      case 'b':
        num = 20;
      default:
        num = 30;
    }
    System.out.println(num);
  }
}
