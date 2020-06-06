# swaggerResponseTemplate
Java response template based on swagger
### 1、controller class
- 定义：规范化接口格式，返回固定格式的接口数据，服务状态可根据ResultCodeEnum设置，服务返回的数据统一写在listResult中。
- 使用举例：
```java
ListResult listResult = new ListResult();
List<String> list = new ArrayList<>();
listResult.setList(list);
listResult.setTotal(list.size());
SCResponsResult result = new SCResponsResult(ResultCodeEnum.SUCCESS, listResult);
```
ResultCodeEnum可枚举下述情况：
```java
SUCCESS("success",10000,"操作成功！"),
UNAUTHENTICATED("fail",10001,"此操作需要登陆系统！"),
UNAUTHORISE("fail",10002,"权限不足，无权操作！"),
INVALID_PARAM("fail",10003,"非法参数！"),
FAIL("fail",11111,"操作失败！"),
SERVER_ERROR("fail",99999,"抱歉，系统繁忙，请稍后重试！");
```



