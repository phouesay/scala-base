# Actor

## 为什么学习Actor？
我们现在需的是Scala Actor是Scala 2.10.x版本的actor
Scala在2.11.x版本中将Akka加入其中，作为默认的Actor，老版本的Actor已经废弃
我们学习Actor的目的就是为了学习Akka做铺垫

## 什么是Actor
Actor是消息并发模型
Scala中的Actor能够实现并行编程的强大功能，它是基于事件模型的并发机制；
Scala是运用消息（message）的发送、接收来实现多线程的；
使用Scala能够更容易地实现多线程应用的开发


## Java并发编程与Scala Actor编程的区别
Scala的Actor尽可能地避免锁和共享状态，从而避免多线程并发时出现资源争用的情况，进而提升多线程编程的性能
此外，Scala actor的这种模型还可以避免死锁等一系列传统多线程编程的问题
原因在于Java中多数使用的是可变状态的对象资源，对这些资源进行共享来实现多线程编程的模型的话，
控制好资源竞争与防止对象状态被意外修改是非常重要的，而对象状态的不变性也是难以保证的。
而在Scala中，我们可以通过复制不可变状态的资源（即对象，Scala中一切都是对象，连函数、方法也是）的一个副本，
在基于Actor的消息发送、接收机制进行并行编程


## Actor方法执行顺序
- 调用start()方法启动Actor
- 执行act()方法
- 向Actor发送消息


## 发送消息的方式

- ！ --> 发送异步消息，没有返回值
- ！? --> 发送同步消息，等待返回值
- ！! --> 发送异步消息，返回值是 Future[Any]

## 掌握内容
- 创建Actor
- Actor的消息接收和发送
- 用Actor并发编程实现word count