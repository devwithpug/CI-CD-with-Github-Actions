if [ -d /home/ec2-user/build ]; then
  rm -rf /home/ec2-user/build
fi

mkdir -vp /home/ec2-user/build

docker stop cicd-test
docker rm cicd-test

if [[ "$(docker images -q devwithpug/ci-cd-with-github-actions 2> /dev/null)" != "" ]]; then
  docker rmi -f $(docker images --format '{{.Repository}}:{{.Tag}}' --filter=reference='devwithpug/ci-cd-with-github-actions')