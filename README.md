# Структура модулей

## Вариант 2

Первый вариант с разделением на `api/impl`.

Количество модулей: 11`*`  
Глубина зависимостей: 6 `application -> library01:impl -> library01:api -> library02:api -> library03:api -> library04:api -> library05:api`  
Связей между модулями: 35

`*` без учёта модулей `source/library`.

![graph.png](img/graph.png)

Зависимости:
```
+--- project :application
     +--- project :sources:library01:api
     +--- project :sources:library01:impl
     +--- project :sources:library02:api
     +--- project :sources:library02:impl
     +--- project :sources:library03:api
     +--- project :sources:library03:impl
     +--- project :sources:library04:api
     +--- project :sources:library04:impl
     +--- project :sources:library05:api
     \--- project :sources:library05:impl
```
```
+--- project :sources:library01:impl
     +--- project :sources:library01:api
     +--- project :sources:library02:api
     +--- project :sources:library03:api
     +--- project :sources:library04:api
     \--- project :sources:library05:api
```
```
+--- project :sources:library01:api
     +--- project :sources:library02:api
     +--- project :sources:library03:api
     +--- project :sources:library04:api
     \--- project :sources:library05:api
```
```
+--- project :sources:library02:impl
     +--- project :sources:library02:api
     +--- project :sources:library03:api
     +--- project :sources:library04:api
     \--- project :sources:library05:api
```
```
+--- project :sources:library02:api
     +--- project :sources:library03:api
     +--- project :sources:library04:api
     \--- project :sources:library05:api
```
```
+--- project :sources:library03:impl
     +--- project :sources:library03:api
     +--- project :sources:library04:api
     \--- project :sources:library05:api
```
```
+--- project :sources:library03:api
     +--- project :sources:library04:api
     \--- project :sources:library05:api
```
```
+--- project :sources:library04:impl
     +--- project :sources:library04:api
     \--- project :sources:library05:api
```
```
+--- project :sources:library04:api
     \--- project :sources:library05:api
```
```
+--- project :sources:library05:impl
     \--- project :sources:library05:api
```
```
+--- project :sources:library05:api
```
