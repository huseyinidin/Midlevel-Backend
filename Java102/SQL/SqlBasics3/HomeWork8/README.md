## ÖDEV - SQL 

1. test veritabanýnýzda **employee** isimli sütun bilgileri **id(INTEGER)**, **name VARCHAR(50)**, **birthday DATE**, **email VARCHAR(100)** olan bir tablo oluþturalým.

2. Oluþturduðumuz employee tablosuna **'Mockaroo'** servisini kullanarak 50 adet veri ekleyelim.

3. Sütunlarýn her birine göre diðer sütunlarý güncelleyecek 5 adet **UPDATE** iþlemi yapalým.

4. Sütunlarýn her birine göre ilgili satýrý silecek 5 adet **DELETE** iþlemi yapalým.



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

