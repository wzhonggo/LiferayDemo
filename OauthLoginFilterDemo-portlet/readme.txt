1. 这个工程要最终导出成jar放到 /tomcat/webapp/ROOT/WEB-INF/目录下面, 里面调用Oauth2TokenLocalServiceUtil 来添加Oauth2Token到
数据库，所有把Oauth2Token等相关的类复制到工程src,然后把Oauth2-portlet-service.jar  放到 /tomcat/webapp/ROOT/WEB-INF/目录下面
2. 把这个工程导入成jar时， 不需要导出lib, js , css, tld 目录。

3.  加这个filter的原因是因为需要用到liferay的登陆页面， oauth Authorize 请求时会转到 "/web/guest/welcome", 然后统一在这个
Filter 做处理。