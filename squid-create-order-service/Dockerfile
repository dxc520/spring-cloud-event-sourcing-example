FROM 192.168.31.34/squid/squid-executor:latest

ARG SATURN_EXECUTOR_DOWNLOAD_URL

COPY target/squid-create-order-service-0.0.1-SNAPSHOT-app.zip squid-poc-server.zip

RUN sh -c 'unzip squid-poc-server.zip' \
 && sh -c 'mv /app /squid-executor/apps/' \
 && sh -c 'rm -rf squid-poc-server.zip'

ENV TZ "Asia/Shanghai"
ENV SQUID_ZK_CONNECTION=zookeeper:2181
ENV KAFKA_CLUSTER=kafka

CMD ["/bin/sh","/squid-executor/bin/squid-executor.sh", "start", "-n", "squid.dataman.com", "-r" ,"foreground", "-env", "docker", "-d", "/squid-executor/apps"]
