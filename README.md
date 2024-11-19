<div align="center">
  <h1>🧒 킨더피아 🐇</h1>
</div>

![킨더피아](https://github.com/user-attachments/assets/33ea9cdb-dc36-4684-bf3c-b78a116bc72c)

<div align="center">
  <strong>👨‍👩‍👧‍👦 부모와 아이들이 함께할 공간을 소개하며,<br> 🗨 모임을 만들어 함께 할 수 있는 웹 사이트</strong>
</div>
<br>
<div align="center">

</div>

<br>

❣ 회원 가입할 때 테스트 계정을 생성하거나, 로그인화면에서 [테스트 유저 계정으로 로그인] 버튼을 누르면
해당 프로젝트를 빠르게 살펴볼 수 있습니다.❣

[👉 킨더피아 배포링크 바로가기](http://ec2-3-38-150-41.ap-northeast-2.compute.amazonaws.com/)<br/>

[👉 킨더피아 위키 바로가기](https://github.com/SeSAC-3rd-Kinderpia/kinderpia_front/wiki)
<br>

## 📢 1. 서비스 소개

킨더피아는 '킨더(Kindergarten)'와 '유토피아(Utopia)'의 합성어로,
부모와 아이가 함께하는 이상적인 문화생활 플랫폼입니다.

현대 사회에서 바쁜 부모들이 자녀와 질 높은 시간을 보내기 어려운 점에 착안하여 기획되었습니다. 다양한 놀이시설, 박물관, 키즈카페 등의 정보를 제공하고, 같은 관심사를 가진 가족들이 모임을 만들 수 있는 기회를 제공합니다.

<br>

## 🙋 2. Back-End Developers

#### 김어진 [![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/qldirr)
- 유저, 관리자

#### 석원준 [![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/ymind14563)
- 채팅, 신고, 파이프라인 자동화 구축
- 서버 배포: AWS (EC2, RDS, S3), NGINX

#### 유예진 [![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/yjyoo6831)
- 장소 검색, 리뷰 CRUD

#### 윤예슬 [![GitHub](https://img.shields.io/badge/GitHub-181717?style=flat&logo=github&logoColor=white)](https://github.com/errorose)
- 모임 관리 시스템 개발

<br/>

## 📅 3. 개발일정

🗓️ 기간 : 2024.10.21 (월) ~ 11.08 (금)

- Jira를 활용한 체계적인 일정 관리와 효율적인 작업 분배
- 원활한 커뮤니케이션을 통한 프로젝트 진행 상황 실시간 공유

![개발일정](https://github.com/user-attachments/assets/036c4b70-714e-411b-b130-f6c007d87b01)

<br>

## ⚙️ 4. 기술 스택

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

## 📂 5. 프로젝트 폴더 구조

<br>

## 😀 6. 주요 데이터베이스 ERD

<br>

## 🏷️ 7. 기능 소개

### 0) 메인 페이지

| 시작 화면                                                                                                                                       | 온보딩 튜토리얼                                                                                                                                        |
| ----------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| <img src="https://github.com/user-attachments/assets/3332690a-2a31-413f-9a6c-6606b412eb72" width="243" height="auto" alt="메인페이지 시작화면"> | <img src="https://github.com/user-attachments/assets/c110df9e-f7c5-43fe-95f7-8d53225f6b1f" width="243" height="auto" alt="메인페이지 온보딩 튜토리얼"> |

### 1) 회원기능

| 회원가입 페이지                                                                                                                             | 로그인 페이지                                                                                                                             | 마이페이지                                                                                                                             |
| ------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| <img src="https://github.com/user-attachments/assets/4c0734b2-19c6-45fa-b7fe-0073d38a0d9d" width="243" height="auto" alt="회원가입 페이지"> | <img src="https://github.com/user-attachments/assets/646bd240-8742-4e46-a917-997d7ce949f4" width="243" height="auto" alt="로그인 페이지"> | <img src="https://github.com/user-attachments/assets/2c91a558-3ec1-4ab7-b906-c4e1f2db4764" width="243" height="auto" alt="마이페이지"> |

### 2) 장소기능

| 장소 검색                                                                                                                              | 장소 상세조회                                                                                                                              | 리뷰 작성/관리                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------ | ----------------------------------------------------------------------------------------------------------------------------------------- |
| <img src="https://github.com/user-attachments/assets/695a0e93-0dca-4084-8dba-0c37771e13e8"  width="243" height="auto" alt="장소 검색"> | <img src="https://github.com/user-attachments/assets/d623c84b-39bc-4f5a-98ae-7cdff044d1db"  width="243" height="auto" alt="장소 상세조회"> | <img src="https://github.com/user-attachments/assets/57b711b9-45a0-4f35-a0f2-0717c9162b61"  width="243" height="auto" alt="리뷰작성관리"> |

### 3) 모임기능

| 모임 검색                                                                                                                                 | 모임 생성                                                                                                                                 | 모임 참여                                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- |
| <img src="https://github.com/user-attachments/assets/d2c0adb0-dfdf-4fad-93e6-e9be9e252770"  width="243" height="auto" alt="리뷰작성관리"> | <img src="https://github.com/user-attachments/assets/4d29f7df-13ef-4c6b-85d1-e539535e29f5"  width="243" height="auto" alt="리뷰작성관리"> | <img src="https://github.com/user-attachments/assets/94873c45-a95a-440f-abba-fca146317e69"  width="243" height="auto" alt="리뷰작성관리"> |

| 모임 수정/관리                                                                                                                            | 채팅                                                                                                                                      |
| ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- |
| <img src="https://github.com/user-attachments/assets/befd81e7-e986-4708-a297-cca1c5ea76e5"  width="243" height="auto" alt="리뷰작성관리"> | <img src="https://github.com/user-attachments/assets/addd56ea-f22b-4273-8250-7246e3eb811f"  width="243" height="auto" alt="리뷰작성관리"> |

### 3) 관리자 기능

| 관리자 메인                                                                                   | 회원 통계                                                                                     |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| ![adminmain](https://github.com/user-attachments/assets/dc4c2712-e497-4abb-a3bd-1aa77238b3aa) | ![adminuser](https://github.com/user-attachments/assets/c435a81e-e2ff-4ac1-9e1d-f018fd98fdd5) |

| 모임 통계                                                                                        | 신고 조회                                                                                       |
| ------------------------------------------------------------------------------------------------ | ----------------------------------------------------------------------------------------------- |
| ![adminmeeting](https://github.com/user-attachments/assets/92aa4380-6008-48b4-a4ab-a231b4baf005) | ![adminreport](https://github.com/user-attachments/assets/a4def0d7-5ea3-4a62-b011-de689511273c) |
