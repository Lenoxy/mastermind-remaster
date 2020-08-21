FROM openjdk:8


ADD out/artifacts/mastermind/mastermind.jar tmp/

CMD ["java", "-jar", "tmp/mastermind.jar"]


#COPY . /tmp
#WORKDIR /tmp
#ENTRYPOINT ["java","Main"]