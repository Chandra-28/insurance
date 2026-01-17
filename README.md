# insurance-claim
Developed a production-ready full-stack Online Insurance Claim Management System using Java, Spring Boot, REST, Hibernate, Angular &amp; MySQL. Implemented JWT authentication, role-based access, admin approval APIs, and deployed cloud-ready architecture.
insurance-claim-management-system/
 ├── backend/
 │   └── insurance-claim-backend/
 │       ├── pom.xml
 │       ├── src/main/java/com/example/insurance/
 │       │    ├── InsuranceApplication.java
 │       │    ├── controller/ (AuthController.java, ClaimController.java, AdminController.java)
 │       │    ├── entity/ (User.java, Policy.java, Claim.java)
 │       │    ├── repository/ (UserRepository.java, PolicyRepository.java, ClaimRepository.java)
 │       │    ├── service/ (ClaimService.java)
 │       │    └── security/ (JwtUtil.java, JwtRequestFilter.java, SecurityConfig.java)
 │       └── src/main/resources/application.properties
 └── frontend/
     └── insurance-claim-frontend/
         └── src/app/
             ├── login/ (login.component.ts, login.component.html)
             ├── claim/ (claim.component.ts, claim.component.html)
             ├── admin/ (admin.component.ts, admin.component.html)
             ├── services/ (auth.service.ts, claim.service.ts)
             └── app.module.ts
 README.md
