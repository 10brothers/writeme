#####################
根据IP查询具体的IP所在地  
调用新浪的IP地址查询接口   http://int.dpool.sina.com.cn/iplookup/iplookup.php?format=js&ip=[ip地址]
可选格式为js和json格式  返回js格式可以在页面脚本中使用 jquery的$.getScript()方法来获得结果解析
不写format默认是json格式   
项目中可以在页面中通过ajax请求来获取具体的地址信息，也可以在后台通过HttpClient来获取地址信息

#####################
mybatis的占位符写法中，#{} 和 ${}的区别   前者会让mybatis创建预处理语句时，使用?来作为占位符，而后者则是在生成这条预处理语句时，已经被
固定写死，不够安全，可能有sql注入的风险，应该以前一种的写法为主

insert时，返回主键  设置keyProperty为实体的主键属性  方法的返回值只是这条sql影响的行数，自增的主键值会返回到实体中


###################spring的 interceptor


###################单点登录，同时一人一地登录 可以使用 shiro



###################apache的安全权限框架  shiro


###################spring security


######################java mail 












############################移动工程时  遇到的工程名上出现的红色叹号和叉号  
可在problems视图下找到错误所在  右键可以选择快速修复
一般是tomcat问题和编译版本问题   编译版本问题也可以在workspace中找到工程的.setting文件中的一个xml文件  直接修改为和Eclipse工程同一编译版本
tomcat的问题就是设置一个tomcat     高版本编译的工程运行在低版本jre中，会出错


############################log4j的日志文件打印到哪里？ 绝对路径和相对路径问题，打印tomcat日志，和catalina日志，localhost-access日志
