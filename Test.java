import java.io.*;

class Test
{
  public static void main(String[] args) throws IOException
  {
    System.out.print("テストの教科数を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int elm = Integer.parseInt(str);

    int[] sub = new int[elm];
    int total = 0;

    for(int i = 0; i < elm; i++){
      do{
        System.out.print("教科" + (i + 1) + "の点数を入力してください。");
        str = br.readLine();
        sub[i] = Integer.parseInt(str);
      } while(sub[i] < 0 || sub[i] > 100);
      total += sub[i];
    }
    double ave = total / elm;

    System.out.println("平均点は" + ave + "点です。");
  }
}
