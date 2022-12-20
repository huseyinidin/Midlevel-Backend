# ÖDEV - SQL 

Aþaðýdaki sorgu senaryolarýný **dvdrental** örnek veri tabaný üzerinden gerçekleþtiriniz.

* **city** tablosu ile **country** tablosunda bulunan **þehir (city)** ve **ülke (country)** isimlerini birlikte görebileceðimiz **LEFT JOIN** sorgusunu yazýnýz.

* **customer** tablosu ile **payment** tablosunda bulunan **payment_id** ile **customer** tablosundaki **first_name** ve **last_name** isimlerini birlikte görebileceðimiz **RIGHT JOIN** sorgusunu yazýnýz.

* **customer** tablosu ile **rental** tablosunda bulunan **rental_id** ile **customer** tablosundaki **first_name** ve **last_name** isimlerini birlikte görebileceðimiz **FULL JOIN** sorgusunu yazýnýz.


``` 
SELECT city , country FROM country
LEFT JOIN city ON city.country_id = country.country_id;

SELECT payment_id, first_name, last_name FROM payment
RIGHT JOIN customer ON customer.customer_id = payment.customer_id;

SELECT rental_id, first_name, last_name FROM rental
FULL JOIN customer ON customer.customer_id = rental.customer_id;
```
