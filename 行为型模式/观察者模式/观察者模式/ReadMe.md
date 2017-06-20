# 观察者模式

定义对象之间的一种一对多依赖关系，使得每当一个对象状态发生改变时，其相关依赖对象皆得到通知并被自动更新。

# JDK对观察者模式的支持

在JDK的java.util包中，提供了Observable类以及Observer接口，它们构成了JDK对观察者模式的支持。

- **Observer接口**
  在java.util.Observer接口中只声明一个方法，它充当抽象观察者，其方法声明代码如下所示：

  ```java
  void update(Observable o, Object arg);
  ```

  ?

- **Observable类**

   java.util.Observable类充当观察目标类，在Observable中定义了一个向量Vector来存储观察者对象，它所包含的方法及说明如下表所示。

| 方法名                                      | 方法描述                                     |
| ---------------------------------------- | ---------------------------------------- |
| Observable()                             | 构造方法，实例化Vector向量。                        |
| addObserver(Observer o)                  | 用于注册新的观察者对象到向量中。                         |
| deleteObserver(Observer o)               | 用于删除向量中的某一个观察者对象。                        |
| notifyObservers()和notifyObservers(Object arg) | 通知方法，用于在方法内部循环调用向量中每一个观察者的update()方法。    |
| deleteObservers()                        | 用于清空向量，即删除向量中所有观察者对象。                    |
| setChanged()                             | 该方法被调用后会设置一个boolean类型的内部标记变量changed的值为true，表示观察目标对象的状态发生了变化。 |
| clearChanged()                           | 用于将changed变量的值设为false，表示对象状态不再发生改变或者已经通知了所有的观察者对象，调用了它们的update()方法。 |
| hasChanged()                             | 用于测试对象状态是否改变。                            |
| countObservers()                         | 用于返回向量中观察者的数量。                           |