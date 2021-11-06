# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.
---

## 구현할 기능 목록
- [x] 등수(정답 개수와 상금)들을 생성한다.
- [ ] 구입 금액을 입력 받는다. (UI)
- [x] 구매 개수를 구한다.
- [ ] 정답 숫자를 입력 받는다. (UI)
- [ ] 내 숫자를 생성한다. (숫자들 묶음의 그룹)
- [x] 내 숫자가 정답 숫자를 포함하는 지 확인한다.
- [x] 내 숫자가 정답 숫자를 포함하지 않는 지 확인한다.
- [x] 내 숫자들 묶음이 정답 숫자를 포함하는 지 확인한다.
- [x] 내 숫자들 묶음이 정답 숫자를 몇 개 포함하는 지 확인한다.
- [x] 내 숫자들 묶음이 몇등인지 결과 확인한다.
- [ ] 등수가 있다면 등수의 개수를 증가시켜준다.
- [ ] 모든 묶음을 확인하면 각 등수 마다 몇 개 있는지 보여준다. (UI)
- [ ] 등수 개수의 합에 따라 수익률이 얼마인지 알려준다. (UI)

---

## 테스트 케이스

---
정답 숫자 1 내 숫자 1개 생성    
정답 숫자 1  
내 숫자 1  
결과 true

---
정답 숫자 여러개 내 숫자 1개 생성  
정답 숫자 1 2 3  
내 숫자 1  
결과 true
---
정답 숫자 1 2 3 4 5 6  
내 숫자 1 2 3 4 5 6  
결과 6
---
정답 숫자 1 2 3 4 5 6  
내 숫자 7 8 9 10 11 12  
결과 0
---
정답 숫자 1 2 3 4 5 6  
내 숫자 1 8 3 5 10 12  
결과 3
---
정답 숫자 1 2 3 4 5 6  
내 숫자 1 2 3 4 5 6  
결과 match6 -> 금액 확인
---



## 주의 사항
- 핵심 로직 & UI 로직을 구분한다.
- UI 로직 InputView, ResultView 클래스 단위로 구분한다.
- indent 1까지만
- 메소드 길이는 15 line 까지
- **모든 로직에 단위 테스트 구현 (UI 제외)**
- 자바 코드 컨벤션 지키기 (https://myeonguni.tistory.com/1596)
- else 사용하지 않기

---------------------------------------------------------------------------------------------------


# 문자열 덧셈 계산기
## 진행 방법
* 요구사항을 파악한다.
* 테스트 케이스를 만든다.
* 요구 사항에 필요한 플로우를 그려본다.
* 필요한 클래스들을 간단하게 그려본다.
* 작업을 진행한다.
* PR을 보낸다!


## 테스트 케이스

---
1. 빈 문자열 or null 문자열 입력
   null -> calculatedValue 0
   "" -> calculatedValue 0
---
2. 커스텀 구분자 없는 입력
   1,2,3 -> {1 2 3}
   1:2:3 -> {1 2 3}
---
3. 커스텀 구분자 있는 입력
   //b\n1b2b3 -> {1 2 3}
---
4. 숫자 아닌 값 테스트
   a,b,c -> IllegalArgumentException
---
5. 음수 값 테스트
   -1,-2,-3 -> NegativeNumberException
---
6. 값 1개 테스트
   2 -> 2
---
7. 값 복수개 테스트
   1,2 -> 3

## 주의 사항
* indent depth는 늘 1단계만 유지!
* method maximum 10line 유지!
* else 사용하지 않을 것!

## 기능 목록  
* 문자열 입력을 받는다.  
* 앞 부분의 문자가 (//~\n)으로 받는 지 확인한다.  
   * 커스텀 구분자 입력 없는 경우 쉼표, 콜론 구분자 문자열을 파싱한다.  
   * 커스텀 구분자 있는 경우 1-1 문자열에 커스텀 구분자를 추가한다. (// 과 \n 사이)  
* 올바른 값인지 확인한다.    
   * 올바른 값 테스트 - null or 빈 문자 (정상 처리)  
* 올바른 숫자인지 확인한다.  
   * 숫자 인지 테스트 (IllegalArgumentException)    
   * 음수 숫자값 아닌지 테스트 (NegativeNumberException <|- RuntimeException)  
* 커스텀 구분자를 계산기에 적용한다.  
* 결과값을 보여준다.  

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)
 