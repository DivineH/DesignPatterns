# ��̬����

```sequence
title: ��̬������ù���
Client->DynamicProxy: doSomething()
DynamicProxy -> MyInvocationHandler: invoke()
MyInvocationHandler -> Subject: "invoke()"
```