## Project setup
### Openfire
execute this command for openfire setup in docker:

`docker run --name openfire --hostname openfiretest.com -d --restart=always \
   --publish 9090:9090 --publish 5222:5222 --publish 7777:7777 \
   --volume ~/data/docker/openfire:/var/lib/openfire \
   sameersbn/openfire:3.10.3-19`