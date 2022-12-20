# ÖDEV - SQL 

Aþaðýdaki sorgu senaryolarýný **dvdrental** örnek veri tabaný üzerinden gerçekleþtiriniz.

1. **film**  tablosunda **film**  uzunluðu **length** sütununda gösterilmektedir. Uzunluðu **ortalama** film uzunluðundan fazla **kaç tane** film vardýr?

2. **film**  tablosunda **en yüksek** **rental_rate** deðerine sahip **kaç tane** film vardýr?

3. **film**  tablosunda **en düþük** **rental_rate** ve **en düþük** **replacement_cost** deðerlerine sahip filmleri sýralayýnýz.

4. **payment** tablosunda **en fazla** sayýda alýþveriþ yapan müþterileri **(customer)** sýralayýnýz.


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
