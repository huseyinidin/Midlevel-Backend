## ÖDEV - SQL 

Aþaðýdaki sorgu senaryolarýný **dvdrental** örnek veri tabaný üzerinden gerçekleþtiriniz.

1. **film** tablosunda bulunan tum sütunlardaki verileri **replacement cost** deðeri 12.99 dan büyük eþit ve 16.99 küçük olma koþuluyla sýralayýnýz. (**BETWEEN** - **AND** yapýsýný kullanýnýz.)

2. **actor** tablosunda bulunan **first_name** ve **last_name** sütunlardaki verileri **first_name** 'Penelope' veya 'Nick' veya 'Ed' deðerleri olmasý koþuluyla sýralayýnýz. (**IN** operatörürü kullanýnýz.)

3. **film** tablosunda bulunan tüm sütunlardaki verileri **rental_rate** 0.99, 2.99, 4.99 **VE** **replacement_cost** 12.99, 15.99, 28.99 olma koþullarýyla sýralayýnýz. (**IN** operatörürü kullanýnýz.)



* SELECT * FROM film WHERE replacement_cost BETWEEN 12.99 AND 16.99; 

* SELECT first_name, last_name FROM film WHERE first_name IN ('Penelope', 'Nick', 'Ed');

* SELECT * FROM film WHERE (rental_rate IN (0.99, 2.99, 4.9)) AND (replacement_cost IN (2.99, 15.99, 28.99));     

