#!/bin/bash
sleep 10
cat /etc/host
while ! exec 6<>/dev/tcp/${DATABASE_HOST}/${DATABASE_PORT}; do
    echo "Trying to connect to MySQL at ${DATABASE_PORT}...  at host ${DATABASE_HOST}"
    sleep 10
done

java -Djava.security.egd=file:/dev/./urandom  -jar /app.jar

#-Dspring.profiles.active=container