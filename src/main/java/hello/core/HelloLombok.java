package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {
    // 위의 annotation 입력시 lombok이 자동으로 아래의 내용에 해당하는 getter, setter를 생성해줌
    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("aasasdd");

//        String name = helloLombok.getName();
//        System.out.println("name = " + name);

        //toString
        System.out.println("helloLombok = " + helloLombok);
    }

}
