FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG DEPENDENCY=target/dependency
RUN set -xe \ && apk --no-cache add ttf-dejavu fontconfig
ENV TIME_ZONE Asiz/Shanghai
ENV JAVA_OPTS="-server -Xms400m -Xmx500m -Xmn400m -Duser.timezone=GMT+08 -Djava.security.egd=file:/dev/./urandom"
ADD /target/mongodb.jar mongodb.jar
EXPOSE 8089
ENTRYPOINT ["java","-jar","mongodb.jar"]
