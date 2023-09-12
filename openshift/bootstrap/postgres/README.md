login psql pod

```shell
psql -d mydb -U admin -W
```

create database for service

```sql
\l

create database customer;
create database fraud;
create database notification;
```