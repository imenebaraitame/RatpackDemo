FROM gitpod/workspace-full

ENV GRADLE_HOME=/opt/gradle/gradle-7.2/bin


# Install dart
USER root
RUN apt-get update -y && \
    apt-get install gradle -y 

# Install Gradle
RUN wget https://services.gradle.org/distributions/gradle-7.2-bin.zip
RUN mkdir /opt/gradle
RUN unzip gradle-7.2-bin.zip -d /opt/gradle


USER gitpod

# add executables to PATH
RUN echo 'export PATH=${GRADLE_HOME}:$PATH' >>~/.bashrc

