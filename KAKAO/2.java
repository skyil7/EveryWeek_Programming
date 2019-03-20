
public class test {

/*

카카오 코딩테스트 #2

길이가 N인 배열에 1부터 N까지
숫자가 중복 없이 한 번씩 들어 있는지 확인하시오.

Ensure that the array of length N contains the numbers 1 through N, one at a time, without any duplication.


 */

    public static void main(String args[]) {
        int N = 5;
        int array[] = {1, 2, 3, 4, 5};

        int sum = 0;
        
        for (int i = 0; i < N; i++) {
            sum += array[i];
        }
        if(sum == (N+1)*N/2)
            System.out.println("true");
        else
            System.out.println("false");
    }

}
