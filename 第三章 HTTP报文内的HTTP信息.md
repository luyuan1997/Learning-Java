[toc]
# 1.HTTP报文
用于HTTP协议交互的信息成为HTTP报文，分为请求报文和响应报文。HTTP是由多行(用CR+LF作换行符)数据构成为字符串文本。HTTP报文分为报文首部（服务器端或者客户端需要处理的请求或响应的内容及属性）和报文主体（应被发送的数据）两部分，两者由空行（CR(Carriage Return,回车符，16进制0x0d)+LF(Line Feed,换行符，16进制0x0a)）划分。通常，不一定有报文主体。  
![image](https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1533872828435&di=690936ad48cec0ed06d03a6b9fb9c093&imgtype=0&src=http%3A%2F%2Fwww.th7.cn%2Fd%2Ffile%2Fp%2F2016%2F05%2F24%2Fddfa9a60929c65020ee957bbe4883901.jpg)  
![image](https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1533872894398&di=60b0113aca24ab9f5cbbc3750bdaa035&imgtype=0&src=http%3A%2F%2Fimg0.tuicool.com%2F2u6RviE.jpg%2521web)
![image](https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1533873012841&di=3f6772bd85abae31f72f7900bd2c1190&imgtype=0&src=http%3A%2F%2Fimg.it610.com%2Fimage%2Finfo5%2Ffc6d458936594e4aa5c19aee0ababbd9.jpg)  
1）请求行：包含用于请求的方法，请求URI和HTTP版本；  
2）状态行：包含表明响应结果的状态码，原因短语和HTTP版本；  
3）首部字段：包含表示请求和响应各种条件和属性的各类首部；一般分为：通用首部、请求首部、响应首部和实体首部；  
4）其他：可能包含HTTP的RFC里未定义的首部（Cookie等）。
# 2.编码提升传输效率
通过在传输时编码，能有效处理大量的访问请求，但是会占用大量的CPU。
## 2.1报文主体和实体主体的差异
### 2.1.1报文(message)
是HTTP通信中的基本单位，由8位组字节流组成，通过HTTP通信传输。
### 2.1.2实体(entity)
作为请求或者响应的有效载荷数据（补充项）被传输，其内容由实体首部和实体主体组成。
HTTP报文主体用于传输请求或响应的实体主体。
通常，报文主体等同于实体主体。只有当传输中进行编码操作时，实体主体的内容发生变化，才导致它和保温主题产生差异。
## 2.2 压缩传输的内容编码
内容编码指明应用在实体内容上的编码格式，其保持实体信息原样压缩。内容编码后的实体由客户端接收并负责解码。  
常用的内容编码形式：gzip(GNU zip)、compress(UNIX系统的标准压缩)、deflate和identity(不进行编码)
## 2.3分割发送的分块传输编码
- 在传输大容量数据时，通过把数据分割成多块，能够让浏览器逐步显示页面。这种把实体主体分块的功能称为分块传输编码(Chunked Transfer Coding)。
- 分块传输编码会将实体主体分为多块，每块用16进制来标记块的大小，结尾用"0(CR+LF)"标记。  
- 使用分块传输编码会在客户端对实体主体进行解码。
# 3发送多种数据的多部分对象集合  

采用MIME(Multipurpose Internet Mail Extensions,多用途因特网邮件扩展)机制，可以在一个文件中添加多种类型文件。多部分对象集合(Multipart)包含的对象有：  
- multipart/form-data：在Web表单文件上传时使用；
- multipart/byteranges：状态码206(Partial Content，部分内容)响应报文包含了多个范围的内容时使用。
- 在HTTP报文中使用多部分对象集合时，需要在首部字段里增加Content-Type字段。
# 4.获取部分内容的范围请求
为实现恢复机制（在网络中断的情况下，可以从之前下载中断处恢复下载）功能，需要制定下载的实体范围，像这样制定范围发送的请求叫做范围请求。  
执行范围请求需要用到首部字段Range来指定资源的byte范围，形式如下：  
- 5001~10000字节：Range: bytes=5001-10000
- 从5001字节之后的全部：Range: bytes=5001-
- 多重范围选取：Range: bytes=0-3000, 5000-7000  

针对范围请求，响应会返回状态码206 Partial Content的响应报文。对于多重范围请求，响应会在首部字段Content-Type标明multipart/byteranges后返回响应报文。  
如果服务器无法响应范围请求，则会返回200 OK和完整的实体内容。  
# 5.内容协商返回最合适的内容
内容协商机制是指客户端和服务器端就响应的资源内容进行交涉，然后提供给客户端最为适合的资源。内容协商会以语言、字符集、编码方式等为基准判断响应的资源。  
包含在请求报文中的某些首部字段就是判断的标准，如：
- Accept
- Accept-Charset
- Accept-Encoding
- Accept-Language
- Content-Language  

内容协商技术有如下三种：  
- 服务器驱动协商(Server-driven Negotiation)：由服务器端进行内容协商。以请求的首部字段为参考，在服务器端自动处理。对用户来说，已浏览器发送的信息作为判定的依据，并不一定能够筛选出最优内容。
- 客户端驱动写上(Agent-driven Negotiation)：由客户端进行内容协商的方式。用户从浏览器显示的可选项列表中手动选择，可以利用JavaScript脚本在Web页面上自动进行上述选择。
- 透明协商(Transparent Negotiation)：是服务器驱动与客户端驱动的结合体，是由服务器端与客户端各自进行内容协商的一种方式。