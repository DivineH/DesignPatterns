# �۲���ģʽ

�������֮���һ��һ�Զ�������ϵ��ʹ��ÿ��һ������״̬�����ı�ʱ���������������Եõ�֪ͨ�����Զ����¡�

# JDK�Թ۲���ģʽ��֧��

��JDK��java.util���У��ṩ��Observable���Լ�Observer�ӿڣ����ǹ�����JDK�Թ۲���ģʽ��֧�֡�

- **Observer�ӿ�**
  ��java.util.Observer�ӿ���ֻ����һ�����������䵱����۲��ߣ��䷽����������������ʾ��

  ```java
  void update(Observable o, Object arg);
  ```

  ?

- **Observable��**

   java.util.Observable��䵱�۲�Ŀ���࣬��Observable�ж�����һ������Vector���洢�۲��߶������������ķ�����˵�����±���ʾ��

| ������                                      | ��������                                     |
| ---------------------------------------- | ---------------------------------------- |
| Observable()                             | ���췽����ʵ����Vector������                        |
| addObserver(Observer o)                  | ����ע���µĹ۲��߶��������С�                         |
| deleteObserver(Observer o)               | ����ɾ�������е�ĳһ���۲��߶���                        |
| notifyObservers()��notifyObservers(Object arg) | ֪ͨ�����������ڷ����ڲ�ѭ������������ÿһ���۲��ߵ�update()������    |
| deleteObservers()                        | ���������������ɾ�����������й۲��߶���                    |
| setChanged()                             | �÷��������ú������һ��boolean���͵��ڲ���Ǳ���changed��ֵΪtrue����ʾ�۲�Ŀ������״̬�����˱仯�� |
| clearChanged()                           | ���ڽ�changed������ֵ��Ϊfalse����ʾ����״̬���ٷ����ı�����Ѿ�֪ͨ�����еĹ۲��߶��󣬵��������ǵ�update()������ |
| hasChanged()                             | ���ڲ��Զ���״̬�Ƿ�ı䡣                            |
| countObservers()                         | ���ڷ��������й۲��ߵ�������                           |