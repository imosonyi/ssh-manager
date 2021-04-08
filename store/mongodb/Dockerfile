FROM mongo:latest

ENV MONGO_INITDB_DATABASE ssh-manager_store
ENV MONGO_INITDB_ROOT_USERNAME root
ENV MONGO_INITDB_ROOT_PASSWORD root

ADD ./mongo-init.js /docker-entrypoint-initdb.d/
