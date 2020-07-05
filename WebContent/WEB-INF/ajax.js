var xmlHttpRequest;
function checkUserExists(oCtl) {
    var uname=oCtl.value;
    if(uname==""||uname==null){
        alert("用户名不能为空");
        oCtl.focus();
        return false;
    }
    doRequest(uname);
}
function addGoods(){
    var name=$.jquery("#name").value;
    var price=$.jquery("#price").value;
    var dt=$.jquery("#dt").value;
    var remark=$.jquery("#remark").value;

    console.log(name+",price")

    doRequest(name);

}

function createXMLHttpRequest() {
    if(window.XMLHttpRequest){
        return new XMLHttpRequest();
    }else if(window.ActiveXObject){
        try{
            return new ActiveXObject("Msxml2.XMLHTTP");
        }catch (e) {
            try{
                return new ActiveXObject("Microsoft.XMLHTTP");
            }catch (e) {

            }
        }
    }
}
function doRequest(uname) {
    //请求字符串
    var url="htttp://localhost:8000/SpringMVC/InsertGoods.action";
    //1.创建xmlHttpRequest组件
    xmlHttpRequest=createXMLHttpRequest();
    //2.设置回调函数
    xmlHttpRequest.onreadystatechange=haoLeJiaoWo;
    //3.初始化xmlHttpRequest组件
    xmlHttpRequest.open("post",url,true);
    //4.发送请求

    var name=$.jquery("#name").value;
    var price=$.jquery("#price").value;
    var dt=$.jquery("#dt").value;
    var remark=$.jquery("#remark").value;


    var jsonObj={
        "name":name,
        "price":price,
        "dt":dt,
        "remark":remark
    }

    var jsonStr = JSON.toString(jsonObj);
    var body={
        param:jsonStr
    }

    console.log(jsonStr);
    // xmlHttpRequest.send(body);


    $.ajax({
        type:'post',
        url:url,
        data:jsonStr,
        contentType:'application/json:charset=utf-8',
        dataType:"text",
        success:function (result) {
            if(result=="success"){
                console.log(result);
            }else {
                console.log(result);
            }
        },
        error:function (msg) {
            alert('Error:'+msg);
        }
    })

}
function haoleJiaoWo() {
    //0.请求未初始化
    //1.服务器连接已建立
    //2.请求已接收，接收到了响应头
    //3.请求处理中，正在下载响应体
    //4.请求已完成，且响应已就绪

    if (xmlHttpRequest.readState==4){
        if (xmlHttpRequest.status==200){
            var b=xmlHttpRequest.responseText;
            if (b=="true"){
                alert("用户名已存在")；
            }else {
                document.getElementById("spanBlock").innerHTML="用户名可用";
            }
        }else {
            alert("您请求的页面有异常");
        }
    }

}