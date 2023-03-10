# Java-Study
[java 응용] 명언앱 만들기 🪐

- App : 라우팅, 고객이 올바른 컨트롤러를 만나도록 교통정리

- **Controller** : 본인이 맡은 주제와 관련된 고객의 요구사항을 듣고, 처리 후 응답
    - 처리를 할 때, 본인이 판단하지 못하는 것은 서비스에 물어보는게 원칙
    - 식당에서 `점원`의 역할이라고 보면 된다.
    - 고객을 만나서, 그들의 요청을 받고 처리해준다.

- Service : 핵심로직을 담당한다.
    - 서비스는 오직 컨트롤러의 요청에 의해서만 일을 한다.
    - 식당에서 `메인 요리사`의 역할이라고 보면 된다.

- Repository : 데이터의 저장/조회를 담당한다.
    - 리포지터리는 오직 서비스의 요청에 의해서만 일을 한다.
    - 식당에서 `재료담당 요리사`의 역할이라고 보면 된다.

- DB : 데이터의 영속저장/조회를 담당한다.
    - 보통 외부 프로그램으로 작동한다.
        - 즉 개발자가 DB 프로그램을 구현하는 일은 없다.
            - 이미 구현되어 있다. 주로 MySQL, Oracle 과 같은 제품이 많이 사용된다.
    - 식당에서 `재료창고 관리자`의 역할이라고 보면 된다.
    - DB는 오직 리포지터리의 요청에 의해서만 일을 한다.
    

## **MVC 디자인패턴의 관점으로 봤을 때의 우리 프로그램의 구조**

- Model : Entity, Service, Repository
- View : 콘솔, 우리 프로그램은 콘솔 프로그램이다. 콘솔 프로그램의 특성 상 어쩔 수 없이 Controller 에 View 로직이 섞여있다.
- Controller : Controller
