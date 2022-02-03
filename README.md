# stockcrawling-api  
주식 정보 가져오는 api
---
사용법
 1. http://localhost:8080/crawling/stockinfojson 에 REST API방식으로 요청을 보낸다.
 2. https://finance.naver.com/ 에서 코스닥/코스피 주식 전체를 크롤링해온다.
 3. 아래와 같은 json 형식으로 return한다.
 ```
 {
  "error": null,
  "data": [{
   "id": "1",
   "stockcode": "000000",
   "stockdate": "2022-02-03",
   "stockname": "창진고",
   "stockidx": 1,
   "highprice": 9999999,
   "lowprice": 9999999,
   "startprice": 9999999,
   "endprice": 9999999,
   "fprice": 9999999,
   "frate": "99.99"
   }
  ]
 }
 ```

---

spring boot run
 - ./gradlew build && java -jar build/libs/demo-0.0.1-SNAPSHOT.jar 

docker image build
 - docker build --build-arg JAR_FILE=build/libs/\*.jar -t springio/demo .
