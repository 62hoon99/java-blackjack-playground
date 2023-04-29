# 기능
## Denomination
- [x] score를 반환한다.

## Hit
- [x] draw(카드를 한 장 더 받고)하고 다음 state를 반환한다.
- [X] stay를 반환한다.

## Stay
카드를 더 뽑지 않고 차례를 마치는 것
- [x] 비율을 반환한다.

## Blackjack
처음 두 장의 카드 합이 21인 경우, 베팅 금액의 1.5배
- [x] 비율을 반환한다.
## Bust
카드 총합이 21을 넘는 경우. 배당금을 잃는다.
- [x] 비율을 반환한다.

## Started
- [x] 카드를 반환한다.

## Running
- [x] finished 상태인지 반환한다.
- [x] profit(이익)을 반환한다.

## Finished
- [x] draw(카드를 한 장 더 받기)하면 예외를 반환한다.
- [x] stay하면 현 클래스를 반환한다.
- [x] finished 상태인지 반환한다.
- [x] profit(이익)을 반환한다.

---

## User
- [ ] 현재 보유한 카드를 반환한다.
- [ ] 카드를 받는다.
- [ ] 결과를 반환한다.

## Player

## Dealer
- [ ] 결과반환 할 때 16이하이면 한 장 더 받는다.

---

## Cards
- [x] score 합산을 반환한다.

## Deck
- [x] 무작위 카드 하나를 반환한다.