# �DEV - SQL 

A�a��daki sorgu senaryolar�n� **dvdrental** �rnek veri taban� �zerinden ger�ekle�tiriniz.

* **city** tablosu ile **country** tablosunda bulunan **�ehir (city)** ve **�lke (country)** isimlerini birlikte g�rebilece�imiz **LEFT JOIN** sorgusunu yaz�n�z.

* **customer** tablosu ile **payment** tablosunda bulunan **payment_id** ile **customer** tablosundaki **first_name** ve **last_name** isimlerini birlikte g�rebilece�imiz **RIGHT JOIN** sorgusunu yaz�n�z.

* **customer** tablosu ile **rental** tablosunda bulunan **rental_id** ile **customer** tablosundaki **first_name** ve **last_name** isimlerini birlikte g�rebilece�imiz **FULL JOIN** sorgusunu yaz�n�z.


``` 
SELECT city , country FROM country
LEFT JOIN city ON city.country_id = country.country_id;

SELECT payment_id, first_name, last_name FROM payment
RIGHT JOIN customer ON customer.customer_id = payment.customer_id;

SELECT rental_id, first_name, last_name FROM rental
FULL JOIN customer ON customer.customer_id = rental.customer_id;
```
