/**
 * Created by JJungHyun on 2017-06-11.
 */
public class Dog {
    private String name;// string은 기본값이 null 왜냐면 String 은 Object..
    private int age; // method 내가 아니라면 기본값으로 0으로 셋팅

    //생성자 이게 기본생성자 입니다...yes
    public Dog(){
        super();
    }

    //그럼 name과 age를 알려면 ??
    //가져오는 메소드를 만듭니다
    //흔히 get~~~~~g이런으로

    public String getName(){
        return this.name;
    }

    //set은 주로 내가 어떤 결과를 받기 위해 하는 행동이 아닙니다. 그냥 넌 요런 놈이야 라고 선언하는거죠
    //보통 일반 수행하는 메소드는 void 를 이용하고 출력이 필요하면 출력 타입을 명시 하고 return 해줍니다.
    //자동생성을 하도 써서 그건 편하기때문이고
    // 우선 이렇게 된다는걸 평소 써보고 자동생성을 이용하십시요 ....
    public void setName(String name){
        //자 이 개같은 선배의 이름을 지어줍시다 이름 kami입니다. 케이미가 아니고 카미
        this.name = name;
    }

    public int getAge(){
        //얼래 오류가... age는 int니가...
        return this.age;
    }
    public void  setAge(int age){
        //에이지는 ??
        this.age = age;
    }
}
