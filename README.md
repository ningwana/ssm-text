# ssm-text
Spring+SpringMVC+mybatis+Mysql+Shiro

每天学一点，写一点，日积月累，积少成多！

项目结构说明：
\src\main\java\com\nw

dao
数据访问层(接口)：
与数据打交道，可以是数据库操作，也可以是文件读写操作，甚至是redis缓存操作，
总之与数据操作有关的都放在这里，也有人叫做dal或者数据持久层都差不多意思。
为什么没有daoImpl，因为我们用的是mybatis，所以可以直接在配置文件中实现接口的每个方法。

dto
数据传输层：
刚学框架的人可能不明白这个有什么用，其实就是用于service层与web层之间传输，
为什么不直接用entity（pojo）？其实在实际开发中发现，
很多时间一个entity并不能满足我们的业务需求，可能呈现给用户的信息十分之多，
这时候就有了dto，也相当于vo，记住一定不要把这个混杂在entity里面，答应我好吗？

entity
实体类：
一般与数据库的表相对应，封装dao层取出来的数据为一个对象，
也就是我们常说的pojo，一般只在dao层与service层之间传输。

service
业务逻辑（接口）：
写我们的业务逻辑，也有人叫bll，在设计业务接口时候应该站在“使用者”的角度。

serviceImpl
业务逻辑（实现）：
实现我们业务接口，一般事务控制是写在这里。

web
控制器：
springmvc就是在这里发挥作用的，
一般人叫做controller控制器，相当于struts中的action。