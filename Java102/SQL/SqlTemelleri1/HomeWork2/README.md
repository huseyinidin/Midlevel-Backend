## �DEV - SQL 

A�a��daki sorgu senaryolar�n� **dvdrental** �rnek veri taban� �zerinden ger�ekle�tiriniz.

1. **film** tablosunda bulunan tum s�tunlardaki verileri **replacement cost** de�eri 12.99 dan b�y�k e�it ve 16.99 k���k olma ko�uluyla s�ralay�n�z. (**BETWEEN** - **AND** yap�s�n� kullan�n�z.)

2. **actor** tablosunda bulunan **first_name** ve **last_name** s�tunlardaki verileri **first_name** 'Penelope' veya 'Nick' veya 'Ed' de�erleri olmas� ko�uluyla s�ralay�n�z. (**IN** operat�r�r� kullan�n�z.)

3. **film** tablosunda bulunan t�m s�tunlardaki verileri **rental_rate** 0.99, 2.99, 4.99 **VE** **replacement_cost** 12.99, 15.99, 28.99 olma ko�ullar�yla s�ralay�n�z. (**IN** operat�r�r� kullan�n�z.)



* SELECT * FROM film WHERE replacement_cost BETWEEN 12.99 AND 16.99; 

* SELECT first_name, last_name FROM film WHERE first_name IN ('Penelope', 'Nick', 'Ed');

* SELECT * FROM film WHERE (rental_rate IN (0.99, 2.99, 4.9)) AND (replacement_cost IN (2.99, 15.99, 28.99));     

