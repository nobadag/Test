import java.io.*;

class User
{
  private String name;
  private int[] score;

  public User(int subject)
  {
    this.score = new int[subject];
  }

  public void add_name(int count) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print(" " + (count + 1) + "人目の名前を入力してください。");
    name = br.readLine();
    System.out.println(" " + name + "さんを登録しました。\n");
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
    System.out.print(" 教科数を入力してください。");
    str = br.readLine();
    int subject = Integer.parseInt(str);

    User[] users;
    users = new User[number];
    for(int i = 0; i < number; i++){
      users[i] = new User(subject);
    }

    for(int i = 0; i < number; i++){
      users[i].add_name(i);
    }
  }
}
