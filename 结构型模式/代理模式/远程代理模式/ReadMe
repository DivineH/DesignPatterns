远程代理模式：
远程代理就像“远程对象的本地代表”，其中，“远程对象”是一种运行在不同JVM堆中的对象。
（更一般的说法为，在不同地址空间运行的远程对象）
主要有四个对象：
客户堆中的客户对象、客户辅助对象(RMI称之为stub)
服务器堆中的服务对象、服务辅助对象(RMI称之为skeleton)

产生stub和skeleton:
1. rmic DefaultRemoteRoom
2. 启动rmiregistry: rmiregistry
3. 实例化一个服务对象并注册到rmiregistry中: java DefaultRemoteRoom