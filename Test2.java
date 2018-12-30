import java.io.*;

class User {
  public String name;
  private int[] score;
  private double average;
  public int total;
  public int rank;

  public User(int subject) {
    this.score = new int[subject];
  }

  public void add_name(int count) {
    int retry = 0;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    do {
      retry = 0;
      try {
        System.out.print("\n " + (count + 1) + "人目の名前を入力してください。");
        name = br.readLine();
      } catch (IOException e) {
        System.out.print(" 正しい名前ではありません。");
        retry = 1;
      }
    } while (retry == 1);
  }

  public void add_score(int subject) {
    int retry = 0;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println();
    for (int i = 0; i < subject; i++) {
      do {
        retry = 0;
        try {
          System.out.print(" " + name + "さんの教科" + (i + 1) + "の点数を入力してください。");
          String str = br.readLine();
          score[i] = Integer.parseInt(str);
          if (score[i] > 100 || score[i] < 0) {
            IOException e = new IOException();
            throw e;
          }
        } catch (IOException e) {
          System.out.println(" 正しい値ではありません。");
          retry = 1;
        }
      } while (retry == 1);
      total += score[i];
    }
    average = (double) total / (double) subject;
    System.out.println("\n 合計点は" + total + "点です。");
    System.out.println(" 平均点は" + String.format("%.1f", average) + "点です。");
  }
}

class Test2 {
  public static void main(String[] args) {
    int number = 0;
    int subject = 0;
    int i;
    int j;
    int retry = 0;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    do {
      retry = 0;
      try {
        System.out.print(" 人数を入力してください。");
        String str = br.readLine();
        number = Integer.parseInt(str);
        if (number <= 0) {
          IOException e = new IOException();
          throw e;
        }
      } catch (IOException e) {
        System.out.println(" 正しい値ではありません。");
        retry = 1;
      }
    } while (retry == 1);
    do {
      retry = 0;
      try {
        System.out.print(" 教科数を入力してください。");
        str = br.readLine();
        subject = Integer.parseInt(str);
        if (subject <= 0) {
          IOException e = new IOException();
          throw e;
        }
      } catch (IOException e) {
        System.out.println(" 正しい値ではありません。");
        retry = 1;
      }
    } while (retry == 1);

    User[] users;
    users = new User[number];
    for (i = 0; i < number; i++) {
      users[i] = new User(subject);
    }

    for (i = 0; i < number; i++) {
      users[i].add_name(i);
    }
    for (i = 0; i < number; i++) {
      users[i].add_score(subject);
    }

    for (i = 0; i < number; i++) {
      users[i].rank = i;
    }
    for (i = 0; i < number; i++) {
      for (j = i + 1; j < number; j++) {
        if (users[i].total < users[j].total) {
          int tmp = users[i].rank;
          users[i].rank = users[j].rank;
          users[j].rank = tmp;
        } else if (users[i].total == users[j].total) {
          users[j].rank = users[i].rank;
        }
      }
    }
    System.out.println();
    for (i = 0; i < number; i++) {
      for (j = 0; j < number; j++) {
        if (users[j].rank == i) {
          System.out.println(" " + (users[j].rank + 1) + "位は、" + users[j].name + "さんです。 ");
        }
      }
    }
  }
}
