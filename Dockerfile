########################################
 # Start with a build image                                            #
#################################################
##################################################################   
 FROM artifactory.us.bank-dns.com:5000/usb/maven36-openjdk8:v_1.0.0As build
# copy file to /usr
COPY src /usr/src
COPY pom.xml /usr
COPY settings.xml /root/.m2/
WORKDIR /usr
RUN chmod +x /usr/share/fix_resolv.sh &&/usr/share/fix_resolv.sh && mvn clean package
#########################
# Base image                 #
#####################
FROM artifactory.us.bank-dns.com:5000/usb/java-openjdk-jre8u52:v_1.0.0 As base
WORKDIR /usr/src

COPY --from=bild /usr/target//github.com/satya7275/GQL-1.0.0-SNAPSHOT.jar /usr/src//github.com/satya7275/GQL-1.0.0-SNAPSHOT.jar
# Make port 8080 available to the world outside this container 
EXPOSE 8080
#executing Spring boot app 
#ENTRYPOINT ["java", "-jar","/usr/src/gd001-customer-services-query-1.0.0-SNAPSHOT.jar"]
#executing Spring boot app
ENTRYPOINT java -XX:+UnlockExperimentalVMOptions-XX:+UseCGroupMemoryLimitForHeap $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /usr/src//github.com/satya7275/GQL-1.0.0-SNAPSHOT.jar
