### spi-demo
使用JAVA SPI机制实现可插拔的应用插件示例项目

>JAVA SPI机制，全称: Service Provider Interface，是一种服务发现机制。它通过在classpath路径下的META-INF/services文件夹查找文件，自动加载文件中实现了特定接口的所定义的类。这一机制为很多框架实现扩展提供了可能，比如在Dubbo、JDBC、Spring、Mybatis、Netty等框架中都使用到了SPI机制。SPI的实现原理基于Java类加载机制和反射机制。

##### 常见的SPI应用场景
|  应用名称   | 应用场景  |
|  ------  | ------  |
| JDBC  | JDBC为了实现可插拔的数据库驱动，在Java.sql.Driver接口中定义了一组标准的API规范，而具体的数据库厂商则需要实现这个接口，以提供自己的数据库驱动程序。在Java中，JDBC驱动程序的加载就是通过SPI机制实现的。 |
| Dubbo  | Dubbo框架也使用了SPI思想，通过接口注解@SPI声明扩展点接口，并在classpath下的META-INF/dubbo目录中提供实现类的配置文件，来实现扩展点的动态加载。 |
| Spring  | Spring框架中的Bean加载机制就使用了SPI思想，通过读取classpath下的META-INF/spring.factories文件来加载各种自定义的Bean。 |
| MyBatis  | MyBatis框架中的插件机制也使用了SPI思想，通过在classpath下的META-INF/services目录中存放插件接口的实现类路径，来实现插件的加载和执行。 |
| Netty  | Netty框架也使用了SPI机制，让用户可以根据自己的需求选择合适的网络协议实现方式。 |
| Hadoop  | Hadoop框架中的输入输出格式也使用了SPI思想，通过在classpath下的META-INF/services目录中存放输入输出格式接口的实现类路径，来实现输入输出格式的灵活配置和切换。 |
| 日志  | 流行的开源日志框架，如Log4j、SLF4J和Logback等，都采用了SPI机制。用户可以根据自己的需求选择合适的日志实现，而不需要修改代码。 |

 需要说明的是Spring的SPI机制相对于Java原生的SPI机制进行了改造和扩展，主要体现在以下几个方面：
- 支持多个实现类：Spring的SPI机制允许为同一个接口定义多个实现类，而Java原生的SPI机制只支持单个实现类。这使得在应用程序中使用Spring的SPI机制更加灵活和可扩展。
- 支持自动装配：Spring的SPI机制支持自动装配，可以通过将实现类标记为Spring组件（例如@Component），从而实现自动装配和依赖注入。这在一定程度上简化了应用程序中服务提供者的配置和管理。
- 支持动态替换：Spring的SPI机制支持动态替换服务提供者，可以通过修改配置文件或者其他方式来切换服务提供者。而Java原生的SPI机制只能在启动时加载一次服务提供者，并且无法在运行时动态替换。
- 提供了更多扩展点：Spring的SPI机制提供了很多扩展点，例如BeanPostProcessor、BeanFactoryPostProcessor等，可以在服务提供者初始化和创建过程中进行自定义操作。
其他框架也是对Java SPI进行改造和扩展增强，从而更好的提供服务！

