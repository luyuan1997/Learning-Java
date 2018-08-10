[toc]
# 1.客户端
通过发送请求获取服务器资源的web浏览器等，都可称为客户端。web使用HTTP(HyperText Transfer Protocol)的协议作为规范，完成从客户端到服务器端等一系列运作流程。因此可以说，web是建立在HTTP协议上通信的。
# 2.TCP/IP/DNS
## 2.1TCP/IP协议族
计算机与网络设备之间的通讯必须基于相同的方法，不同的硬件、操作系统之间的通信，所有的之一切都需要一种规则，这种规则就称为协议。  
TCP/IP有三种解释，分别为：  
1）我们把与互联网相关联的协议集合起来总称为TCP/IP；  
2）指的是TCP协议和IP协议；  
3）在IP协议的通信过程中，使用的协议族的统称。
## 2.2TCP/IP的分层管理
TCP/IP采用分层结构，把各层之间的接口部分规划好之后，每个层次内部的设计就能够自由进行改动。TCP/IP共分为四层。
### 2.2.1应用层
应用层决定了向用户提供应用服务时通信的活动，常用的有：FTP(File Transfer Protocol,文件传输协议)、DNS(Domain Name System,域名系统)和HTTP协议。
### 2.2.2传输层
传输层对上层应用层，提供处于网络连接中的两台计算机的数据传输。包括，TCP(Transmission Control Protocol，传输控制协议)和UDP(User Data Protocol，用户数据报协议).
### 2.2.3网络层（网络互联层）
网络层用来处理在网络上流动的数据包。数据包是网络传输的最小数据单位。该层规定了通过怎样的路径（所谓的传输路线）到达对方计算机，并将数据包传给对方。  
与对方计算机之间通过多台计算机或者网络设备进行传输时，网络层所起到的作用是在众多的选项内选择一条传输路线。
### 2.2.4链路层（数据链路层/网络接口层）
用来处理网络的硬件部分。硬件上的范畴均在链路层的作用范围之内。
## 2.3TCP/IP通信传输流
![image](https://images2015.cnblogs.com/blog/1181881/201706/1181881-20170626153258071-1029565526.png)
利用TCP/IP协议族进行网络通信时，会通过分层顺序与对方进行通信。发送端从应用层往下走，接受层则从链路层往上走。  
首先作为发送端的客户端在应用层（HTTP协议）发出一个想看某个WEB页面的HTTP请求。  
接着，为了传输方便，在传输层（TCP协议）把从应用层收到的数据（HTTP请求报文）进行分割，并在各个报文上打上标记序号及端口号后转发给网络层。  
在网络层（IP协议），增加作为通信目的的MAC地址后转发给链路层。这样一来，发往网络的通信请求就准备齐全。  
接收端的服务器在链路层接收到数据，按序往上层发送，一直到应用层。当传输到应用层，才算真正接收到有客户端发送过来的HTTP请求。  
***发送层在层与层之间传输数据时，每经过一层必定被打上一个该层所属的首部信息。反之，接收端在层与层传输数据时，每经过一层会把对应的首部消去。  
这种把数据信息包装起来的做法称之为封装（encapsulate).***
## 2.4与HTTP关系密切的协议：IP/TCP/DNS
### 2.4.1负责传输的IP协议
IP(Internet Protocol)网际协议位于网络层，几乎所有使用网络的系统都会用到IP协议。起作用是把各种数据包传送给对方，为了保证确实传送到对方，必须满足各种条件，最重要的就是IP地址和MAC地址（Media Access Controll Address).  
IP地址指明了节点被分配到的地址，MAC地址是指网卡所属的固定地址。IP地址和MAC地址进行配对，IP地址可以更换，但是MAC地址基本上不会更改。
IP间的通信依赖MAC地址，通信的双方往往是经过多台计算机和网络设备中转才能连接到对方，中转时，会利用下一站中转设备的MAC地址来搜索下一个中转目标，这时会采用ARP(Address Resolution Protocol)。ARP是一种用以解析地址的协议，根据通信方的IP地址就可以反查出对应的MAC地址。
### 2.4.2确保可靠性的TCP协议
TCP位于传输层，提供可靠的字节流服务。所谓的字节流服务（Byte Stream Service)是指，为了方便传输，将大块数据分割为以报文段(segment)为单位的数据包进行管理。而可靠的传输服务是指，能够把数据准确可靠的传给对方。  
TCP协议为了更容易传送大数据才能把数据分割，而且TCP协议能够确认数据最终是否送达到对方。  
TCP采用三次握手(three-way handshaking)的策略准确无误地将数据送达目标处。  
发送端首先发送一个带有SYN标志的数据包给对方。接收端收到后，回传一个带有SYN/ACK标志的数据包以示传达确认消息。最后，发送端再回传一个带ACK标志的数据包，代表“握手”结束。  

