<h1>Spring Boot X Spring Data JPA</h1>

<h2>

  * [개발자를 위한 HTTP 웹 기본 지식](https://www.inflearn.com/course/http-%EC%9B%B9-%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC)
  * [Spring 핵심 원리](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%ED%95%B5%EC%8B%AC-%EC%9B%90%EB%A6%AC-%EA%B8%B0%EB%B3%B8%ED%8E%B8#curriculum)
  * [Spring Boot와 JPA 활용1 - 웹 애플리케이션 개발](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-JPA-%ED%99%9C%EC%9A%A9-1#reviews)
  * [Spring Boot와 JPA 활용2 - API 개발과 성능 최적화](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-JPA-API%EA%B0%9C%EB%B0%9C-%EC%84%B1%EB%8A%A5%EC%B5%9C%EC%A0%81%ED%99%94)
  
  </h2> 
강의를 수강하며 만들어본 웹 프로젝트

</br> </br>
<h2>🛠 Stack</h2>

|분류|Stack|
|---|-------------|
|BACK-END| <img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> <img src="https://img.shields.io/badge/Spring Boot-6DB36F?style=for-the-badge&logo=Spring Boot&logoColor=white"> <img src="https://img.shields.io/badge/junit5-25A162?style=for-the-badge&logo=junit5&logoColor=white">|
|DATABASE|<img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white"> <img src="https://img.shields.io/badge/Redis-DC382D?style=for-the-badge&logo=Redis&logoColor=white"> <img src="https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white"> |
|RENDERING| <img src="https://img.shields.io/badge/Thymleaf-005F0F?style=for-the-badge&logo=Thymleaf&logoColor=white"> |

</br></br>
<h2>🖼 Images</h2>

| ![image](https://github.com/jw0293/Spring_JPA/assets/80098469/72c74912-d9ce-4ad0-ba38-48b8041dc6c9) | ![image](https://github.com/jw0293/Spring_JPA/assets/80098469/d3b14d64-06b4-4766-b16d-cb64a44bbdf5) |
| :------------------------------------------------------------------------------------------------------------: | :------------------------------------------------------------------------------------------------------------: |
|                                            DATA INPUT                                                |                                           DATA SEARCH                                             |

</br></br>
<h2>📖 Content</h2>

<h3> 웹 애플리케이션의 이해 </h3>

[웹 애플리케이션의 이해(1) : 웹 서버, 웹 애플리케이션 서버](https://wonsjung.tistory.com/431) </br> 
[웹 애플리케이션의 이해(2) : 서블릿](https://wonsjung.tistory.com/432) </br> 
[웹 애플리케이션의 이해(3) : 동시요청, 멀티 쓰레드](https://wonsjung.tistory.com/433) </br> 
[웹 애플리케이션의 이해(4) : HTML, CSR, SSR](https://wonsjung.tistory.com/434) </br>  </br>

<h3>HTTP 기본 지식</h3>

[HTTP 정리](https://wonsjung.tistory.com/category/HTTP) </br>
[HTTP 요청(1) : 쿼리 파라미터](https://wonsjung.tistory.com/437) </br> 
[HTTP 요청(2) : @RequstParam, @ModelAttribute](https://wonsjung.tistory.com/438) </br> 
[HTTP 요청(3) : 단순 텍스트](https://wonsjung.tistory.com/439) </br> 
[HTTP 요청(4) : JSON](https://wonsjung.tistory.com/440) </br> </br> 


<h3>Spring의 이해와 원리</h3>

[Spring의 기본, 오브젝트 이해하기](https://wonsjung.tistory.com/353) </br>
[관심사의 분리 + 리팩토링](https://wonsjung.tistory.com/354) </br>
[DB 커넥션 독립 / 디자인 패턴](https://wonsjung.tistory.com/355) </br>
[개방 폐쇄 원칙 / 전략 패턴](https://wonsjung.tistory.com/358) </br>
[Spring's IoC](https://wonsjung.tistory.com/359) </br>
[Spring's IoC 용어 정리](https://wonsjung.tistory.com/360) </br>
[싱글톤 패턴과 Spring에서의 싱글톤](https://wonsjung.tistory.com/449) </br>
[Spring's Design Pattern](https://wonsjung.tistory.com/462) </br>
[Spring's TEST(1)](https://wonsjung.tistory.com/480) </br>
[Spring's TEST(2)](https://wonsjung.tistory.com/483) </br>


<h3>Lombok</h3>

[Constructor : @AllConstructor, @NoArgsConstructor, @RequiredArgsConstructor](https://wonsjung.tistory.com/382) </br>
[BaseTimeEntity : @MappedSupperclass, @EntityListeners](https://wonsjung.tistory.com/383) </br>
[@Transactional](https://wonsjung.tistory.com/384) </br>
[@RestController, @RequestBody, @ResponseBody](https://wonsjung.tistory.com/387) </br>
[@Data](https://wonsjung.tistory.com/388) </br>
[@PostConstruct, @PreDestroy](https://wonsjung.tistory.com/392) </br>
[빈 등록 : @Bean, @Configuration, @Component](https://wonsjung.tistory.com/396) </br>
[@RequestParam, @ModelAttribute](https://wonsjung.tistory.com/450) </br> </br>


<h3>API 개발 및 최적화</h3>

[RESTful API란?](https://wonsjung.tistory.com/418) </br> 
[API 개발(1) : Result 클래스로 유연한 JSON 반환](https://wonsjung.tistory.com/421) </br>
[API 개벌(2) : 지연 로딩을 적용한 API 조회](https://wonsjung.tistory.com/424) </br>
[API 개발(3) : 페치 조인을 적용한 지연 로딩 최적화](https://wonsjung.tistory.com/425) </br>
[API 개벌(4) : 컬렉션 조회](https://wonsjung.tistory.com/427) </br>
[API 개발(5) : 페치 조인 최적화를 적용한 컬렉션 조회](https://wonsjung.tistory.com/428) </br>
[API 개벌(6) : 페치 조인의 페이징 한계 돌파](https://wonsjung.tistory.com/429) </br> </br>
