openshift custom domain

```shell
oc create route edge --service=rabbitmq rabbitmq --hostname rabbitmq.apps.fajar-project.site
```