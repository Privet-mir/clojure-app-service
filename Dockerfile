FROM clojure:lein-2.9.10
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
COPY . /usr/src/app
RUN lein uberjar
EXPOSE  4000
RUN ls target
CMD ["java", "-jar", "target/uberjar/clojure-rest-api-0.0.1-standalone.jar"]
