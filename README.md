<h1 align="center">Upin-core</h1>

<div align="center"><img src="assets/spring-framework.png" width="80" height="80" alt=""/></div>

## About
The upin-core is a lightweight adaptation of the Spring framework designed to help you quickly understand its source code and core principles. It distills Spring’s essential logic into a much simpler form, while still preserving the key features such as IoC, AOP, resource loading, event listening, type conversion, container extension points, bean lifecycle and scope, as well as the application context.

## Contents
#### Basics
* IoC
    * Implement a simple container
    * BeanDefinition and BeanDefinitionRegistry
    * Bean Instantiation Strategy
    * Populate bean with property values
    * Populate bean with bean
    * Resource and ResourceLoader
    * Define the bean in the XML file
    * Container extension mechanism：BeanFactoryPostProcess and BeanPostProcessor
    * ApplicationContext
    * Init method and destroy method of bean
    * Aware interface
    * Bean scope, added prototype support
    * FactoryBean
    * Event and event listener
* AOP
    * Pointcut expression
    * JDK-based dynamic proxy
    * CGLIB-based dynamic proxy
    * AOP ProxyFactory
    * Common Advice: BeforeAdvice/AfterAdvice/AfterReturningAdvice/ThrowsAdvice
    * PointcutAdvisor：A combination of Pointcut and Advice
    * Dynamic proxies are integrated into the bean lifecycle
