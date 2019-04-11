# 泛型
- [B <:A] UpperBound 上界：B类型的上界是A类型，即B类型的父类是A类型
- [B >:A] LowerBound 下界：B类型的下界是A类型，即B类型的子类是A类型
- [B <%A] ViewBound 表示B类型要转换成A类型，需要一个隐式转换函数
- [B :A] ContextBound 需要一个隐式转换的值


[-A,+B]
- [-A] 逆变，作为参数类型。如果A是T的子类，那么C[T]是C[A]的子类
- [+B] 协变，作为返回类型。如果B是T的子类，那么C[B]是C[T]的子类
