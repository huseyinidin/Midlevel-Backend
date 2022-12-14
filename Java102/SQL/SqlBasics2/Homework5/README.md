## ÖDEV - SQL 

Aþaðýdaki sorgu senaryolarýný **dvdrental** örnek veri tabaný üzerinden gerçekleþtiriniz.

1. **film** tablosunda bulunan ve film ismi (title) 'n' karakteri ile biten en uzun (length) 5 filmi sýralayýnýz.

2. **film** tablosunda bulunan ve film ismi (title) 'n' karakteri ile biten en kýsa (length) ikinci(6,7,8,9,10) 5 filmi sýralayýnýz.

3. **customer** tablosunda bulunan last_name sütununa göre azalan yapýlan sýralamada store_id 1 olmak koþuluyla ilk 4 veriyi sýralayýnýz.


* SELECT title, length FROM film WHERE title ~~ '%n' ORDER BY length DESC LIMIT 5;

* SELECT title, length FROM film WHERE title ~~ '%n' ORDER BY length OFFSET 5 LIMIT 5;

* SELECT store_id, last_name FROM customer WHERE store_id IN (1) ORDER BY last_name DESC LIMIT 4;






