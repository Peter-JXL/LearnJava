public class FloatDetail {
  public static void main(String[] args) {
    //Java�ĸ����ͳ���������ֵ��Ĭ��Ϊdouble�ͣ�����float�ͳ�����������ĸF��СдfҲ�У�
    // float num1 = 1.1;   //���뱨��
    float num2 = 1.1f;  //��ȷ�﷨
    double num3 = 1.1;  //��ȷ�﷨
    double num4 = 1.1f;  //��ȷ�﷨

    double num5 = .512;  //��ȷ���ȼ���0.512��ʡ��0
    System.out.println(num5);

    //��ѧ����������ĸe���ô�д
    double num6 = 5.12e2; //�ȼ���5.12 * 10�Ķ��η������512.0
    double num7 = 5.12e-2; //�ȼ���5.12 / 10�Ķ��η� ���0.0512

    //��������¶�ʹ��double
    double num9 = 2.1234567851;
    float num10 = 2.1234567851F;
    System.out.println(num9); //2.1234567851
    System.out.println(num10);  //2.1234567

    double num11 = 2.7;
    double num12 = 8.1 / 3; //2.7
    System.out.println(num11);  //2.7
    System.out.println(num12);  //2.6999999999999997 �ӽ�2.7��С��

    //�õ�һ����Ҫ��ʹ�õ�: �����Ƕ���������С���Ľ�������ж��ǣ�ҪС��
		//Ӧ�������������Ĳ�ֵ�ľ���ֵ����ĳ�����ȷ�Χ���ж�

    // ����д��
		if( num11 == num12) {
			System.out.println("num11 == num12 ���");
		}

		//��ȷ��д��
		if(Math.abs(num11 - num12) < 0.000001 ) {
			System.out.println("��ֵ�ǳ�С�����ҵĹ涨���ȣ���Ϊ���...");
		}
		// ����ͨ��java API  ���� ��һ����Ƶ�������ʹ��API
		System.out.println(Math.abs(num11 - num12));
		//ϸ��:�����ֱ�Ӳ�ѯ�õĵ�С������ֱ�Ӹ�ֵ���ǿ����ж����
  }
}
