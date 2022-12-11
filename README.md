# yacoding-dongbao-mall-master
# yacoding-dongbao-mall

#### 介绍

yacoding东宝商城小白

#### 软件架构

软件架构说明


#### 安装教程

1.  xxxx
2.  xxxx
3.  xxxx

#### 使用说明

1.  xxxx
2.  xxxx
3.  xxxx

#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request


#### 特技

1. 使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2. Gitee 官方博客 [blog.gitee.com](https://blog.gitee.com)
3. 你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解 Gitee 上的优秀开源项目
4. [GVP](https://gitee.com/gvp) 全称是 Gitee 最有价值开源项目，是综合评定出的优秀开源项目
5. Gitee 官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)
6. Gitee 封面人物是一档用来展示 Gitee 会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)


# 工程结构

```xml
父项目
----子项目
----子项目

pom.xml
```



```xml
yacoding-dongbao-mall-parent        	父项目
--yacoding-dongbao-mall-application 	入口（controller）
--yacoding-dongbao-mall-api			接口（controller调用api）
    --yacoding-dongbao-cms-api
    --yacoding-dongbao-cart-api		购物车api代码
    --yacoding-dongbao-pms-api		商品中心api代码
    --yacoding-dongbao-dictionary-api
    --yacoding-dongbao-oms-api
    --yacoding-dongbao-pay-api
    --yacoding-dongbao-sms-api
    --yacoding-dongbao-ums-api

--yacoding-dongbao-mall-service		接口的实现层(api的实现层)
    --xxxx项目
--yacoding-dongbao-mall-common		通用工具类
pom.xml
```



```
代码模块介绍
yacoding-dongbao-mall-parent        	父项目
	yacoding-dongbao-common 公共包
		yacoding-dongbao-common-base 公共基础类
		yacoding-dongbao-common-util 工具类
	yacoding-dongbao-api 业务模块接口层
		yacoding-dongbao-oms-api 订单中心接口
		yacoding-dongbao-pms-api 商品中心接口
		yacoding-dongbao-ums-api 用户中心接口
		yacoding-dongbao-pay-api 支付中心接口
		yacoding-dongbao-cart-api 购物车接口
		yacoding-dongbao-dictionary-api 基础字典接口
		yacoding-dongbao-sms-api 优惠中心接口
		yacoding-dongbao-cms-api 内容中心接口
	yacoding-dongbao-service 业务模块实现层
		yacoding-dongbao-oms 订单中心模块实现
		yacoding-dongbao-pms 商品中心模块实现
		yacoding-dongbao-ums 用户中心模块实现
		yacoding-dongbao-pay 支付中心模块实现
		yacoding-dongbao-cart 购物车模块实现
		yacoding-dongbao-dictionary 基础字典模块实现
		yacoding-dongbao-sms 优惠中心模块实现
		yacoding-dongbao-cms 内容中心模块实现
	yacoding-dongbao-application web应用模块

	    yacoding-dongbao-manager-web 后台管理应用
		yacoding-dongbao-portal-web 商城门户网站
	yacoding-dongbao-job 定时任务模块

	yacoding-dongbao-generator 代码生成器
```


