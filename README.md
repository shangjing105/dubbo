# Dubbo脚手架项目

## pisces-api

api接口层，需要将API打包成jar包，在下面两个工程里定义。内部的dto，exception包是接口对外的数据模型和异常信息。

`#打包命令 mvn clean install`


## pisces-provide

provide服务提供者，对外提供服务接口。这个项目里提供者即使提供者也是消费者。

`#mvn启动  mvn spring-boot:run`

## pisces-consumer

provide服务消费者，消费提供者提供的接口。

`#mvn启动  mvn spring-boot:run`