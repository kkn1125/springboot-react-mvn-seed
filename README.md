# Getting started with Spring Boot + React + Maven

현재 작성된 문서는 springboot + react + Maven 환경 구축을 위해 만들어진 Seed Project입니다.

## 개발 환경

- vscode
- react 18.1.0
- react-router-dom
- springboot
- lombok
- postgresql
- h2
- yarn

## 사용방법

> 아래는 build하는데 필요한 내용입니다.

```bash
$ mkdir clone-project
$ cd clone-project
$ curl -L -O -J https://github.com/kkn1125/springboot-react-mvn-seed/archive/refs/heads/main.zip && unzip *.zip -d . && rm -f springboot-react-mvn-seed-main.zip && shopt -s dotglob && mv -f springboot-react-mvn-seed-main/* ./ && rm -r -f springboot-react-mvn-seed-main/

$ curl -L -O -J https://github.com/kkn1125/springboot-react-front-seed/archive/refs/heads/main.zip && unzip *.zip -d ./src/main/frontend/ && rm -f ./springboot-react-front-seed-main.zip && shopt -s dotglob && mv -f ./src/main/frontend/springboot-react-front-seed-main/* ./src/main/frontend/ && rm -r -f ./src/main/frontend/springboot-react-front-seed-main/

$ ./mvnw clean install -e
$ cd target/ && java -jar seedprj-0.0.1-SNAPSHOT.jar

# run server with react !
```

위의 명령줄이 작동하지 않을 때는 아래의 과정을 따라하시기 바랍니다.


```bash
$ mkdir clone-project 
$ git clone https://github.com/kkn1125/springboot-react-mvn-seed.git folder_name
$ cd folder_name
$ git clone https://github.com/kkn1125/springboot-react-front-seed ./src/main/frontend/

$ ./mvnw clean install -e
$ cd target/ && java -jar seedprj-0.0.1-SNAPSHOT.jar
```
아래 경로로 접속합니다.

http://localhost:8080

## Submodule repository

springboot-react-front-seed 저장소와 연결되어 있습니다.

## 파일 구조

.mvn/  
│└┬─wrapper/  
│　├──maven-wrapper.jar  
│　└──maven-wrapper.properties  
├┬─src/  
│├┬─main/  
││├──frontend/  
││├┬─java/com/seedprj/    
│││├┬─restController/  
││││└──TestRestController.java  
│││└──PrjApplication.java  
││└┬─resources/  
││　├──static/  
││　└──application.properties  
│└┬─test/  
│　└┬─java/com/seedprj/  
│　　└──SredprjApplicationTests.java  
├──.gitignore  
├──.gitmodules  
├──mvnw  
├──mvnw.cmd  
├──pom.xml  
└──README.md  

<!-- gradle/
 wrapper/
  gradle-wrapper.jar
  gradle-wrapper.properties
src/
 main/
  frontend/
  java/com/gradleseed/
   prj/
    restController/
     TestRestController.java
    PrjApplication.java
  resources/
   static/
   application.properties
 test/
  java/com/gradleseed/
   prj/
    PrjApplicationTests.java
.gitignore
.gitmodules
build.gradle
gradlew
gradlew.bat
settings.gradle -->

## Author

profile: https://github.com/kkn1125

blog : https://kkn1125.github.io/

portfolio : https://kkn1125.github.io/portfolio