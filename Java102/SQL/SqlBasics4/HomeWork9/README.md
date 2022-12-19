# �DEV - SQL 

A�a��daki sorgu senaryolar�n� **dvdrental** �rnek veri taban� �zerinden ger�ekle�tiriniz.

* **city** tablosu ile **country** tablosunda bulunan �ehir (city) ve �lke (country) isimlerini birlikte g�rebilece�imiz **INNER JOIN** sorgusunu yaz�n�z.

* **customer** tablosu ile **payment** tablosunda bulunan **payment_id** ile **customer** tablosundaki **first_name** ve **last_name** isimlerini birlikte g�rebilece�imiz **INNER JOIN** sorgusunu yaz�n�z.

* **customer** tablosu ile **rental** tablosunda bulunan **rental_id** ile **customer** tablosundaki **first_name** ve **last_name** isimlerini birlikte g�rebilece�imiz **INNER JOIN** sorgusunu yaz�n�z.

``` 
SELECT city, country FROM city
INNER JOIN country ON city.country_id = country.country_id;

SELECT payment.payment_id, customer.first_name, customer.last_name  FROM payment
INNER JOIN customer ON payment.customer_id = customer.customer_id;

SELECT rental.rental_id, customer.first_name, customer.last_name FROM rental
INNER JOIN customer ON customer.customer_id = rental.customer_id;
```

