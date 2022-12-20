# ÖDEV - SQL 

Aþaðýdaki sorgu senaryolarýný **dvdrental** örnek veri tabaný üzerinden gerçekleþtiriniz.

* **actor** ve **customer** tablolarýnda bulunan **first_name** sütunlarý için **tüm** verileri sýralayalým.

* **actor** ve **customer** tablolarýnda bulunan **first_name** sütunlarý için **kesiþen** verileri sýralayalým.

* **actor** ve **customer** tablolarýnda bulunan **first_name** sütunlarý için **ilk** tabloda bulunan ancak **ikinci** tabloda **bulunmayan** verileri sýralayalým.

* Ýlk 3 sorguyu tekrar eden veriler için de yapalým.

``` 
(
SELECT first_name FROM actor
)
UNION 
(
SELECT first_name FROM customer
);
---
(
SELECT first_name FROM actor
)
INTERSECT 
(
SELECT first_name FROM customer
);
---
(
SELECT first_name FROM actor
)
EXCEPT 
(
SELECT first_name FROM customer
);
---
(
SELECT first_name FROM actor
)
UNION ALL 
(
SELECT first_name FROM customer
);
---
(
SELECT first_name FROM actor
)
EXCEPT ALL
(
SELECT first_name FROM customer
);
```
