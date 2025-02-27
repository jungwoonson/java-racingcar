# 자동차 경주 게임

## 초간단 자동차 경주 게임 구현

### 3단계 기능 요구사항
- 초간단 자동차 경주 게임을 구현한다.
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
- 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.

### 4단계 기능 요구사항
- 각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.
- 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분한다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.

### 구현할 기능 목록
- 자동자
  - [x] 움직일 수 있다.
  - [x] 움직이지 않을 수 있다.
  - [x] 이름을 입력 받는다.
- 조건
  - [x] 0 ~ 9 의 랜덤 값이 4 이상인 경우와 아닌 경우를 알려줄 수 있다.
- 입력
  - [x] 콤마로 구분된 자동차 이름을 입력 받는다.
  - [x] 움직임 수를 입력 받는다.
- 출력
  - [x] 자동차의 위치를 출력할 수 있다.
  - [x] 자동차 이름을 출력한다.
  - [x] 우승자를 출력한다.
- 레이싱 게임
  - [x] 입력을 받고 게임을 진행한뒤 결과를 출력한다.
- 닉네임
  - [x] 닉네임은 null일 수 없다.
  - [x] 닉네임 앞뒤에 white space가 있으면 white space는 제거된다.
  - [x] 닉네임은 공백일 수 없다.
  - [x] 닉네임은 5자를 초과할 수 없다.
- 레이싱 출전 자동차
  - [x] 출전될 자동차를 세팅한다.
  - [x] 자동차들을 움직인다.
  - [x] 자동차들의 위치상태를 알려준다.
  - [x] 자동차들의 이름을 알려준다.
  - [x] 우승자를 알려준다.
- 이름 구분자
  - [x] 자동차 이름을 콤마로 나눈다.

### 프로그래밍 요구사항
- 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외.
    - 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
    - UI 로직을 InputView, ResultView와 같은 클래스를 추가해본다.
- 자바 코드 컨벤션을 지키면서 프로그래밍한다.
    - Code Style은 intellij idea Code Style. Java을 따른다.
- else 예약어를 쓰지 않는다.
    - switch/case도 사용하지 않는다.

### 기능 목록 및 commit 로그 요구사항
- 기능을 구현하기 전에 README.md 파일에 구현할 기능 목록을 정리해 추가한다.
- git의 commit 단위는 앞 단계에서 README.md 파일에 정리한 기능 목록 단위로 추가한다.
    - 참고문서: [AngularJS Commit Message Conventions](https://gist.github.com/stephenparish/9941e89d80e2bc58a153)

### MVC 정리

- MVC
  - Mocde - View - Controller
  - 소프트웨어 디자인 패턴
  - 비즈니스 로직과 화면을 구분하는데 중점을 둠
  - 관심사를 분리하여 향상된 관리를 제공

- Model
  - 데이터와 비즈니스 로직을 관리
  - 앱에 포함될 데이터가 무엇인지 정의
  - 데이터의 상태가 변경되면 View 또는 Controller에게 알림

- View
  - 레이아웃과 화면을 처리
  - 데이터를 보여주는 방식을 정의

- Controller
  - 명령을 Model과 View 부분으로 라우팅
  - 사용자로부터의 입력에 대한 응답으로 Model, View를 업데이트 하는 로직을 포함