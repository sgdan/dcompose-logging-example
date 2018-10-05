FROM nginx:1.15.4-alpine

# Generate certificate and key
RUN apk add --no-cache openssl
RUN openssl req -x509 -newkey rsa:4096 \
    -keyout /server.key -out /server.crt \
    -days 1000 -nodes \
    -subj "//C=AU\ST=NSW\L=Sydney\OU=Org\CN=docker.local"
EXPOSE 443

COPY nginx.conf /etc/nginx/
