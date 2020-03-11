// 查找数组中最小值
function min(array) {
    var min = array[0];
    for (var i = 1, len = array.length; i < len; i += 1) {
        if (array[i] < min) {
            min = array[i];
        }
    }
    return min;
}

// 查找数组中最大值
function max(array) {
    var max = array[0];
    for (var i = 1, len = array.length; i < len; i += 1) {
        if (array[i] > max) {
            max = array[i];
        }
    }
    return max;
}

// test
var testArray = [2, 4, 5, 2, 1, 3, 7, 8, 1];
console.log(min(testArray));
console.log(max(testArray));