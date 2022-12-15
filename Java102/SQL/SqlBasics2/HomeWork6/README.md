## �DEV - SQL 

A�a��daki sorgu senaryolar�n� **dvdrental** �rnek veri taban� �zerinden ger�ekle�tiriniz.

1. **film** tablosunda bulunan **rental_rate** s�tunundaki de�erlerin **ortalamas�** nedir?

2. **film** tablosunda bulunan filmlerden **ka� tanesi 'C'** karakteri ile ba�lar?

3. **film** tablosunda bulunan filmlerden **rental_rate** de�eri 0.99 a e�it olan **en uzun** (length) film ka� dakikad�r?

4. **film** tablosunda bulunan filmlerin uzunlu�u 150 dakikadan b�y�k olanlar�na ait **ka� farkl� replacement_cost** de�eri vard�r?


* SELECT AVG(rental_rate) FROM film;

* SELECT COUNT(*) FROM film WHERE title ~~ 'C%';

* SELECT MAX(length) FROM film WHERE rental_rate IN(0.99);

* SELECT COUNT(DISTINCT(replacement_cost)) FROM film WHERE length > 150 ;
