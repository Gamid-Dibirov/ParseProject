Приложение для загрузки данных в БД библиотек

Среда разработки: IntelliJ IDEA Community Edition 2021.1.3 x64 
SDK openjdk-16.0.1 БД: Oracle SQL Developer. Оracle Database 18c Express Edition 
Для подключения к БД использовался Oracle Driver OJDBC8.jar Парсинг реализован с помощью библиотеки GSON
Для того, чтобы собрать приложение нужно:
*скачать основную папку с проектом, открыть её в IntelliJ IDEA. 
В SQL Developer необходимо создать соединение librbook (username: hr ; password: dbpword) и импортировать запросы с SQL-файла.

Запускаем проект (Shift+F10) и прописываем полное имя json-файла
![alt text](https://github.com/Gamid-Dibirov/ParseProject/blob/main/img1.png?raw=true)

Далее заходим в SQL Developer и просматриваем таблицы в БД  
![alt text](https://github.com/Gamid-Dibirov/ParseProject/blob/main/img2.png?raw=true)
![alt text](https://github.com/Gamid-Dibirov/ParseProject/blob/main/img3.png?raw=true)

Инструкция по созданию БД:
1.	Необходимо скачать Oracle Database 18c Express Edition с оф. сайта https://www.oracle.com/database/technologies/xe-downloads.html
2.	Распаковываем архив, запускаем установку, ставим в процессе установки пароль (dbpword).
3.	Далее открываем в поиске SQL PLUS. Username: system. Password: dbpword.
4.	Поочередно вводим 3 команды.
	
alter session set "_ORACLE_SCRIPT"=true; 

create user hr identified by hr account unlock; 

grant DBA to hr;

5.	Скачать SQL Developer с оф. сайта

https://www.oracle.com/tools/downloads/sqldev-downloads.html

6.	Распаковываем архив, запускаем установку.
7.	Добавляем соединение, нажав на +

![alt text](https://github.com/Gamid-Dibirov/ParseProject/blob/main/4.png?raw=true)

8.	Далее заполняем окно следующим образом 

![alt text](https://github.com/Gamid-Dibirov/ParseProject/blob/main/5.png?raw=true)

При тесте соединения статус должен быть успешен

![alt text](https://github.com/Gamid-Dibirov/ParseProject/blob/main/6.png?raw=true)

9.	После создания соединения, необходимо зайти в него по паролю. Далее скачиваем файл Practice.sql (выделив скрипт и вставив его в локальный файл), открываем в SQL Developer и запускаем как сценарий (F5)

![alt text](https://github.com/Gamid-Dibirov/ParseProject/blob/main/7.png?raw=true)

![alt text](https://github.com/Gamid-Dibirov/ParseProject/blob/main/8.png?raw=true)

10.	Таблицы в БД созданы.

![alt text](https://github.com/Gamid-Dibirov/ParseProject/blob/main/9.png?raw=true)
