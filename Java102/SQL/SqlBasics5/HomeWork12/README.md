# �DEV - SQL 

A�a��daki sorgu senaryolar�n� **dvdrental** �rnek veri taban� �zerinden ger�ekle�tiriniz.

1. **film**  tablosunda **film**  uzunlu�u **length** s�tununda g�sterilmektedir. Uzunlu�u **ortalama** film uzunlu�undan fazla **ka� tane** film vard�r?

2. **film**  tablosunda **en y�ksek** **rental_rate** de�erine sahip **ka� tane** film vard�r?

3. **film**  tablosunda **en d���k** **rental_rate** ve **en d���k** **replacement_cost** de�erlerine sahip filmleri s�ralay�n�z.

4. **payment** tablosunda **en fazla** say�da al��veri� yapan m��terileri **(customer)** s�ralay�n�z.


``` 
SELECT COUNT(length) FROM film 
WHERE length >
(
	SELECT AVG(length)
	FROM film
);


SELECT COUNT(film_id) FROM film 
WHERE rental_rate =
(
	SELECT MAX(rental_rate)
	FROM film
);

SELECT rental_rate, replacement_cost, (SELECT MIN(rental_rate) FROM film) AS rental_rate , (SELECT MIN(replacement_cost) FROM film) AS replecament_cost FROM film 
WHERE rental_rate =
(
	SELECT MIN(rental_rate)
	FROM film
)
AND replacement_cost = 
(
	SELECT MIN(replacement_cost)
	FROM Film
);

SELECT COUNT(payment_id), customer.first_name, customer.last_name FROM payment
JOIN customer ON payment.customer_id = customer.customer_id
GROUP BY customer.customer_id, customer.first_name, customer.last_name
ORDER BY COUNT(payment_id) DESC;


```
