import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FibonacciService {
    private int count;
    private FibonacciNumbers fibonacciNumbers;

    public void fibonacci() {
        System.out.println("\nКол-во чисел Фибоначчи: " + count);
        int[] arr = fibonacciNumbers.showFibonacci(count);
        System.out.println("Полученные числа Фибоначчи:");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
