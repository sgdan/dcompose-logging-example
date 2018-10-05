FROM fluent/fluentd:v1.2.5-debian

RUN gem install fluent-plugin-elasticsearch --no-rdoc --no-ri --version 1.5.0
COPY fluent.conf /fluentd/etc/
