# :seedling: Kinderpia 
## 프로젝트 소개

* 주제 : 부모와 아이들이 함께할 공간을 소개하며, 모임을 만들어 함께 할 수 있는 웹 페이지
* 기획 의도 : 전국에 있는 아이들을 위한 공간을 소개하고 서로의 경험을 나눌 수 있는 네트워크 서비스를 제공하고자 한다.

* 기간 : 2024.10.21 ~ 2024.11.08
* Test ID: test3859
* Test Password: test1234

<br>

## :raising_hand: Backend Developers
#### 김어진 [![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/qldirr)
- 유저, 관리자

#### 석원준 [![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/ymind14563)
- 채팅, 신고, 파이프라인 자동화 구축
- **서버 배포**: AWS (EC2, RDS, S3), NGINX

#### 유예진 [![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/yjyoo6831)
- 장소 검색, 리뷰 CRUD
#### 윤예슬 [![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/errorose)
- 모임 CRUD

<br>

## 🧰 Architecture


## ❓ 주요 기술 채택 이유
- **Spring Boot** : 모듈화된 아키텍처를 제공하며, 의존성 주입(Dependency Injection)같은 프로그래밍 패턴을 이해하고 많은 예제 및 라이브러리 사용을 위함.
- **Spring Security** : Spring Security와 통합되어 있어, 인증 및 권한 부여에 강력한 기능을 제공하기 위해 채택
- **JPA** : 객체 간 관계를 매핑해 복잡한 연관 관계도 손쉽게 관리할 수 있어 유지보수 편리성을 위해 채택
- **JWT** (JSON Web Token) : 보안 및 서버의 부하를 줄이고, 확장성을 높이기 위해 채택
- **Socket.io** : 채팅 기능을 위해 실시간 양방향 통신이 가능하고, 다양한 이벤트를 쉽게 처리하기 위해 채택
- **Multipart** : AWS 서버에 파일을 업로드하여 서버의 저장 공간 절약 및 파일 관리의 용이성과 파일 형식 및 크기 제한을 위해 채택
- **AWS** : 현재 클라우드 시장에서 가장 큰 점유율을 차지하고 있으며, EC2, S3, RDS 등 다양한 서비스를 지원하고, 자원을 확대/축소 하는 등 유연성의 이점으로 인해 채택
- **Jenkins** : 코드의 자동 빌드 및 배포 프로세스를 수행하여 버전관리의 용이 및 유지보수성 향상을 위함.

<br>

## 주요 페이지 소개 

## 메인 페이지 
![메인페이지](https://github.com/user-attachments/assets/9654fd23-52f6-41aa-ae93-e66270675524)

## 장소 상세 페이지 
![장소상세](https://github.com/user-attachments/assets/018f3597-96fb-42a3-904a-5df0868e843c)

## 장소 검색 페이지 
![장소검색](https://github.com/user-attachments/assets/ab79221d-8107-4ca7-bcde-d2f1a07efaee)

