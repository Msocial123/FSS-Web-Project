# Pulling the Base Image 
FROM ubuntu:latest 
# Trying to Set the workdir 
WORKDIR /app 
# Update os to install dependencies 
RUN apt-get update -y 
# Installing a WebServer
RUN apt-get install apache2 -y 
# Copy all the source code files inside the Webserver default path 
COPY . /var/www/html 
# Set the EXPOSE 8081 
EXPOSE 81 
# Start the Apache Server 
ENTRYPOINT apachectl -D FOREGROUND 

