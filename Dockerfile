# Start with OL runtime.
FROM icr.io/appcafe/open-liberty:kernel-slim-java11-openj9-ubi

#ARG VERSION=1.0
#ARG REVISION=SNAPSHOT
#
#LABEL \
#  org.opencontainers.image.authors="Your Name" \
#  org.opencontainers.image.vendor="IBM" \
#  org.opencontainers.image.url="local" \
#  org.opencontainers.image.source="https://github.com/OpenLiberty/guide-docker" \
#  org.opencontainers.image.version="$VERSION" \
#  org.opencontainers.image.revision="$REVISION" \
#  vendor="Open Liberty" \
#  name="system" \
#  version="$VERSION-$REVISION" \
#  summary="The system microservice from the Docker Guide" \
#  description="This image contains the system microservice running with the Open Liberty runtime."

USER root

COPY --chown=1001:0 \
    target/liberty/wlp/usr/shared/resources/*.jar \
    /opt/ol/wlp/usr/shared/resources/

COPY --chown=1001:0 src/main/liberty/config/ /config/

RUN features.sh

COPY --chown=1001:0 target/*.war /config/apps/
USER 1001

RUN configure.sh
