# Структура модулей

## Вариант 1

Пример проекта, в котором наибольшая взаимосвязь между модулями.

Количество модулей: 6`*`  
Глубина зависимостей: 5 `application -> library01 -> library02 -> library03 -> library04 -> library05`  
Связей между модулями: 15

`*` без учёта модуля `source`.

![graph.png](img/graph.png)

Зависимости:
```
+--- project :application
     +--- project :sources:library01
     +--- project :sources:library02
     +--- project :sources:library03
     +--- project :sources:library04
     \--- project :sources:library05
```
```
+--- project :sources:library01
     +--- project :sources:library02
     +--- project :sources:library03
     +--- project :sources:library04
     \--- project :sources:library05
```
```
+--- project :sources:library02
     +--- project :sources:library03
     +--- project :sources:library04
     \--- project :sources:library05
```
```
+--- project :sources:library03
     +--- project :sources:library04
     \--- project :sources:library05
```
```
+--- project :sources:library04
     \--- project :sources:library05
```
```
+--- project :sources:library05
```

## Варианты структур gradle-модулей

1. [Первый вариант](https://github.com/rmarma/build-structure-sample/blob/main/README.md) - исходный проект, в котором наибольшая взаимосвязь между модулями и кодом;
2. [Второй вариант](https://github.com/rmarma/build-structure-sample/blob/variant2/README.md) - это первый вариант, но где `api` и `impl` вынесены в отдельные модули. При этом запрещено `impl` зависеть от `impl`;
3. [Третий вариант](https://github.com/rmarma/build-structure-sample/blob/variant3/README.md) - это второй, только дополниельно запрещено `api` зависеть от `api`.
