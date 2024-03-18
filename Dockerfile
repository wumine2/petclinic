FROM adoptopenjdk/openjdk17:jre-17.0.1_12-alpine
EXPOSE 8082
ADD target/petclinic.war petclinic.war
ENTRYPOINT ["java", "-jar", "/petclinic.war"]
