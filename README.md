Приложение для загрузки данных в БД библиотек

Среда разработки: IntelliJ IDEA Community Edition 2021.1.3 x64 
SDK openjdk-16.0.1 БД: Oracle SQL Developer. Оracle Database 18c Express Edition 
Для подключения к БД использовался Oracle Driver OJDBC8.jar Парсинг реализован с помощью библиотеки GSON
Для того, чтобы собрать приложение нужно скачать основную папку с проектом, открыть её в IntelliJ IDEA. 
В SQL Developer необходимо создать соединение librbook (username: hr ; password: dbpword) и импортировать запросы с SQL-файла.

Запускаем проект (Shift+F10) и прописываем полное имя json-файла
![alt text](ParseProject/img1.png)

Далее заходим в SQL Developer и просматриваем таблицы в БД  
![alt text](Gamid-Dibirov/ParseProject/img2.png)
![alt text](ParseProject/img3.png)
