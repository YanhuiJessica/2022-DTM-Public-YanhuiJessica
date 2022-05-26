# 面向切面编程 AOP

## JDKProxyDemo

### Output

```
早安~!
学生小明醒来了
晚安~!
学生小明睡觉了
```

## CglibProxyDemo

- 需要先导入 `cglib` 和 `ASM` 的 JAR 包
  - 也可以通过使用 `cglib-nodep` JAR 包解决

### Output

```
早安~!
学生小红醒来了
晚安~!
学生小红睡觉了
```