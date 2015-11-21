##([Руководство по Eclipse IDE](http://sotnyk.com/2011/10/09/rukovodstvo-po-eclipse-ide/) | [еще](http://www.bsu.by/Cache/pdf/508363.pdf)) [GWT - Tutorial](http://www.vogella.com/tutorials/GWT/article.html#overview_gwt)
* `Создание первой части GWT-приложения`:


1. Создаем обычное веб-приложение: `архитектура веб-приложения: src='client','shared'; war='WEB-INF';` | `сперва 'web.xml','<XXX>.gwt.xml';` | `потом: создаем='index.html'; и прописываем в='web.xml','XXX.gwt.xml','<СТИЛИ>.css';` | `теперь это уже GWT-приложение (потому-что есть модуль '<XXX>.gwt.xml') при компиляции и запуске его нужно указать модуль: '<XXX>.gwt.xml'`;
2. Это будет чисто клиентское GWT-приложение. `Дальше добавляем класс='<EntryPoint>' в 'client', <МОДЕЛЬ> в 'shared', <ВИДЖЕТ> в 'client...';`
3. Подключаем наш <ВИДЖЕТ> в методе '< onModuleLoad() >' для класса '< EntryPoint >';

##GWT 2 Spring 3 JPA 2 Hibernate 3.5 Tutoria ([#1](http://www.javacodegeeks.com/2010/05/gwt-2-spring-3-jpa-2-hibernate-35-2.html) | [#2](http://www.javacodegeeks.com/2010/07/gwt-2-spring-3-jpa-2-hibernate-35.html))
