import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> numbers = readList(scanner);

  }

  private static List<Integer> readList(Scanner scanner) {
    List<Integer> list = new ArrayList<>();
    System.out.print("Введите кол-во цифр для записи: ");
    int n = scanner.nextInt();
    scanner.nextLine();
    for (int i = 0; i < n; ++i) {
      System.out.print("Введите " + (i + 1) + "-ое целое число (каждое в новой строке): ");
      list.add(scanner.nextInt());
      scanner.nextLine();
    }
    return list;
  }
}
