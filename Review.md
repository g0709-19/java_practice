# Java GUI

## 1. 자바 GUI 프로그래밍 개요
### Hello world 출력
```
JFrame frame = new JFrame(제목);
JLabel label = new JLabel(내용);
frame.add(label);
frame.pack(); // 내용물에 맞게 크기 조절
frame.setVisible(true);
```
### 이클립스 오류: there are no recent launches
1. Window -> Preferences
2. Run/Debug -> Launching
3. Launch Operation -> Launch the associated project

**기존에 '이전에 실행시켰던 어플리케이션 시작'으로 되어있음**

## 2. 자바 GUI JFrame 크기, 위치 및 좌표계
### JFrame 위치 지정
```
JFrame.setLocation(int x, int y)
```
### Java 의 좌표계
* 우측으로 갈수록 X 값이 증가
* 하단으로 갈수록 Y 값이 증가

### JFrame 크기 조절
```
new Dimension(int x, int y);
JFrame.setPrefferedSize(Dimension);
```
**크기 조절 이후에 JFrame.pack() 을 해주지 않으면 적용 되지 않음**

## 3. 자바 JLabel 사용하기
### JLabel 생성
```
new JLabel(String);
JFrame.add(JLabel);
```

### JLabel Method
```
JLabel.setText(String);
JLabel.getText();
JLabel.setVerticalAlignment(SwingConstants);
JLabel.setHorizontalAlignment(SwingConstants);
JLabel.getVerticalAlignment();
JLabel.getHorizontalAlignment();
```

### 왜 SwingConstants 는 Interface 일까?
정의된 메소드가 따로 없기 때문에 enum 으로 작성하는게 적합하다고 생각했지만 interface 인 이유는 SwingConstants 를 구현하는 클래스가 필요한 경우가 생기는걸까?
