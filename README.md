## JVM-Compiler-ByteCode

- JAVA 기본 문법과 **JVM 메모리 영역**에 대한 이해/연습울 위한 레포지토리입니다.

### 구성

- 기본 문법에 대한 **java 파일**과,
- compile된 class파일을 javap -v 옵션을 통해 **deassemble한 파일**이 모여있습니다.
- JAVA version : **17**

### Package 구조

main  
&nbsp;&nbsp;└ sourcecode  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└ 기본문법 <U>package</U>  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└ 기본문법. **java**  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└ deassembled <U>package</U>  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└ **deassembled file**  


### 참고
* ORACLE의 Class File Format
    * https://docs.oracle.com/javase/specs/jvms/se10/html/jvms-4.html
* Java Bytecode Instructions
    * https://en.wikipedia.org/wiki/List_of_Java_bytecode_instructions
    * 니모닉 / OPcode(hex / binary) / Other Bytes / Stack / Description 으로 구성

### **※ 주의**
* JVM vendor 및 version에 따라 적용된 ByteCode Instruction이 상이할 수</br>
  있는지의 여부는 아직 확인하지 못했습니다.
* 개인적인 학습 목적의 공간인 만큼, <U>코드에 대한 적절한 설명 및 가독성이 낮습니다.</U>
* ***2023-10-07***</br> 기존에 혼재하던 자료구조 / 알고리즘 / PS에 관련된 내용을 </br>
  각각 DataStructure / Algorithm / ProblemSolving 레포지토리로 옮겼습니다. </br>
  -> git subtree를 사용했지만, <U>위 내용과 관련된 commit들이 남아있습니다.</U>