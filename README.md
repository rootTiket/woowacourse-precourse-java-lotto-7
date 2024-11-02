# java-lotto-precourse

## 기능 요구 사항
### 간단한 로또 발매기를 구현한다.

- 로또 번호의 숫자 범위는 1~45까지이다.
- 1개의 로또를 발행할 때 중복되지 않는 6개의 숫자를 뽑는다.
- 당첨 번호 추첨 시 중복되지 않는 숫자 6개와 보너스 번호 1개를 뽑는다.
- 당첨은 1등부터 5등까지 있다. 당첨 기준과 금액은 아래와 같다.
```
1등: 6개 번호 일치 / 2,000,000,000원
2등: 5개 번호 + 보너스 번호 일치 / 30,000,000원
3등: 5개 번호 일치 / 1,500,000원
4등: 4개 번호 일치 / 50,000원
5등: 3개 번호 일치 / 5,000원
```
- 로또 구입 금액을 입력하면 구입 금액에 해당하는 만큼 로또를 발행해야 한다.
- 로또 1장의 가격은 1,000원이다.
- 당첨 번호와 보너스 번호를 입력받는다.
- 사용자가 구매한 로또 번호와 당첨 번호를 비교하여 당첨 내역 및 수익률을 출력하고 로또 게임을 종료한다.
- 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
- Exception이 아닌 IllegalArgumentException, IllegalStateException 등과 같은 명확한 유형을 처리한다.

## 구현할 기능 목록

입력 값 처리

- 금액을 입력받는 기능
- 입력받은 금액을 숫자로 변환하는 기능
- 금액을 통해 로또 매수를 계산하는 기능

로또 생성

- 무작위 숫자를 뽑는 기능
- 숫자 6개를 이용해 로또를 생성하는 기능
- 로또 매수를 입력하면 매수만큼 로또를 생성하는 기능

당첨번호 생성

- 사용자에게 6개의 숫자와 보너스 숫자를 입력받는 기능

로또 당첨 여부 확인

- 당첨번호를 이용해 몇개의 번호가 맞는지 체크하는 기능
- 보너스 번호가 맞는지 체크하는 기능
- 매칭되는 번호의 개수와 보너스 점수를 보고 등수를 반환하는 기능

수익률 계산

- 등수당 몇 번 당첨되었는지 체크하는 기능 
- 수익률을 계산하는 기능


출력 처리

- 로또 번호를 출력 포맷에 맞게 변환하는 기능
- 생성된 로또 번호를 출력하는 기능
- 로또의 등수와 매수를 출력하는 기능

## 예외 체크리스트

### 입력값 처리 - 금액 입력시

- [ ] 숫자가 아닐 경우 예외처리
- [ ] 1000단위가 아닐 경우 예외처리

### 입력값 처리 - 당첨번호 입력시

- [ ] 숫자가 아닐경우 예외처리
- [ ] 숫자의 범위가 1 ~ 45에서 벗어날 경우 예외처리
- [ ] 당첨 번호에 중복이 있을 경우 예외처리
- [ ] 당첨 번호 입력시 쉼표(,)외에 구분자가 올 경우 예외처리

### 출력 처리
- [ ] 로또 번호를 오름차순으로 정렬
- [ ] 수익률 소수점 둘째 자리에서 반올림
