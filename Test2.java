import java.io.*;

class User
{
  private String name;
  public int[] score;
}

class Test2
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print(" �l������͂��Ă��������B");
    String str = br.readLine();
    int number = Integer.parseInt(str);
    User[] users;
    users = new User[number];
    for(int i = 0; i < number; i++){
      users[i] = new User();
    }
  }
}
