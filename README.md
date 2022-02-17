## 系统名称 
仓库管理系统 warehouse 
### 系统概要
仓库管理系统总共分为两个大的模块，分别是系统模块和业务模块。其中系统模块和业务模块底下又有其子模块。
### 功能模块
#### 一、业务模块
##### 1、客户管理
###### 客户列表
###### 客户分页和模糊查询
###### 客户添加、修改、删除、批量删除
##### 2、供应商管理
###### 供应商列表
###### 供应商分页和模糊查询
###### 供应商添加、修改、删除、批量删除
##### 3、商品管理
###### 商品列表
###### 商品分页和模糊查询
###### 商品添加、修改、删除、商品图片的上传
##### 4、商品进货管理
###### 商品进货列表
###### 商品进货分页和模糊查询
###### 商品进货添加、修改、删除、商品退货
##### 5、商品退货管理
###### 商品退货列表
###### 商品退货分页和模糊查询
###### 商品退货删除
##### 6、商品销售管理
###### 商品销售列表
###### 商品销售分页和模糊查询
###### 商品销售添加、修改、删除、商品销售退货
##### 7、商品销售退货管理
###### 商品销售退货列表
###### 商品销售退货分页和模糊查询
###### 商品销售退货删除
#### 二、系统模块
##### 1、用户登陆
###### 校验用户名、密码以及验证码
###### 登陆成功将登陆信息写入登陆日志
###### 未登录直接访问服务器资源进行拦截
##### 2、菜单管理
###### 全查询菜单和根据左边的树查询不同菜单
###### 菜单的添加、修改、删除
##### 3、角色管理
###### 全查询角色和模糊查询
###### 角色的添加、修改、删除以及给角色分配权限
##### 4、用户管理
###### 全查询用户和模糊查询
###### 用户的添加、修改、删除、重置密码以及给用户分配角色
##### 5、部门管理
###### 全查询部门、模糊查询以及根据左边的树查询不同的部门
###### 部门的添加、修改、删除

### 技术选型
#### 后台技术选型
* SpringBoot
* Shiro
* MybatisPlus
#### 前端技术选型
* LayUI、DTree

### 开发环境
* 操作系统：Windows 10
* 编程语言：Java
* 开发工具：IDEA、Navicat、Git
* 项目构建：Maven 3.5.2
* 服务器：Tomcat 8.5
* 数据库：MySQL 5.0
* 代码托管平台：GitHub

### 预览效果
登陆页面
![](https://github.com/yeqifu/warehouse/blob/master/src/main/resources/static/images/login.PNG)
部门管理
![](https://github.com/yeqifu/warehouse/blob/master/src/main/resources/static/images/dept.PNG)
菜单管理
![](https://github.com/yeqifu/warehouse/blob/master/src/main/resources/static/images/menu.PNG)
权限管理
![](https://github.com/yeqifu/warehouse/blob/master/src/main/resources/static/images/permission.PNG)
角色管理
![](https://github.com/yeqifu/warehouse/blob/master/src/main/resources/static/images/role.PNG)
用户管理
![](https://github.com/yeqifu/warehouse/blob/master/src/main/resources/static/images/user.PNG)
登陆日志管理
![](https://github.com/yeqifu/warehouse/blob/master/src/main/resources/static/images/loginfo.PNG)
系统公告管理
![](https://github.com/yeqifu/warehouse/blob/master/src/main/resources/static/images/notice.PNG)
缓存管理
![](https://github.com/yeqifu/warehouse/blob/master/src/main/resources/static/images/cache.PNG)
客户管理
![](https://github.com/yeqifu/warehouse/blob/master/src/main/resources/static/images/customer.PNG)
供应商管理
![](https://github.com/yeqifu/warehouse/blob/master/src/main/resources/static/images/provider.PNG)
商品管理
![](https://github.com/yeqifu/warehouse/blob/master/src/main/resources/static/images/goods.PNG)
商品进货管理
![](https://github.com/yeqifu/warehouse/blob/master/src/main/resources/static/images/inport.PNG)
商品退货管理
![](https://github.com/yeqifu/warehouse/blob/master/src/main/resources/static/images/output.PNG)
商品销售管理
![](https://github.com/yeqifu/warehouse/blob/master/src/main/resources/static/images/sales.PNG)
商品销售退货管理
![](https://github.com/yeqifu/warehouse/blob/master/src/main/resources/static/images/salesback.PNG)

### 讨论
有问题请在([issue])中讨论 或联系我QQ：1784525940，请注明来意，伸手党勿加~
### 备注
管理员账号 system 密码 123456   
1. 用户登录添加了图形验证码，采用shiro进行验证，使用了session保存用户信息。
    1. 可以学习图形验证。
    1. 可以学习shiro的登录验证。
    1. 可以学习session的作用。
2. 使用了切面，并在切面中使用缓存
    1. 学习切面的使用。
    1. 学习缓存的使用，理解缓存的作用原理。
3. 菜单权限管理使用树形节点的形式。
    1. 用户有不同的角色，角色有不同的菜单权限，菜单中有多个功能按钮。  
    菜单和按钮平级但是类型不同，不同的角色可以把权限精确到按钮级别。
    1. 学习权限控制的实现方式。
4. 项目功能不全，只有数据的记录，数据没有联动起来。例如进货与销售的数据和商品管理中的数据没有关联性。  
进货的数据和销售的数据仅仅是记录而已，库存的数据也是做记录的，并没有类似只能销售进货的商品，并且数量不能超多库存量等。