![image](https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1251521130,3152839845&fm=27&gp=0.jpg)  
![image](https://images2015.cnblogs.com/blog/801753/201705/801753-20170530134852368-626393240.jpg)
若在我收过程中某个阶段莫名中断，TCP协议会再次以相同的顺序发送相同的数据包。
### 2.4.3负责域名解析的DNS服务
DNS服务位于应用层，提供域名到IP地址之间的解析服务。DNS协议提供通过域名查找IP地址，或逆向从IP地址反查域名的服务。  
DNS主要解决计算机名中字母加数字的表示形式。  
![image](https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1533830020921&di=28cc8934646bc6acbc95f6ab4785ca71&imgtype=0&src=http%3A%2F%2Fimage.codes51.com%2FArticle%2Fimage%2F20170504%2F20170504161541_5781.jpg)  
图 各种协议与HTTP协议的关系
## 2.5URI和URL
### 2.5.1统一资源标识符
URI(Uniform Resource Identifier统一资源标识符)就是由于某个协议方案表示的资源的定位标识符。协议方案是指访问资源所使用的协议类型名称。采用HTTP协议时，协议方案就是http。  
URI用字符串标识某一互联网资源，而URL表示资源的地点（互联网上的位置）。因此，URL是URI的子集。
### 2.5.2URI格式
表示制定的URI，要使用涵盖全部必要信息的绝对URI、绝对URL以及相对URL。相对URL是指从浏览器中基本URI处制定的URL，形如/image/logo.gif.  

![image](https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1533830762417&di=068421b3024dfca2629e89ddd8b5d270&imgtype=jpg&src=http%3A%2F%2Fimg1.imgtn.bdimg.com%2Fit%2Fu%3D2199450846%2C2627177721%26fm%3D214%26gp%3D0.jpg)  
使用http:或https:等协议方案名获取访问资源时要制定协议类型。不区分大小写，最后附一个冒号。  
也可以使用data:或者javascript:这类指定数据或脚本程序的方案名。  
1）登录信息（认证）  
指定用户名和密码作为从服务器获取资源时必要的登录信息(身份认证).此项是可选项。  
2）服务器地址  
使用绝对URI必须指定待访问的服务器地址。可以使hackr.jp这种DNS可解析的名称，或者是IPV4或者IPV6地址名。  
3）服务器端口号  
指定服务器连接的网络端口号。可选项，若用户省略则使用默认的端口号。  
4）带层次的文件路径  
指定服务器上的文件路径来定位特指的资源。  
5）查询字符串  
针对已指定的文件路径内的资源，可以使用查询字符串传入任意参数。此项可选。  
6）片段标识符  
使用片段标识符可以标记出已经获取资源的子资源(文档内的某个位置)。但在RFC中的并没有明确规定其使用方法。为可选项。
# 3.简单的HTTP协议
## 3.1HTTP协议用于客户端和服务器端之间的通信，通过请求和响应的交换达成通信
下面为从客户端发送给某个HTTP服务器端的请求报文中的内容：  

```
GET /index.htm HTTP/1.1
Host: hackr.jp
```
起始行开头的GET表示请求访问服务器的类型，称为方法。随后的字符index.htm指明了请求访问的资源对象，也叫作请求URI(request-URI).最后的为HTTP版本号，用来提示客户端使用的HTTP协议功能。其意为：请求访问某台HTTP服务器上的/index.htm页面资源。  
请求报文是由请求方法、请求URI、协议版本、可选的请求首部字段和内容实体构成。  
![image](https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1533834892144&di=ec992036b3cb2c953239f7499b0fe4fb&imgtype=jpg&src=http%3A%2F%2Fimg0.imgtn.bdimg.com%2Fit%2Fu%3D4253544680%2C2443771322%26fm%3D214%26gp%3D0.jpg)  
接收到请求的服务器，会将请求内容的处理结果以响应的形式返回。  

```
HTTP/1.1 200 OK
Date: Tue, 10 Jul 2012 06:50:15 GMT
Content-Length: 362
Content-Type: text/html

<html>
......
```
![image](https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1533835109676&di=4c687c4e00b8cc33b112a2283a3be1ee&imgtype=0&src=http%3A%2F%2Fwww.qingpingshan.com%2Fuploads%2Fallimg%2F170203%2F1439594047-1.png)  
## 3.2 HTTP是不保存状态的协议
HTTP是一种不保存状态，即无状态(stateless)状态。HTTP协议自身不对请求和响应之间的通信状态进行保存。也就是说在HTTP这个级别，协议对于发送过的请求或响应都不做持久化处理。这是为了更快的处理大量事务，确保协议的可伸缩性，而特意把HTTP协议设计成如此简单。  
为了实现期望的保持状态功能，因此引入了Cookie技术。  
HTTP协议使用URI定位互联网上的资源。指定请求URI的方式有：  
1）URI为完整的请求URI，如
```
GET http://hackr.jp/index.htm HTTP/1.1
```

2)在首部字段HOST中写明网络域名或IP地址

