INSERT INTO categoria_cuarto (nombre,descripcion,precio)
    VALUES ('Individual', 'Ideal para quienes viajan solos.',50.0);

INSERT INTO categoria_cuarto (nombre,descripcion,precio)
    VALUES ('Doble', 'Ideal para dos viajeros.',60.0);    

INSERT INTO cuarto (numero, descripcion,categoria)
    VALUES(1,'Vista a la piscina',1);
INSERT INTO cuarto (numero, descripcion,categoria)
  VALUES(2,'Remodelado recientemente',1);
  
INSERT INTO cuarto (numero, descripcion,categoria)
    VALUES(3,'Vista al mar',2);
INSERT INTO cuarto (numero, descripcion,categoria)
  VALUES(4,'Estilo Colonial',2);
  
INSERT INTO huesped (nombre,email,telefono) 
	VALUES ('Juan Perez', 'juanperez@gmail.com', '22226046' );
	
INSERT INTO huesped (nombre,email,telefono) 
	VALUES ('Julio Lopez', 'juliolopez@gmail.com', '22225046' );	
	
	
INSERT into reservacion (desde, hasta, cuarto, huesped)	VALUES ('2017-02-24', '2017-02-25', 1, 1);
	
INSERT into reservacion (desde, hasta, cuarto, huesped)	VALUES ('2017-02-25', '2017-02-27', 2, 2);	
	
INSERT into reservacion (desde, hasta, cuarto, huesped)	VALUES ('2017-02-24', '2017-02-28', 3, 1);
	
INSERT into reservacion (desde, hasta, cuarto, huesped)	VALUES ('2017-02-24', '2017-02-25', 4, 2);	
