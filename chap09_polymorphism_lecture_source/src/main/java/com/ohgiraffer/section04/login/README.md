# 로그인 기능 만들기
## interface를 이해하자
### 주제 : 사용자가 sns를 이용한 로그인 기능
설계 내용 : memberDTO 클래스 생성 : loginId, password <br>
memberservice.class : MemberDTO 클래스를 매개변수로 받고 기존에 있는 사용자와 같은 값을 가지는지 확인한다
login() / signUp()
<br>

SnsAuth.interface : login() 메서드를 구현해줘야 한다.
<br>
sns 인증 방식은 총 3가지를 제공한다.
아래의 클래스는 snsAuth를 상속받아 구현.
1. googleAuth
2. kakaoAuth
3. naverAuth

## 프로그램 흐름
### main에서 scanner를 통해 사용자에게 인증 방식을 입력받는다. <br>
### 인증 방식이 결정되면 사용자에게 아이디 비밀번호를 입력받는다. <br>
### 입력받은 인증에 따라 사용자에게 sns 인증 방식을 제공한다. <br>
### 출력화면 예시 <br>
### 없는 회원의 경우 : 000인증한 회원이 없습니다.
### 존재하는 회원의 경우 : 000에 인증된 id님 환영합니다.


