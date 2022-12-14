## �DEV - SQL 

A�a��daki sorgu senaryolar�n� **dvdrental** �rnek veri taban� �zerinden ger�ekle�tiriniz.

1. **film** tablosunda bulunan **replacement_cost** s�tununda bulunan birbirinden farkl� de�erleri s�ralay�n�z.

2. **film** tablosunda bulunan **replacement_cost** s�tununda birbirinden farkl� ka� tane veri vard�r?

3. **film** tablosunda bulunan film isimlerinde (title) ka� tanesini T karakteri ile ba�lar ve ayn� zamanda rating 'G' ye e�ittir?

4. **country** tablosunda bulunan �lke isimlerinden (country) ka� tanesi 5 karakterden olu�maktad�r?

5. **city** tablosundaki �ehir isimlerinin ka� tanesi 'R' veya r karakteri ile biter?


* SELECT DISTINCT replacement_cost FROM film; 

* SELECT COUNT(DISTINCT replacement_cost) FROM film;

* SELECT COUNT(title) FROM film WHERE title ~~ 'T%' AND rating IN ('G');

* SELECT COUNT(country) FROM country WHERE LENGTH(country) < 6;

* SELECT COUNT(city) FROM city WHERE city ~~* '%r';