import java.io.*;

class Test
{
  public static void main(String[] args) throws IOException
  {
    System.out.print("テストの教科数を入力してください。");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int elm = Integer.parseInt(str);
  }
}
