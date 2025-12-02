FROM eclipse-temurin:latest 
#RUN mkdir /opt/app

RUN apt-get update
COPY . .

RUN apt-get install maven -y
RUN mvn clean install 
#COPY target/deploy_render-1.0.0.jar app.jar

COPY --from=build /target/deploy_render-1.0.0.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]
#CMD ["java", "-jar", "app.jar"]

EXPOSE 8080
