package section05.typecasting;

public class Application04 {
    public static void main(String[] args){
        int inum = 290;
        byte bnum = (byte)inum;
        System.out.println("inum : " + inum);
        System.out.println("bnum : " + bnum); // byte 앞 부분의 손질로 인해 예측이 어렵다.

        double height = 178.8;
        int floatHeight = (int)height;
        System.out.println("height : " + height);
        System.out.println("floatHeight : " + floatHeight);

        System.out.println("===============문제=======================");

        //10명의 반 학생이 있으며 학생들의 키는 각각 178.5, 170.3, 190.7, 188.678, 160.8이다. 우리는 학생의 평균 키를 구해서 화면에 출력(소수자리 절삭)

        double st1 = 178.5;
        double st2 = 170.3;
        double st3 = 190.7;
        double st4 = 188.678;
        double st5 = 160.8;

        double sum = st1 + st2 + st3 + st4 + st5;

        double average = sum / 5;

        System.out.println("1반 학생 5명의 평균 키는 " + (int)average + "cm이다.");

        // 문자 z에 대응하는 숫자를 화면에 출력해주세요
        char zz = 'z';
        System.out.println((int)zz);

        //3
        long lnum = 10L;
        int num = 190;
        int sum2 = (int)num + num;
        int sum3 = (int)(num + lnum);

        //4
        double vat = 0.1;
        double sales1 = 150400 - (150400 * vat);
        double sales2 = 1400 - (1400 * vat);
        double sales3 = 25000 - (25000 * vat);
        double sales4 = 30000 - (30000 * vat);
        System.out.println("10월 18일의 매출은 " + (int)(sales1 + sales2 + sales3 + sales4) + "원 입니다");


    }
}
