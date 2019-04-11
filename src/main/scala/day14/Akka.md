# Akka 简介

spark的RPC是通过Akka类库实现的，Akka 用Scala语言开发，基于Actor并发模型实现
Akka 具有高可靠、高性能、可扩展等特点，使用Akka 可以轻松实现分布式RPC功能
Actor是Akka 中最核心的概念，它是一个封装了状态和行为的对象，Actor之间可以通过交换消息的方式进行通信
每个Actor都有自己的收件箱（MailBox）。通过Actor能够简化锁及线程管理。
可以非常容易地开发正确地并发程序和并行系统，Actor具有如下特性：
- 提供了一种高级抽象，能够简化在并发（Concurrency）/并行（Parallelism）应用场景下的编程开发
- 提供了异步非阻塞的、高性能的时间驱动编程模型
- 超级轻量级事件处理（每GB堆内存几百万Actor）

# ActorSystem

在Akka 中，ActorSystem是一个重量级的结构
它需要分配多个线程，所以子实际应用中，ActorSystem通常是一个单例对象。
我们可以通过ActorSystem创建很多Actor。

# Actor
在 Akka中，Actor负责通信，在Actor中有一些重要的生命周期方法。
1. preStart() 方法：该方法在Actor对象构造方法执行后执行，整个Actor生命周期中仅执行一次；
2. receive() 方法：该方法在Actor的 preStart方法执行完成后执行，用于接收消息，会被反复执行。

# 案例需求
用Akka 实现RPC通信
模拟实现spark启动机制


 



