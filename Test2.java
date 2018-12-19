import java.io.*;

class User
{
  private String name;
  public int[] score;

  public void add_name(String temporary)
  {
    name = temporary;
    System.out.println(" " + name + "さんを登録しました。");
  }
}

class Test2
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print(" 人数を入力してください。");
    String str = br.readLine();
    int number = Integer.parseInt(str);
    User[] users;
    users = new User[number];
    for(int i = 0; i < number; i++){
      users[i] = new User();
    }
    System.out.print(" 教科数を入力してください。");
    str = br.readLine();
    int subject = Integer.parseInt(str);
    for(int i = 0; i < number; i++){
      users[i].score = new int[subject];
    }

    for(int i = 0; i < number; i++){
      System.out.print(" 名前を入力してください。");
      str = br.readLine();
      users[i].add_name(str);
    }
  }
}
