## 题目
题目名字有点意思，其实就是一个用户自定义的特殊数据结构，比较简单
限定了宠物、猫、狗的类，如下：

```java
public class Pet{
    private String type;
    public Pet(String type){
        this.type=type;
    }
    public String getType(){
    return this.type;
    }
}

public class Dog extends Pet{
    public Dog(){
        super("dog");
    }
}

public class Cat extends Pet{
    public Cat(){
        super("cat");
    }
}

```

## 要求猫狗队列有如下方法：
add/poll/pollDog/pollCat/isEmpty/isDogEmpty/isCatEmpty

## 解答
注意不能修改原有的类就好了。
为猫狗各建两个队列，并利用一个计数器记录进入的位置