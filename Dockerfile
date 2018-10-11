FROM openjdk:8
COPY build/jars/*.jar /jars/
COPY build/libs/spring-boot-hello-world-1.0-SNAPSHOT.jar /jars/

CMD [ "sh", "-c", "java $JAVA_OPTS -cp '/jars/*' -Djava.security.egd=file:/dev/./urandom de.melnichuk.helloworld.HelloWorld" ]
