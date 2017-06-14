# 动态代理：

```sequence
title: 动态代理调用过程
Client->DynamicProxy: doSomething()
DynamicProxy -> MyInvocationHandler: invoke()
MyInvocationHandler -> Subject: "invoke()"
```