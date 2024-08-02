## Structural Patterns (结构型设计模式）

## 内容
- [适配器模式（Adapter）](<../src/main/java/com/mei/structuralpatterns/adapterpattern>)
<br><b>属于结构型设计模式。它通过一个中间件（适配器）将一个类的接口转换成客户期望的另一个接口，使原本不能一起工作的类能够协同工作。</b></br>
<br><b>结构</b></br>
  <br>1. Target（目标）接口：它是客户期望的接口。[示例代码](<../src/main/java/com/mei/structuralpatterns/adapterpattern/target>)</br>
  <br>2. Adaptee（被适配者）接口：它是现有类的接口。[示例代码](<../src/main/java/com/mei/structuralpatterns/adapterpattern/adaptee>)</br>
  <br>3. Adapter（适配器）类：它实现了Target接口，并持有Adaptee类的实例。[示例代码](<../src/main/java/com/mei/structuralpatterns/adapterpattern/adapter>)</br>
<br><b>关键代码：适配器通过继承或依赖现有对象，并实现所需的目标接口</b></br>
<br><b>应用实例：跨平台运行，数据库连接....</b></br>
<br><b>要点：实际上就是将客户目标进行抽象 该实现类引用适配器类(适配器类中持有被适配类实例) 从而完成目标接口实现的</b></br>
- [桥接模式（ Bridge）](<../src/main/java/com/mei/structuralpatterns/bridgepattern>)
<br><b>是用于把抽象化与实现化解耦，使得二者可以独立变化。</b></br>
  <br><b>结构</b></br>
  <br>1. Abstraction（抽象类）[示例代码](<../src/main/java/com/mei/structuralpatterns/bridgepattern/color/Color.java>)</br>
  <br>2. RefinedAbstraction（扩充抽象类）[示例代码](<../src/main/java/com/mei/structuralpatterns/bridgepattern/shape/Shape.java>)</br>
  <br>3. Implementor（实现类）接口</br>
  <br>4. ConcreteImplementor（具体实现类）</br>
<br><b>说明：该模式在示例中 图形颜色可以互相切换互不影响，与适配器的区别在于 适配器模式中适配器类是引用了被适配器类抽象</b></br>