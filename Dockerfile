FROM registry.redhat.io/ubi8/openjdk-17:1.20-2.1721231681
COPY target\demo-0.0.1-SNAPSHOT.jar ./app.jar
COPY sample-file.txt ./sample-file.txt

ENV CLASS_PATH=classpath:sample-file.txt
ENV DB_DEFAULT_POOL=5
ENV DB_MAX_POOL=100
ENV DB_NAME=demo2
ENV DB_PASSWORD=root
ENV DB_URL=jdbc:mysql://localhost:3306
ENV DB_USERNAME=root
ENV FILE_PATH=/home/jboss/sample-file.txt
ENV LOG_DIRECTORY=
ENV LOG_FILE_NAME=
ENV LOG_LEVEL_MS=off
ENV JAVA_OPTIONS="-Xms256m -Xmx512m -XX:+UseG1GC -XX:MaxPermSize=128m -XX:MaxTenuringThreshold=0"

EXPOSE 8081
CMD java ${JAVA_OPTIONS} -jar app.jar