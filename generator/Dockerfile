FROM groovy:2.5.2-jre8-alpine

# download Alice in Wonderland text
RUN wget https://www.gutenberg.org/files/11/11-0.txt -O source.txt

COPY generate.groovy ./
CMD groovy generate.groovy
