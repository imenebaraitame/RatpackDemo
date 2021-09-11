FROM gitpod/workspace-full

ENV GRADLE_HOME=/usr/share/gradle/gradle-7.2/bin

# Install dart
USER root 

RUN apt-get update -y && \
    apt-get install gradle -y


USER gitpod

# add executables to PATH
RUN echo 'export PATH=${GRADLE_HOME}:$PATH' >>~/.bashrc