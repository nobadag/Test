import java.io.*;

class Test
{
  public static void main(String[] args) throws IOException
  {
    System.out.print("�e�X�g�̋��Ȑ�����͂��Ă��������B");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int elm = Integer.parseInt(str);

    int[] sub = new int[elm];

    for(int i = 0; i < elm; i++){
      do{
        System.out.print("����" + (i + 1) + "�̓_������͂��Ă�������");
        str = br.readLine();
        sub[i] = Integer.parseInt(str);
      } while(sub[i] < 0 || sub[i] > 100);
    }
  }
}
