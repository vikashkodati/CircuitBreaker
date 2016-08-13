export CATALINA_OPTS="\
    -server \
    -XX:MaxMetaspaceSize=256m \
    -XX:+DisableExplicitGC \
    -XX:+UseConcMarkSweepGC \
    -XX:+CMSParallelRemarkEnabled \
    -XX:+CMSClassUnloadingEnabled \
    -XX:+UseCMSInitiatingOccupancyOnly \
    -XX:CMSInitiatingOccupancyFraction=70 \
    -XX:+ScavengeBeforeFullGC \
    -XX:+CMSScavengeBeforeRemark \
    -XX:+UseParNewGC \
    -XX:+PrintGCDateStamps \
    -verbose:gc \
    -XX:+PrintGCDetails \
    -XX:+UseGCLogFileRotation \
    -XX:NumberOfGCLogFiles=5 \
    -XX:GCLogFileSize=50M \
    -Dfile.encoding=UTF-8 \
    -Duser.timezone=America/New_York \
    -Dsun.net.inetaddr.negative.ttl=30 \
    -Djava.net.preferIPv4Stack=true \
    ${CATALINA_OPTS}"