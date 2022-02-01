# stockcrawling-api
주식 정보 가져오는 api

---

spring boot run
 - ./gradlew build && java -jar build/libs/demo-0.0.1-SNAPSHOT.jar 

docker image build
 - docker build --build-arg JAR_FILE=build/libs/\*.jar -t springio/demo .
