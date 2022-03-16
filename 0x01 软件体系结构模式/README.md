# Java 开发环境配置

- 安装 JDK（Java Development Kit）

    ```bash
    sudo apt install default-jdk
    ```

- 安装 Eclipse

    ```bash
    sudo snap install eclipse --classic
    ```
- 安装 VS Code [Java 扩展](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
  - 当前配置不能很好地应对缺失导入包的情况

## 参考资料

[Getting Started with Java in Visual Studio Code](https://code.visualstudio.com/docs/java/java-tutorial)

# MVCDemo

- 代码格式化：`Ctrl+Shift+F`
- 运行效果<br>
![移动的黄球](img/demo.gif)

# InterpreterPatternDemo

对 `<city>的<person>` 格式的数据进行乘车是否扣费的判断

**示例仅作参考，与现实世界无关**

## Input Sample

```java
public class InterpreterClient {
	public static void main(String[] args) {
		Interpreter bus = new Interpreter();  //创建一个解释器
		//使用解释器的功能
		bus.freeRide("北京的老人");
		bus.freeRide("天津的年轻人");
		bus.freeRide("广州的孕妇");
		bus.freeRide("上海的儿童");
		bus.freeRide("山东的儿童");
		bus.freeRide("成都的老人");
	}
}
```

## Output

```
您是北京的老人，您本次乘车免费！
天津的年轻人，您不是免费人员，本次乘车扣费2元！
深圳的孕妇，您不是免费人员，本次乘车扣费2元！
您是上海的儿童，您本次乘车免费！
山东的儿童，您不是免费人员，本次乘车扣费2元！
成都的老人，您不是免费人员，本次乘车扣费2元！
```