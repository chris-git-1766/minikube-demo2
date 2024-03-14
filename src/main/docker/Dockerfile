FROM eclipse-temurin:21-jre

RUN mkdir -p /opt/application
COPY *-runner.jar /opt/application/minikube-demo-vk.jar
WORKDIR /opt/application
CMD [ "java", "-jar", "minikube-demo-vk.jar"]
