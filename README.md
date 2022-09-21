# SpringBoot-Jenkins

## Setting Up Jenkins
1. docker image pull jenkins/jenkins:lts
2. docker volume create jenkins_volume
3. docker container run -p 8080:8080 -p 50000:50000 -d -v /var/run/docker.sock:/var/run/docker.sock -v jenkins_home:/var/jenkins_home jenkins/jenkins:lts
4. docker container exec container_id sh -c "cat /var/jenkins_home/secrets/initialAdminPassword"
## To Install Docker In Jenkins Container
https://docs.docker.com/engine/install/debian/
1. docker exec -it --user root container_id bash
2. curl https://get.docker.com/ > dockerinstall && chmod 777 dockerinstall && ./dockerinstall
3. sudo chmod 666 /var/run/docker.sock
