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

    System.out.print("\n " + (count + 1) + "�l�ڂ̖��O����͂��Ă��������B");
    name = br.readLine();
    System.out.println(" " + name + "�����o�^���܂����B");
  }

  public void add_score(int subject) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    for(int i = 0; i < subject; i++){
      System.out.print(" " + name + "����̋���" + (i + 1) + "�̓_������͂��Ă��������B");
      String str = br.readLine();
      this.score[i] = Integer.parseInt(str);
    }
    System.out.println();
  }
}

class Test2
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print(" \n�l������͂��Ă��������B");
    String str = br.readLine();
    int number = Integer.parseInt(str);
    System.out.print(" ���Ȑ�����͂��Ă��������B");
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
    for(int i = 0; i < number; i++){
      users[i].add_score(subject);
    }
  }
}
