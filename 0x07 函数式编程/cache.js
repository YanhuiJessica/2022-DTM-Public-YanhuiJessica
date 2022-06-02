function process(date) {
    let result = date;
    result += " data processing is complete!";
    return result;
}

// 高阶函数
function widthProcess(base) {
    let cache = {};
    return (date) => {
        if (cache[date]) {
            console.log('Data exists!');
            return cache[date];
        }
        else {
            console.log('Data does not exist!');
            cache[date] = base(date);
            return cache[date];
        }
    }
    // else
    return function() {
        // arguments 对象是所有非箭头函数中都可用的局部变量,此对象包含传递给函数的每个参数
        let date = arguments[0];
        if (cache[date]) {
            console.log('Data exists!');
            return cache[date];
        }
        else {
            console.log('Data does not exist!');
            cache[date] = base(date);
            return cache[date];
        }
    }
}

let _process = widthProcess(process);
console.log(_process('2022-06-02'));
console.log(_process('2022-06-02'));