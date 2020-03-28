## 说明
当前项目属于 energyScreen 项目的子集，用来提供sqlServer数据库数据的获取。<br>
后期可以扩展为其他项目使用。<br>

## 准备
1. 安装 jdk1.8，下载地址: https://www.oracle.com/java/technologies/javase-jdk8-downloads.html <br>
2. 下载 sqljdbc4.jar，下载地址： https://pan.baidu.com/s/1MxUAJf6rj1JWwAkigO0lTA 提取码: 3kdt <br>
3. mvn 导入driver：
mvn install:install-file -Dfile=sqljdbc4.jar -Dpackaging=jar -DgroupId=com.microsoft.sqlserver -DartifactId=sqljdbc4 -Dversion=4.0

### pom.xml 添加依赖 <br>

```xml
<!-- SqlServer -->
<dependency>
    <groupId>com.microsoft.sqlserver</groupId>
    <artifactId>sqljdbc4</artifactId>
    <version>4.0</version>
</dependency>
```

### application.properties 添加配置<br>

```
#spring.datasource.url=jdbc:sqlserver://IP:端口;DatabaseName=数据名
#spring.datasource.username=用户名
#spring.datasource.password=密码
#spring.datasource.driver-class-name=com.microsoft.sqlserver.jdbc.SQLServerDriver
```

**WQDQ: 指数据库的SID**<br>


## 运行
`nohup java -Dspring.profiles.active=prod -jar sqlserv-conn-1.0.jar &`

