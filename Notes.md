### Demo0 - Video 2
- Simple Java Project
- trying to explain the issue of tight coupling when we use plain java to create industry level projects.

### Demo1 - Video 4
- creating IOC container using spring in java application
- use of @Configuration and @Bean annotations
- initialising and getting beans from ioc container, to enhance loose coupling.

### Demo2 - Video 5
- Not implemented/Not Required, Demo was regarding Constructor based Injection

### Demo3 - Video 6
- Not implemented/Not Required, Demo was regarding Setter based Injection

### Demo4 - Video 7
- @ComponentScan and @Component to create bean automatically
- Using Constructor based Injection

### Demo5 - Video 8
- @Autowired and @Value Annotations

### Demo6 - Video 9
- @Primary and @Qualifier Annotations

### Demo7 - Video 10
- Simple HelloWorld Spring Boot App using SpringInitializer

### Demo8 - Video 11 (Important - Watch Video Again)
- Running same simple spring Application (Demo5) using SpringBoot dependency instead of Spring-Context dependency.
- @SpringBootApplication consist of @Configuration + @ComponentScan + @EnableAutoConfiguration
- @Configuration + @ComponentScan are common with simple Spring Application
- using @EnableAutoConfiguration, springBoot app do autoConfiguration for dependencies
- we replace manual ApplicationContext creation with automatic ApplicationContext creation using SpringApplication.run(Demo.class, args) method
- SpringApplication.run method create ApplicationContext and invoke run method of CommandLine runners beans Automatically.
- Use Multiple CommandLine Runners

### Demo9 - Video 12
- Scopes in Spring Application
- Number of Beans creation in Singleton and Prototype Scope

### Demo10 - Video 13
- Logging in spring boot app
- Logging with file rolling policy

### Demo11 - Video 14
- reading configurations from .properties file
- configure multiple .properties file in spring boot app using @PropertySource Annotation
- Fetching configuration by Autowiring Environment object
- if same configuration available in multiple properties file application.properties file will get preference

### Demo12 - Video 15
- managing multiple .properties file for multiple environments/profiles
- application.properties file for common properties and application-{env}.properties files for env/profile specific configurations
- creating bean based on active profile using @Profile annotation

### Demo13 - Video 16
- replace .properties file with .yml file
- merge multiple environment .properties files in single yaml file

### Demo14 - Video 17-18
- AOP concepts learning
- AOP practice project

### Demo15 - Video 19-20-21
- Unit Testing in Spring Boot Project
- devTools in SpringBoot App
- Custom Banner in SpringBoot App

