# reggie-takeout-cloud

## 介绍
基于黑马程序员瑞吉外卖开发, 瑞吉外卖微服务项目

#### 软件架构
软件架构说明


## 安装教程

1.  找到项目初始化文件夹，导入sql
2.  nacos配置文件压缩包，注意命名空间
3.  初始化vue项目 npm i


## 技术栈介绍

### 后端技术栈
都是比较新的版本微服务，把 nacos 做注册中心，把 dubbo 融合进去，并且都以最新版本匹配

pringboot 2.5.14
2020 版本的 SpringCloud
2.7.7 版本的阿里巴巴微服务
2.x 版本 nacos 服务发现和配置
2.7 版本的 Dubbo 远程调用 （2.7.7版本阿里巴巴微服务包下的）
geteway 网关服务
redisson 分布式锁
rabbtion MQ 消息队列

    代替业务后续不需要等待完成需求
    延时队列，订单超时未支付取消

CompletableFuture 异步编排查询

    编排并发加载一些数据

Spring 提供的@Async注解（因使用AOP实现的，使用比较局限）
请求合并（批处理，首页中使用到）

    阻塞队列 -》 聚合存请求 ，
    定时器 -》 定时处理聚合存在阻塞队列的请求

AOP 切面

    流量管控
    分布式锁

支付宝 API 调用

    支付
    退款

mapstruct 实体类映射转换工具，

    特点：牺牲一点内存换取高性 bean 转换

使用 Redis hashMap 开发购物车功能
还有其他一些比较常用有

    lombok
    mybatisplus
    redis


### 前端技术栈

    vue2 cli
    elementUI 组件
    vant2 UI 组件
    vue 路由器和使用 vue 路由的钩子
    keep-alive 页面缓存，可以防止页面闪烁
    axios 请求

## 项目介绍

### 首页


    介绍首页聚合哪些数据
        分类信息
        产品列表
        购物车

    介绍请求合并
        CompletableFuture 对象

    链表的阻塞队列
        定时器

    使用请求合并可以解决穿透问题

    异步使用
        可以解决分类和产品数据的同时还要读取当登录的购物车信息

    redis
        缓存分类信息和产品列表

    分布式锁
        解决高并发下导致多个线程读取数据库数据到缓存中

### 购物车


    商品加入到购物车
    购物车中商品数量增加减少
    删除购物车中的某个商品
    清空购物车

### 优惠券

    发布优惠券
    优惠券领取
    优惠券管理

### 提交订单
   
    异步编排加载下单的数据
    订单提交
        策略模式根据枚举数组绑定的顺序进行渲染每个步骤
        渲染完成之后使用 rabbit MQ 发送消息并且 redis 存储一份消息
    订单提交成功之后，调用支付微服务

### 支付


    使用的支付宝

    订单提交成功调用支付微服务

    查询订单检查什么多介绍

    调用支付宝 SDK API 生成支付数据，返回前端

### 前端支付

    后端响应支付数据之后跳转到支付宝支付界面
    用户支付成功之后
        支付宝异步回调 -》 存根 -》 改变订单状态
        前端同回调访问接口 -》 重定向到订单页面
    

### 页面发起退款请求

    检查订单是否符合退款
    创建退款信息
    响应前端
    rabbit MQ 通知卖家有人退款
    卖家接收到消息同意退款
    rabbit MQ 通知支付微服务处理退款
    支付微服务消费消息处理退款
    完成


本项目fork了 https://gitee.com/starsh 这位开发者的项目 https://gitee.com/hayhead/order-take-out-cloud




