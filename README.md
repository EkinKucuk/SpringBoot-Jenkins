# SpringBoot-Jenkins

## Setting Up Jenkins
1. docker image pull jenkins/jenkins:lts
2. docker volume create jenkins_volume
3. docker container run -d -p 8080:8080 -v jenkins_volume:/var/jenkins_home --name jenkins-local jenkins/jenkins:lts
4. docker container exec container_id sh -c "cat /var/jenkins_home/secrets/initialAdminPassword"
