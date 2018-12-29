import java.io.*;

class User
{
  public String name;
  private int[] score;
  private double average;
  public int total;
  public int rank;

  public User(int subject)
  {
    this.score = new int[subject];
  }

  public void add_name(int count) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("\n " + (count + 1) + "人目の名前を入力してください。");
    name = br.readLine();
    System.out.println(" " + name + "さんを登録しました。");
  }

  public void add_score(int subject) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println();
    for(int i = 0; i < subject; i++){
      System.out.print(" " + name + "さんの教科" + (i + 1) + "の点数を入力してください。");
      String str = br.readLine();
      score[i] = Integer.parseInt(str);
      total += score[i];
    }
    average = (double)total / (double)subject;
    System.out.println("\n 合計点は" + total + "点です。");
    System.out.println(" 平均点は" + String.format("%.1f",average) + "点です。");
  }
}

class Test2
{
  public static void main(String[] args) throws IOException
  {
    int i;
    int j;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("\n 人数を入力してください。");
    String str = br.readLine();
    int number = Integer.parseInt(str);
    System.out.print(" 教科数を入力してください。");
    str = br.readLine();
    int subject = Integer.parseInt(str);

    User[] users;
    users = new User[number];
    for(i = 0; i < number; i++){
      users[i] = new User(subject);
    }

    for(i = 0; i < number; i++){
      users[i].add_name(i);
    }
    for(i = 0; i < number; i++){
      users[i].add_score(subject);
    }

    for(i = 0; i < number; i++){
      users[i].rank = i;
    }
    for(i = 0; i < number; i++){
      for(j = i + 1; j < number; j++){
        if(users[i].total < users[j].total){
          int tmp = users[i].rank;
          users[i].rank = users[j].rank;
          users[j].rank = tmp;
        } else if(users[i].total == users[j].total){
          users[j].rank = users[i].rank;
        }
      }
    }
    System.out.println();
    for(i = 0; i < number; i++){
      for(j = 0; j < number; j++){
        if(users[j].rank == i){
          System.out.println(" " + (users[j].rank + 1) + "位は、" + users[j].name + "さんです。 " );
        }
      }
    }
  }
}
