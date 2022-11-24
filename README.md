### 리뷰 사항
---

_11.24_

```java
//이거는 기본적으로 import 해줘야 한다.

import java.util.*;
```

```java
// Scanner 기본 사용법

 Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();


```

```java
//배열 입력받는 방법
int[] arr = new int[n];
    for (int i = 0; i < n; i++){
      arr[i] = sc.nextInt();
    }
```

```java
//정렬 하는 방법

Arrays.sort(arr);
```

***

```java
//List 복사 생성
List<Integer> inList = new ArrayList<>();

//deep copy or shallow copy? => shallow copy
List<List<Integer> outList = new ArrayList<>(inList); 
//내부에 있는 객체가 기본 타입이면 괜찮을것 같다. PS경우 보통 기본타입이라 괜찮을듯!

//Do the Test!
List<MyObject> src = new ArrayList
src.add(ob); // ob 객체

List<MyObject> dst = new ArrayList<>(src); //복사생성
System.out.println(src);
System.out.println(dst);

/* 출력결과 
[MyObject@1c20c684]
[MyObject@1c20c684]
*/

// shallow copy 이다.
```
<hr/>

```java
//이차원 배열 생성

for (int i = 0; i < n; i++){
  for (int j = 0; j < m; j++){
    int val = sc.nextInt();
    InLst.add(val);
  }
  //이 코드가 핵심!!
  OutLst.add(new ArrayList<>(InLst));  //리스트 그대로 넣으면 안됨
  InLst.clear();
}
```

<hr/>

```java
//최대 최솟값

Math.min(12, 3);
Math.max(13, 2);

//Collections max or min value 
Collections.max(list);
Collections.min(list);
```