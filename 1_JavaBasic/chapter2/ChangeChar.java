public class ChangeChar {
  public static void main(String[] args) {

    System.out.println("��ʾ\\t: ����\t�Ϻ�\t����");  
    //���Ϊ ��ʾ\t: ����    �Ϻ�    ����


    System.out.println("��ʾ\\n: \n����\n�Ϻ�\n����");  
    /*���Ϊ ��ʾ\n: 
    ����
    �Ϻ�    
    ����
    */


    System.out.println("��ʾ\\: \\");  //���Ϊ ��ʾ\\: \
    System.out.println("��ʾ\\\\: \\\\");  //���Ϊ ��ʾ\\: \\

    System.out.println("��ʾ\": \"");  //��ʾ": "
    System.out.println("��ʾ\': \'");  //���Ϊ ��ʾ': '
    System.out.println("��˳ƽ����\r����");  //���Ϊ ����ƽ����
  }
}


/*
  ��ʾ��ת���ַ����£�
  \t��һ���Ʊ�λ��ʵ�ֶ���Ĺ���
  \n�����з�
  \\��һ��\
  \":һ��"
  \'��һ��'
  \r:һ���س�  System.out.println("��˳ƽ����\r����");
 */