### 这是一个期望通过SpringCloud来改造orangepeels.net的项目

#### 整体构架
```
- orangecloud 父容器
    - orangecloud-api 服务生产者，供服务消费者调用
    - orangecloud-api2 服务生产者2，供服务消费者调用
    - orangecloud-common 一些通用方法或者变量的放置
    - orangecloud-eureka eureka服务注册器，注册服务，发现服务
    - orangecloud-eureka eureka服务注册器2，注册服务，发现服务
    - orangecloud-web 服务的消费者
```
#### 添加hosts 模拟多服务器负载均衡
```
127.0.0.1 orangecloud1.net
127.0.0.1 orangecloud2.net
```