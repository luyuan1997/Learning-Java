[toc]
# 1.状态码告知从服务器端返回的请求结果
HTTP状态码负责表示客户端HTTP请求的返回结果、标记服务器端的处理是否正常、通知出现的错误等工作。响应类别有以下五种：  

状态码数字第一位  | 类别 | 原因短语
---|---|--
1XX | Informational（信息性状态码） | 接收的请求正在处理
2XX | Success(成功状态码) | 请求正常处理完毕
3XX | Redirection(重定向状态码) | 需要进行附加操作以完成请求
4XX | Client Error(客户端错误状态码) | 服务器无法处理请求
5XX | Server Error(服务器错误状态码) | 服务器处理请求出错
# 2. 2XX成功
2XX的相应结果表明请求被正常处理。  

- 200 OK：表示从客户端发来的请求在服务器端被正常处理了，包括GET请求和HEAD请求；
- 204 No Content:代表服务器接收的请求已成功处理，但在返回的响应报文中不含实体的主体部分，也不允许返回任何实体的主体。一般在只需要从客户端往服务器发送信息，而对客户端不需要发送新信息内容的情况下使用。
- 206 Partial Content:表示客户端进行了范围请求，而服务器成功执行了这部分的GET请求，响应报文中半含由Content-Range指定范围的实体内容；
# 3. 3XX重定向
3XX响应结果表面路蓝旗需要执行某些特殊的处理以正确处理请求。  
## 3.1 301 Moved Permanently:永久性重定向。  
表示请求的资源已经被分配了新的URI，以后应使用资源现在所指的URI，也就是说，如果已经把组员对应的URI保存为数钱，这是应该按照Location首部字段提示的URI重新保存。  
像下方给出的请求URI，当指定资源路径的最后忘记添加斜杠“/”，就会产生301状态码。

```
http://example.com/sample
```

```
HTTP/1.1 301 Moved Permanently
Server: nginx
Date: Tue, 21 Mar 2017 03:28:23 GMT
Content-Type: text/html
Content-Length: 178
Connection: close
Location: https://xx.com.bd/
X-Powered-By: EasyEngine 3.7.4

<html>
<head><title>301 Moved Permanently</title></head>
<body bgcolor="white">
<center><h1>301 Moved Permanently</h1></center>
<hr><center>nginx</center>
</body>
</html>
```
## 3.2 302Found
临时性重定位。表示请求的资源已经被分配了新的URI，希望用户（本次）能使用新的URI访问。  
与301代码相似，但是302代表的意思是这次分配是临时性的，之后还可能将这个资源分配为其他URI，如果用户将此URI存为书签，那么客户端不会根据头部字段Location中的值更新书签，而是仍然保留返回302状态码的页面对应的URI。  

```
HTTP/1.1 302 Found
Content-Type: text/html; charset=iso-8859-1
Content-Length: 208
Connection: close
Date: Tue, 21 Mar 2017 03:34:42 GMT
Server: Apache
Location: http://www.xxx.com

<!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML 2.0//EN">
<html><head>
<title>302 Found</title>
</head><body>
<h1>Found</h1>
<p>The document has moved <a href="http://www.xxx.com">here</a>.</p>
</body></html>
```
## 3.3 303 See Other
改状态码表示由于请求对应的资源存在着另一个URI，应使用GET方法定向获取请求的资源。  
303状态码与302状态码功能相同，但是303明确客户端应当采用GET方法获取资源。  
比如：当时用POST方法访问CGI程序，其执行后的处理结果是希望客户端能以GET方法重定向到另一个URI上去时，返回303状态码。

```
GET / HTTP/1.1
Host: 123.234.345.456
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
Accept-Encoding: gzip, deflate, sdch
Accept-Language: zh-CN,zh;q=0.8
Connection: close
```
这次请求的意思是，以GET方法访问123.234.345.456。

```
HTTP/1.1 303 See Other
Date: Tue, 21 Mar 2017 03:39:10 GMT
Server: Apache
Location: http://www.xxx.com
Content-Length: 300
Connection: close
Content-Type: text/html; charset=iso-8859-1

<!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML 2.0//EN">
<html><head>
<title>303 See Other</title>
</head><body>
<h1>See Other</h1>
<p>The answer to your request is located <a href="http://www.xxx.com">here</a>.</p>
<hr>
<address>Apache Server at 123.234.345.456 Port 80</address>
</body></html>
```
这段响应报文的意思是，http://www.xxx.com 也可以访问到 123.234.345.456 所访问的资源，请你访问 http://www.xxx.com 这个URI吧！
## 3.4 304 Not Modified
该状态码表示客户端在发送携带附加条件的报文时，服务端允许请求资源但未符合条件的情况，直接返回304 Not Modified（服务器端资源未改变可直接使用客户端未过期的缓存），返回时，不包含任何响应的主体部分。  
附加条件是指报文中含有 If-Match、If-None-Match、If-Modified-Since、If-Unmodified-Sine、If-Range 中任一头部
## 3.5 307 Temporary Redirect
临时重定向。与302意义相同，但是严格执行禁止POST变成GET。
# 4 4XX客户端错误
4XX的响应结果表明客户端是发生错误的原因所在。
- 400 Bad Request  
表示请求报文中存在语法错误。当错误发生时，需要修改请求的内容后再次发送请求。浏览器会像200 OK一样对待该状态码。
- 401 Unauthorized  
该状态码表示客户端发送的请求需要有通过HTTP认证的认证信息，若之前已经请求过一次则表示认证失败。  
返回含有 401 的响应必须包含一个用于被请求资源的 WWW-Authenticate 头部以认证（Challeneg）用户信息。当浏览器初次收到401响应会弹出用于认证的对话框。
- 403 Forbidden  
表明对请求资源的访问被服务器拒绝了。服务端没有必要返回拒绝的详细信息，若要返回在响应报文的主体中描述即可。  
未获得文件系统的访问授权，访问权限出现某些问题（从未授权的发送源IP地址试图访问）等列举的情况都可能是发生403的原因。
- 404 Not Found  
表明服务器上无法找到请求的资源，或者是服务器端拒绝请求且不想说明理由的使用。
# 5 5XX服务器错误
5XX响应结果说明服务器本身发生错误。
- 500 Internel Server Error  
表明服务器端在执行请求时，发生错误，也可能是Web应用存在的bug或某些临时的故障。
- 503 Service Unavailable  
表米昂服务器暂时处于超负载或者正在进行停机维护，现在无法处理请求。如果事先得知接触以上状态需要的时间，最好是写入Retry-After首部字段再返回给客户端。  


注：文中引用的代码有些来自于[第4章 返回结果的HTTP状态码 HTTP协议常用的状态码](https://blog.csdn.net/u010369338/article/details/64129478)