```
GET /index.htm HTTP/1.1
Host: hackr.jp
```
## 3.3告知服务器意图的HTTP方法
1）GET：用来请求访问已被URI识别的资源。指定的资源经服务器端解析后返回响应内容。如果请求的资源是文本，那就保持原样返回。如果是CGI(Common Gateway Interface，通用网关接口)，则返回经过执行后的输出结果。  
2）POST:传输实体主体，GET和POST方法具有本质上的区别：  
(1)GET方法用于信息获取，它是安全的（安全：指非修改信息，如数据库方面的信息），而POST方法是用于修改服务器上资源的请求；  
(2)GET请求的数据会附在URL之后，而POST方法提交的数据则放置在HTTP报文实体的主体里，所以POST方法的安全性比GET方法要高；  
(3)GET方法传输的数据量一般限制在2KB，其原因在于：GET是通过URL提交数据，而URL本身对于数据没有限制，但是不同的浏览器对于URL是有限制的，比如IE浏览器对于URL的限制为2KB，而Chrome，FireFox浏览器理论上对于URL是没有限制的，它真正的限制取决于操作系统本身；POST方法对于数据大小是无限制的，真正影响到数据大小的是服务器处理程序的能力.  
3)PUT:传输文件。要求在请求报文的主体中包含文件内容，然后保存到请求URI指定的位置。  
4）HEAD：获得报文首部，用于确认URI的有效性及资源更新的日期时间等；  
5）DELETE:删除文件。按请求URI删除指定的资源。  
6）OPTIONS:用来查询针对请求URI指定的资源支持的方法；  
7）TRACE:让Web服务器端将之前的请求通信返回给客户端的方法；  
8）CONNECT:要求在与代理服务器通信时建立隧道，实现用隧道协议进行TCP通信，主要使用SSL(Secure Sockets Layer,安全套接层)和TLS(Transport Layer Security,传输层安全)协议把通信内容加密后经网络隧道传输。
## 3.4使用Cookie的状态管理
![image](https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1533836909146&di=3ffe869f15d8041fae9bf6ca6e465023&imgtype=0&src=http%3A%2F%2Faliyunzixunbucket.oss-cn-beijing.aliyuncs.com%2Fjpg%2F2784a880d5901b821b02e4d070c25bdb.jpg%3Fx-oss-process%3Dimage%2Fresize%2Cp_100%2Fauto-orient%2C1%2Fquality%2Cq_90%2Fformat%2Cjpg%2Fwatermark%2Cimage_eXVuY2VzaGk%3D%2Ct_100)  
1)请求报文(没有Cookie信息的状态)

```
GET /reader/ HTTP/1.1
Host: hackr.jp
*首部字段内没有Cookie的相关消息
```
2）响应报文（服务器端生成Cookie信息）

```
HTTP/1.1 200 OK
Date: Thu, 12 Jul 2012 07:12:20 GMT
Server: Apache
<Set-Cookie: sid=1342077140226724; path=/; expires=Wed, 10-Oct-12 07:12:20 GMT>
Content-Type: text/plain; charset=UTF-8
```
3)请求报文（自动发送保存着的Cookie信息）

```
GET /image/ HTTP/1.1
Host: hackr.jp
Cookie: sid=1342077140226724
```
