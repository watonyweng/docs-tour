# docs-tour

This project was generated with [spring-boot](https://github.com/spring-projects/spring-boot) using [swagger-spring-boot-starter](https://github.com/SpringForAll/swagger-spring-boot-starter).

## Environment

- [Java](https://www.java.com)
- [Git](https://git-scm.com)

## Installation

- git clone https://github.com/watonyweng/docs-tour.git
- cd docs-tour && mvn clean install

## Compile

- mvn compile

## Package

- mvn package

## Run

- mvn spring-boot:run
- http://localhost:8418/swagger-ui.html

## Coding Guidelines

- [Alibaba Java Coding Guidelines](https://github.com/alibaba/p3c)

## User Guide

### 配置POM文件

```
<dependencies>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-data-rest</artifactId>
    </dependency>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
    </dependency>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-test</artifactId>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>org.projectlombok</groupId>
      <artifactId>lombok</artifactId>
      <version>1.18.12</version>
      <scope>provided</scope>
    </dependency>
    <dependency>
      <groupId>com.spring4all</groupId>
      <artifactId>swagger-spring-boot-starter</artifactId>
      <version>1.9.1.RELEASE</version>
    </dependency>
    <dependency>
      <groupId>io.github.swagger2markup</groupId>
      <artifactId>swagger2markup</artifactId>
      <version>1.3.3</version>
    </dependency>
    <dependency>
      <groupId>javax.persistence</groupId>
      <artifactId>persistence-api</artifactId>
      <version>1.0.2</version>
    </dependency>
  </dependencies>
```

### 在application.properties文件中加入Swagger相关配置

```
swagger.title=Docs Tour
swagger.description=Docs Tour
swagger.version=1.0.0.RELEASE
swagger.license=Apache License, Version 2.0
swagger.licenseUrl=https://www.apache.org/licenses/LICENSE-2.0.html
swagger.termsOfServiceUrl=https://github.com/watonyweng
swagger.contact.name=WaTonyWeng
swagger.contact.url=https://github.com/watonyweng
swagger.contact.email=softweitao@126.com
swagger.base-package=me.weitao.spring.docs

swagger.global-operation-parameters[0].name=access_token
swagger.global-operation-parameters[0].description=user access token
swagger.global-operation-parameters[0].modelRef=string
swagger.global-operation-parameters[0].parameterType=header
swagger.global-operation-parameters[0].required=true

swagger.global-operation-parameters[1].name=timestamp
swagger.global-operation-parameters[1].description=access timestamp
swagger.global-operation-parameters[1].modelRef=int
swagger.global-operation-parameters[1].parameterType=header
swagger.global-operation-parameters[1].required=false

swagger.apply-default-response-messages=true
swagger.global-response-message.get[0].code=401
swagger.global-response-message.get[0].message=401get
swagger.global-response-message.get[1].code=500
swagger.global-response-message.get[1].message=500get
swagger.global-response-message.get[1].modelRef=ERROR

swagger.ui-config.json-editor=false
swagger.ui-config.show-request-headers=true
swagger.ui-config.request-timeout=5000
swagger.ui-config.submit-methods=get,delete

swagger.docket.member.title=\u4F1A\u5458\u7BA1\u7406
swagger.docket.member.description=\u4F1A\u5458\u7BA1\u7406
swagger.docket.member.version=1.0.0.RELEASE
swagger.docket.member.termsOfServiceUrl=https://github.com/watonyweng
swagger.docket.member.contact.name=WaTony
swagger.docket.member.contact.url=https://github.com/watonyweng
swagger.docket.member.contact.email=softweitao@126.com
swagger.docket.member.base-path=/member
swagger.docket.tag.title=\u4F1A\u5458\u6807\u7B7E
swagger.docket.tag.description=\u4F1A\u5458\u6807\u7B7E
swagger.docket.tag.version=1.0.0.RELEASE
swagger.docket.tag.termsOfServiceUrl=https://github.com/watonyweng
swagger.docket.tag.contact.name=WaTony
swagger.docket.tag.contact.url=https://github.com/watonyweng
swagger.docket.tag.contact.email=softweitao@126.com
swagger.docket.tag.base-path=/tag
swagger.docket.level.title=\u4F1A\u5458\u7B49\u7EA7
swagger.docket.level.description=\u4F1A\u5458\u7B49\u7EA7
swagger.docket.level.version=1.0.0.RELEASE
swagger.docket.level.termsOfServiceUrl=https://github.com/watonyweng
swagger.docket.level.contact.name=WaTony
swagger.docket.level.contact.url=https://github.com/watonyweng
swagger.docket.level.contact.email=softweitao@126.com
swagger.docket.level.base-path=/level
```

## License

- docs-tour is released under an [MIT](https://opensource.org/licenses/MIT) license. See [LICENSE](https://github.com/watonyweng/docs-tour/tree/master/LICENSE) for more information.
