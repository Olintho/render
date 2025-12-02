FROM eclipse-temurin:latest AS build
#RUN mkdir /opt/app

COPY target/deploy_render-1.0.0.jar app.jar
#COPY --from=build /target/deploy_render-1.0.0.jar app.jar

CMD ["java", "-jar", "app.jar"]

EXPOSE 8080
