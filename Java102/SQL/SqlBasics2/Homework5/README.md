## �DEV - SQL 

A�a��daki sorgu senaryolar�n� **dvdrental** �rnek veri taban� �zerinden ger�ekle�tiriniz.

1. **film** tablosunda bulunan ve film ismi (title) 'n' karakteri ile biten en uzun (length) 5 filmi s�ralay�n�z.

2. **film** tablosunda bulunan ve film ismi (title) 'n' karakteri ile biten en k�sa (length) ikinci(6,7,8,9,10) 5 filmi s�ralay�n�z.

3. **customer** tablosunda bulunan last_name s�tununa g�re azalan yap�lan s�ralamada store_id 1 olmak ko�uluyla ilk 4 veriyi s�ralay�n�z.


* SELECT title, length FROM film WHERE title ~~ '%n' ORDER BY length DESC LIMIT 5;

* SELECT title, length FROM film WHERE title ~~ '%n' ORDER BY length OFFSET 5 LIMIT 5;

* SELECT store_id, last_name FROM customer WHERE store_id IN (1) ORDER BY last_name DESC LIMIT 4;






