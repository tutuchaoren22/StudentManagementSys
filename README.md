## 需求:
使用自己的搭建的SpringBoot项目完成一个简单的学生管理系统:
1. 学生有姓名,性别,班级三个属性
2. 添加学生功能:能够通过post请求添加学生,如果学生姓名重复会返回字符串:"姓名重复",如果添加成功则返回字符串:"添加成功"(存储到内存中即可,不要求重启保留这些数据)
3. 查询所有学生的功能,能够查看当前系统存在的所有学生信息
4. 根据学生姓名查询学生信息
5. 根据学生姓名删除学生,如果学生不存在则返回字符串:"该学生不存在",如果删除成功则返回字符串:"删除成功"
## PS:
1. 每种操作的请求应该限定为对应操作业务含义的http请求方法,例如查询应该使用GET请求
2. 只需要完成后端代码即可(可以用Postman访问),不需要页面
3. 作业需要提交github地址,请忽略本作业的模板仓库(使用你们自己搭建的SpringBoot项目)