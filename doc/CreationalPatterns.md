## Creational Patterns (创建型设计模式）

## 内容
-  [工厂模式](<../src/main/java/com/mei/creationalpatterns/factorypattern>) 
<br>它提供了一种创建对象的方式，使得创建对象的过程与使用对象的过程进行分离。注意事项：如果对象较为简单则不必使用</br>
<b>使用场景：数据库访问，服务器连接</b><br>
<b>结构：</b><br>
1.<b>抽象产品&nbsp;&nbsp;[示例代码](<../src/main/java/com/mei/creationalpatterns/factorypattern/product/DefaultProduct.java>)</b><br>
2.<b>具体产品&nbsp;&nbsp;[示例代码](<../src/main/java/com/mei/creationalpatterns/factorypattern/product/WeChatProduct.java>)</b><br>
3.<b>抽象工厂&nbsp;&nbsp;[示例代码](<../src/main/java/com/mei/creationalpatterns/factorypattern/factory/DefaultProductFactory.java>)</b><br>
4.<b>具体工厂&nbsp;&nbsp;[示例代码](<../src/main/java/com/mei/creationalpatterns/factorypattern/factory/ProductFactory.java>)</b><br>
-  [单例模式](<../src/main/java/com/mei/creationalpatterns/singletonpattern>)
<br>确保一个类只有一个实例，并提供一个全局访问点来访问该实例。关键点：构造函数私有化，提供公共静态方法获取实例</br>
<b>注意事项：线程安全，是否延迟初始化，反射攻击，序列化，注意复杂加载环境可能导致多个实例问题</b><br>
<b>使用场景：当需要控制实例数目，节省系统资源时。</b><br>
-  [建造者模式](<../src/main/java/com/mei/creationalpatterns/builderpattern>)
<br>在软件系统中，一个复杂对象的创建通常由多个部分组成，这些部分的组合经常变化，但组合的算法相对稳定。</br>
<b>使用场景：组合变化，例如 StringBuilder</b><br>
<b>结构：</b><br>
   1.<b>产品&nbsp;&nbsp;要构建的复杂对象。产品类通常包含多个部分或属性。在这个示例中产品就是一个套餐产品。[示例代码](<../src/main/java/com/mei/creationalpatterns/builderpattern/product/Meal.java>)</b><br>
   2.<b>抽象建造者&nbsp;&nbsp;定义了构建产品的抽象接口，包括构建产品的各个部分的方法。</b><br>
   3.<b>具体建造者&nbsp;&nbsp;实现抽象建造者接口，具体确定如何构建产品的各个部分，负责返回最终构建的产品。在这个示例中建造者就是最终构建套餐的 builder[示例代码](<../src/main/java/com/mei/creationalpatterns/builderpattern/builder/MealBuilder.java>)</b><br>
   4.<b>指导者&nbsp;&nbsp;负责调用建造者的方法来构建产品。在这个代码中 main 方法是指导者[示例代码](<../src/main/java/com/mei/creationalpatterns/builderpattern/Entrance.java>)</b><br>
-  [原型模式](<../src/main/java/com/mei/creationalpatterns/prototypepattern>)
<br>原型模式是用于创建重复的对象，同时又保证了性能，他提供了一种创建对象的最佳方式之一。</br>
<b>使用场景：在运行时动态建立和删除原型。因此可以使用原型模式。</b><br>
<br>Spring 中的 Context 获取 bean 采用了这种思想， 只不过 Spring 并不是使用Cloneable 接口的 clone</br>
    1.<b>原型接口 [示例代码](<../src/main/java/com/mei/creationalpatterns/prototypepattern/prototype/DefaultBean.java>)</b><br>
    2.<b>原型实现 [示例代码](<../src/main/java/com/mei/creationalpatterns/prototypepattern/prototype/OneBean.java>)</b><br>
    3.<b>原型工厂 [示例代码](<../src/main/java/com/mei/creationalpatterns/prototypepattern/cache/BeanCache.java>)</b><br>