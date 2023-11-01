package main.java.com.ohgiraffer.section01.String;

public class Application {
    public static void main(String[] args){
        /*
        * chatAt() : 해당 문자열의 인덱스에서 해당하는 문자를 반환한다.
        * 인덱스는 0부터 시작하는 숫자 세계이며,
        * 인덱스를 벗어난 경우 IndexOutOfBoundException이 발생한다.
        * */

        String str1 = "apple";
        for(int i = 0; i < str1.length(); i++){
            System.out.println("[" + i + "] 번째 문자열 " + str1.charAt(i));
        }

//        for(char a : str1) { // foreach문에서는 문자열을 지원하지 않는다.
//
//        }

        /*
        * compareTo() : 인자로 전달된 문자열과 사전 순으로 비교하여
        * 두 문자열이 같다면 0을 반환, 인자로 전달된 문자열보다 작으면 음수를 크면 양수를 반환한다.
        * */

        String java1 = "java";
        String java2 = "java";
        String java3 = "JAVA";
        String java4 = "oracle";
        System.out.println("compareTo() " + java1.compareTo(java2));
        System.out.println("소문자와 대문자 비교 compareTo() " + java2.compareTo(java3));
        System.out.println("대문자와 소문자 비교 compareTo() " + java3.compareTo(java2));
        System.out.println("다른 값 비교 compareTo() " + java1.compareTo(java4));
        System.out.println("다른 값 비교 " + java4.compareTo(java1));

        // comparetoIgnoreCase() : 대소문자를 구분하지 않고 비교한다.
        System.out.println("comareToIgnoreCase() : " + (java3.compareTo(java1)));
        System.out.println("comareToIgnoreCase() : " + (java3.compareTo(java4)));

        /*
        * concat() : 문자열에 인자로 전달된 문자열을 합치기해서 새로운 문자열을 반환한다.
        * */
        System.out.println("concat() : " + (java1.concat(java4)));

        /*
        * indexOf()문 : 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환한다.
        * 단, 일치하는 문자가 없는 경우 -1을 반환한다.
        * */
        String indexOf = "java oracle";
        System.out.println("indexOf('a') : " + indexOf.indexOf('a'));
        System.out.println("indexOf('z') : " + indexOf.indexOf('z'));

        /*
        * lastIndexOf() : 문자열 특정 문자를 탐색하는데 탐색의 기준은 뒤에서 부터이다.
        * */
        System.out.println("indexOf('a') : " + indexOf.lastIndexOf('a'));
        System.out.println("indexOf('z') : " + indexOf.lastIndexOf('z'));

        /*
        * trim() : 문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다.
        * */

        String trimStr = "    java      ";
        System.out.println("trisStr : #" + trimStr + "#");
        System.out.println("trim() : #" + trimStr.trim() + "#");

        /*
        * toLowerCase() : 문자열을 소문자로 변경한다.
        * toUpperCase() : 문자열을 대문자로 변경한다.
        * */
        String value = "java";
        System.out.println("toUpperCase :" + value.toUpperCase());
        System.out.println("toLowerCase :" + value.toLowerCase());
        System.out.println(value);

        /*
        * subString(): 문자열의 일부 잘라내어 새로운 문자열을 반환한다.
        * */
        String javascript = "javascript";
        System.out.println("substring(3,6) : " + javascript.substring(3,6));

        /*
        * replace() : 문자열에서 대체할 문자열을 기존의 문자열을 변경해서 변환한다.
        * */

        System.out.println("replace() : " + javascript.replace("java", "python"));

        /*
        * length() : 문자열의 길이를 정수형으로 반환한다
        * */

        /*
        * isEmpty() : 문자열의 길이가 0이면 true , 아니면 false를 반환해준다.
        * */

        String test = "";
        String nullTest = null;
        System.out.println(test.isEmpty());
        System.out.println("null TEST " + (nullTest == null));
        //System.out.println("null Test" + nullTest.isEmpty());

        /*
        * 문자열 객체를 만드는 방법
        * "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관련한다.(singletone)
        * new ("문자열") : 매번 새로운 인스턴스를 생성한다.
        * */

        String stringTest1 = "java";
        String stringTest2 = "java";
        String newString1 = new String("java");
        String newString2 = new String("java");

        /*
        * String test = "java"와 같은 리터럴 타입의 문자열은
        * stak에 있는 string pool에서 리터럴 형태의 문자열은 새로
        * 동일한 문자열은 리터럴 형식으로 전달하여도 String pool에 존재하는 주소값을 반환한다.
         * */
        System.out.println("str1 == str2 " + (stringTest2 == stringTest1));
        System.out.println("StringTest2 == newStrint1 " + (stringTest1 == newString1));
        System.out.println("String의 hashcode " + stringTest1.hashCode());

        System.out.println("stringTest의 newString의 값 비교 : " + stringTest2.equals(newString1));
    }
}
