openshift custom domain route

```shell
oc create route edge --service=zipkin zipkin --hostname zipkin.apps.fajar-project.site
```