FROM openjdk:8-jdk-alpine

VOLUME /opt/tmp

ADD detail-v1-1.0.0.jar detail-v1.jar

ENV JAVA_OPTS=""

ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /detail-v1.jar