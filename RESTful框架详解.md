[toc]
# 1什么是REST
REST（Representational State Transfer）表达性状态转移，一种软甲架构风格，不是标准，所以可以遵守也可以不遵守。是一种URL定位资源，HTTP动词(GET,POST,PUT,DELETE)描述操作的风格。  
REST架构的主要原则：
- 网络上的所有事物都被抽象为资源；
- 每个资源都有一个唯一的资源标识符
- 同一个资源具有多种变现形式；
- 对资源的各种操作不会改变资源标识符
- 所有的操作都是无状态的；
- 符合REST原则的框架方式均可称为RESTful
# 2.RESTful架构风格的特点
## 2.1资源
资源是以json(或其他的Representation)为载体的、面向用户的一组数据集，资源对信息的表达倾向于概念模型中的数据：
- 资源总是以某种Representation为载体显示的，即序列化的信息；
- 常用的Representation是json（推荐）或者xml(不推荐)等；
- Representation是REST架构的表现层；  

相对而言，数据（尤其是数据库）是一种更加抽象的、对计算机更高效和友好的数据表现形式，更多的存在于逻辑模型中，资源与数据的关系如下：
![image](http://7d9q7a.com1.z0.glb.clouddn.com/blog-post-rest-resource-vs-data.png)
## 2.2统一接口
RESTful架构风格规定，数据的元操作，即CRUD(create, read, update和delete,即数据的增删查改)操作，分别对应于HTTP方法：GET用来获取资源，POST用来新建资源（也可以用于更新资源），PUT用来更新资源，DELETE用来删除资源，这样就统一了数据操作的接口，仅通过HTTP方法，就可以完成对数据的所有增删查改工作。即：
- GET（SELECT）：从服务器取出资源（一项或多项）。
- POST（CREATE）：在服务器新建一个资源。
- PUT（UPDATE）：在服务器更新资源（客户端提供完整资源数据）。
- PATCH（UPDATE）：在服务器更新资源（客户端提供需要修改的资源数据）。
- DELETE（DELETE）：从服务器删除资源
## 2.3 URI
可以用一个URI（统一资源定位符）指向资源，即每个URI都对应一个特定的资源。要获取这个资源，访问它的URI就可以，因此URI就成了每一个资源的地址或识别符。一般的，每个资源至少有一个URI与之对应，最典型的URI即URL。
## 2.4 无状态
所谓无状态的，即所有的资源，都可以通过URI定位，而且这个定位与其他资源无关，也不会因为其他资源的变化而改变。有状态和无状态的区别，举个简单的例子说明一下。如查询员工的工资，如果查询工资是需要登录系统，进入查询工资的页面，执行相关操作后，获取工资的多少，则这种情况是有状态的，因为查询工资的每一步操作都依赖于前一步操作，只要前置操作不成功，后续操作就无法执行；如果输入一个url即可得到指定员工的工资，则这种情况是无状态的，因为获取工资不依赖于其他资源或状态，且这种情况下，员工工资是一个资源，由一个url与之对应，可以通过HTTP中的GET方法得到资源，这是典型的RESTful风格。
![image](http://7d9q7a.com1.z0.glb.clouddn.com/blog-post-rest-state.png)
![image](http://7d9q7a.com1.z0.glb.clouddn.com/blog-post-rest-stateless.png)
# 3.ROA、SOA、REST与RPC
ROA即Resource Oriented Architecture，RESTful 架构风格的服务是围绕资源展开的，是典型的ROA架构（虽然“A”和“架构”存在重复，但说无妨），虽然ROA与SOA并不冲突，甚至把ROA看做SOA的一种也未尝不可，但由于RPC也是SOA，比较久远一点点论文、博客或图书也常把SOA与RPC混在一起讨论，因此，RESTful 架构风格的服务通常被称之为ROA架构，很少提及SOA架构，以便更加显式的与RPC区分。  
RPC风格曾是Web Service的主流，最初是基于XML-RPC协议（一个远程过程调用（remote procedure call，RPC)的分布式计算协议），后来渐渐被SOAP协议（简单对象访问协议（Simple Object Access Protocol））取代；RPC风格的服务，不仅可以用HTTP，还可以用TCP或其他通信协议。但RPC风格的服务，受开发服务采用语言的束缚比较大，如.NET框架中，开发web service的传统方式是使用WCF，基于WCF开发的服务即RPC风格的服务，使用该服务的客户端通常要用C#来实现，如果使用python或其他语言，很难实现可以直接与服务通信客户端；进入移动互联网时代后，RPC风格的服务很难在移动终端使用，而RESTful风格的服务，由于可以直接以json或xml为载体承载数据，以HTTP方法为统一接口完成数据操作，客户端的开发不依赖于服务实现的技术，移动终端也可以轻松使用服务，这也加剧了REST取代RPC成为web service的主导。  
RPC与RESTful的区别如下面两个图所示：
![image](http://7d9q7a.com1.z0.glb.clouddn.com/blog-post-rest-RPC-service.png)
![image](http://7d9q7a.com1.z0.glb.clouddn.com/blog-post-rest-RESTful-service.png)
# 4.本真REST与hybrid风格
通常开发者做服务相关的客户端开发时，使用的所谓RESTful服务，基本可分为本真REST和hybrid风格两类。本真REST即上文阐述的RESTful架构风格，具有上述的4个特点，是真正意义上的RESTful风格；而hybrid风格，只是借鉴了RESTful的一些优点，具有一部分RESTful的特点，但对外依然宣称是RESTful风格的服务。  
hybrid风格的最主流的用法是，使用GET方法获取资源，用POST方法实现资源的创建、修改和删除。hybrid风格之所以存在，有两种来源：一种情况是因为，某些开发者并没有真正理解何为RESTful架构风格，导致开发的服务貌合神离；而主流的原因是由于历史包袱 —— 服务本来是RPC风格的，由于上文提到的RPC的劣势及RESTful的优势，开发者在RPC风格的服务上又包装了一层RESTful的外壳，通常这层外壳只为获取资源服务，因此会按RESTful风格实现GET方法，如果客户端提出一些简单的创建、修改或删除数据的需求，则通过HTTP协议中最常用的POST方法实现相应功能。  
因此，开发RESTful 服务，如果没有历史包袱，不建议使用hybrid风格。
# 5为什么使用RESTful
1）JSP技术可以让我们在页面中嵌入Java代码，但是这样的技术实际上限制了我们的开发效率，因为需要我们Java工程师将html转换为jsp页面，并写一些脚本代码，或者前端代码。这样会严重限制我们的开发效率，也不能让我们的java工程师专注于业务功能的开发，所以目前越来越多的互联网公司开始实行前后端分离；  
2）近年随着移动互联网的发展，各种类型的Client层出不穷，RESTful可以通过一套统一的接口为Web，iOS和Android提供服务。另外对于广大平台来说，比如微博开放平台，微信开放平台等，它们不需要有显式的前端，只需要一套提供服务的接口，RESTful无疑是最好的选择。RESTful架构如下：
![image](https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3853585835,1730248145&fm=11&gp=0.jpg)  
在Restful之前的操作：
- http://127.0.0.1/user/query/1 GET  根据用户id查询用户数据
- http://127.0.0.1/user/save POST 新增用户
- http://127.0.0.1/user/update POST 修改用户信息
- http://127.0.0.1/user/delete GET/POST 删除用户信息

RESTful用法：
- http://127.0.0.1/user/1 GET  根据用户id查询用户数据
- http://127.0.0.1/user  POST 新增用户
- http://127.0.0.1/user  PUT 修改用户信息
- http://127.0.0.1/user  DELETE 删除用户信息

由于每次请求的接口或者地址,都在做描述,例如查询的时候用了query,新增的时候用了save,其实完全没有这个必要,我使用了get请求,就是查询.使用post请求,就是新增的请求,意图很明显,完全没有必要做描述,这就是为什么有了restful。

HTTP方法 | 资源操作 | 幂等 | 安全
---|---|---|---
GET | SELECT | 是 | 是
POST | INSERT | 否 | 否
PUT | UPDATE | 是 | 否
DELETE | DELETE |是 | 否
其中：幂等性是指对同一REST接口的多次访问，得到的资源状态是相同的；  
安全性：对该REST接口访问，不会使服务器端资源的状态发生变化；  
# 6如何设计Restful风格的API
## 6.1路径设计
- 在RESTful架构中，每个网址代表一种资源（resource），所以网址中不能有动词，只能有名词，而且所用的名词往往与数据库的表名对应，一般来说，数据库中的表都是同种记录的”集合”（collection），所以API中的名词也应该使用复数。
- 举例来说，有一个API提供动物园（zoo）的信息，还包括各种动物和雇员的信息，则它的路径应该设计成下面这样：   
- https://api.example.com/v1/zoos
- https://api.example.com/v1/animals
- https://api.example.com/v1/employees
## 6.2HTTP动词设计
对于资源的具体操作类型，由HTTP动词表示，常用的HTTP动词如下：

请求方式 | 含义
---|---
GET | 获取资源（一项或者多项）
POST | 新建资源
PUT | 更新资源（客户端提供改变后的完整资源）
DELETE | 删除资源
如何通过路径和http动词获悉到调用的功能：

请求 | 含义
---|---
GET/zoos | 列出所有动物园
POST/zoos | 新建一个动物园
GET/zoos/ID | 获取某个指定动物园的信息
PUT/zoos/ID | 更新某个动指定动物园的信息（提供该动物园的全部信息）
DELETE/zoos/ID | 删除某个动物园
GET/zoos/ID/animals | 列出某个指定动物园的所有动物
DELETE/zoos/ID/animanls/ID | 删除某个指定动物园的指定动物
## 6.3 REST接口的使用
SpringMVC实现restful服务:

SpringMVC原生态的支持了REST风格的架构设计

所涉及到的注解:

--@RequestMapping

---@PathVariable

---@ResponseBody

```
package cn.itcast.mybatis.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
 
import cn.itcast.mybatis.pojo.User;
import cn.itcast.mybatis.service.NewUserService;
 
@RequestMapping("restful/user")
@Controller
public class RestUserController {
 
    @Autowired
    private NewUserService newUserService;
 
    /**
     * 根据用户id查询用户数据
     * 
     * @param id
     * @return
     */
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<User> queryUserById(@PathVariable("id") Long id) {
        try {
            User user = this.newUserService.queryUserById(id);
            if (null == user) {
                // 资源不存在，响应404
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }
            // 200
            // return ResponseEntity.status(HttpStatus.OK).body(user);
            return ResponseEntity.ok(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 500
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
 
    /**
     * 新增用户
     * 
     * @param user
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> saveUser(User user) {
        try {
            this.newUserService.saveUser(user);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // 500
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
 
    /**
     * 更新用户资源
     * 
     * @param user
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Void> updateUser(User user) {
        try {
            this.newUserService.updateUser(user);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 500
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
 
    /**
     * 删除用户资源
     * 
     * @param user
     * @return
     */
    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteUser(@RequestParam(value = "id", defaultValue = "0") Long id) {
        try {
            if (id.intValue() == 0) {
                // 请求参数有误
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
            this.newUserService.deleteUserById(id);
            // 204
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 500
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
}

```
# 7.认证机制
![image](http://7d9q7a.com1.z0.glb.clouddn.com/blog-post-rest-stateless-auth.png)
由于RESTful风格的服务是无状态的，认证机制尤为重要。例如上文提到的员工工资，这应该是一个隐私资源，只有员工本人或其他少数有权限的人有资格看到，如果不通过权限认证机制对资源做一层限制，那么所有资源都以公开方式暴露出来，这是不合理的，也是很危险的。

认证机制解决的问题是，确定访问资源的用户是谁；权限机制解决的问题是，确定用户是否被许可使用、修改、删除或创建资源。权限机制通常与服务的业务逻辑绑定，因此权限机制需要在每个系统内部定制，而认证机制基本上是通用的，常用的认证机制包括 session auth(即通过用户名密码登录)，basic auth，token auth和OAuth，服务开发中常用的认证机制为后三者。



本文共参考如下文章：
- [RESTful 架构风格概述](https://www.cnblogs.com/chinajava/p/5871305.html)
- [RESTful 架构详解](http://www.runoob.com/w3cnote/restful-architecture.html)
- [【Restful】三分钟彻底了解Restful最佳实践](https://blog.csdn.net/chenxiaochan/article/details/73716617)