FROM eclipse-temurin:latest AS build
RUN mkdir /opt/app

#COPY target/deploy_render-1.0.0.jar /opt/app/app.jar
COPY --from=build /target/deploy_render-1.0.0.jar /opt/app/app.jar

CMD ["java", "-jar", "/opt/app/app.jar"]

EXPOSE 8080
