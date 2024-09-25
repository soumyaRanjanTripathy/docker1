FROM openjdk:11
EXPOSE 8080
ADD target/Kubernates.jar Kubernates.jar

ENTRYPOINT [ "java"."-jar","Kubernates.jar" ]