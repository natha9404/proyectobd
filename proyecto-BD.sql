--Aura Cristina Jimenez Cod: 1328837
--Nathalia Bedoya Hurtado Cod: 1226305
--Edison Felipe mamian ceron 1224279
--Eduard Efren Arango Lopez - 1325584


/*DROP TABLE Ruta_Estacion;
DROP TABLE Conduce;
DROP TABLE Empleado_Turno;
DROP TABLE Aborda;
DROP TABLE Turno;
DROP TABLE SQR;
DROP TABLE Pasajero;
DROP TABLE Tarjeta;
DROP TABLE Estacion;
DROP TABLE Empleado;
DROP TABLE Bus;
DROP TABLE Ruta;*/

CREATE TABLE Ruta (
	nombre_ruta VARCHAR(4) NOT NULL,
	descripcion TEXT NOT NULL,
	imagen VARCHAR(200),
	PRIMARY KEY (nombre_ruta)
);


CREATE TABLE Bus (
	numero_bus VARCHAR(20) NOT NULL,
	tipo TEXT NOT NULL,
	nombre_ruta VARCHAR(4) NOT NULL,
	PRIMARY KEY (numero_bus),
	FOREIGN KEY (nombre_ruta) REFERENCES Ruta(nombre_ruta)

);


CREATE TABLE Empleado (
	cedula_empleado VARCHAR(10) NOT NULL,
	nombre VARCHAR(50) NOT NULL,
	telefono VARCHAR(20) NOT NULL,
	direccion VARCHAR(50) NOT NULL,
	cargo VARCHAR(50) NOT NULL,
	PRIMARY KEY (cedula_empleado)
);

CREATE TABLE Estacion (
	nombre_estacion VARCHAR(20) NOT NULL,
	ubicacion VARCHAR(50) NOT NULL,
	cedula_empleado VARCHAR(10) NOT NULL,
	PRIMARY KEY (nombre_estacion),
	FOREIGN KEY (cedula_empleado) REFERENCES Empleado(cedula_empleado)
	);


CREATE SEQUENCE tarjeta_id
START 100
increment by 1;	

CREATE TABLE Tarjeta (
	id_tarjeta INTEGER DEFAULT nextval('tarjeta_id') NOT NULL,
	saldo DOUBLE PRECISION NOT NULL,
	estado VARCHAR(10) NOT NULL,
	deuda DOUBLE PRECISION NOT NULL,
	cedula_empleado VARCHAR(10) NOT NULL,
	nombre_estacion VARCHAR(20) NOT NULL,
	PRIMARY KEY (id_tarjeta),
	FOREIGN KEY (cedula_empleado) REFERENCES Empleado(cedula_empleado),
	FOREIGN KEY (nombre_estacion) REFERENCES Estacion(nombre_estacion)
);



CREATE TABLE Pasajero (
	cedula_pasajero VARCHAR(10) NOT NULL,
	nombre VARCHAR(50) NOT NULL,
	telefono VARCHAR(20) NOT NULL,
	id_tarjeta INTEGER, --PUEDE SER NULL, por ejemplo un pasajero que no tiene tarjeta personalizada.
	PRIMARY KEY (cedula_pasajero),
	FOREIGN KEY (id_tarjeta) REFERENCES Tarjeta(id_tarjeta)
);


--Modifique SQR

CREATE SEQUENCE sqr_id
START 1001
increment by 1;	

CREATE TABLE SQR (
	numero_ticket INTEGER DEFAULT nextval('sqr_id') NOT NULL,
	tipo_pqr VARCHAR(20) NOT NULL,
	detalle TEXT NOT NULL,
	nombre VARCHAR(100) NOT NULL,
	tarjeta INTEGER NOT NULL,
	nombre_estacion VARCHAR(50) NOT NULL,
	fecha DATE NOT NULL,
	estado VARCHAR(10) NOT NULL,
	respuesta TEXT,
	PRIMARY KEY (numero_ticket),
	FOREIGN KEY (nombre_estacion) REFERENCES Estacion(nombre_estacion),
	FOREIGN KEY (tarjeta) REFERENCES Tarjeta(id_tarjeta)
);



CREATE SEQUENCE turno_id
START 001
increment by 1;

CREATE TABLE Turno (
	id_turno INTEGER DEFAULT nextval('turno_id') NOT NULL,
	fecha DATE NOT NULL,
	hora_inicio VARCHAR(10) NOT NULL,
	hora_termina VARCHAR(10) NOT NULL,
	PRIMARY KEY (id_turno)
);



CREATE TABLE Aborda (
	id_tarjeta INTEGER NOT NULL,
	---cambio numero_bus a nombre_ruta
	nombre_ruta VARCHAR(20) NOT NULL,
	fecha DATE NOT NULL,
	PRIMARY KEY (id_tarjeta, nombre_ruta, fecha),
	FOREIGN KEY (id_tarjeta) REFERENCES Tarjeta(id_tarjeta),
	FOREIGN KEY (nombre_ruta) REFERENCES Ruta(nombre_ruta)
);


CREATE TABLE Empleado_Turno (
	cedula_empleado VARCHAR(10) NOT NULL,
	id_turno INTEGER NOT NULL,
	PRIMARY KEY (cedula_empleado, id_turno),
	FOREIGN KEY (cedula_empleado) REFERENCES Empleado(cedula_empleado),
	FOREIGN KEY (id_turno) REFERENCES Turno(id_turno)
);



CREATE TABLE Conduce (
	numero_bus VARCHAR(20) NOT NULL,
	nombre_ruta VARCHAR(4) NOT NULL,
	cedula_empleado VARCHAR(10) NOT NULL,
	id_turno INTEGER NOT NULL,
	PRIMARY KEY (numero_bus, nombre_ruta, cedula_empleado, id_turno),
	FOREIGN KEY (id_turno) REFERENCES Turno(id_turno),
	FOREIGN KEY (numero_bus) REFERENCES Bus(numero_bus),
	FOREIGN KEY (nombre_ruta) REFERENCES Ruta(nombre_ruta),
	FOREIGN KEY (cedula_empleado) REFERENCES Empleado(cedula_empleado)
);

CREATE TABLE Ruta_Estacion (
	nombre_ruta VARCHAR(4) NOT NULL,
	nombre_estacion VARCHAR(20) NOT NULL,
	PRIMARY KEY (nombre_ruta, nombre_estacion),
	FOREIGN KEY (nombre_ruta) REFERENCES Ruta(nombre_ruta),
	FOREIGN KEY (nombre_estacion) REFERENCES Estacion(nombre_estacion)
);


/*INSERT INTO Empleado VALUES('1144084641','Diego Hoyos','3215710899','carrera 2F # 68-62','director de estacion');
INSERT INTO Empleado VALUES('16687707','Juan Beltran','3104504253','carrera 29B # 26B-69','servicio al cliente');

INSERT INTO Estacion VALUES('Universidades','carrera 100 # 16-19','1144084641');

INSERT INTO Tarjeta(saldo,estado,deuda,cedula_empleado,nombre_estacion) VALUES(1800,'activo',0,'16687707','Universidades');

INSERT INTO Pasajero(cedula_pasajero,nombre,telefono) VALUES('31918451','Laura Perlaza','6655225');
INSERT INTO Pasajero(cedula_pasajero,nombre,telefono) VALUES('12345','Pedro Perez','3365618');
INSERT INTO Pasajero(cedula_pasajero,nombre,telefono) VALUES('55555','Juan Valdez','4464817');*/
