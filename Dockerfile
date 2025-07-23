FROM aliyun-hn1-tcr-prod-registry.cn-shenzhen.cr.aliyuncs.com/ux168/base/openjdk8:20230901


COPY csa-ld-proxy-service-boot/target/jar/*.jar /app/app.jar


EXPOSE 9021

ENTRYPOINT ["java", "-javaagent:/app/agent/skywalking-agent.jar", "-Dskywalking.agent.service_name=gz-csa-ld-proxy-service", "-XX:+UseContainerSupport", "-XX:InitialRAMPercentage=50.0","-XX:MaxRAMPercentage=50.0","-XX:+HeapDumpOnOutOfMemoryError", "-XX:HeapDumpPath=/tmp/csa-ld-proxy-service.hprof","-XX:+UseG1GC","-jar","app.jar"]