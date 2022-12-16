## �DEV - SQL 

1. test veritaban�n�zda **employee** isimli s�tun bilgileri **id(INTEGER)**, **name VARCHAR(50)**, **birthday DATE**, **email VARCHAR(100)** olan bir tablo olu�tural�m.

2. Olu�turdu�umuz employee tablosuna **'Mockaroo'** servisini kullanarak 50 adet veri ekleyelim.

3. S�tunlar�n her birine g�re di�er s�tunlar� g�ncelleyecek 5 adet **UPDATE** i�lemi yapal�m.

4. S�tunlar�n her birine g�re ilgili sat�r� silecek 5 adet **DELETE** i�lemi yapal�m.



* ```CREATE TABLE employee (
 	 id INTEGER PRIMARY KEY,
	 first_name VARCHAR(50) NOT NULL,
	 birthday DATE, 
	 email VARCHAR(100) 
 );```

* ```50 Adet veri eklendi.```

* ```UPDATE employee SET first_name = 'Alfa' WHERE id = 1;
  UPDATE employee SET first_name = 'Tango' WHERE id = 5;
  UPDATE employee SET first_name = 'Romeo' WHERE id = 10;
  UPDATE employee SET first_name = 'Juliet' WHERE id = 15;
  UPDATE employee SET first_name = 'Sierra' WHERE id = 20;```

* ```DELETE FROM employee where id = 2
  DELETE FROM employee where id = 6;
  DELETE FROM employee where id = 11;
  DELETE FROM employee where id = 16;
  DELETE FROM employee where id = 21;```

