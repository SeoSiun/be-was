# java-was-2023

Java Web Application Server 2023

## 프로젝트 정보 

이 프로젝트는 우아한 테크코스 박재성님의 허가를 받아 https://github.com/woowacourse/jwp-was 
를 참고하여 작성되었습니다.

## 요구사항

### step1 - index.html 응답
- [x] 정적인 html 파일 응답 
  - http://localhost:8080/index.html 접속시 index.html 파일을 읽어 응답
  
- [x] HTTP Request 내용 출력
  - 서버로 들어오는 HTTP Request 내용을 읽고 log.debug로 출력

- [x] 기존 Thread 기반 프로젝트를 Concurrent 패키지를 사용하도록 수정

### step2 - GET으로 회원가입
- [x] '회원가입' 클릭시 회원가입 폼 표시
- [x] 회원가입 폼에서 '가입' 클릭시 전달되는 사용자 입력값을 파싱해 model.User 클래스에 저장
  - HTML과 URL을 비교 후 파싱할 것
  - 유지보수가 편하도록!
- [x] Junit을 활용한 단위테스트

### step3 - 다양한 컨텐츠 타입 지원
- [x] html, css, js, ico, png, jpg 확장자를 지원해야 한다
- [x] static 폴더 내의 정적 콘텐츠에 대한 요청이 정상적으로 처리되어야 한다

### step4 - POST로 회원 가입
- [x] 회원가입 POST로 수정!
  - [x] user/form.html 파일의 form 태그 method를 post로 수정
  - [x] body에서 인자 읽어오기
- [x] 가입 완료시 index.html 페이지로 리다이렉트
  - [x] HTTP redirect 기능 구현하기
  - [x] statusCode 302로 설정

### step5 - 쿠키를 이용한 로그인
- [x] 로그인 메뉴 클릭시 user/login.html로 이동해 로그인할 수 있음
- 로그인 성공 시
  - [x] DataBase에 저장된 유저의 아이디, 비밀번호와 같은지 확인하여 성공여부 판단
  - [x] index.html로 리다이렉트
  - [x] 헤더의 쿠키 값을 SID=[세션 ID]로 응답
    - [x] 세션 ID는 랜덤한 숫자 또는 문자열 (UUID로 구현)
    - [x] 세션 아이디에 해당하는 유저 정보에 접근 가능해야한다.
- [x] 로그인 실패 시 user/login_failed.html로 리다이렉트

### step6 - 동적인 HTML
- [x] 동적인 html 구현
  - 로그인 상태인 경우 (Cookie 헤더에 있는 sid의 유저가 존재하는 경우?)
    - [x] /index.html에서 사용자 이름을 표시
    - [x] /user/list에서 사용자 목록 출력
  - 로그인 상태가 아닌 경우
    - [x] /index.html에서 '로그인' 버튼을 표시
    - [x] /user/list 페이지 접근시 로그인 페이지(login.html)로 리다이렉트

---
## 학습할 내용

### step1 - index.html 응답
- [x] [Web Server, WAS](https://github.com/SeoSiun/be-was/wiki/Web-Server-&-WAS)
- [x] 자바 스레드 모델에 대해 학습 (버전별 변경점, 향후 지향점)
  - [x] [JVM](https://github.com/SeoSiun/be-was/wiki/JVM-(Java-Virtual-Machine))
  - [x] [Thread & Java Thread model](https://github.com/SeoSiun/be-was/wiki/%EC%93%B0%EB%A0%88%EB%93%9C-(Thread))
- [x] [자바 Concurrent 패키지](https://github.com/SeoSiun/be-was/wiki/Concurrent-%ED%8C%A8%ED%82%A4%EC%A7%80(Java.util.concurrent))
- [x] [HTTP](https://github.com/SeoSiun/be-was/wiki/HTTP)
- [x] [입출력 Stream](https://github.com/SeoSiun/be-was/wiki/%EC%9E%85%EC%B6%9C%EB%A0%A5-Stream)
- [x] [Socket](https://github.com/SeoSiun/be-was/wiki/Socket)
