组合模式：

组合模式又分为安全模式和透明模式。

安全模式：
树枝节点和叶子节点是彻底分开的，树枝节点会单独拥有组合树的方法（添加、删除节点），叶子节点是没有的。

透明模式：
将组合树的方法变成抽象方法写到了顶层接口或这抽象类中。树枝节点单独实现这些方法，叶子节点的话就需要在这些方法中抛出UnsupportedOperationException异常，并且将这些方法标记为@Deprecated。


对比：
安全模式并不符合依赖倒置的原则，使用的是实现类
透明模式基本符合依赖倒置的原则，使用的都是接口或者抽象类，不需要做类型转换了
