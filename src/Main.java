import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> numbers = readList(scanner);
    Collections.sort(numbers);
    Collections.reverse(numbers);
    System.out.print("Введите элемент для поиска: ");
    int x = scanner.nextInt();
    scanner.nextLine();
    int i = indexOfRevers(numbers, x);
    System.out.println("Индекс искомого элемента: " + i);
    System.out.println("Сорт.список: " + numbers);
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

  private static int indexOfRevers(List<Integer> list, int target) {
    int left = 0;
    int right = list.size();
    while (left < right - 1) {
      int indexMid = (left + right) / 2;
      int mid = list.get(indexMid);
      if (mid > target) {
        left = indexMid + 1;
      } else if (mid < target) {
        right = indexMid - 1;
      } else {
        return indexMid;
      }
    }
    if (list.get(left) == target) {
      return left;
    }
    return -1;
  }
}
