# 函数式编程

## 可缓存

```js
let _process = widthProcess(process);
console.log(_process('2022-06-02'));
console.log(_process('2022-06-02'));
```

### Output

```
Data does not exist!
2022-06-02 data processing is complete!
Data exists!
2022-06-02 data processing is complete!
```