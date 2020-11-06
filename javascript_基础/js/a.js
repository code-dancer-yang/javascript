//不常用的Function对象声明方式
var fun_unusual=new Function("a","b","alert('ddfdfs');");
//fun_unusual(1,2);
/**
 * 常用的两种声明Function对象的方式
 * 特点：1 方法的定义中，形参的类型不用写
 *      2 对象.length 返回形参的个数
 */
var fun1=function (param1,param2) {
    // alert(length);
    // alert(arguments.length);
    // alert(param1+param2);
    // alert("i am fun1");
}
function fun2(a,b) {
    alert(a+b);
}

//调用方法
// fun1(1,2);
// fun2(1,4);
// alert(fun2.length);

//需求：求任意数字的和
function add() {
    let a=89;
    console.log(arguments);
    var sum=0;
    for(var i=0;i<arguments.length;i++){
        sum+=arguments[i];
    }
    return sum;
}
var sum=add(1,3,54);
alert(sum);