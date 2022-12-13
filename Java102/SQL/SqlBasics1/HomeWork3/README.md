## �DEV - SQL 

A�a��daki sorgu senaryolar�n� **dvdrental** �rnek veri taban� �zerinden ger�ekle�tiriniz.

1. **country** tablosunda bulunan **country** s�tunundaki �lke isimlerinden 'A' karakteri ile ba�lay�p 'a' karakteri ile sonlananlar� s�ralay�n�z. 

2. **country** tablosunda bulunan **country**s�tunundaki �lke isimlerinden en az 6 karakterden olu�an ve sonu 'n' karakteri ile sonlananlar� s�ralay�n�z.

3. **film**tablosunda bulunan **title** s�tunundaki film isimlerinden en az 4 adet b�y�k ya da k���k harf farketmesizin 'T' karakteri i�eren film isimlerini s�ralay�n�z.

4. **film**tablosunda bulunan t�m s�tunlardaki verilerden **title** 'C' karakteri ile ba�layan ve uzunlu�u **(length)** 90 dan b�y�k olan ve **rental_rate** 2.99 olan verileri s�ralay�n�z.


* SELECT country FROM country WHERE country ~~ 'A%a';

* SELECT country FROM country WHERE country ~~ '_____%n';

* SELECT title FROM film WHERE title ~~* '%t%t%t%t';

* SELECT * FROM film WHERE title ~~ 'C%' and length > 90 and rental_rate IN (2.99);

